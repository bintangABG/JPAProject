package com.jod.app;

import com.jod.model.Employee;
import java.text.DecimalFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.derby.iapi.store.raw.Transaction;

public class MainJPA {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProjectPU");        
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
//        Employee staf = new Employee();
//        staf.setName("Jodhy");
//        staf.setPosition("Manager");
//        staf.setSalary(8000000.0);
//        staf.setDateOfBirth(new Date());
        
        Employee staf = em.find(Employee.class, 101);
        System.out.println("Nama "+staf.getName());
//        em.persist(staf);
        
//        tx.commit();
        
        em.close();
        emf.close();
    }
    
}
