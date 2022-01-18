package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	// Operação responsável por inserir no BD o obj
	void insert(Department obj);
	
	// Operação responsável por atualizar os dados no BD
	void update(Department obj);
	
	// Operação responsável por deletar dados por ID
	void deleteById(Integer id);
	
	// Operação responsável por procurar pelo ID
	Seller findById(Integer id);
	
	List<Seller> findAll();
}
