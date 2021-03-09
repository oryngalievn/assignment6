package kz.aitu.oop.assignment6.factory;

import kz.aitu.oop.assignment6.factory.interfaces.FurnitureFactory;
import kz.aitu.oop.assignment6.furniture.chairs.ModernChair;
import kz.aitu.oop.assignment6.furniture.chairs.interfaces.Chair;
import kz.aitu.oop.assignment6.furniture.coffeeTables.ModernCoffeeTable;
import kz.aitu.oop.assignment6.furniture.coffeeTables.interfaces.CoffeeTables;
import kz.aitu.oop.assignment6.furniture.sofas.ModernSofa;
import kz.aitu.oop.assignment6.furniture.sofas.interfaces.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTables createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
