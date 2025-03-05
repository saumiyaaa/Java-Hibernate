package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.bean.Product;
import java.util.List;

public class ProductService {
    
    private static SessionFactory factory;
    
    static {
        // Initialize Hibernate configuration and session factory
        Configuration c = new Configuration();        
        factory = c.configure().buildSessionFactory();
    }

    public void addProduct(Product product) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);//insert
        transaction.commit();
        session.close();
        System.out.println("Product added successfully: " + product);
    }

    public Product getProduct(int prodid) {
        Session session = factory.openSession();
        Product product = (Product) session.get(Product.class, prodid);
        session.close();
        return product;
    }

    
    @SuppressWarnings("unchecked")
    public List<Product> getAllProducts() {
        Session session = factory.openSession();
        List<Product> productList = session.createQuery("from Product").list(); // No Class argument
        session.close();
        return productList;
    }
    

    public void updateProduct(Product product) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        if (product != null) {
        	session.update(product);
            System.out.println("Product updated successfully: " + product);
        } else {
            System.out.println("Product with ID not found.");
        }
        
        transaction.commit();
        session.close();
        System.out.println("Product updated successfully: " + product);
    }

    public void deleteProduct(int prodid) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product = (Product) session.get(Product.class, prodid);
        if (product != null) {
            session.delete(product);
            System.out.println("Product deleted successfully: " + product);
        } else {
            System.out.println("Product with ID " + prodid + " not found.");
        }
        transaction.commit();
        session.close();
    }
    
    public static void closeFactory() {
        factory.close();
    }
}
