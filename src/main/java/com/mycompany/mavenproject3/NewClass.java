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
public class NewClass {
     public int[] primeros3impares(int num) {
        int[] listaImpares = new int[num];
        int indice = 0;

        //Busqueda de los 3 primeros impares
        for (int i = 0; i <= num; i++) {

            if (i % (2) != 0 && indice < num) {
                listaImpares[indice] = i;
                indice++;

            }
        }
        //En caso de que no se llene la lista pondremos un -1
        while (indice < num) {

            listaImpares[indice] = -1;
            indice++;

        }

        //El indice de la lista es reinicido
        indice = 0;

        return listaImpares;
    }
}
