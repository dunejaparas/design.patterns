package com.pd.core.patterns.structural.decorator.example.car;

/**
 *
 * Component Implementation – The basic implementation of the component
 * interface. We can have BasicCar class as our component implementation.
 *
 */
public class BasicCar implements ICar {

    @Override
    public void assemble() {
	System.out.print("Basic Car.");
    }

}
