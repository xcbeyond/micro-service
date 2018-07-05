package com.xcbeyond.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Controller demo
 * @author xcbeyond
 * 2018年7月5日下午11:22:49
 */

@RestController
public class ControllerDemo {

	@RequestMapping("/print")
	public String print() {
		return "hello SpringBoot!";
	}
}
