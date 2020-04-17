package edu.utp;

public class Main {

    private static Dev1 d1 = new Dev1();
    private static Dev2 d2 = new Dev2();

    public static void main(String[] args) {
        System.out.println("Wersja JRE: "+System.getProperty("java.runtime.version"));
        System.out.println("Wersja JDK: "+System.getProperty("java.version"));
        System.out.println("Nazwa: "+ System.getProperty("java.runtime.name"));
        System.out.println("Vendor: "+ System.getProperty("java.vm.vendor"));

        System.out.println("Autorzy: "+d1.getAuthor()+", "+d2.getAuthor());
    }
}
