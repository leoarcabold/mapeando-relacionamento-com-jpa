package com.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class PagamentoCartao {

    @EqualsAndHashCode.Include
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private StatusPagamento status;

    private String numero;

    @Column(name = "pedido_id")
    private Integer pedidoid;
}
