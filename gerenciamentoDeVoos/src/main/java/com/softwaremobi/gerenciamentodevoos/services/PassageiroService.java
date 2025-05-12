package com.softwaremobi.gerenciamentodevoos.services;

import com.softwaremobi.gerenciamentodevoos.repositories.PassageiroRepository;
import com.softwaremobi.gerenciamentodevoos.repositories.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassageiroService {
    @Autowired
    private PassageiroRepository passageiroRepository;
    @Autowired
    private VooRepository vooRepository;
}
