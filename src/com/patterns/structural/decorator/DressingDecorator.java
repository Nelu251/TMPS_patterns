package com.patterns.structural.decorator;

public class DressingDecorator extends SandwichDecorator {
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make() + addDressing();
    }

    public String addDressing() {
        return " + mustard";
    }
}
