package com.menegheti.blog.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Postagem implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String titulo;
	private String texto;
	
	private Autor autor;
	
	private List<Comentario> comentarios = new ArrayList<Comentario>();

}
