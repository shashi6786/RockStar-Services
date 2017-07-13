package com.fanpage.rockstar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RockstarController {
		/**
		 * This method is to test the REST URL.
		 * @throws SQLException
		 * @throws IOException
		 */
		@RequestMapping(value="/rockstar/test", method=RequestMethod.GET)
	public String getTestData(){
			
		return "I love my fans!";

}

}
