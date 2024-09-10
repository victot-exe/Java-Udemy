package src.ooA.encapsulamento;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;

	public Pessoa(String nome,String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		this.setIdade(idade);
	}

	public String getNome() {// botão direito/ source/ generate getters and setters para auto gerar os
								// getters e setters
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	public int getIdade() {// metodo getter
		return idade;
	}

	public void setIdade(int novaIdade) {// metodo setter
		novaIdade = Math.abs(novaIdade);// Math.abs da o valor absoluto, ignorando o sinal (+, -)
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() + "e tenho " + getIdade() + " anos.";
	}
}
