package userInterface;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
	
	@GetMapping("/address")
	public String showForm(Model model) {
		Address address = new Address();
		model.addAttribute("address", address);
		
		return "Address_Form";
	}
		
	/*
	@PostMapping("/address")
	public String submitForm(@ModelAttribute("address") Address address) {
		return "AddressConfirmation";
	} 
	 */
	
	@PostMapping("/address")
	public String submitForm(@ModelAttribute("address") Address address) {
		
		return "AddressConfirmation";
	} 
	
	
	@GetMapping("/addressConfirmation")
	public String confirmAddress() {
		return "AddressConfirmation";
	}
	
	@GetMapping("/menu")
<<<<<<< HEAD
	private String showMenu()
	{
	    final String uri = "http://menu.us-e2.cloudhub.io/menu";

	    RestTemplate restTemplate = new RestTemplate();
	 
	    String result = restTemplate.getForObject(uri, String.class);
	    
	    Gson gson = new Gson();
	    
	    //System.out.println(result);
	 
	    
	    MenuSchema menuschema = gson.fromJson(result, MenuSchema.class);
	    
	    
	    //System.out.println(menuschema);
	    
	    return "Menu";

=======
	public String showMenu() {
		return "Menu";
>>>>>>> 88d4f931707e29cdca6a045fad450c9101de90a2
	}
	
	@GetMapping("/orderConfirmation")
	public String confirmOrder() {
		return "OrderConfirmation";
	}
	
		}

