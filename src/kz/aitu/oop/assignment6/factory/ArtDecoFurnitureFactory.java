package kz.aitu.oop.assignment6.factory;

import kz.aitu.oop.assignment6.factory.interfaces.FurnitureFactory;
import kz.aitu.oop.assignment6.furniture.chairs.ArtDecoChair;
import kz.aitu.oop.assignment6.furniture.chairs.interfaces.Chair;
import kz.aitu.oop.assignment6.furniture.coffeeTables.ArtDecoCoffeeTable;
import kz.aitu.oop.assignment6.furniture.coffeeTables.interfaces.CoffeeTables;
import kz.aitu.oop.assignment6.furniture.sofas.ArtDecoSofa;
import kz.aitu.oop.assignment6.furniture.sofas.interfaces.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTables createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
