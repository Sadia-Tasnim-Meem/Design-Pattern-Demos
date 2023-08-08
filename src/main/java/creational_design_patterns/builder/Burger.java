package creational_design_patterns.builder;

public class Burger {
    private final String size;
    private final boolean cheese;
    private final boolean meats;

    private Burger(Burger.BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.meats = builder.meats;
    }

    // getters for all fields


    public String getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMeat(){return meats;}

    public static class BurgerBuilder {
        private final String size;
        private boolean cheese;
        private boolean burger;
        private boolean meats;

        public BurgerBuilder(String size) {
            this.size = size;
        }

        public Burger.BurgerBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }



        public Burger.BurgerBuilder meats(boolean meats) {
            this.meats = meats;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
