package com.example.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDAO {
//JPAUil객체로 옮김.
//    private EntityManagerFactory emf;
//
//    public UserDAO(){
//        emf = Persistence.createEntityManagerFactory("UserPU");
//    }
//    void close(){
//        if(emf!=null){
//            emf.close();
//        }
//    }

    private final EntityManager entityManager;
    public UserDAO(){
        this.entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    }

    public void createUser(User user){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        }finally {
            entityManager.close();
        }
    }

    public User findUser(Long id){
       try{
           return entityManager.find(User.class , id);
       }finally {
           //entityManager.close();
       }

    }
}
