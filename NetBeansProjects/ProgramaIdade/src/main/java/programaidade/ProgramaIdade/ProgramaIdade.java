/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programaidade.ProgramaIdade;

import java.util.Scanner;
/**
 *
 * @author rafie
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.print("Digite o ano que voce nasceu, por favor: ");
        int nasc = t.nextInt();
        
        int i = 2023 - nasc;
        System.out.println("Sua idade e " + i);
        
        if (i >= 18) {
            System.out.print("de maior");
        } else {
            System.out.print("de menor");
        }
    }
}
