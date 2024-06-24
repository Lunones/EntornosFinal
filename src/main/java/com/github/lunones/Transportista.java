package com.github.lunones;

public abstract class Transportista {
    protected String nombre;
    protected String color;
    protected Distancia distancia;
    public abstract double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException;
    public class EnvioNoDisponibleException extends Exception {
        EnvioNoDisponibleException(String mensaje) {
            super(mensaje);
        }
    }
}
