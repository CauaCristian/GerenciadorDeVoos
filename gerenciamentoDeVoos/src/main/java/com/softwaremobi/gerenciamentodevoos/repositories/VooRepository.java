package com.softwaremobi.gerenciamentodevoos.repositories;

import com.softwaremobi.gerenciamentodevoos.Enum.StatusVooEnum;
import com.softwaremobi.gerenciamentodevoos.Models.VooModel;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VooRepository extends MongoRepository<VooModel,String> {
    List<VooModel> findByStatusVoo(@NotNull StatusVooEnum statusVoo);
}
