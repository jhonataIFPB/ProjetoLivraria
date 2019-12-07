package ProjetoLivraria.POO.IFPB;

import java.util.Set;

public class Autor {
	
	private Long id;
	private String nomeAutor;
	private Set <Livros> livros;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public Set<Livros> getLivros() {
		return livros;
	}
	public void setLivros(Set<Livros> livros) {
		this.livros = livros;
	}
	
}