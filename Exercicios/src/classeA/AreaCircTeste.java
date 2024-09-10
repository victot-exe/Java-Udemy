package src.classeA;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		var a1 = new AreaCirc(10);
//		a1.pi = 10; //quando se altera o valor do metodo estático ele da advertência e mantém sempre o ultimo valor dado a 
		
		var a2 = new AreaCirc(5);
//		a2.pi = 5; // aqui ele mantem o pi = 5 para ambos os objetos mesmo a1.pi sendo 10 ele sobrescreve o valor.
		
//		AreaCirc.PI = 3.1415;//maneira correta de se alterar um método estático
//		o itálico indica atributos de classe ex: pi, out.
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(AreaCirc.area(45));//calcula a area de um circulo com raio = 45
		
	}

}
