package com.dalpeng.serviceImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SampleServiceImpl {
	
	public byte[] sampleTest(HashMap<String, Object> hash) {
		byte[] result = null;
		String version = hash.get("vv").toString();
		String chainCode = hash.get("cc").toString();
		List<String> param = Arrays.asList(hash.get("param").toString());
		
		String ret = "{ return [ version : " + version + " Chaincode : " + chainCode + " param : %s" + param.stream();
		result = ret.getBytes();
		
		return result;
	};
	
}
