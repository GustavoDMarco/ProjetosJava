package AprendendoJava;

public class Main {
	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
		
		carrinho.adicionar("Jaqueta", 140.00, 1);
		carrinho.adicionar("Camiseta", 99.99, 2);
		carrinho.adicionar("Calça", 200.00, 1);

		System.out.println(carrinho.toString());		
		carrinho.valorTotal();
		
		carrinho.remover("Jaqueta", 1);
		
		System.out.println(carrinho.toString());		
		carrinho.valorTotal();
		
		
	}
}
