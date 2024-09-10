package src.colecoesA;

public class Usuario {

	String nome;

	Usuario(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Meu nome �: " + this.nome + ".";
	}
//caso n�o implementar atrapalha a verificar 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

//	@Override
//	public int hashCode() {
//		return 1;// dessa forma ele faz o equals para todos os elementos o que deixa ele mais
//					// lento
//	}
	
//	@Override
//	public int hashCode() {
//		return this.nome.length();//usa o numero de caracteres primeiro pra depois fazer o equals
//	}
}
