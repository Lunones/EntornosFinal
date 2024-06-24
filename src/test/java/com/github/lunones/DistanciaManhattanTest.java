package com.github.lunones;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanciaManhattanTest {
    static DistanciaManhattan distancia;

    @BeforeAll
    public static void setUpClass(){
        distancia = new DistanciaManhattan();
    }
    @Test
    void distancia_1_2_al_3_4() {
        Punto origen = new Punto(1,2);
        Punto destino = new Punto(3,4);
        assertEquals(distancia.medir(origen,destino), 4);
    }


    @Test
    void distancia_1_1_al_3_3() {
        Punto origen = new Punto(1,1);
        Punto destino = new Punto(3,3);
        assertEquals(distancia.medir(origen,destino), 4);
    }


    @Test
    void distancia_menos_2_menos_1_al_1_2() {
        Punto origen = new Punto(-2,-1);
        Punto destino = new Punto(1,2);
        assertEquals(distancia.medir(origen,destino), 6);
    }


    @Test
    void distancia_menos_1_1_al_3_1() {
        Punto origen = new Punto(-1,1);
        Punto destino = new Punto(3,1);
        assertEquals(distancia.medir(origen,destino), 4);
    }
}