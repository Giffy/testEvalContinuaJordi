package model;

import java.util.Set;

public interface AdminServices {
	
	public Admin findAdmin(int id);
	
	public Set<Admin> findAllAdmin();

}
