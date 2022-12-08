package poo;

import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {
        Numero n = new Numero();

        boolean continuar = true;


        Scanner scan = new Scanner(System.in);
        while(continuar) {
            double x = 0;
            double y = 0;
            int operacao = 0 ;

            System.out.println("Digite a operação que deseja realizar: "
            +                       " \n1 para soma "  
            +                       " \n2 para subtração "  
            +                       " \n3 para multiplicação "  
            +                       " \n4 para divisão "  
            +                       " \n ou 0 para finalizar "                 
            );

            operacao = scan.nextInt();

            if (operacao == 0) {
                continuar = false;
                return;

            }

            System.out.println("Informe o valor do primeiro número");
            x = scan.nextDouble();

            System.out.println("Informe o valor do segundo número");
            y = scan.nextDouble();

            switch (operacao) {
                case 1:
                    imprimeCalculadora(operacao, n.soma(x, y), x, y);
                    break;
            switch (operacao) {
                case 2:
                    imprimeCalculadora(operacao, n.subtracao(x, y), x, y);
                    break;  
            switch (operacao) {
                case 3:
                    imprimeCalculadora(operacao, n.multiplicacao(x, y), x, y);
                    break;
            switch (operacao) {
                case 4:
                    imprimeCalculadora(operacao, n.divisao(x, y), x, y);
                    break;                                             
            }

        }

        scan.close();

        
    }

    static void imprimeCalculadora(int operacao, double resultado, double x, double y){
        HashMap<Interger, String> mapOperacao = new HashMap<>();
        mapOperacao.put(key: 1, value: "Somado");
        mapOperacao.put(key: 2, value: "Subtraído");
        mapOperacao.put(key: 3, value: "Multiplicado");
        mapOperacao.put(key: 4, value: "Dividido");

        System.out.println("\n O resultado de: " + x + mapOperacao.get(operacao) + " por " + y + " é igual a " + resultado + "\n" );

            
        }
    }
}
        
    }

    private static void imprimeCalculadora(int operacao, Object multiplicacao, double x, double y) {
    }
}

