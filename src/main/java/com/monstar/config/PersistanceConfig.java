package com.monstar.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"com.monstar.dao"})
public class PersistanceConfig {

	
	@Bean
	public DataSource newDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/lalitha_db");
		dataSource.setUsername("root");
		dataSource.setPassword("7860");
		return dataSource;
	}
	
	@Bean(autowire=Autowire.BY_TYPE)
	public JdbcTemplate newTemp() {
		return new JdbcTemplate();
	}
	
	
	
}
