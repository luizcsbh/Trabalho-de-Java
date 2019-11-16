package com.blog.app.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * POSTAGENS Entity
 * 
 * @author luiz.santos
 */
@Entity
@Table(name="POSTAGENS")
@SequenceGenerator(name = "POSTAGENS_ID_GENERATOR", sequenceName = "SE_POSTAGENS", allocationSize = 1)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PostagensEntity implements IEntity<Long>{

	private static final long serialVersionUID = 2L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POSTAGENS_ID_GENERATOR")
	private Long id;
	
	@NotNull 
	@Size(max = 10)
	@Column
	private String type;

    @ManyToOne (targetEntity = AuthorEntity.class)  
    @JoinColumn(name="Author_ID", referencedColumnName="ID")
    @XmlTransient
    private AuthorEntity Author;
    
    @NotNull
    @Size (max = 50)
    @Column
    private String titulo;
    
    @NotNull
    @Size(max = 250)
    @Column
    private String descricao;
   
    @NotNull
    @Column
    java.sql.Timestamp data_postagens;
   
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AuthorEntity getAuthor() {
		return Author;
	}

	public void setAuthor(AuthorEntity Author) {
		this.Author = Author;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Timestamp getData_postagens() {
		return data_postagens;
	}
	
	public void setData_postagens(Timestamp data_postagens){
		this.data_postagens = data_postagens;
	}

}
