package creational_design_patterns.abstract_factory.concrete_factory.BlackHoles;


import creational_design_patterns.abstract_factory.product.BlackHoles.Big_BlackHoles;
import creational_design_patterns.abstract_factory.product.BlackHoles.Small_BlackHoles;
import creational_design_patterns.abstract_factory.product.Obstacle;

public class Level1BlackHolesFactory extends BlackHolesFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new Big_BlackHoles();
        else return new Small_BlackHoles();
    }
}
