/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.figures.domain;

/**
 *
 * @author valen
 */
public class Square implements Figure { 
    private double lado;

    public Square(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double calculatePerimeter(){
      return 4*lado;  
        
    }
    @Override
    public double calculateArea(){
      return lado * lado;
    }
    
}
