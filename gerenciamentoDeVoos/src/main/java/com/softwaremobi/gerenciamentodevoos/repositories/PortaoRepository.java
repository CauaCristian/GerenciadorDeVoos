package com.softwaremobi.gerenciamentodevoos.repositories;

import com.softwaremobi.gerenciamentodevoos.Models.PortaoModel;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortaoRepository extends MongoRepository<PortaoModel, String> {
    List<PortaoModel> findByDisponivel(@NotNull boolean disponivel);
}
