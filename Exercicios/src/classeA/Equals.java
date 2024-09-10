package src.classeA;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezmail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezmail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2)); //como não mexeu na implantação do .equals vai dar false **agora mexeu e da true
		System.out.println(u2.equals(u1));
	}
}

