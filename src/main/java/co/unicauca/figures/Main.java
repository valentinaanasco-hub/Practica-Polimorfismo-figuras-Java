package co.unicauca.figures;

import co.unicauca.figures.domain.Circle;
import co.unicauca.figures.domain.Figure;
import co.unicauca.figures.domain.Square;
import co.unicauca.figures.domain.Triangle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brada
 */
public class Main {

    public static void main(String[] args) {

        Figure fig1 = new Circle(1.0); //radio
        Figure fig2 = new Square(2.3); //lado
        Figure fig3 = new Triangle(4.2, 4.5); //base y altura

        //Arreglo polimorfico
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);

        //Recorremos el arreglo y ejecutamos los metodos polimorficos
        for (Figure fig : figures) {
            System.out.println("Area: " + fig.calculateArea());
            System.out.println("Perimeter: " + fig.calculatePerimeter());
        }
    }
}
