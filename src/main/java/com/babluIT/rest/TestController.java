package com.babluIT.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.babluIT.service.InvokeQuotaApi;

@RestController
public class TestController {

	@Autowired
	private InvokeQuotaApi iqa;

	@GetMapping("/clint")
	public String getdata() {
		String quotadata = iqa.getapidataresponse();
		System.out.println(quotadata);
		return quotadata;
	}

}
