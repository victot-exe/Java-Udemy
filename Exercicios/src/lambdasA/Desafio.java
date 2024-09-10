package src.lambdasA;

import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto municipal : >= 2500 (8.5%)/ <2500 (Isento)
		 * 3. Frete: 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56 
		 */
		//1 - Calculo de preço real
		BiFunction<Double, Double, Double> precoReal = (x, y) ->{
			return (x * (1 - y));
		};
		System.out.println(precoReal.apply(p.preco, p.desconto));
		
		//2 - Calculo com o imposto municipal
		UnaryOperator<Double> imposto = preco ->{
			return preco >= 2500 ? (preco * (1 + 0.085)) : preco;
		};
		System.out.println(precoReal.andThen(imposto).apply(p.preco, p.desconto));
		
		//3 - calculo com frete
		UnaryOperator<Double> frete = preco ->{
			return preco >= 3000 ? preco + 100 : preco + 50;
		};
		System.out.println(precoReal.andThen(imposto).andThen(frete).apply(p.preco, p.desconto));
		
		//4 - Dois decimais
		DecimalFormat df = new DecimalFormat("0.##");
		System.out.println(df.format(2.88888));
		Function<Double, String> doisDecimais = preco ->{
			return df.format(preco);
		};
		System.out.println(precoReal.andThen(imposto).andThen(frete).andThen(doisDecimais).apply(p.preco, p.desconto));
		
		//5 - Formatando R$1234,56
		Consumer<String> formatando = preco -> System.out.println("R$ " + preco);
		formatando.accept(precoReal.andThen(imposto).andThen(frete).andThen(doisDecimais).apply(p.preco, p.desconto));
		
		Function<String, String> teste = linha ->{
			return "R$ " + linha;
		};
		System.out.println(precoReal.andThen(imposto).andThen(frete).andThen(doisDecimais).andThen(teste).apply(p.preco, p.desconto));
		
		//6 - Eu inventando
//		DoubleConsumer faz = (x,y) -> syso
		BiFunction<Double, Double, String> fazTudo = (x, y) ->{
			double precoreal = precoReal.apply(x, y);
			double precoComImposto = imposto.apply(precoreal);
			double precoComFrete = frete.apply(precoComImposto);
			String formatado = df.format(precoComFrete);
			return "R$ " + formatado;
		};
		System.out.println(fazTudo.apply(p.preco, p.desconto));
	}
}
