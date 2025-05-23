package com.softwaremobi.gerenciamentodevoos.services;

import com.softwaremobi.gerenciamentodevoos.Enum.StatusVooEnum;
import com.softwaremobi.gerenciamentodevoos.Models.PortaoModel;
import com.softwaremobi.gerenciamentodevoos.Models.VooModel;
import com.softwaremobi.gerenciamentodevoos.repositories.PortaoRepository;
import com.softwaremobi.gerenciamentodevoos.repositories.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VooService {
    @Autowired
    private VooRepository vooRepository;
    @Autowired
    private PortaoRepository portaoRepository;

    public List<VooModel> getAll() {
        return vooRepository.findAll();
    }
    public VooModel createVoo(VooModel voo) {
        if(voo.getPortaoId().isDisponivel()){
            PortaoModel portao = portaoRepository.findById(voo.getPortaoId().getId()).orElse(null);
            if (portao != null) {
                portao.setDisponivel(false);
                portaoRepository.save(portao);
            }
            return vooRepository.save(voo);
        }
        return null;
    }
    public VooModel updateStatusVoo(StatusVooEnum status,String id) {
        if(status.equals(StatusVooEnum.CONCLUIDO)){
            PortaoModel portao = portaoRepository.findById(vooRepository.findById(id).orElse(null).getPortaoId().getId()).orElse(null);
            if (portao != null) {
                portao.setDisponivel(true);
                portaoRepository.save(portao);
            }
        }
        VooModel voo = vooRepository.findById(id).orElse(null);
        if (voo != null) {
            voo.setStatusVoo(status);
            return vooRepository.save(voo);
        }
        return null;
    }
    public void deleteVoo(String id) {
        vooRepository.deleteById(id);
    }
}
