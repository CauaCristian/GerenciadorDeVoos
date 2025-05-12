package com.softwaremobi.gerenciamentodevoos.services;

import com.softwaremobi.gerenciamentodevoos.Enum.StatusCheckinEnum;
import com.softwaremobi.gerenciamentodevoos.Enum.StatusVooEnum;
import com.softwaremobi.gerenciamentodevoos.Models.PassageiroModel;
import com.softwaremobi.gerenciamentodevoos.Models.PortaoModel;
import com.softwaremobi.gerenciamentodevoos.Models.VooModel;
import com.softwaremobi.gerenciamentodevoos.repositories.PassageiroRepository;
import com.softwaremobi.gerenciamentodevoos.repositories.PortaoRepository;
import com.softwaremobi.gerenciamentodevoos.repositories.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatorioService {
    @Autowired
    private VooRepository vooRepository;
    @Autowired
    private PassageiroRepository passageiroRepository;
    @Autowired
    private PortaoRepository portaoRepository;

    public List<VooModel> getVoosProgramados(StatusVooEnum statusVoo, String dataHoraPartida) {
        List<VooModel> voosProgramados = vooRepository.findByStatusVoo(statusVoo);
        List<VooModel> voosFiltrados = voosProgramados.stream()
                .filter(voo -> voo.getDataHoraPartida().equals(dataHoraPartida))
                .toList();
        return voosFiltrados;
    }
    public List<PassageiroModel> getPassageirosPorVoo(String vooId) {
        VooModel voo = vooRepository.findById(vooId).orElse(null);
        if (voo != null) {
            return passageiroRepository.findByVooId(voo);
        }
        return null;
    }
    public List<PassageiroModel> getStatusCheckInPassageiros() {
        return passageiroRepository.findAll();
    }
    public List<PortaoModel> getPortoesAtribuidos() {
        return portaoRepository.findByDisponivel(false);
    }
}
