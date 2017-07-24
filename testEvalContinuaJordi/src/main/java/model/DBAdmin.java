package model;

import java.util.HashSet;
import java.util.Set;

public class DBAdmin implements AdminServices{

	@Override
	public Admin findAdmin(int id) {				
		return getMockAdmin((int)Math.random()*1000000 ,"Pedro");
	}

	private Admin getMockAdmin(int d, String string) {
		Admin admin = new Admin();
		admin.setId(d);
		admin.setName(string);
		return admin;
	}

	@Override
	public Set<Admin> findAllAdmin() {
		int size= (int) (Math.random()*100);
		HashSet<Admin> list = new HashSet<>();
		
		for (int i=0; i<size;i++){
			list.add(getMockAdmin(i, "NoName" + i));
		}
		
		return list;
	}	
}