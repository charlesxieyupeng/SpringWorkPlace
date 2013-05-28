package com.charlie.SpringDB.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.charlie.SpringDB.springJDBC.companyDao.CompanyDao;
import com.charlie.SpringDB.springJDBC.model.Company;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
    	CompanyDao companydao = (CompanyDao)ac.getBean("companyDao");
//    	Custom auto scan component name
//    	By default, Spring will lower case the first character of the component 
//    	– from ‘CustomerService’ to ‘customerService’. 
//    	And you can retrieve this component with name ‘customerService’.
		Company company = companydao.getCompany(2);
		
		System.out.println(company.getName());
		System.out.println("The total number of companies in db: "+companydao.countCompany());
    }
}