/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexp.exercice2;

/**
 *
 * @author kernel-mk
 */
public class Exercice2 {

    public static void main(String[] args) {
        
         // Boucle pour les lignes
         
        for (int i = 1; i <= 7; i++) {
            
            // Boucle pour les colonnes
            
            for (int j = 1; j <= i; j++) {
                
                // Affichage du nombre en fonction du nombre de colonnes
                
                System.out.print(i);
                
            }
            
            // Passage à la ligne suivante
            
            System.out.println();
        }
    
    }
}
