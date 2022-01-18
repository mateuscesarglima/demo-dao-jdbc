package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao dp = DaoFactory.createDepartmentDao();
		
		Department newDp = new Department(null, "Joao");
		
		dp.insert(newDp);
		
		System.out.println("Inserted new Id" + newDp.getId());

	}

}
