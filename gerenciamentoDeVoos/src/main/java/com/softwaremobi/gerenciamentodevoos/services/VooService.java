package com.softwaremobi.gerenciamentodevoos.services;

import com.softwaremobi.gerenciamentodevoos.repositories.PortaoRepository;
import com.softwaremobi.gerenciamentodevoos.repositories.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VooService {
    @Autowired
    private VooRepository vooRepository;
    @Autowired
    private PortaoRepository portaoRepository;
}
