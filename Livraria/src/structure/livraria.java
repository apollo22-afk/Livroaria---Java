package structure;

import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class livraria {
	
	private List<Livro> livros;
	
	public void Livraria() {
		livros = new ArrayList<livros>();
	}

	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}
	
	public void listarLivros() {
		System.out.println("Livros Disponíveis");
		for (Livro l : livros) {
			System.out.println(l.toString())
		}
	}
	
	public Livro buscaLivroPorTitulo(String titulo) {
		for (Livro l: livros) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				return l;
			}
		}
		return null;
	}
}
