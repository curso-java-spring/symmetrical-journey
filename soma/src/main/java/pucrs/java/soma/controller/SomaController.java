package pucrs.java.soma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
  
@Controller
public class SomaController {

	@GetMapping("/add")
	private String somar() {
		return "formSoma";
	}
	
	@PostMapping("/add")
	private String somar(@RequestParam int a, 
			@RequestParam int b, 
			Model model) {
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("soma", a + b);
		return "resultado";
	}
}
