package com.dalpeng.serviceImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dalpeng.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {
	Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);
	
	public byte[] sampleTest(HashMap<String, Object> hash) {
		byte[] result = null;
		String version = hash.get("vv").toString();
		String chainCode = hash.get("cc").toString();
		
		try {
			logger.info("hash : {}", hash);
			String ret = "{ return : [ \n### version : " + version + "\n### Chaincode : " + chainCode + "\n### param : " + hash.get("param") + "\n] }";
			logger.info(ret);
			result = ret.getBytes();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	};
	
}
