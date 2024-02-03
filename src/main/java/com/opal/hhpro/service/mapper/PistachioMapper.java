package com.opal.hhpro.service.mapper;

import com.opal.hhpro.dto.produt.PistachioDTO;
import com.opal.hhpro.model.product.Pistachio;

public class PistachioMapper {
    public static PistachioDTO mapToDTO(Pistachio pistachio)
    {
        PistachioDTO pistachioDTO = new PistachioDTO();
        pistachioDTO.setId(pistachio.getId());
        pistachioDTO.setOrigin(pistachio.getOrigin());
        pistachioDTO.setType(pistachio.getType());
        pistachioDTO.setPurity(pistachio.getPurity());
        pistachioDTO.setFullDescription(pistachio.getFullDescription());
        pistachioDTO.setGeneralDescription(pistachio.getGeneralDescription());
        pistachioDTO.setImageURL(pistachio.getImageURL());
        pistachioDTO.setName(pistachio.getName());
        pistachioDTO.setPrice(pistachio.getPrice());
        if(pistachio.getCategory() != null)
        {
            pistachioDTO.setCategory(CategoryMapper.mapToDTO(pistachio.getCategory()));
        }
        if (pistachio.getSeller() != null)
        {
            pistachioDTO.setSeller(SellerMapper.mapToDTO(pistachio.getSeller()));
        }
        return pistachioDTO;
    }
}
