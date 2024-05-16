package com.cxc.clientes.transform;

import com.cxc.clientes.model.dto.ClienteDto;
import com.cxc.clientes.model.entity.ClienteEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteTransform {

    @Autowired
    ModelMapper mapper;

    public ClienteDto toDto(ClienteEntity entity){
        return this.mapper.map(entity, ClienteDto.class);
    }

    public ClienteEntity toEntity(ClienteDto dto){
        return this.mapper.map(dto, ClienteEntity.class);
    }

    public ClienteEntity copyToAttached(ClienteEntity old, ClienteDto dto){
        old.setAddress(dto.getAddress());
        old.setName(dto.getName());
        old.setRfc(dto.getRfc());
        old.setPhoneNumber(dto.getPhoneNumber());
        return old;
    }
}
