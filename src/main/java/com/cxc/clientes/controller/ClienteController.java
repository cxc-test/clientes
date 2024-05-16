package com.cxc.clientes.controller;


import com.cxc.clientes.model.dto.ClienteDto;
import com.cxc.clientes.service.ClienteService;

import jakarta.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "clientes/")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @CrossOrigin("*")
    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON)
    @ResponseBody
    public ResponseEntity<ClienteDto> create(@RequestBody ClienteDto dto) {
        return ResponseEntity.ok(clienteService.create(dto));
    }

    @CrossOrigin("*")
    @GetMapping(value = "")
    @ResponseBody
    public ResponseEntity<List<ClienteDto>> getAll() {
        return ResponseEntity.ok(clienteService.getAll());
    }

    @CrossOrigin("*")
    @PutMapping(value = "update")
    @ResponseBody
    public ResponseEntity<ClienteDto> update(@RequestBody ClienteDto dto) {
        return ResponseEntity.ok(clienteService.update(dto));
    }

    @CrossOrigin("*")
    @DeleteMapping(value = "deleteById/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(clienteService.deleteById(id));
    }
}
