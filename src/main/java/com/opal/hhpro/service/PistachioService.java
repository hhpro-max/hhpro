package com.opal.hhpro.service;

import com.opal.hhpro.dto.produt.PistachioDTO;
import com.opal.hhpro.model.product.Pistachio;

import java.util.List;

public interface PistachioService {
    List<Pistachio> getAllPistachio();
    Pistachio getPistachioById(Long id);
    Pistachio creatPistachio(PistachioDTO pistachioDTO);
}
