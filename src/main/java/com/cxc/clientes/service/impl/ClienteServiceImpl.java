package com.cxc.clientes.service.impl;

import com.cxc.clientes.model.dto.ClienteDto;
import com.cxc.clientes.repository.ClienteRepository;
import com.cxc.clientes.service.ClienteService;
import com.cxc.clientes.transform.ClienteTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository repository;

    @Autowired
    ClienteTransform transform;

    @Override
    public List<ClienteDto> getAll() {
        return repository.findAll()
                .stream()
                .map(transform::toDto)
                .toList();
    }

    @Override
    public ClienteDto create(ClienteDto dto) {
        dto.setId(null);
        var txn = repository.saveAndFlush(transform.toEntity(dto));
        return transform.toDto(txn);
    }

    @Override
    public ClienteDto update(ClienteDto dto) {
        var exitsId = repository.getById(dto.getId());
        var txn = repository.saveAndFlush(transform.copyToAttached(exitsId, dto));
        return transform.toDto(txn);
    }

    @Override
    public Boolean deleteById(Long id) {
        repository.deleteById(id);
        return true;
    }
}
