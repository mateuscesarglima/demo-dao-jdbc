package application;



import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: Seller FindById: ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("=== TEST 2: Seller FindByDepartment: ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: Seller FindByAll: ===");
		list = sellerDao.findAll();
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 4: Seller Insert ===");
		Seller newSeller = new Seller(null, "Mateus", "mateus@gmail.com", new Date(), 5000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id = " + newSeller.getId());
		
		System.out.println("=== TEST 5: Seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Marta Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		

		System.out.println("=== TEST 5: Seller Delete ===");
		seller = sellerDao.findById(10);
		sellerDao.deleteById(seller.getId());
		System.out.println("Deleted!");
		
		
	}

}
