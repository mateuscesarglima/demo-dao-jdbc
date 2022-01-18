package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	// Opera��o respons�vel por inserir no BD o obj
	void insert(Department obj);
	
	void update(Department obj);
	
	void deleteById(Integer id);
	
	Department findById(Integer id);
	
	List<Department> findAll();
	
}
