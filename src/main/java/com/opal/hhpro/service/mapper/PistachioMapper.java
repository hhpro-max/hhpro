package com.opal.hhpro.service.mapper;

import com.opal.hhpro.dto.produt.PistachioDTO;
import com.opal.hhpro.model.product.Pistachio;

public class PistachioMapper {
    public static PistachioDTO mapToDTO(Pistachio pistachio)
    {
        PistachioDTO pistachioDTO = (PistachioDTO) ProductMapper.mapToDTO(pistachio);
        pistachioDTO.setOrigin(pistachio.getOrigin());
        pistachioDTO.setType(pistachio.getType());
        pistachioDTO.setPurity(pistachio.getPurity());
        pistachioDTO.setFullDescription(pistachio.getFullDescription());
        return pistachioDTO;
    }
    public static Pistachio mapToEntity(PistachioDTO pistachioDTO)
    {
        Pistachio pistachio =(Pistachio) ProductMapper.mapToEntity(pistachioDTO);
        pistachio.setOrigin(pistachioDTO.getOrigin());
        pistachio.setPurity(pistachioDTO.getPurity());
        pistachio.setType(pistachioDTO.getType());
        pistachio.setFullDescription(pistachioDTO.getFullDescription());
        return pistachio;
    }
}
