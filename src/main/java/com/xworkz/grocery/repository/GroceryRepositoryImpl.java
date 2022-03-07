package com.xworkz.grocery.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.xworkz.grocery.entity.GroceryEntity;

@Repository
public class GroceryRepositoryImpl implements GroceryRepository {
	// @Autowired
	private EntityManagerFactory entityManagerFactory;

	public GroceryRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		super();
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public void save(GroceryEntity entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			if (entityManager != null) {
				System.out.println("Data saved");
			} else {
				System.out.println("Data not saved");
			}
		}
	}

	public GroceryEntity findByName(String name) {
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			return (GroceryEntity)query.getSingleResult();
		} finally {
			entityManager.close();
		}
	}
	public GroceryEntity updateBrandByName(String name, String newBrand) {
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		try {
			Query query = entityManager.createNamedQuery("updateBrandByName");
			query.setParameter("nm", name);
			query.setParameter("nbrand", newBrand);			
			Object obj=query.executeUpdate();
			transaction.commit();			
		} 
		catch(PersistenceException e){
			transaction.rollback();
			e.printStackTrace();
		}
		finally {		
			if(entityManager!=null) {
			entityManager.close();
			}
		}
		return null;
	 }
}
	
