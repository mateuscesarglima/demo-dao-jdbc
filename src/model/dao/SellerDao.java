package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	// Opera��o respons�vel por inserir no BD o obj
	void insert(Department obj);
	
	void update(Department obj);
	
	void deleteById(Integer id);
	
	Seller findById(Integer id);
	
	List<Seller> findAll();
}
