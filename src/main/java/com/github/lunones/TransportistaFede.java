package com.github.lunones;

/**
 * Esta clase implementa el transportista Fede
 * @author Lunones
 */
public class TransportistaFede extends Transportista {
    TransportistaFede() {
        this.nombre = "Fede";
        this.color = "Marrón";
        this.distancia = new DistanciaManhattan();
    }

    /**
     * Esta clase calcula el presupuesto del envio
     * @param origen es el punto de partida del envio
     * @param destino y este es el punto de destino del envio
     * @param peso el peso que se transporta
     * @return devuelve el ingreso a pagar por el envio
     * @throws EnvioNoDisponibleException lanza una excepcion cuando la distancia es de mas de 100km
     */
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
