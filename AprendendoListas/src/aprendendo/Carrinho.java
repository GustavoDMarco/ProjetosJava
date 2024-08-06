package aprendendo;
import java.util.ArrayList;
import java.util.List;


public class Carrinho {
	private List<Item> carrinho;

	public Carrinho() {
		this.carrinho = new ArrayList<>();
	}
	
	public void adicionar(String nome, double preco, int quantidade) {
		if(quantidade > 1) {
			preco = preco * quantidade;
		}
		
		carrinho.add(new Item(nome,preco,quantidade));
		//Quando faço new Item estou chamando o construtor de Item
	}
	
	public void remover(String nome, int quantidade) {
		List<Item> removidos = new ArrayList<>();
		for (Item i : carrinho) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				if(i.getQuantidade() > 1) {
					i.setQuantidade(quantidade-1);
				}
				else{
					removidos.add(i);
				}
			}
		}
		carrinho.removeAll(removidos);
	}
	
	
	public void valorTotal() {
		double valor = 0;
		
		for (Item item : carrinho) {
			valor = valor + item.getPreco();
		}
		
		System.out.println("Valor carrinho: " + valor + "\n");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + carrinho + "\n";
	}
}
