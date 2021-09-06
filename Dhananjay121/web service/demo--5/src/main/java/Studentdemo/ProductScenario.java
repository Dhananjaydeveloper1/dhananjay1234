package Studentdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductScenario {

static HashMap<Integer,Product> productIdMap = getProductIdMap(); //map list
	
	public ProductScenario()
	{
		super();
		
		
		if(productIdMap == null) {
			productIdMap = new HashMap<Integer, Product>();
			Product indiaProduct =new Product(1, "oil", "oil","12/07/2021");
			Product delhiproduct =new Product(2, "mobile", "sony", "12/05/2021" );
			Product biharProduct =new Product(3, "tv", "sony", "15/08/2020");
			Product barbighaProduct =new Product(4, "rice", "vns", "16/07/2021" );
			
			productIdMap.put(1, indiaProduct);
			productIdMap.put(2, delhiproduct);
			productIdMap.put(3, biharProduct);
		    productIdMap.put(4, barbighaProduct);
				
		}
	}
		public List<Product> getAllProductlist() {
			List<Product> productlist = new ArrayList<Product>(productIdMap.values());
			return productlist;
			}

			 public Product getproduct(int id) {
			Product product = productIdMap.get(id);
			return product;
			}
			// add product
			public Product addproduct(Product product ) {
			product.setId(getMaxId()+ 1);
			// key , value
			productIdMap.put(product.getId(),product); ///logic class
			return product;
			}
			//order product
			public Product orderproduct(Product product) {
				product.setId(getMaxId()+1);
				return productIdMap.put(product.getId(),product);
			}
			//update
			public Product updateproduct(Product Product) {
			if (Product.getId() <= 0)
			return null;
			productIdMap.put(Product.getId(), Product);
			return Product;

			 }
			//delete

			 public void deleteProduct(int id) {
			productIdMap.remove(id);
			}

			 public static HashMap<Integer, Product> getProductIdMap() {
			return productIdMap;
			}

			 // Utility method to get max id
			public static int getMaxId() {
			int max = 0;
			for (int id : productIdMap.keySet()) 
			{
				
			if (max <= id)
			max = id;

			 }
			return max;
			}
			}

	

	