package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.entity.Employee;
@Service
public class AppService {

	@Autowired
	private MyRepo myRepo;
	public boolean login(String uname, String pass){
		if(uname.equals("admin")&& pass.equals("manager")){
			return true;
		}
		else{
			return false;
		}
	}
	
	private static HashMap<Integer,List<Employee>> hm = new HashMap<Integer,List<Employee>>();

	public boolean addUser(Employee e){
		myRepo.save(e);
		return true;
	}
	
	
	public boolean updateperson(Employee e, int id){
		
		if(hm.containsKey(id)){
			
			ArrayList<Employee> al = new ArrayList<Employee>();
			al.add(e);
			hm.put(id,al);
			System.out.println(hm.get(id));
			return true;
	}
		else{
			return false;
		}
	}

	
	public boolean deleteperson(int id ){
		
	if(hm.containsKey(id))
	{
		hm.remove(id);
		System.out.println(hm.get(101));
	return true;
	}
	else{
		return false;
	}
	
	}	
	
}
