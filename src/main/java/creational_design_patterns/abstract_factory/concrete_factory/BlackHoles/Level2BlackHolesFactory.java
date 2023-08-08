package creational_design_patterns.abstract_factory.concrete_factory.BlackHoles;


import creational_design_patterns.abstract_factory.product.BlackHoles.Bigger_BlackHoles;
import creational_design_patterns.abstract_factory.product.BlackHoles.Super_BlackHoles;
import creational_design_patterns.abstract_factory.product.Obstacle;

public class Level2BlackHolesFactory extends BlackHolesFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1000) return new Super_BlackHoles();
        else return new Bigger_BlackHoles();
    }
}
