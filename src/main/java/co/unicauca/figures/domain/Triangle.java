/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.figures.domain;

/**
 *
 * @author valen
 */
public class Triangle implements Figure {

    private double base, altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculatePerimeter() {
        double baseMid = base / 2;
        double lado = Math.sqrt (Math.pow(baseMid,2)+Math.pow(altura,2));
        return base +lado+lado ;
    }

    @Override
    public double calculateArea() {
        return (base * altura) / 2;
    }
}
