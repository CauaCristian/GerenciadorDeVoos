package com.softwaremobi.gerenciamentodevoos.repositories;

import com.softwaremobi.gerenciamentodevoos.Enum.StatusCheckinEnum;
import com.softwaremobi.gerenciamentodevoos.Models.PassageiroModel;
import com.softwaremobi.gerenciamentodevoos.Models.VooModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PassageiroRepository extends MongoRepository<PassageiroModel,String> {
   List<PassageiroModel> findByVooId(@NotNull VooModel vooId);

    List<PassageiroModel> findByStatusCheckin(@NotBlank StatusCheckinEnum statusCheckin);
}
