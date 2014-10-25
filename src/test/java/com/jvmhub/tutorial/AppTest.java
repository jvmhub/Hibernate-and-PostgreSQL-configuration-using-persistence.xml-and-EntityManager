package com.jvmhub.tutorial;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import junit.framework.TestCase;

import com.jvmhub.tutorial.entity.AppUser;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	private EntityManager entityManager;

	public void testApp() {

		entityManager = Persistence.createEntityManagerFactory("entityManager")
				.createEntityManager();

		entityManager.getTransaction().begin();

		AppUser user = new AppUser("seconduser");
		entityManager.persist(user);

		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
