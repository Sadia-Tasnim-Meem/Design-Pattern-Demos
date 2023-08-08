package creational_design_patterns.factory_method;

import creational_design_patterns.factory_method.concrete_creator.Level1AsteroidsFactory;
import creational_design_patterns.factory_method.concrete_creator.Level1BlackHolesFactory;
import creational_design_patterns.factory_method.concrete_creator.Level2AsteroidsFactory;
import creational_design_patterns.factory_method.concrete_creator.Level2BlackHolesFactory;
import creational_design_patterns.factory_method.creator.AsteroidsFactory;
import creational_design_patterns.factory_method.creator.BlackHolesFactory;
import creational_design_patterns.factory_method.product.Asteroids;
import creational_design_patterns.factory_method.product.BlackHoles;

public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        AsteroidsFactory asteroidsFactory;

        if(level == 1) asteroidsFactory = new Level1AsteroidsFactory();
        else asteroidsFactory = new Level2AsteroidsFactory();

        int score = (int)(Math.random() * 2000);

        Asteroids asteroids = asteroidsFactory.createAsteroids(score);
        asteroids.show();

        BlackHolesFactory blackHolesFactory;
        if(level == 1) blackHolesFactory = new Level1BlackHolesFactory();
        else blackHolesFactory = new Level2BlackHolesFactory();

        BlackHoles blackHoles = blackHolesFactory.createBlackHoles(score);
        blackHoles.show();
    }
}
