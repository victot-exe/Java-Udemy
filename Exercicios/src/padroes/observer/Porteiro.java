package src.padroes.observer;
//representa o subject, que quando detecta o evento dispara para os interessados o alerta

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	//lista dos interessados no evento
	private List<ObservadorChegadaAniversariante> observadores
		= new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	//normalmente algo interno dentro do framework implementa isso automaticamente, este é apenas para exemplificar e explicar como funciona
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou?");
			valor = entrada.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				//Criar o evento
				EventoChegadaAniversariante evento =
						new EventoChegadaAniversariante(new Date());//new Date() da a data de hoje
				
				//notificar os observadores
				observadores.stream()
					.forEach(o -> o.chegou(evento));
				valor = "sair";
			}else {
				System.out.println("Alarme falso!");
			}
		}

		entrada.close();
	}
}
