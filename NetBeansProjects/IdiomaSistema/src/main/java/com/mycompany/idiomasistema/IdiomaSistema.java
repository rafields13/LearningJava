/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idiomasistema;

import java.util.Locale;

/**
 *
 * @author rafie
 */
public class IdiomaSistema {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema e");
        System.out.println(loc.getDisplayLanguage());
    }
}
