package src.ooA.heranca.desafio.resposta;

//ela possui métodos sem corpo, ou seja, quando algum objeto herdar a interface vai ter a necessidade de implementar os métodos
//uma classe pode herdar apenas de uma classe mas de várias interfaces.
public interface Esportivo {

	void ligarTurbo();// define que algo tem esse método mas que precisa de uma implementação
						// diferente para cada objeto

	void desligarTurbo();// metodos de interface por padrão sempre são public abstract (abstract = método
							// sem corpo)
}
