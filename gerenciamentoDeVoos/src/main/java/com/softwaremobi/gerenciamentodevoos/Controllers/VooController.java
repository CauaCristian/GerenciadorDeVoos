package com.softwaremobi.gerenciamentodevoos.Controllers;

import com.softwaremobi.gerenciamentodevoos.Models.VooModel;
import org.springframework.beans.factory.annotation.Autowired;
import com.softwaremobi.gerenciamentodevoos.services.VooService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voo")
public class VooController {
    @Autowired
    private VooService vooService;

    @GetMapping(value = "/getAll", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<VooModel> getAll() {
        return vooService.getAll();
    }
    @PostMapping(value = "/create", consumes= MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public VooModel createVoo(@RequestBody VooModel voo) {
        return vooService.createVoo(voo);
    }
    @PutMapping(value = "/updateStatus/{Status}", consumes= MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public VooModel updateVoo(@PathVariable String Status) {
        return vooService.updateStatusVoo(Status);
    }
    @DeleteMapping(value = "/delete/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public void deleteVoo(@PathVariable String id) {
        vooService.deleteVoo(id);
    }

}
