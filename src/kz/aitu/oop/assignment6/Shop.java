package kz.aitu.oop.assignment6;

import kz.aitu.oop.assignment6.factory.ArtDecoFurnitureFactory;
import kz.aitu.oop.assignment6.factory.ModernFurnitureFactory;
import kz.aitu.oop.assignment6.factory.VictorianFurnitureFactory;
import kz.aitu.oop.assignment6.factory.interfaces.FurnitureFactory;
import kz.aitu.oop.assignment6.furniture.chairs.interfaces.Chair;
import kz.aitu.oop.assignment6.furniture.coffeeTables.interfaces.CoffeeTables;
import kz.aitu.oop.assignment6.furniture.sofas.interfaces.Sofa;

public class Shop {

    public static void main(String[] args) {
        //FurnitureFactory furnitureFactory = new ArtDecoFurnitureFactory();
        FurnitureFactory furnitureFactory = createFurnitureByStyle("modErN");

        CoffeeTables coffeeTables = furnitureFactory.createCoffeeTable();
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();

        coffeeTables.createCoffeeTables();
        chair.createChair();
        sofa.createSofa();
    }

    static FurnitureFactory createFurnitureByStyle(String style) {
        if (style.equalsIgnoreCase("artdeco")) {
            return new ArtDecoFurnitureFactory();
        } else if (style.equalsIgnoreCase("modern")) {
            return new ModernFurnitureFactory();
        } else if (style.equalsIgnoreCase("victorian")) {
            return new VictorianFurnitureFactory();
        } else {
            throw new RuntimeException(style + " is not available furniture style.");
        }
    }
}
