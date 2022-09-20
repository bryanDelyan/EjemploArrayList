/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class MiColeccion {

    ArrayList<Integer> Coleccion = new ArrayList<>();

    public MiColeccion() {

    }

    public void insertarAlFinal(int valor) {
        Coleccion.add(valor);

    }

    public void insertarAlPrincipio(int valor) {
        Coleccion.add(0, valor);
    }

    public void agregarFinal(ArrayList i) {
        Coleccion.addAll(i);

    }

    public void eliminar(int posicion) {
        Coleccion.remove(posicion);
    }

    public void setValor(int posicion, int valor) {
        Coleccion.add(posicion, valor);
    }

    public int getValor(int posicion) {
        int valor = Coleccion.get(posicion);
        return valor;
    }

    public int getSumatoria() {
        int suma = 0;
        for (int i = 0; i < Coleccion.size(); i++) {
            suma += Coleccion.get(i);
        }
        return suma;
    }

    public double getPromedio() {
        double prom = 0.0;
        for (int i = 0; i < Coleccion.size(); i++) {
            prom = prom + Coleccion.get(i);
        }
        return prom / Coleccion.size();
    }

    public int cuentaElementos() {
        return Coleccion.size();
    }

    public int cuentaCeros() {
        int count = 0;
        for (int i = 0; i < Coleccion.size(); i++) {

            if (Coleccion.get(i) == 0) {
                count++;
            }
        }
        return count;
    }

    public int sumaPares() {
        int par = 0;
        for (int i = 0; i < Coleccion.size(); i++) {
            if (Coleccion.get(i) % 2 == 0) {
                par = par + Coleccion.get(i);
            }
        }
        return par;
    }

    public int cuentaRepeticiones(int numero) {
        int contador = 0;
        for (int i = 0; i < Coleccion.size(); i++) {
            if (Coleccion.get(i).equals(numero)) {
                contador++;
            }
        }
        return contador;
    }

    public void reemplazarValor(int antiguoValor, int nuevoValor) {
        for (int i = 0; i < Coleccion.size(); i++) {
            if (Coleccion.get(i).equals(antiguoValor)) {
                Coleccion.set(i, nuevoValor);
            }
        }
    }

    public void reemplazarTodo(ArrayList a) {
        Coleccion.clear();
        Coleccion.addAll(a);
    }

    public ArrayList invertir() {
        ArrayList list = new ArrayList();
        for (int i = (Coleccion.size() - 1); i >= 0; i--) {
            list.add(Coleccion.get(i));
        }
        return list;
    }

    public int getMayor() {
        int mayor = Coleccion.get(0);
        for (int i = 0; i < Coleccion.size(); i++) {
            if (Coleccion.get(i) > mayor) {
                mayor = Coleccion.get(i);
            }
        }
        return mayor;
    }

    public int getMenor() {
        int menor = Coleccion.get(0);
        for (int i = 0; i < Coleccion.size(); i++) {
            if (Coleccion.get(i) < menor) {
                menor = Coleccion.get(i);
            }
        }
        return menor;
    }

    public ArrayList getPrimeros(int cantidad) {
        ArrayList list = new ArrayList();

        if (cantidad < Coleccion.size()) {
            for (int i = 0; i < cantidad; i++) {
                list.add(Coleccion.get(i));
            }
        } else {
            System.out.println("La cantidad supera el tamaño del array");
        }
        return list;
    }

    public ArrayList getUltimos(int cantidad) {
        ArrayList list = new ArrayList();

        if (cantidad < Coleccion.size()) {
            for (int i = 0; i < cantidad; i++) {
                list.add(Coleccion.get(Coleccion.size() - cantidad + i));
            }
        } else {
            System.out.println("La cantidad supera el tamaño del array");
        }
        return list;
    }

    public boolean esPalindrome() {
        boolean palindrome = true;
        for (int i = 0; i < (Coleccion.size() / 2); i++) {
            if (Coleccion.get(i) != Coleccion.size() - i - 1) {
                palindrome = false;
            }
        }
        return palindrome;
    }

    public boolean buscar(int numero) {
        boolean si = false;
        for (int i = 0; i < Coleccion.size(); i++) {
            if (Coleccion.get(i).equals(numero)) {
                si = true;
            }
        }
        return si;
    }

    public void mostrarContenido() {
        System.out.println(Coleccion);
    }
}
