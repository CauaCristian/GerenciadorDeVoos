package com.softwaremobi.gerenciamentodevoos.repositories;

import com.softwaremobi.gerenciamentodevoos.Models.PassageiroModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PassageiroRepository extends MongoRepository<PassageiroModel,String> {
}
