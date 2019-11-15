package com.monstar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.monstar.BO.JobBO;

@Repository
public class JobDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String SQL_SELECT_ALL_JOBS = "select job_code,job_skillset,job_type,job_location,job_email from job";

	public List<JobBO> getJobs() {
		List<JobBO> bos = jdbcTemplate.query(SQL_SELECT_ALL_JOBS, new JobRowMapper());
		System.out.println("dao------------" + bos);
		return bos;
	}

	private final class JobRowMapper implements RowMapper<JobBO> {

		@Override
		public JobBO mapRow(ResultSet rs, int arg1) throws SQLException {
			JobBO bo = new JobBO(rs.getInt("job_code"), rs.getString("job_skillset"), rs.getString("job_type"),
					rs.getString("job_location"), rs.getString("job_email"));
			return bo;
		}

	}
}
