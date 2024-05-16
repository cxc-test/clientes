package com.cxc.clientes.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {
    private Long id;
    private String name;
    private String rfc;
    private String phoneNumber;
    private String address;
}
