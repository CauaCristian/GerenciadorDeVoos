package com.softwaremobi.gerenciamentodevoos.Controllers;

import com.softwaremobi.gerenciamentodevoos.services.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relatorio")
public class RelatorioController {
    @Autowired
    private RelatorioService relatorioService;

}
