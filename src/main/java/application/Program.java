package application;

import model.dao.SellerDao;
import model.entities.Seller;
import model.dao.DaoFactory;

public class Program {

    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
}