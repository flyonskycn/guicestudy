package com.flyonsky;

import com.google.inject.Inject;

public class HelloWorldImp implements HelloWorld{
	@Inject
	public String sayHello() {
		return "Hello, world!";
	}
}
