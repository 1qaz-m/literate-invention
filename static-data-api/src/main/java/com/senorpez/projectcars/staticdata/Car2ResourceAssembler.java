package com.senorpez.projectcars.staticdata;

import org.springframework.hateoas.mvc.IdentifiableResourceAssemblerSupport;

import java.util.function.Supplier;

public class Car2ResourceAssembler extends IdentifiableResourceAssemblerSupport<Car2Model, Car2Resource> {
    final private Supplier<Car2Resource> supplier;

    public Car2ResourceAssembler(final Supplier<Car2Resource> supplier) {
        super(Car2Controller.class, Car2Resource.class);
        this.supplier = supplier;
    }

    @Override
    public Car2Resource toResource(Car2Model entity) {
        return createResource(entity);
    }

    @Override
    protected Car2Resource instantiateResource(Car2Model entity) {
        return supplier.get();
    }
}
