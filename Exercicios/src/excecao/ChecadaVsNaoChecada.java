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
	
	//N�o checada ou n�o verificada (o compilador deixa escolher se vai tratar ou n�o)
	static void gerarErro1() {
		//new RuntimeException("Ocorreu um erro bem legal #01!");//como o erro n�o foi lan�ado nada acontece
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
		//throw � a palavra para lan�ar o erro.
	}
	
	//checada � obrigat�rio tratar e a colocar na assinatura do m�todo vai ter essa exception
	static void gerarErro2() throws Exception{
		throw new Exception ("Ocorreu um erro bem legal #02!");
	}
}
