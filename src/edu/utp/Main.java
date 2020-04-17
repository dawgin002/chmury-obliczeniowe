package edu.utp;

public class Main {

    private static final String PROJECT_NAME = "Projekt na chmury obliczeniowe";

    public static void main(String[] args) {
        System.out.println("Wersja JRE: "+System.getProperty("java.runtime.version"));
        System.out.println("Wersja JDK: "+System.getProperty("java.version"));
        System.out.println("Nazwa: "+ System.getProperty("java.runtime.name"));
        System.out.println("Vendor: "+ System.getProperty("java.vm.vendor"));
    }
}
