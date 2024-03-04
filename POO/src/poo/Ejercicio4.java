/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import  javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
       String numero1 = JOptionPane.showInputDialog("Ingrese el primer numero");
       String numero2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
       
       int num1 = Integer.parseInt(numero1);
       int num2 = Integer.parseInt(numero2);
       int suma = num1+num2;
       
      
        System.out.println("La suma de los numero es "+ suma);
       
               
        
    }
    
}
