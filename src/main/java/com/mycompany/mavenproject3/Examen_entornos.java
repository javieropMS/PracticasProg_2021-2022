/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Javier
 */
public class Examen_entornos {

    public static void main(String[] args) {
        // TODO code application logic here
        NewClass a = new NewClass();
        int prlmp = 1;
        for (int i = 0; i < a.primeros3impares(6).length; i++) {
            prlmp = a.primeros3impares(13)[i] * prlmp;

            //System.out.println(a.primeros3impares(13[i]);
        }
        System.out.println(prlmp);

    }

}

