package com.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Pedido {

    private Long id;
    private Date dataPedido;
    private Date dataConclusao;
    private String status;
    private BigDecimal total;
    private NotaFiscal notaFiscalId;
}
