package com.kn.Bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee 
{
	List<String> technoloogies ;
	Set<String> projects;
	Map<String,String> organisation;
	public Employee(List<String> technoloogies, Set<String> projects, Map<String, String> organisation) {
		super();
		this.technoloogies = technoloogies;
		this.projects = projects;
		this.organisation = organisation;
	}
	public Employee() {
		super();
	}
	public List<String> getTechnoloogies() {
		return technoloogies;
	}
	public void setTechnoloogies(List<String> technoloogies) {
		this.technoloogies = technoloogies;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	public Map<String, String> getOrganisation() {
		return organisation;
	}
	public void setOrganisation(Map<String, String> organisation) {
		this.organisation = organisation;
	}
	@Override
	public String toString() {
		return "Employee [technoloogies=" + technoloogies + ", projects=" + projects + ", organisation=" + organisation
				+ "]";
	}
	
	
}
