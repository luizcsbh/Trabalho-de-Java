package com.blog.app.rest.postagens;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.blog.app.entity.PostagensEntity;


@Stateless
public class PostagensService {
	
	@PersistenceContext(unitName = "postagens-persistence-unit")
	private static EntityManager entityManager;

	public List<PostagensEntity> getAllPostagens() {
		
		//List<PostagensEntity> listPostagens = entityManager.createNamedQuery("PostagensEntity.retrieveAll").getResultList();
		List<PostagensEntity> listPostagens = entityManager.createNamedQuery("PostagensEntity.retrieveAll").getResultList();	
			return listPostagens;
	}
	
	public static PostagensEntity create(PostagensEntity PostagensEntity) {
		entityManager.persist(PostagensEntity);
		return PostagensEntity;
	}
	
	public static void delete(PostagensEntity PostagensEntity) {
		entityManager.remove(PostagensEntity);
		return;
	}

}
