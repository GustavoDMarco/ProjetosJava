package banco;

public class Conta {

	/*
	 * PRIVADO POIS ESTÃO SENDO UTILIZADOS APENAS DENTRO DA CLASSE, SE TIVESSEM
	 * SENDO USADOS NOS FILHOS SERIA PROTECTED.
	 */
	private static final int AGENCIA = 1;
	private static int NUM_CONTA = 1;

	private int agencia;
	private int numConta;
	private double saldo = 0;
	private String tipoConta;

	public Conta(int tipoConta) {
		/*
		 * COM STATIC FAÇO COM QUE CADA VEZ QUE CONTA SEJA INSTANCIADA, agencia TERÁ
		 * SEMPRE O MESMO VALOR. ESSE VALOR NÃO PODE SER ALTERADO POIS TEM A PALAVRA
		 * FINAL.
		 */
		this.agencia = AGENCIA;

		/*
		 * COM STATIC FAÇO COM QUE CADA VEZ QUE CONTA SEJA INSTANCIADA, numConta TERÁ
		 * SEMPRE O MESMO VALOR. NO ENTANTO, COMO NÃO TEM A PALAVRA FINAL PODE SER FEITA
		 * UMA LOGICA PARA QUE ESSE VALOR SEJA ALTERADO TODA VEZ QUE CONTA FOR
		 * INSTANCIADA.*
		 */
		this.numConta = NUM_CONTA++;

		if (tipoConta == 1) {
			this.tipoConta = "Conta Corrente";
		} else if (tipoConta == 2) {
			this.tipoConta = "Conta Poupança";
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}
	
	public void depositar(double deposito) {
		
			if(deposito > 0) {
				saldo=saldo+deposito;
				System.out.println("\nDepósito realizado com sucesso!");	
			}else {
				System.out.println("\nOperação inválida!");	
			}
		
	}
	
	public void sacar(double saque) {
		    if (saldo >= saque) {
		        saldo = saldo-saque;
		        System.out.println("\nSaque realizado com sucesso!");
		    } else {
		        System.out.println("\nSaldo insuficiente!");
		    }
	}
	
	public void transferir(double valor, Conta contadestino) {
			if(this.saldo < valor) {
				sacar(valor);
			}else {
				sacar(valor);
				contadestino.depositar(valor);
				System.out.println("\nTransferência realizada com sucesso!");
			}
	}

	public String toString() {
		return "\n\tAgência: " + agencia + "\n\tN° conta: " + numConta + "\n\t"+ tipoConta +"\n\tSaldo = " + saldo+ "\n";
	}
	

}
