package com.xworkz.grocery.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.grocery.entity.GroceryEntity;
@Repository
public class GroceryRepositoryImpl implements GroceryRepository{
	@Autowired
	 private EntityManagerFactory entityManagerFactory;
	
	public GroceryRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		super();
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public void save(GroceryEntity entity) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e){
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			if(entityManager!=null) {
				System.out.println("Data saved");
			}else {
				System.out.println("Data not saved");
			}
		}
	}

}
