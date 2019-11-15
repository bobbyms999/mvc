package com.monstar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monstar.DTO.JobDTO;
import com.monstar.service.JobService;

@Controller
@RequestMapping("/job/")
public class JobController {

	@Autowired
	private JobService service;

	@GetMapping("/getJobs.htm")
	public String findJobs(ModelMap map) {
		List<JobDTO> dtos = service.jobs();
		System.out.println(dtos);
		map.put("dtos", dtos);
		return "jobs";
	}
}
