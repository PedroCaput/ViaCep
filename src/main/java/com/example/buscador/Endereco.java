package com.example.buscador;

import lombok.Getter;
import lombok.Setter;

public class Endereco {
    @Getter
    @Setter
    private String cep;
    @Getter
    @Setter
    private String logradouro;
    @Getter
    @Setter
    private String complemento;
    @Getter
    @Setter
    private String bairro;
    @Getter
    @Setter
    private String localidade;
    @Getter
    @Setter
    private String uf;

    @Override
    public String toString(){
        return "{Cep = '" + cep + '\'' +
                ", Logradouro = '" + logradouro + '\'' +
                ", Complemento = '" + complemento + '\'' +
                ", Bairro = '" + bairro + '\'' +
                ", Cidade = '" + localidade + '\'' +
                ", Uf = '" + uf + "'}";
    }
}
