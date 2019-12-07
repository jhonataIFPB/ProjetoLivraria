package ProjetoLivraria.POO.IFPB;

import java.util.Set;

public class Editora {
	
	private Long id;
	private String nomeEd;
	private Set <Livros> livros;
	private Set <Autor> autores;
	
	public Set<Livros> getLivros() {
		return livros;
	}
	public void setLivros(Set<Livros> livros) {
		this.livros = livros;
	}
	public Set<Autor> getAutores() {
		return autores;
	}
	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeEd() {
		return nomeEd;
	}
	public void setNomeEd(String nomeEd) {
		this.nomeEd = nomeEd;
	}
	public Set<Livros> getlivros() {
		return livros;
	}
	public void setlivros(Set<Livros> livros) {
		this.livros = livros;
	}
	
	
}
