<<<<<<< HEAD
package aprendendoSet;

import java.util.HashSet;
import java.util.Set;

public class CadernoTarefas {
	private Set<Tarefa> cadernoTarefas;

	public CadernoTarefas() {
		this.cadernoTarefas = new HashSet<Tarefa>();
	}

	public void adicionar(String descricao, boolean concluida) {
		cadernoTarefas.add(new Tarefa(descricao,concluida));
	}

	public void remover(String descricao) {
		Set<Tarefa> tarefasRemovidas = new HashSet<Tarefa>();
		
		for (Tarefa t : cadernoTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasRemovidas.add(t);
				break;
			}
		}
		cadernoTarefas.removeAll(tarefasRemovidas);
		System.out.println("Tarefa " +descricao+ " foi removida\n");
	}
	
	public void exibir(CadernoTarefas caderno) {
		System.out.println(caderno);
	}
	
	public void contarTarefas(CadernoTarefas caderno) {
		int i=0;
		int prontas =0;
		int naoProntas =0;
		for (Tarefa t : cadernoTarefas) {
			i++;
			if(t.isConcluida()==true) {
				prontas++;
			}else {
				naoProntas++;
			}
		}
		System.out.println("O caderno possui "+i+" tarefas, sendo:");
		System.out.println(prontas+" concluidas e " +naoProntas+ " pendentes\n");
	}
	
	public void concluidas(CadernoTarefas caderno) {
		Set<Tarefa> concluidas = new HashSet<Tarefa>();
		for (Tarefa t : cadernoTarefas) {
			if(t.isConcluida()==true) {
				concluidas.add(t);
			}
		}
		System.out.println("Concluidas: " + concluidas+"\n");
	}
	
	public void pendentes(CadernoTarefas caderno) {
		Set<Tarefa> pendentes = new HashSet<Tarefa>();
		for (Tarefa t : cadernoTarefas) {
			if(t.isConcluida()==false) {
				pendentes.add(t);
			}
		}
		System.out.println("Pendentes: " + pendentes+"\n");
	}
	
	public void limparCaderno(CadernoTarefas caderno) {
		Set<Tarefa> limpar = new HashSet<Tarefa>();
		for (Tarefa t : cadernoTarefas) {
			limpar.add(t);
		}
		cadernoTarefas.removeAll(limpar);
		System.out.println("O caderno está limpo\n");
	}
	
	public void concluirTarefa(String descricao) {
		
		for (Tarefa t : cadernoTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);
				System.out.println("Tarefa "+descricao+" foi concluida com sucesso!\n");
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "Caderno de Tarefas: [" + cadernoTarefas + "]";
	}
	
}
=======
package aprendendoSet;

import java.util.HashSet;
import java.util.Set;

public class CadernoTarefas {
	private Set<Tarefa> cadernoTarefas;

	public CadernoTarefas() {
		this.cadernoTarefas = new HashSet<Tarefa>();
	}

	public void adicionar(String descricao, boolean concluida) {
		cadernoTarefas.add(new Tarefa(descricao,concluida));
	}

	public void remover(String descricao) {
		Set<Tarefa> tarefasRemovidas = new HashSet<Tarefa>();
		
		for (Tarefa t : cadernoTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasRemovidas.add(t);
				break;
			}
		}
		cadernoTarefas.removeAll(tarefasRemovidas);
		System.out.println("Tarefa " +descricao+ " foi removida\n");
	}
	
	public void exibir(CadernoTarefas caderno) {
		System.out.println(caderno);
	}
	
	public void contarTarefas(CadernoTarefas caderno) {
		int i=0;
		int prontas =0;
		int naoProntas =0;
		for (Tarefa t : cadernoTarefas) {
			i++;
			if(t.isConcluida()==true) {
				prontas++;
			}else {
				naoProntas++;
			}
		}
		System.out.println("O caderno possui "+i+" tarefas, sendo:");
		System.out.println(prontas+" concluidas e " +naoProntas+ " pendentes\n");
	}
	
	public void concluidas(CadernoTarefas caderno) {
		Set<Tarefa> concluidas = new HashSet<Tarefa>();
		for (Tarefa t : cadernoTarefas) {
			if(t.isConcluida()==true) {
				concluidas.add(t);
			}
		}
		System.out.println("Concluidas: " + concluidas+"\n");
	}
	
	public void pendentes(CadernoTarefas caderno) {
		Set<Tarefa> pendentes = new HashSet<Tarefa>();
		for (Tarefa t : cadernoTarefas) {
			if(t.isConcluida()==false) {
				pendentes.add(t);
			}
		}
		System.out.println("Pendentes: " + pendentes+"\n");
	}
	
	public void limparCaderno(CadernoTarefas caderno) {
		Set<Tarefa> limpar = new HashSet<Tarefa>();
		for (Tarefa t : cadernoTarefas) {
			limpar.add(t);
		}
		cadernoTarefas.removeAll(limpar);
		System.out.println("O caderno está limpo\n");
	}
	
	public void concluirTarefa(String descricao) {
		
		for (Tarefa t : cadernoTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);
				System.out.println("Tarefa "+descricao+" foi concluida com sucesso!\n");
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "Caderno de Tarefas: [" + cadernoTarefas + "]";
	}
	
}
>>>>>>> branch 'master' of https://github.com/GustavoDMarco/ProjetosJava.git
