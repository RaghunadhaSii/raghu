package com.raghu.AutomationEx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

@RequestMapping("/")
public String sayHello() {
	
	return "Hi ................";
}
}
