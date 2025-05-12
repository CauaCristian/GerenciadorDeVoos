package com.softwaremobi.gerenciamentodevoos.Controllers;

import com.softwaremobi.gerenciamentodevoos.Models.PassageiroModel;
import com.softwaremobi.gerenciamentodevoos.services.PassageiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passageiro")
public class PassageiroController {
    @Autowired
    private PassageiroService passageiroService;

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PassageiroModel> getAllPassageiros() {
        return passageiroService.getAllPassageiros();
    }
    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PassageiroModel createPassageiro(@RequestBody PassageiroModel passageiro) {
        return passageiroService.createPassageiro(passageiro);
    }
    @PutMapping(value = "/updateCheckIn/{status}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PassageiroModel updatePassageiro(@PathVariable String status) {
        return passageiroService.updateCheckInPassageiro(status);
    }
    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deletePassageiro(@PathVariable String id) {
        passageiroService.deletePassageiro(id);
    }
}
