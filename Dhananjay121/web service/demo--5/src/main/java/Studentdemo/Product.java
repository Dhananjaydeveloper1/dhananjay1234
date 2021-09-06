package Studentdemo;

public class Product {
	private Integer Id;
	private String Name;
	private String order;
	private String date;
	
	 public Product() // contructor
	 {
	 super();
	 }
	 public Product(Integer id,String name,String order,String date) //paraco
	 {
	 super();
	 this.Id=id;
	 this.Name=name;
	 this.order=order;
	 this.date=date;
	 }
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
}
