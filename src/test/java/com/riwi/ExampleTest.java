package com.riwi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExampleTest {

    private Example example;

    //INICIALIZAMOS UNA INSTQANCIA PARA CADA TEST
    @BeforeEach
    public void setUp() {
        example = new Example();
    }

    //LOS TEST SIEMPRE SOM VOID
    //PRUEBA DE METODO SUMA
    @Test
    public void test() {
        //given
        Example example = new Example();
        int numberA = 3;
        int numberB = 3;
        //when
        int result = example.sumar(numberA, numberB);

        //then
        assertEquals(6, result);
    }

    //PRUEBA EXCEPCIONES if menor 0 excepcion else true
    @Test
    public void testCheckPositivo(){
        //given
        Example example = new Example();
        int numberA = 3;
        //when
        boolean result = example.checkPositivo(numberA);
        //then
        assertTrue(result);
    }
    //EVALUARA UNA CONDICION DE ERROR POR ENDE NO LLEVA UN WHEN es una rama del de arriba
    @Test
    public void testChecPositivoError(){
        Example example = new Example();
        int numberA = -3;
        //THEN SE LANZA EL METODO DIRECTAMENTE EN EL ASSERT
        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(numberA));
    }

    @Test
    public void testCountALetters(){
        Example example = new Example();
        String cadena = "ju renas";

        int result = example.contarLetrasA(cadena);

        assertEquals(3, result);
    }

    @Test
    public void testContainsElement(){
        //YA TENEMOS EL OBJETO
        List<String> countries = List.of("mexico", "colombia");
        String element = "colombia";
        boolean result = example.contieneElemento(countries, element);

        assertTrue(result);
    }
    
    @Test
    public void testRevertCadena(){
        String cadena = "carro";

        String result = example.revertirCadena(cadena);

        assertEquals("orrac", result);
    }

    @Test
    public void testFactorial(){
        int number = 6;

        Long result = example.factorial(number);
        assertEquals(720, result);
    }

    @Test
    public void testFactorialError(){
        int number = -10;
        assertThrows(IllegalArgumentException.class, () -> example.factorial(number));
    }

    @Test
    public void testEsPrimoFirst(){
        int number = 1;
        boolean result = example.esPrimo(number);
        assertFalse(result);
    }

    @Test
    public void testEsPrimoSecond(){
        int number = 4;
        boolean result = example.esPrimo(number);
        assertFalse(result);
    }
    @Test
    public void testEsPrimoThird(){
        int number = 3;
        boolean result = example.esPrimo(number);
        assertTrue(result);
    }

    @Test
    public void testMessageRetrsased() throws InterruptedException {
        String result = example.mensajeConRetraso();
        assertEquals("Listo después de retraso", result);
    }
}
