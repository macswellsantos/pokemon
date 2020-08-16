package br.com.macswell.pokedex.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import br.com.macswell.pokedex.model.Pokemon;

public interface PokedexRepository extends ReactiveMongoRepository<Pokemon, String>{

}
