package creational_design_patterns.factory_method.concrete_creator;

import creational_design_patterns.factory_method.concrete_product.Bigger_BlackHoles;
import creational_design_patterns.factory_method.concrete_product.Small_BlackHoles;
import creational_design_patterns.factory_method.concrete_product.Super_BlackHoles;
import creational_design_patterns.factory_method.creator.BlackHolesFactory;
import creational_design_patterns.factory_method.product.BlackHoles;

public class Level2BlackHolesFactory extends BlackHolesFactory {
    @Override
    public BlackHoles createBlackHoles(int score) {
        if(score > 1000) return new Super_BlackHoles();
        else return new Bigger_BlackHoles();
    }
}
