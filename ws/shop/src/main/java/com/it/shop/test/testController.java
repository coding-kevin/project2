package com.it.shop.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	
	private static final Logger logger = LoggerFactory.getLogger(testController.class);
	
	@RequestMapping("/test")
	public void test() {
		logger.info("테스트");
	}
}
