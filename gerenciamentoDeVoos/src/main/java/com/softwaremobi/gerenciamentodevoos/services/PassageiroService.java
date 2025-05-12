package com.softwaremobi.gerenciamentodevoos.services;

import com.softwaremobi.gerenciamentodevoos.Enum.StatusCheckinEnum;
import com.softwaremobi.gerenciamentodevoos.Models.PassageiroModel;
import com.softwaremobi.gerenciamentodevoos.repositories.PassageiroRepository;
import com.softwaremobi.gerenciamentodevoos.repositories.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassageiroService {
    @Autowired
    private PassageiroRepository passageiroRepository;
    @Autowired
    private VooRepository vooRepository;

    public List<PassageiroModel> getAllPassageiros() {
        return passageiroRepository.findAll();
    }
    public PassageiroModel createPassageiro(PassageiroModel passageiro) {
        return passageiroRepository.save(passageiro);
    }
    public PassageiroModel updateCheckInPassageiro(StatusCheckinEnum status,String id) {
        PassageiroModel passageiro = passageiroRepository.findById(id).orElse(null);
        if (passageiro != null) {
            passageiro.setStatusCheckin(status);
            return passageiroRepository.save(passageiro);
        }
        return null;
    }
    public void deletePassageiro(String id) {
        passageiroRepository.deleteById(id);
    }
}
