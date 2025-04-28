package model;

public class ebook extends Postagem{
	
	private double tamanhoArquivo;
	
	public ebook(String titulo, String autor, String preco, double tamanhoArquivo) {
		super(titulo, autor, preco);
		this.tamanhoArquivo = tamanhoArquivo;
	}

	@Override
	public void mostrarDetalhes() {
		super.mostrarDetalhes();
		System.out.println("Tamanho do arquivo: "+tamanhoArquivo);
	}
}
