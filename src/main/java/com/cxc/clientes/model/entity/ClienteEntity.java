package com.cxc.clientes.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "cliente")
public class ClienteEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1506872896128254182L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "seq_clientes")
    @SequenceGenerator(name = "seq_clientes", allocationSize=1)
    private Long id;

    private String name;
    private String rfc;
    private String phoneNumber;
    private String address;

}
