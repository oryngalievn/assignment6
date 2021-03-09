package kz.aitu.oop.assignment6.factory;

import kz.aitu.oop.assignment6.factory.interfaces.FurnitureFactory;
import kz.aitu.oop.assignment6.furniture.chairs.VictorianChair;
import kz.aitu.oop.assignment6.furniture.chairs.interfaces.Chair;
import kz.aitu.oop.assignment6.furniture.coffeeTables.VictorianCoffeeTable;
import kz.aitu.oop.assignment6.furniture.coffeeTables.interfaces.CoffeeTables;
import kz.aitu.oop.assignment6.furniture.sofas.VictorianSofa;
import kz.aitu.oop.assignment6.furniture.sofas.interfaces.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTables createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
