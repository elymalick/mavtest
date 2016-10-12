package dao;

import java.util.ArrayList;

import javax.enterprise.context.spi.Context;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import entities.Employe;

public class EmployeImpl implements IEmploye {
	
		@PersistenceContext
		EntityManager entity ;

		public ArrayList<Employe> getListsEmploye() {
			// TODO Auto-generated method stub
			return null;
		}

		public void addEmploye(Employe em) {
			// TODO Auto-generated method stub
			entity.persist(em);
		}

		public void deleteEmploye(long id) {
			// TODO Auto-generated method stub
			
		}

		public Employe getEmploye(long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
	


}
