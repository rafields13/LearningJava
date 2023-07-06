/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programamedia.ProgramaMedia;

import java.util.Scanner;

/**
 *
 * @author rafie
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota, por favor: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota, por favor: ");
        float n2 = teclado.nextFloat();
        
        float m = (n1 + n2) / 2;
        
        System.out.println("Sua media foi " + m);
        
        if (m > 9) {
            System.out.print("Parabens, a nota foi excelente!");
        }
    }
}
