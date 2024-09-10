package src.classeA;

public class PrimeiroTrauma {

	int a = 3;
	static int b = 4;
//	somente um membro de classe pode acessar diretamente membros de classe (static), caso não queira é preciso instancear o objeto

	public static void main(String[] args) {

		var teste = new PrimeiroTrauma();

		System.out.println(teste.a);
		System.out.println(b);// outra forma de acessar

	}

}
