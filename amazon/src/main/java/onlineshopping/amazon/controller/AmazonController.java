package onlineshopping.amazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import onlineshopping.amazon.service.AmazonService;

@Controller
public class AmazonController {
	private AmazonService amazonService;

	public AmazonController(AmazonService amazonService) {
		super();
		this.amazonService = amazonService;
	}
	//handler method to handle list students
	
	
	@GetMapping("/Amazon")
	public String listAmazon(Model model) {
		model.addAttribute("amazon",amazonService.getAllAmazonEntities());
		return "Amazon";
	}
	
	
}
