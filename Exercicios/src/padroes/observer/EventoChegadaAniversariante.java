package src.padroes.observer;

import java.util.Date;
//objeto que contem o que tem que acontecer para executar ação
public class EventoChegadaAniversariante {
	
	private final Date momento;

	public EventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
}
