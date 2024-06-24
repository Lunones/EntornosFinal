package com.github.lunones;

public class TransportistaFede extends Transportista {
    TransportistaFede() {
        this.nombre = "Fede";
        this.color = "Marrón";
        this.distancia = new DistanciaManhattan();
    }

    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException {
        double distanciaEntrePuntos = distancia.medir(origen, destino);
        if (distanciaEntrePuntos > 0 && distanciaEntrePuntos <= 10) {
            return 5;
        } else if (distanciaEntrePuntos > 10 && distanciaEntrePuntos < 100) {
            return (peso * distanciaEntrePuntos) / 2;
        } else {
            throw new Transportista.EnvioNoDisponibleException("La distancia de envío no está soportada");
        }
    }
}
