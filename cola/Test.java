/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.cola;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alvarogasca
 */
public class Test {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
    
      public void encolar() {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla [tabla.length -1]= a;
        int z=sc.nextInt();
        while(z>=0){
        this.insertarFinal(z);
        z=atr.nextInt();
        }
        
    }
    public void desencolar() {
        int b=1;
    for (int i = 0; i < tabla.length-2; i++) {
        tabla[i]=tabla[b];
        b++;
    }
    tabla[tabla.length-1]=0;
    while(tabla.length>0){
    this.eliminar(0);
        System.out.println(Arrays.toString(tabla));
    }
    }
  }


