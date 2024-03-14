package br.com.marcusprado02.diostockquoteswebfluxapi;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends ReactiveCrudRepository<Quote, Long> {
}
