package src.classeA;

public class AreaCirc {
	
	double raio;
//	definindo pi como um atributo de classe, que � diferente do atributo de objeto, se usa a palavra static
	static final double PI = 3.14; //final define que � uma constante e n�o pode ser alterada
//	final static tamb�m estaria correto, mas o tipo sempre fica ao lado da var
/*Atributo de classe � uma constante que vai ser a mesma para todos os objetos, mas ao inv�s de salvar em um novo espa�o da mem�ria a cada inst�ncia ele apenas
 * acessa o atributo de classe e utiliza o valor
 */
	
//	Alterando o metodo construtor da classe
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
//	Criando um m�todo na classe
	double area() {
		return PI * Math.pow(raio, 2);//Math.pow � elevar o primeiro par�metro ao segundo no caso raio elevado a 2
	}					//pow � um exemplo de metodo est�tico
	
//	Tamb�m � poss�vel criar metodos staticos que s�o apenas acessados pelos objetos
	static double area(double raio) {//esse m�todo calcula a area de qualquer circulo sem precisar criar uma inst�ncia
		return PI * Math.pow(raio, 2);
	}
	
}
