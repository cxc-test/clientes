package com.cxc.clientes.repository;


import com.cxc.clientes.model.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository  extends JpaRepository<ClienteEntity, Long> {
    List<ClienteEntity> findAll();
    void deleteById(Long id);
    ClienteEntity saveAndFlush(ClienteEntity entity);
    ClienteEntity getById(Long id);
}
