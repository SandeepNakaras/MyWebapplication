package service.state.tx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.state.tx.model.Coffee;

@RestController
public class RestServiceImpl {
	
	@RequestMapping("/getListofCoffee")
	public void getListofMenu(Coffee coffee){
		coffee.getId();
		coffee.getCoffeeType();
		
		
	}

}
