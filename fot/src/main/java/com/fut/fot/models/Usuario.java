package com.fut.fot.models;

public class Usuario {

	private String usuario;
	private String senha;
	private String nome;
	private long codigo_usuario;
	private Perfil perfil;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCodigo_usuario() {
		return codigo_usuario;
	}
	public void setCodigo_usuario(long codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	
}
