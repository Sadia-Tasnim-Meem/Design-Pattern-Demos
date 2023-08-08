package creational_design_patterns.factory_method.concrete_product;

import creational_design_patterns.factory_method.product.BlackHoles;

public class Small_BlackHoles implements BlackHoles {
    @Override
    public void show() {
        System.out.println("Small black holes show up");
    }
}
