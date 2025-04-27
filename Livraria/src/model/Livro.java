package model;

public class Livro {
	
	private String titulo;
	private Autor autor;
	private double preco;
	private int estoque;
	
	public Livro(String titulo, Autor autor, double preco, int estoque) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.estoque = estoque;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	/*Método ToString para identificação de classe*/
	
	@Override
	public String toString() {
		return "Titulo: "+titulo+", Autor: "+autor+", Preco: R$ "+preco+", Estoque: "+estoque;
	}
}
