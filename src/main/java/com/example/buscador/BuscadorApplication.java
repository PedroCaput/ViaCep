package com.example.buscador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class BuscadorApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuscadorApplication.class, args);

        String cep = "";

        while (cep != "sair") {
            ConsultaCep consultaCep = new ConsultaCep();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, digite o cep que deseja pesquisar ou 'sair' para encerrar o programa");

            cep = scanner.nextLine();
            if(!cep.equalsIgnoreCase("sair")) {
                try {
                    Endereco endereco = consultaCep.buscaEndereco(cep);

                    System.out.println(endereco);

                    GeradorDeArquivo gerador = new GeradorDeArquivo();
                    gerador.geraJson(endereco);

                } catch (RuntimeException | IOException e) {
                    System.out.println(e.getMessage());
                    System.out.println("O cep informado não é válido!");
                }
            } else{
                System.out.println("Finalizando a aplicação");
                break;
            }
        }
    }
}
