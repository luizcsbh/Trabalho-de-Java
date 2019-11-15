package com.blog.app.rest.author;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.blog.app.entity.AuthorEntity;

@Stateless
public class AuthorService {
	
	@PersistenceContext(unitName = "author-persistence-unit")
	private EntityManager entityManager;

	public List<AuthorEntity> getAllAuthors() {
		
		//List<AuthorEntity> listAuthors = entityManager.createNamedQuery("AuthorEntity.retrieveAll").getResultList();
		List<AuthorEntity> listAuthors = entityManager.createNamedQuery("AuthorEntity.retrieveAll").getResultList();	
			return listAuthors;
	}
	
	public AuthorEntity create(AuthorEntity AuthorEntity) {
		entityManager.persist(AuthorEntity);
		return AuthorEntity;
	}
	
	public void delete(AuthorEntity AuthorEntity) {
		entityManager.remove(AuthorEntity);
		return;
	}

}
