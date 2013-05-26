package derby.jdbc.demo;

import derby.jdbc.dao.CompanyDao;
import derby.jdbc.model.Company;

public class JDBCDemo {
	public static void main(String[] args) {
		Company company = new CompanyDao().getCompany(3);
		System.out.println(company.getName());
	}
}
