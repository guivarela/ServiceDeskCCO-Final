package br.usjt.deswebmob.servicedeskcco.controller;

public class SingletonFilas {
    private static final SingletonFilas ourInstance = new SingletonFilas();

    public static SingletonFilas getInstance() {
        return ourInstance;
    }

    private SingletonFilas() {
    }
}
