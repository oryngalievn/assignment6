package kz.aitu.oop.assignment6.furniture.chairs;

import kz.aitu.oop.assignment6.furniture.chairs.interfaces.Chair;

public class VictorianChair implements Chair {

    @Override
    public void createChair() {
        System.out.println("Sold Victorian style Chair.");
    }
}
