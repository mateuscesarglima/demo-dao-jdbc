package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	// Opera��o respons�vel por inserir no BD o obj
	void insert(Department obj);
	
	// Opera��o respons�vel por atualizar os dados no BD
	void update(Department obj);
	
	// Opera��o respons�vel por deletar dados por ID
	void deleteById(Integer id);
	
	// Opera��o respons�vel por procurar pelo ID
	Seller findById(Integer id);
	
	List<Seller> findAll();
}
