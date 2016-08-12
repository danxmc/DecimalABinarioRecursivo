/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejenteroabinario;

import java.util.Scanner;

/**
 *
 * @author Daniel Alexandro Martínez A00513954
 */
public class EjEnteroABinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el numero a trasnformar: ");
        System.out.println(Numero.transformToBinary(scan.nextInt()));
    }
    
}
