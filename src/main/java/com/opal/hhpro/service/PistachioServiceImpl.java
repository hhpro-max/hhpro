package com.opal.hhpro.service;

import com.opal.hhpro.dto.produt.PistachioDTO;
import com.opal.hhpro.model.product.Pistachio;
import com.opal.hhpro.repository.PistachioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PistachioServiceImpl implements PistachioService{
    @Autowired
    private PistachioRepository pistachioRepository;

    @Override
    public List<Pistachio> getAllPistachio() {
        return pistachioRepository.findAll();
    }

    @Override
    public Pistachio getPistachioById(Long id) {
        return pistachioRepository.findById(id).orElse(null);
    }

    @Override
    public Pistachio creatPistachio(PistachioDTO pistachioDTO) {
        
        return null;
    }
}
