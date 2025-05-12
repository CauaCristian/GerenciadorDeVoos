package com.softwaremobi.gerenciamentodevoos.repositories;

import com.softwaremobi.gerenciamentodevoos.Models.VooModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VooRepository extends MongoRepository<VooModel,String> {
}
