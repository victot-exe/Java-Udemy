package src.classeA;

public class Usuario {

	String nome;
	String email;

	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {//para evitar erro verificar a instancia de objeto
			Usuario outro = (Usuario) objeto;// transforma o objeto do tipo Object(o mais gen�rico dos tipos) no tipo
												// desejado
			boolean nomeIgual = outro.nome.equals(this.nome);// fazer assim � melhor do que da maneira abaixo
			boolean emailIgual = outro.email == this.email;

			return nomeIgual && emailIgual;// ap�s essa implementa��o usar u1.equals(u2) vai dar true.
		} else {
			return false;
		}
	}//o hashcode ser� abordado em outra aula
	public int hashCode() {
		return 0;
	}
}
