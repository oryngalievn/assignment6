package kz.aitu.oop.assignment6.factory.interfaces;

import kz.aitu.oop.assignment6.furniture.chairs.interfaces.Chair;
import kz.aitu.oop.assignment6.furniture.coffeeTables.interfaces.CoffeeTables;
import kz.aitu.oop.assignment6.furniture.sofas.interfaces.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTables createCoffeeTable();

}
