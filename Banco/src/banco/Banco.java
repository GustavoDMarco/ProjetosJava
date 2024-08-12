package banco;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco{
	private String nome;
	private List<Cliente> clientes;
	
	public Banco(String nome) {
		this.nome = nome;
		this.clientes= new ArrayList<Cliente>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	Scanner tec = new Scanner(System.in);
	public Cliente cadastrarCliente() {
		int tipoConta = 0, idade;
		String nome, cpf;
		
		System.out.println("\n\t*** CADASTRANDO CLIENTE ***");
		System.out.println("\nDigite seu nome: ");
		nome = tec.next();
		System.out.println("Digite sua idade: ");
		idade = tec.nextInt();
		System.out.println("Digite seu cpf: ");
		cpf = tec.next();
		
		while (true) {
			System.out.println("Selecione o tipo de conta que deseja abrir: (1 = Corrente // 2 = Poupança)");
			tipoConta = tec.nextInt();

			if (tipoConta == 1 || tipoConta == 2) {
				break;
			}else {
				System.out.println("Valor incorreto. Tente novamente!");
			}

		}
		
		Cliente cliente = new Cliente(nome, idade, cpf, tipoConta);
		adicionarCliente(cliente);
		
		return cliente;
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("\nCLIENTE CADASTRADO COM SUCESSO!");
	}
	
	public void fecharConta(Cliente cliente) {
		clientes.remove(cliente);
		System.out.println("\nCONTA FECHADA!");
	}
	

	public void fecharTec() {
		tec.close();
	}
	
	public void mostrarClientes() {
		System.out.println("\nBanco " + nome + "\nClientes: \n" + clientes);
	}
}
