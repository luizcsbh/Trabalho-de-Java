package com.blog.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * AUTHOR Entity
 * 
 * @author luiz.santos
 */
@Entity
@Table(name="AUTHOR")
@SequenceGenerator(name = "AUTHORY_ID_GENERATOR", sequenceName = "SE_AUTHOR", allocationSize = 1)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

@NamedQueries({
    @NamedQuery(name="AuthorEntity.retrieveAll", query="Select distinct a from AuthorEntity a")
   
}) 

public class AuthorEntity implements IEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUTHOR_ID_GENERATOR")
	private Long id;
	
	@NotNull 
	@Size(min=5, max = 40)
	@Column
	private String name;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
}
