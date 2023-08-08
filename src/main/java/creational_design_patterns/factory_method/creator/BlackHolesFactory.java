package creational_design_patterns.factory_method.creator;

import creational_design_patterns.factory_method.product.Asteroids;
import creational_design_patterns.factory_method.product.BlackHoles;

public abstract class BlackHolesFactory {
    public abstract BlackHoles createBlackHoles(int score);
}
