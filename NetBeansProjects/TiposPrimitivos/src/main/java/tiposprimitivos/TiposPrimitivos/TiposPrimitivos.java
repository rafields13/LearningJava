/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tiposprimitivos.TiposPrimitivos;

import java.util.Scanner;

/**
 *
 * @author rafie
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Type your name, please: ");
        String name = keyboard.nextLine();
        
        System.out.print("Type your grade, please: ");
        float grade = keyboard.nextFloat();
        
        System.out.printf("%s, your grade is %.1f.", name, grade);
        }
}
