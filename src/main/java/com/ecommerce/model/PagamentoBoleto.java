package com.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class PagamentoBoleto {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private String status;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "pedido_id")
    private Integer pedidoid;

}
