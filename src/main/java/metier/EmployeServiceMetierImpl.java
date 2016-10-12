package metier;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import dao.IEmploye;
import entities.Employe;

public class EmployeServiceMetierImpl implements IEmployerServiceMetier{
	
@Autowired
private IEmploye employe;

public ArrayList<Employe> getListsEmploye() {
	// TODO Auto-generated method stub
	return employe.getListsEmploye();
}

public void addEmploye(Employe em) {
	// TODO Auto-generated method stub
	employe.addEmploye(em);
}

public void deleteEmploye(long id) {
	// TODO Auto-generated method stub
	employe.deleteEmploye(id);
}

public Employe getEmploye(long id) {
	// TODO Auto-generated method stub
	return employe.getEmploye(id);
}
	


}
