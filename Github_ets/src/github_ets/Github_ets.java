/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github_ets;

import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class Github_ets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola soy alejandro 3");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Tomar un entero: ");
        int valor = input.nextInt();
        String binario = "";

        int divisor = 20;
        while(divisor != 0){
            int resto = valor%2;
            binario = resto + binario;
            divisor = valor/2;
            valor = valor/2;
        }

        System.out.print(binario);
    }
    
}
