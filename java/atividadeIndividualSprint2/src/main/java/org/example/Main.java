package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Capturas capturas = new Capturas();
        Scanner scanner = new Scanner(System.in);
        Integer respostaMenu;

        System.out.println("+=------------------------------------------------------------------=+");
        System.out.println("Informações do seu sistema");
        System.out.println(capturas.looca.getSistema());

        do {
            respostaMenu = null;
            System.out.println("""
                    +=------------------------------------------------------------------=+
                    Escolha uma das opções para armazenar no banco de dados:
                    1 - Uso de CPU (em %)
                    2 - Memória RAM (em Gigabytes)
                    3 - Número de Processos
                    0 - Sair
                    +=------------------------------------------------------------------=+
                    """);
            respostaMenu = scanner.nextInt();

            if (respostaMenu == 1) {
                capturas.cpu();
                System.out.println("Os dados foram salvos");
            } else if (respostaMenu == 2) {
                capturas.memoriaRam();
                System.out.println("Os dados foram salvos");
            } else if (respostaMenu == 3) {
                capturas.numeroProcessos();
                System.out.println("Os dados foram salvos");
            } else {
                System.out.println("Digite uma opção válida");
            }
        } while (respostaMenu != 0);

        capturas.memoriaRam();
    }
}