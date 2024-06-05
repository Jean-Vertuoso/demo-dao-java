package application;

import model.dao.SellerDao;
import model.entities.Seller;
import model.dao.DaoFactory;

public class Program {

    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
}