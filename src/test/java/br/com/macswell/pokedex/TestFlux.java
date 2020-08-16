package br.com.macswell.pokedex;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;

public class TestFlux {

	@Test
	void testeFlux1() {
		Flux.empty();
	}
	
	@Test
	void testeFlux2() {
		Flux<String> flux = Flux.just("Pokedex");
		flux.subscribe(System.out::println);
	}
	
	@Test
	void testeFlux3() {
		Flux<String> flux = Flux.just("Charizard", "Blastoise", "Pikachu");
		flux.subscribe(System.out::println);
	}
}
