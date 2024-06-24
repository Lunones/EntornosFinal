package com.github.lunones;

/**
 * Clase que calcula la distancia Manhattan
 * @author Lunones
 */
public class DistanciaManhattan extends Distancia {

    /**
     * Este metodo calcula la distancia recorrida entre dos puntos
     * @param origen es el punto de partida
     * @param destino es el punto de destino
     * @return
     */
    @Override
    double medir(Punto origen, Punto destino) {
        return Math.abs(destino.getX() - origen.getX()) + Math.abs(destino.getY() - origen.getY());
    }
}
