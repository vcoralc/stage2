package com.proyecto.stage2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "/")
public class LogActionsController {
    private LogActionsServices logActionsServices;
    @Autowired
    public LogActionsController(LogActionsServices logActionsServices) {
        this.logActionsServices = logActionsServices;
    }

    // en la peticion GET llamará a esta funcion que accederá a la DB y devolverá tod lo que haya
    @GetMapping
    public List<LogActions> getCatalogue() {
        return logActionsServices.getLogActions();
    }

    // ahora la idea es poder registrar en la base de datos un catalogo y eso se hace
    // pasando en el body de la request POST un objeto catalogo
    @PostMapping
    public void registerNewCatalogue(@RequestBody LogActions logActions){
        logActionsServices.addNewLogActions(logActions);
    }


}
