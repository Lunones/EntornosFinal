package com.github.lunones;

public class DistanciaManhattan extends Distancia {

    @Override
    double medir(Punto origen, Punto destino) {
        return Math.abs(destino.getX() - origen.getX()) + Math.abs(destino.getY() - origen.getY());
    }
}
