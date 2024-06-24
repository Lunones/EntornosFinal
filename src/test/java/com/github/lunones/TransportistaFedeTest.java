package com.github.lunones;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportistaFedeTest {
    static TransportistaFede transportista;

    @BeforeAll
    public static void setUpClass(){
        transportista = new TransportistaFede();
    }
    @Test
    void coste_1_2_al_3_4_peso_5() throws Transportista.EnvioNoDisponibleException {
        Punto origen = new Punto(1,2);
        Punto destino = new Punto(3,4);
        double peso = 5;
        assertEquals(transportista.presupuestar(origen,destino,peso), 5);
    }

    @Test
    void coste_0_0_al_0_1_peso_5() throws Transportista.EnvioNoDisponibleException {
        Punto origen = new Punto(0,0);
        Punto destino = new Punto(0,1);
        double peso = 5;
        assertEquals(transportista.presupuestar(origen,destino,peso), 5);
    }


    @Test
    void coste_0_0_al_5_15_peso_2() throws Transportista.EnvioNoDisponibleException {
        Punto origen = new Punto(0,0);
        Punto destino = new Punto(5,15);
        double peso = 2;
        assertEquals(transportista.presupuestar(origen,destino,peso), 20);
    }


    @Test
    void coste_0_0_al_100_100_peso_5() throws Transportista.EnvioNoDisponibleException {
        Punto origen = new Punto(0,0);
        Punto destino = new Punto(100,100);
        double peso = 58;
        //assertEquals(transportista.presupuestar(origen,destino,peso), 5);

        Exception thrown = assertThrows(Transportista.EnvioNoDisponibleException.class, () -> {
            transportista.presupuestar(origen,destino,peso);
        });

        assertEquals("La distancia de envío no está soportada", thrown.getMessage());

    }
}