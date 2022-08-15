package com.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class NotaFical {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    private String xml;

    @Column(name = "data_emissao")
    private Date dataEmissao;

    @Column(name="pedido_id")
    private Integer pedidoId;
}
