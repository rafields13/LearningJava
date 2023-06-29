/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucaotela;

import java.awt.Toolkit;
import java.awt.Dimension;

/**
 *
 * @author rafie
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolucao do seu sistema e: " + d.width + "X" + d.height);
    }
}
