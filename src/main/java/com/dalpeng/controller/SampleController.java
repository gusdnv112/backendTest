package com.dalpeng.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dalpeng.service.SampleService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/sample")
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@Autowired
	private SampleService sampleService;
	
	@ApiOperation(value="Sample")
	@PostMapping
	public String getSample(@RequestBody HashMap<String, Object> hash) {
		byte[] result = null;
		
		try {
			logger.info("################### Sample Controller ##################");
			logger.info("### Input : {} ###" , hash);
			logger.info("########################################################");
			result = sampleService.sampleTest(hash);
			logger.info("### Output : {} ###" , new String(result));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		return new String(result);
	}
}
