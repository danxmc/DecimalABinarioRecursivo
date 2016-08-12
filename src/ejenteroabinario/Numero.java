/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejenteroabinario;

/**
 *
 * @author Daniel Alexandro Martínez A00513954
 */
public class Numero {
    static String binary = "";
    //Constructor
    public Numero() {
        
    }
    
    /**
     * 
     * @param n el numero el cual se divide entre 2
     * @return 
     */
    public static String transformToBinary(int n) {
        /*Caso base, termina cuando el numerador quede 0*/
        if((n/2) == 0) {
            String binaryReverted = "";
            binary = binary + (n%2);
            //voletea el String donde se guardo el numero binario
            for (int i = (binary.length() - 1); i >= 0; i--) {
                binaryReverted = binaryReverted + binary.charAt(i);
            }
            return binaryReverted;
        } else { /*Dominio, sigue dividiendo entre 2, y el residuo lo anota en
            una variable, y se hace recursivo el numerador de la division entre 2
            */
            binary = binary + n%2;
            return transformToBinary(n/2);
        }
    }
}
