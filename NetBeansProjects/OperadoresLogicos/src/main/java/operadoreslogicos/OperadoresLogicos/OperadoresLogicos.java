/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package operadoreslogicos.OperadoresLogicos;

/**
 *
 * @author rafie
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y ^ y<z)?true:false;
        System.out.print(r);
    }
}
