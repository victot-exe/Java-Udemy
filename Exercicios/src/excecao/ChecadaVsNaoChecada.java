package src.excecao;


public class ChecadaVsNaoChecada {

	public static void main(String[] args){
		try {
			gerarErro1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			gerarErro2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	//Não checada ou não verificada (o compilador deixa escolher se vai tratar ou não)
	static void gerarErro1() {
		//new RuntimeException("Ocorreu um erro bem legal #01!");//como o erro não foi lançado nada acontece
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
		//throw é a palavra para lançar o erro.
	}
	
	//checada é obrigatório tratar e a colocar na assinatura do método vai ter essa exception
	static void gerarErro2() throws Exception{
		throw new Exception ("Ocorreu um erro bem legal #02!");
	}
}
