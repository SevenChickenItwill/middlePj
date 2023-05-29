package com.mid.alcohol.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class PaymentMainController {
	
	@GetMapping("/")
	public String paymenthome(Model model) {
		return "pay";
	}
}
