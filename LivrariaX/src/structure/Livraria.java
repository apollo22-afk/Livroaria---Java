package structure;

import java.util.ArrayList;
import java.util.List;

import model.Item;

public class Livraria {
	
	private List<Item> items;
	
	public Livraria() {
		this.items = new ArrayList<Item>();
	}

	public void adicionarItem(Item item) {
		this.items.add(item);
	}
	
	public void listarItem() {
		if (items.isEmpty()) {
			System.out.println("Lista vazia");
		} else {
			for (Item i : items) {
				i.mostrarDetalhes();
				System.out.println("-".repeat(35));
			}
		}
	}
}
