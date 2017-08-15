package br.com.dominio;

public class Usuario {
	private int codigo;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario(){}
	
	public Usuario(String nome,String email, String senha){
		this.setNome(nome);
		this.setEmail(email);
		this.setSenha(senha);
	}
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
