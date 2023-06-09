package com.example.examenLuis.FiguraInterface;

@FunctionalInterface
public interface FiguraInterface {
    double getRadio(int radio);
    default String defaultRadio(int radio) {
        return "Radio : " + radio +" : iniciando";
    }


}

