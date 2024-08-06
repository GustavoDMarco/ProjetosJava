package aprendendoSet;

public class Main {
	public static void main(String[] args) {
		CadernoTarefas caderno = new CadernoTarefas();
		
		caderno.adicionar("Limpar casa", false);
		caderno.adicionar("Academia", false);
		caderno.adicionar("Estudar", false);
		
		caderno.contarTarefas(caderno);
		caderno.concluidas(caderno);
		caderno.pendentes(caderno);

		caderno.concluirTarefa("Limpar casa");
		caderno.concluidas(caderno);
		caderno.pendentes(caderno);
		caderno.contarTarefas(caderno);
		
		caderno.remover("Academia");
		caderno.contarTarefas(caderno);
		
		caderno.concluirTarefa("Estudar");
		caderno.contarTarefas(caderno);
		
	}

}
