package br.com.bkps.uploadbkps.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
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
	private String mensagem;

	public void gravar() {
		System.out.println("cliente gravado com sucesso: " + nome);
	}
	
    public void handleFileUpload(FileUploadEvent event) {
    	InputStream stream;
    	
    	try {
			stream = event.getFile().getInputstream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
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

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
