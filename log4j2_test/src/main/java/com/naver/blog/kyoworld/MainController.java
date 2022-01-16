package com.naver.blog.kyoworld;

import org.springframework.http.HttpRequest;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Controller
//@Slf4j
public class MainController {
    private static final Logger logger = LogManager.getLogger(MainController.class);
    
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String payload(@RequestParam("payload") String payload) {
		logger.info("payload : {}", payload);
		
		return "index.html";
	}
	
}
