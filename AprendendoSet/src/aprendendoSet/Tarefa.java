<<<<<<< HEAD
package aprendendoSet;

public class Tarefa {
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descricao, boolean concluida) {
		this.descricao = descricao;
		this.concluida = concluida;
	}

	public String getDescricao() {
		return descricao;
	}
	public boolean isConcluida() {
		return concluida;
	}
	
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "[descricao=" + descricao + ", concluida=" + concluida + "]";
	}

}
=======
package aprendendoSet;

public class Tarefa {
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descricao, boolean concluida) {
		this.descricao = descricao;
		this.concluida = concluida;
	}

	public String getDescricao() {
		return descricao;
	}
	public boolean isConcluida() {
		return concluida;
	}
	
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "[descricao=" + descricao + ", concluida=" + concluida + "]";
	}

}
>>>>>>> branch 'master' of https://github.com/GustavoDMarco/ProjetosJava.git
