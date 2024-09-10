package src.ooA.heranca.desafio.resposta;

//ela possui m�todos sem corpo, ou seja, quando algum objeto herdar a interface vai ter a necessidade de implementar os m�todos
//uma classe pode herdar apenas de uma classe mas de v�rias interfaces.
public interface Esportivo {

	void ligarTurbo();// define que algo tem esse m�todo mas que precisa de uma implementa��o
						// diferente para cada objeto

	void desligarTurbo();// metodos de interface por padr�o sempre s�o public abstract (abstract = m�todo
							// sem corpo)
}
