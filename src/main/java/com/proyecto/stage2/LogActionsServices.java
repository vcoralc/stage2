package com.proyecto.stage2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogActionsServices {
    private final LogActionsRepository logActionsRepository;
    @Autowired
    public LogActionsServices(LogActionsRepository logActionsRepository) {
        this.logActionsRepository = logActionsRepository;
    }

    public List<LogActions> getLogActions(){
        return logActionsRepository.findAll();
    }
    public void addNewLogActions(LogActions logActions) {
        logActionsRepository.save(logActions);
    }
}
