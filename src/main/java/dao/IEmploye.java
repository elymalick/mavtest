package dao;

import java.util.ArrayList;

import entities.Employe;

public interface IEmploye {
	
	public ArrayList<Employe> getListsEmploye();
	public void addEmploye(Employe em);
	public void deleteEmploye(long id);
	public Employe getEmploye(long id);
	

}
