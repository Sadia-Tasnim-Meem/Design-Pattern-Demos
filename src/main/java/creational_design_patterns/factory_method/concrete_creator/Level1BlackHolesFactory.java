package creational_design_patterns.factory_method.concrete_creator;

import creational_design_patterns.factory_method.concrete_product.Big_BlackHoles;
import creational_design_patterns.factory_method.concrete_product.Small_BlackHoles;
import creational_design_patterns.factory_method.creator.BlackHolesFactory;
import creational_design_patterns.factory_method.product.Asteroids;
import creational_design_patterns.factory_method.product.BlackHoles;

public class Level1BlackHolesFactory extends BlackHolesFactory {
    @Override
    public BlackHoles createBlackHoles(int score) {
        if(score > 500) return new Big_BlackHoles();
        else return new Small_BlackHoles();
    }
}
