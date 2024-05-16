package com.cxc.clientes.service;


import com.cxc.clientes.model.dto.ClienteDto;
import java.util.List;

public interface ClienteService {
    List<ClienteDto> getAll();
    ClienteDto create(ClienteDto dto);
    ClienteDto update(ClienteDto dto);
    Boolean deleteById(Long id);
}
