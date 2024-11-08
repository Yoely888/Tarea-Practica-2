package tarea.practica2.pkg2;

import java.util.ArrayList;
import java.util.List;

public class TareaPractica2 {

    public static void main(String[] args) {
        // Clase llamada Recursos
        Recursos recursos = new Recursos();

        // Llamar a los métodos y mostrar los resultados con las diferentes operaciones
        System.out.println(recursos.obtenerMensaje());

        int edad = 24;
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));

        int a = 8, b = 8;
        System.out.println("Multiplicacion: " + a + " * " + b + " = " + recursos.multiplicar(a, b));

        int x = 10;
        System.out.println("Lista del 1 al " + x + ": " + recursos.generarLista(x));
    }
}

class Recursos {

    // Primer método: Retornar el mensaje
    public String obtenerMensaje() {
        return "Programacion Orientada a Objetos 2021";
    }

    // Segundo método: Verificar la edad del estudiante
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Multiplicación de dos enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Cuarto método: Retornar una lista de números del 1 al X
    public List<Integer> generarLista(int x) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            lista.add(i);
        }
        return lista;
    }
}