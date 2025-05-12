package com.softwaremobi.gerenciamentodevoos.services;

import com.softwaremobi.gerenciamentodevoos.repositories.PortaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortaoService {
    @Autowired
    private PortaoRepository portaoRepository;
}
