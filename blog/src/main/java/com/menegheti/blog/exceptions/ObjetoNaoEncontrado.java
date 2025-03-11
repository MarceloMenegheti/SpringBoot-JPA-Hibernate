package com.menegheti.blog.exceptions;

public class ObjetoNaoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjetoNaoEncontrado(String msg){
		super(msg);
	}
}
