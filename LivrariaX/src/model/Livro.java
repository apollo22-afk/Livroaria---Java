package model;

public class Livro extends Postagem{
	
	private int numeroPaginas;
	
	public Livro(String titulo, String autor, String preco, int numeroPaginas) {
		super(titulo, autor, preco);
		this.numeroPaginas = numeroPaginas;
	}
	
	@Override
	public void mostrarDetalhes() {
		super.mostrarDetalhes();
		System.out.println("Numero de Paginas: "+numeroPaginas);
	}

}
