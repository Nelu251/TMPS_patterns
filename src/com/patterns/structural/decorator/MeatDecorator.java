package com.patterns.structural.decorator;

public class MeatDecorator extends SandwichDecorator {
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make() + addMeat();
    }

    public String addMeat() {
        return " + turkey";
    }
}
