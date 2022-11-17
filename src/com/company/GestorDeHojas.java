package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GestorDeHojas extends Thread {

    //Usamos un array del paquete concurrent
    private static CopyOnWriteArrayList<String> lista = new CopyOnWriteArrayList<String>();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            lista.add(new String("Texto" + i));
        }

        for (String string : lista) {
            System.out.println(string);
        }
        System.out.println(lista);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new GestorDeHojas().start();
        }

    }

}
