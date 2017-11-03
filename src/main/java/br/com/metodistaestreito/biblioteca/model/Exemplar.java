package br.com.metodistaestreito.biblioteca.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exemplar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer	id;
	
	private Integer idLivro;
	
	@Column(unique=true)
	private String codigoLivro; //md5
	
	private String nome;
	private Autor autor;
	private Date dataPublicacao;
	private Editora editora;
	private Genero genero;
	private boolean emprestado;
	private boolean reservado;
	
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getIdLivro() {
		return idLivro;
	}
	
	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}
	
	public String getCodigoLivro() {
		return codigoLivro;
	}
	
	public void setCodigoLivro(String codigoLivro) {
		this.codigoLivro = codigoLivro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	public Editora getEditora() {
		return editora;
	}
	
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public boolean isEmprestado() {
		return emprestado;
	}
	
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	public boolean isReservado() {
		return reservado;
	}
	
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
	
	

}
