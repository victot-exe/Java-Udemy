package src.classeA;

public class AreaCirc {
	
	double raio;
//	definindo pi como um atributo de classe, que é diferente do atributo de objeto, se usa a palavra static
	static final double PI = 3.14; //final define que é uma constante e não pode ser alterada
//	final static também estaria correto, mas o tipo sempre fica ao lado da var
/*Atributo de classe é uma constante que vai ser a mesma para todos os objetos, mas ao invés de salvar em um novo espaço da memória a cada instância ele apenas
 * acessa o atributo de classe e utiliza o valor
 */
	
//	Alterando o metodo construtor da classe
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
//	Criando um método na classe
	double area() {
		return PI * Math.pow(raio, 2);//Math.pow é elevar o primeiro parâmetro ao segundo no caso raio elevado a 2
	}					//pow é um exemplo de metodo estático
	
//	Também é possível criar metodos staticos que são apenas acessados pelos objetos
	static double area(double raio) {//esse método calcula a area de qualquer circulo sem precisar criar uma instância
		return PI * Math.pow(raio, 2);
	}
	
}
