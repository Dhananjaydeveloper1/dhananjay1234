package Studentdemo;

public class Student {
private Integer Id;
private String Name;
private String SchoolName;
private String Section;
private String Address;
private String Email;
private Integer MobNo;

//construcer
public Student(){
	super();
}
//parameterconstrucer
public Student(Integer Id,String Name,String SchoolName,String Section,String Address,String Email,Integer MobNo) {
	super();
	this.Id=Id;
	this.Name=Name;
	this.SchoolName=SchoolName;
	this.Section=Section;
	this.Address=Address;
	this.Email=Email;
	this.MobNo=MobNo;
	
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
public String getSchoolName() {
	return SchoolName;
}
public void setSchoolName(String schoolName) {
	SchoolName = schoolName;
}
public String getSection() {
	return Section;
}
public void setSection(String section) {
	Section = section;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public Integer getMobNo() {
	return MobNo;
}
public void setMobNo(Integer mobNo) {
	MobNo = mobNo;
}

}
