package banco;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco("Mundo");
		
		Cliente cliente1 = banco.cadastrarCliente();
		cliente1.depositar(200);
		System.out.println(cliente1.getSaldo());							//200
		cliente1.sacar(100);
		System.out.println(cliente1.getSaldo());							//100
		cliente1.mostrarExtrato();
		
		Cliente cliente2 = banco.cadastrarCliente();
		cliente2.depositar(-30);
		System.out.println(cliente2.getNome() + " " + cliente2.getSaldo());	//300
		cliente2.transferir(50, cliente1);
		
		System.out.println(cliente1.getNome()+" " + cliente1.getSaldo());	//150
		System.out.println(cliente2.getNome()+" " + cliente2.getSaldo());	//250
		
		
		banco.mostrarClientes();
		banco.fecharConta(cliente2);
		banco.mostrarClientes();
		
	}
}
