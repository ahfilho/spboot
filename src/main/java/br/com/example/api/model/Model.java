package br.com.example.api.model;

import java.util.Date;

public class Model {

	private int id;
	private String nome;
	private Date data;
	private boolean Status;


	public Model(int id, String nome, Date data, boolean status) {
		this.id = id;
		this.nome = nome;
		this.data = data;
		Status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public boolean getStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	
}
