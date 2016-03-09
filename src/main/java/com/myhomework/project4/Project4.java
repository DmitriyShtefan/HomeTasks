/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myhomework.project4;

/**
 *
 * @author Lenovo
 */
public class Project4 {
    
    public static void main (String args []){
        int radius = 3;
        int Radius = 5;
        int Height = 2;
        double lenth = 2*Math.PI*radius;
        double square = Math.PI*(radius*radius);
        double square2 = Math.PI*(Radius*Radius - radius*radius);
        System.out.println("Длина окружности=" + lenth);
        System.out.println("Площадь окружности=" + square);
        System.out.println("Площадь кольца=" + square2);
        
        double volume = Math.PI*radius*radius*Height;
        System.out.println("Объем цилиндра=" + volume);
        
        double volume2 = square2*Height;{
           if (Radius>radius){
               System.out.println("Объем полого цилиндра=" + volume2);
            }
           else {
               System.out.println("Error");
           }
        }   
        double square3 = lenth*Height;
        System.out.println("Площадь боковой поверхности цилиндра=" + square3);
           
        
        
    }   
      
    
    
    
}
