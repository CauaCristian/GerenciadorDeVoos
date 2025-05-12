package com.softwaremobi.gerenciamentodevoos.Controllers;

import com.softwaremobi.gerenciamentodevoos.Enum.StatusVooEnum;
import com.softwaremobi.gerenciamentodevoos.Models.PassageiroModel;
import com.softwaremobi.gerenciamentodevoos.Models.PortaoModel;
import com.softwaremobi.gerenciamentodevoos.Models.VooModel;
import com.softwaremobi.gerenciamentodevoos.services.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/relatorio")
public class RelatorioController {
    @Autowired
    private RelatorioService relatorioService;
    @GetMapping(value = "/voosProgramados/{dataHoraPartida}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<VooModel> getVoosProgramados(@PathVariable String dataHoraPartida) {
        return relatorioService.getVoosProgramados(StatusVooEnum.PROGRAMADO,dataHoraPartida);
    }
    @GetMapping(value = "/passageirosPorVoo/{vooId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PassageiroModel> getPassageirosPorVoo(@PathVariable String vooId) {
        return relatorioService.getPassageirosPorVoo(vooId);
    }
    @GetMapping(value = "/statusCheckInPassageiros", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PassageiroModel> getStatusCheckIn() {
        return relatorioService.getStatusCheckInPassageiros();
    }
    @GetMapping(value = "/portoesAtribuidos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PortaoModel> getPortoesAtribuidos() {
        return relatorioService.getPortoesAtribuidos();
    }
}
