import structure.Livraria;
import model.Livro;
import model.ebook;
import model.Revista;
import java.util.Scanner;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livraria livraria = new Livraria();
		Scanner scanner = new Scanner(System.in);
		int opcao = 9;
		
		while (opcao != 0) {
			
			System.out.println("Menu:");
			System.out.println("1- Cadastrar livro");
			System.out.println("2- Cadastrar ebook");
			System.out.println("3- Cadastrar revista");
			System.out.println("4- Listar items");
			System.out.println("5- Sair");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
				case 1: {
					System.out.println("\nTitulo: ");
					String titulo = scanner.nextLine();
					
					System.out.println("Autor: ");
					String autor = scanner.nextLine();
					
					System.out.println("Preço: ");
					String preco = scanner.nextLine();
					
					System.out.println("Número de Páginas: ");
					int paginas = scanner.nextInt();
					scanner.nextLine();
					Livro l = new Livro(titulo, autor, preco, paginas);
					livraria.adicionarItem(l);
					break;
				}
					
				case 2: {
					System.out.println("\nTitulo: ");
					String titulo = scanner.nextLine();
					
					System.out.println("Autor: ");
					String autor = scanner.nextLine();
					
					System.out.println("Preço: ");
					String preco = scanner.nextLine();
					
					System.out.println("Tamanho do Arquivo: ");
					double tamanhoArquivo = scanner.nextDouble();
					scanner.nextLine();
					ebook Ebook = new ebook(titulo, autor, preco, tamanhoArquivo);
					livraria.adicionarItem(Ebook);	
					break;
				}
				case 3:{
					System.out.println("\nTitulo: ");
					String titulo = scanner.nextLine();
					
					System.out.println("Autor: ");
					String autor = scanner.nextLine();
					
					System.out.println("Preço: ");
					String preco = scanner.nextLine();
					
					System.out.println("Edição da Revista: ");
					int edicao = scanner.nextInt();
					scanner.nextLine();
					Revista revista = new Revista(titulo, autor, preco, edicao);
					livraria.adicionarItem(revista);	
					break;
				}
				case 4:{
					livraria.listarItem();
					break;
				}
				case 5:{
					System.exit(0);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: "+opcao);
			}
		}
		scanner.close();
	}

}
