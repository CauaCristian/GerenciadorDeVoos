package com.softwaremobi.gerenciamentodevoos.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortaoRepository extends MongoRepository<PortaoRepository, String> {
}
