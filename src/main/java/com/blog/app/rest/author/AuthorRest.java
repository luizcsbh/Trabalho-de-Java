
package com.blog.app.rest.author;

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

import com.blog.app.entity.AuthorEntity;
import com.blog.app.exception.AppException;

/**
 * Class Rest to provide author rest operations
 * 
 * @author luiz.santos
 *
 */
@Path("/authory")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class AuthorRest{
	
	private final static Logger LOGGER = Logger.getLogger(AuthorRest.class.getName());
	
	@Inject
	private AuthorService authorService;
	
	@GET
	@Path("/all")
	public List<AuthorEntity> getAllAuthors() throws AppException{
		LOGGER.info("AuthorRest.getAllAuthors");
		List<AuthorEntity> ListAuthors = authorService.getAllAuthors();
		LOGGER.info("AuthorRest.getAllAuthors: "+ListAuthors);
		return ListAuthors;
	}

	@POST
	@Path("/create")
	public AuthorEntity create(AuthorEntity entity) throws AppException{
		return authorService.create(entity);
	}
	
	@DELETE
	@Path("/delete")
	public void delete(AuthorEntity entity) throws AppException{
		authorService.delete(entity);
	}
	
}
