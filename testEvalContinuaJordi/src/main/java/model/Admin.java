package model;

public class Admin {

	private int id;
	private String name;
	private String surname;
	
	public Admin(int i, String string){
		id = i;
		name = string;
	}
	
	
	public Admin(){
		id= 0;
		name= "0";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
		
}
