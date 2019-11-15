package com.template.app.rest.author;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.template.app.entity.AuthorEntity;
import com.template.app.exception.AppException;

/**
 * Class Rest to provide author rest
 * 
 * @author luiz.santos
 *
 */
@Path("/author")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class AuthorRest {
	
	private final static Logger LOGGER = Logger.getLogger(AuthorRest.class.getName());
	

	@GET
	@Path("/all")
	public List<AuthorEntity> getAllAuthors() throws AppException{
		LOGGER.info("AuthorRest.getAllAuthors");
		List<AuthorEntity> listAuthors = new ArrayList<AuthorEntity>();
		listAuthors.add(new AuthorEntity(1L));
		listAuthors.add(new AuthorEntity(2L));
		listAuthors.add(new AuthorEntity(3L));
		LOGGER.info("AuthorRest.getAllAuthors: "+listAuthors);
		return listAuthors;
	}

	
	
}
