package src.padroes.observer;
//como é interface os métodos são abstrados
public interface ObservadorChegadaAniversariante {
	//método abstrato, deve ser implementado quando o objeto for instanciado
	public void chegou(EventoChegadaAniversariante evento);//método que será chamado quando o eveto acontecer
	
}
