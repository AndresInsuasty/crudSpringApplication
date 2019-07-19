package com.crudAndres.crudAndres.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

		@GetMapping("/hola")
		public String doctorInformation() {
			return "index";
		}
}
