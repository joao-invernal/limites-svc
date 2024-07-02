package com.machinery.limitessvc.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class BeneficiarioDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 4370085483662215437L;

    private Long cpf;
    private Long codigoBanco;
    private String agencia;
    private String conta;
    private String nomeFavorecido;
}