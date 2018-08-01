package com.example.homework.model;

import static java.lang.Math.*;

public class LineCalc {


    public double lineLength(Line2D line){

        double wynik1 = pow(line.getaX() - line.getbX(), 2.0);
        double wynik2 = pow(line.getbX() - line.getbY(), 2.0);
        double lenght = round(abs((sqrt(wynik1 + wynik2))));
        return lenght;

    }
}
