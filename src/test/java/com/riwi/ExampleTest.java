package com.riwi;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    //PRUEBA DE METODO SUMA
    @Test
    public void testSuma(){
        Example example = new Example();
        int result = example.suma(4,4); //Se espera que el resultado sea 8

        //Verificamos si es o no:   1. num esperado, 2 num recibido
        assertEquals(8, result);
    }
}
