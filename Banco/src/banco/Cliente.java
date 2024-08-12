package banco;

public class Cliente extends Conta{
	private String nome;
	private int idade;
	private String cpf;
	private Conta conta;
	
	
	public Cliente(String nome, int idade, String cpf,int tipoConta) {
		super(tipoConta);
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getCpf() {
		return cpf;
	}

	public Conta getConta() {
		return conta;
	}
	
	public void mostrarExtrato() {
		System.out.println("\t------------------------------");
		System.out.println("\n\t\tEXTRATO: "
				+ "\n\tCLIENTE:\n\tNome: " + nome + "\n\tIdade: " + idade + "\n\tCPF: " + cpf 
				+ "\n\n\tConta: " + super.toString()); 
		System.out.println("\t------------------------------");
		
	}
	
	public void mostrarDadosConta() {
		System.out.println("\n\tAgência: " + conta.getAgencia() + "\n\tN° conta: " + conta.getNumConta() + "\n\t"+ conta.getTipoConta());
	}
	
}
