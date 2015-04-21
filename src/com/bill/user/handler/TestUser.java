package com.bill.user.handler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.spi.RootLogger;

import java.util.List;

import com.bill.user.domain.Authorization;
import com.bill.user.domain.User;

public class TestUser {

	/**
	 * @param args
	 */
    static{                // Static initializer
        BasicConfigurator.configure();
        RootLogger.getRootLogger().setLevel(Level.WARN);
    }

    public static void main(String[] args) throws Exception {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("user");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Add a new user to user table
        User u = new User();
        u.setUserId(4);
        u.setPassword("esolve123");
        u.setUserName("mohan");
        u.setEnabled(1);
        
        Authorization a = new Authorization();
        a.setRole("ROLE_ADMIN");
        a.setUserRoleId(1);
        a.setUserIdParent(u);
        
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(u);
            entityManager.persist(a);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
             e.printStackTrace();
             entityManager.getTransaction().rollback();
        }
        
        try {
           // User u2 = entityManager.find(User.class, 1);
           // System.out.println("user id: " + u2.getUserId() + " name: " + u2.getUserName());
            User u3 = entityManager.find(User.class, 4);
            System.out.println("user id: " + u3.getUserId() + " name: " + u3.getUserName());
        } catch (RuntimeException e) {
             e.printStackTrace();
             entityManager.getTransaction().rollback();
        } finally {
             entityManager.close();
        }

    }


}




