package exArrayList;

public class Cliente {
	private String nome;
	private int numero;
	
	public Cliente() {
		
	}

	public Cliente(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", numero=" + numero + "]";
	}
	
	
	
	

}
