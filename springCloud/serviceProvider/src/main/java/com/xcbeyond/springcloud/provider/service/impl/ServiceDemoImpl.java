package com.xcbeyond.springcloud.provider.service.impl;

import org.springframework.stereotype.Service;

import com.xcbeyond.springcloud.provider.service.ServiceDemo;

@Service
public class ServiceDemoImpl implements ServiceDemo {

	@Override
	public String messageContext() {
		String str = "您好！我是服务提供者";
		return str;
	}

}
