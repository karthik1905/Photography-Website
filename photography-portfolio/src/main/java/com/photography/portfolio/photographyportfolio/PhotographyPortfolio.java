package com.photography.portfolio.photographyportfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotographyPortfolio {

//	@Autowired
//	PhotographyPortfolioRepository ppr;
	
	@GetMapping(value="/get") 
	public Boolean getData(){
		return true;
	}
	
}
