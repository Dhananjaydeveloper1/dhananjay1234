package Studentdemo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestProduct {
	
	ProductScenario productscenario=new ProductScenario();


	@GetMapping("/myurl")
	public String saytitle() {
		System.out.println("hello");
		return "dhananjay";
	}
@GetMapping("/productinfo")
public Product getDummyproduct() {
	Product p  =new Product();
	p.setName("dk");
	p.setOrder("sony");
	p.setDate("12/08/2021");
	p.setId(123);
	
	return p;
	}
@PostMapping(value = "/insertproductdetails")
public Product insertDummyproduct(@RequestBody Product product ) {

return productscenario.addproduct(product); //calling the service
}
@PutMapping("/update")


public Product updateproductInfo(@RequestBody Product product) {

return productscenario.updateproduct(product);

}

//get list
@GetMapping("/getlist")
public  List<Product> getDummyproductList()
{
ProductScenario productscenario = null;
List<Product> listofproduct=productscenario.getAllProductlist();
return listofproduct;
}
}
