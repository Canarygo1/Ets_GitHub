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

        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        String binario = "";

        int divisor = 20;
        while(divisor != 0){
            int resto = valor%2;
            binario = resto + binario;
            divisor = valor/2;
            valor = valor/2;
        }

        
        int contar = 0;
        for(int i = 0; i < binario.length(); i++){
            if(binario.charAt(i) == '1'){
                contar++;
            }
        }

        if(contar%2 == 0){
            System.out.println("MALVADO");
        }else{
            System.out.println("NO MALVADO");
        }


        }

    }
    

