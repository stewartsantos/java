package com.fut.fot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaterialController {

	@RequestMapping("/cadastrarMaterial")
	public String form() {
		return "cadastros/formMaterial";
	}
	
}
