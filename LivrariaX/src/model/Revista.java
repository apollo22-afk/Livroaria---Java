package model;

public class Revista extends Postagem{

	private int edicao;
	
	public Revista(String titulo, String autor, String preco, int edicao) {
		super(titulo, autor, preco);
		this.edicao = edicao;
	}
	
	@Override
	public void mostrarDetalhes() {
		super.mostrarDetalhes();
		System.out.println("Edicao: "+edicao);
	}
}
