package br.com.bkps.uploadbkps.controller;

import java.io.Serializable;

import org.springframework.stereotype.Controller;

@Controller
public class UploadBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1539584940501662586L;
	
	private String nome;
	private String email;
	private String empresa;
	private String messagem;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getMessagem() {
		return messagem;
	}
	public void setMessagem(String messagem) {
		this.messagem = messagem;
	}
	
}
