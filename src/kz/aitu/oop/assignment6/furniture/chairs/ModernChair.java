package kz.aitu.oop.assignment6.furniture.chairs;

import kz.aitu.oop.assignment6.furniture.chairs.interfaces.Chair;

public class ModernChair implements Chair {

    @Override
    public void createChair() {
        System.out.println("Sold Modern style Chair.");
    }
}
