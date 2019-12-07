package ProjetoLivraria.POO.IFPB;

import java.util.Calendar;
import java.util.Set;

public class Livros {

		private Long id;
		private String nomeLivro;
		private Set <Autor> autores;
		private Editora editora;
		private Calendar dataDePublicação;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNomeLivro() {
			return nomeLivro;
		}
		public void setNomeLivro(String nomeLivro) {
			this.nomeLivro = nomeLivro;
		}
		public Set<Autor> getAutores() {
			return autores;
		}
		public void setAutores(Set<Autor> autores) {
			this.autores = autores;
		}
		public Editora getEditora() {
			return editora;
		}
		public void setEditora(Editora editora) {
			this.editora = editora;
		}
		public Calendar getDataDePublicação() {
			return dataDePublicação;
		}
		public void setDataDePublicação(Calendar dataDePublicação) {
			this.dataDePublicação = dataDePublicação;
		}
		
	
		
}