package src.ooA.heranca.desafio.resposta;

public class Ferrari extends Carro implements Esportivo, Luxo {// implements � a palavra usada para quando precisa
																// herdar os
																// m�todos da interface

	private boolean ligarTurbo = false;
	private boolean ligarAr =  false;

	Ferrari() {
		super(315);
	}

	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}

//		@Override //efeito de valida��o o eclipse vai verificar se vc est� mesmo sobrescrevendo o m�todo
//		void acelerar() {
//			super.acelerar();
//		}
}
