package com.training.samples;
import java.util.*;

public class StudentList {
	
	private Set<Student> nameList;
	Set<String> names;
	public StudentList(){
		names = new HashSet<String>();
		names.add("Shariq");
		names.add("Krishna");
		names.add("Shariq");
	}
	
	public Set<String> getNames(){
		return names;
	}
	
	public Set<Student> getStudentList(){
		
		return nameList;
	}

	public Set<Student> getNameList() {
		return nameList;
	}

	public void setNameList(Set<Student> nameList) {
		this.nameList = nameList;
	}
}
