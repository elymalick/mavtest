package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entities.Employe;
import metier.IEmployerServiceMetier;

@Controller
@RequestMapping("/test")
public class EmployeController {

//@Autowired
//private IEmployerServiceMetier employeService;	

@RequestMapping("/test")
public ModelAndView printEmployer()
{
	System.out.println("testttttttttttttttttttttttttttttttt");
	ModelAndView model=new ModelAndView("index");
	Employe em=new Employe();
	em.setDateEmbauche("ggg");
	em.setNom("ely");
	em.setPrenom("eeee");
	model.addObject("index", "eeee");
	
	 
 return model;

}
	
	
}
