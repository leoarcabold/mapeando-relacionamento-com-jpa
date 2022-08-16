package com.ecommerce.model;

import javax.persistence.Embeddable;

@Embeddable
public class EnderecoEntregaPedido {

    private Long id;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String esatdo;

}
