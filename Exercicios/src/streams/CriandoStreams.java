package src.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
//		#01 criando um method reference com um consumer para ficar mais facil no syso
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
//		#02 Criando uma stream diretamente
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);//Stream.of é para coleções staticas
//		#03 Criando uma array
		String[] maisLangas = {"Python ", "Lisp ", "Perl ", "Go\n " };
//		#03.1 Criando uma stream a partir de uma array
		Stream.of(maisLangas).forEach(print);
		Arrays.stream(maisLangas).forEach(print);
		Arrays.stream(maisLangas, 1, 4).forEach(print);
//		#04 Criando Streams a partir de colections
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
//		#05 .generate, gera um stream infinita e sem ordenação
		//Stream.generate(() -> "a").forEach(print); vai gerar as infinitamente
		Stream.iterate(0, n -> n + 1).forEach(println);
	}
}
