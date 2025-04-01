package com.menegheti.docker.entity;

import java.util.Objects;

public class Convidado {
	private String name;
	private String cpf;
	
	public Convidado() {
	}
	
	public Convidado(String name, String cpf) {
		super();
		this.name = name;
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(cpf, other.cpf);
	}
	@Override
	public String toString() {
		return "Convidado [name=" + name + ", cpf=" + cpf + "]";
	}
	
	
}
