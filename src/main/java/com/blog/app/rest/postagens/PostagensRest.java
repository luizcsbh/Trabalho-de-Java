
package com.blog.app.rest.postagens;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.blog.app.entity.PostagensEntity;
import com.blog.app.exception.AppException;

/**
 * Class Rest to provide author rest operations
 * 
 * @author luiz.santos
 *
 */
@Path("/postagens")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class PostagensRest{
	
	private final static Logger LOGGER = Logger.getLogger(PostagensRest.class.getName());
	
	@Inject
	private PostagensService postagensservice;
	
	@GET
	@Path("/all")
	public List<PostagensEntity> getAllPostagens() throws AppException{
		LOGGER.info("PostagensRest.getAllPostagens");
		List<PostagensEntity> ListPostagens = postagensservice.getAllPostagens();
		LOGGER.info("PostagensRest.getAllPostagens: "+ListPostagens);
		return ListPostagens;
	}

	@POST
	@Path("/create")
	public PostagensEntity create(PostagensEntity entity) throws AppException{
		return PostagensService.create(entity);
	}
	
	@DELETE
	@Path("/delete")
	public void delete(PostagensEntity entity) throws AppException{
		PostagensService.delete(entity);
	}
	
}
