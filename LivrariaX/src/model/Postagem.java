package model;

public class Postagem implements Item{
	
	protected String titulo;
	protected String autor;
	protected String preco;
	
	public Postagem(String titulo, String autor, String preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}
	
	@Override
	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public void mostrarDetalhes() {
		 System.out.println("Titulo: "+titulo+", autor: "+autor+", preco: "+preco);
	}
}
