package com.memo.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@Autowired
	private TestDAO testDAO;
	
	@ResponseBody
	@RequestMapping("/test1")
	public String test1() {
		return "Hello world";
	}
	
	@ResponseBody
	@RequestMapping("/test2")
	public Map<String, Object> test2() {
		Map<String, Object> result = new HashMap<>();
		result.put("aaaa", 1111);
		result.put("bbb", 2222);
		result.put("ccc", 3333);
		
		return result;
	}
	
	@RequestMapping("/test3")
	public String test3() {
		return "test/test3";
	}
	
	@ResponseBody
	@RequestMapping("/test4")
	public List<Map<String, Object>> test4() {
		return testDAO.selectTest();
	}
}
