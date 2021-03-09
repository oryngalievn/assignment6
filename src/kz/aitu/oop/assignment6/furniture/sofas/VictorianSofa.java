package kz.aitu.oop.assignment6.furniture.sofas;

import kz.aitu.oop.assignment6.furniture.sofas.interfaces.Sofa;

public class VictorianSofa implements Sofa {

    @Override
    public void createSofa(){
        System.out.println("Sold Victorian style Sofa.");
    }
}
