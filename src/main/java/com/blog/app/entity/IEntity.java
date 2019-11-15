package com.blog.app.entity;

import java.io.Serializable;

/**
 * 
 * Interface to IOC for REST entities
 * 
 * @author luiz.santos
 */
public interface IEntity<PK extends Serializable> extends Serializable {

	PK getId();

	void setId(PK id);
		
}