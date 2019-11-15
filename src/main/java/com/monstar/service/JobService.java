package com.monstar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monstar.BO.JobBO;
import com.monstar.DTO.JobDTO;
import com.monstar.dao.JobDao;

@Service
public class JobService {

	@Autowired
	private JobDao dao;

	public List<JobDTO> jobs() {
		List<JobDTO> dtos = new ArrayList<JobDTO>();
		List<JobBO> bos = dao.getJobs();
		JobDTO dto;
		for (JobBO bo : bos) {
			dto = new JobDTO();
			BeanUtils.copyProperties(bo, dto);
			dtos.add(dto);
		}
		System.out.println("service------------"+dtos);
		return dtos;
	}

}
