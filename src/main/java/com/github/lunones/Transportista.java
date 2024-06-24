package com.github.lunones;

public abstract class Transportista {
    private String nombre;
    private String color;
    private Distancia distancia;
    public abstract double presupuestar(Punto origen, Punto destino, double peso);
    public EnvioNoDisponibleException extends Exception {
        EnvioNoDisponibleException(String mensaje) {
            super(mensaje);
        }
    }
}
