package gb1;

public class Main {
    public static void main(String[] args) {
        //Animal animal2 = new Cat("Boris", 2, "red");
        Cat cat = new Cat("Murzik", 1, "black");
        //cat2.setAge(-3);
        Wolf wolf = new Wolf("Akella", 5, "black");
        Animal animal = new Wolf("Sery", 3, "gray");
        Turtle turtle = new Turtle("Tortilla", 150, "green");
        cat.setSwimmingSpeed(5);
        wolf.setSwimmingSpeed(12);
        turtle.setSwimmingSpeed(3);
        System.out.println(wolf.toString());

        //cat.swim(12);

        Pool[] pools = {new Pool(10), new Pool(14), new Pool(40)};
        turtle.setSwimmingSpeed(1);
        wolf.setSwimmingSpeed(12);
        cat.setSwimmingSpeed(5);
        double catTime = 0;
        double turtleTime = 0;
        double wolfTime = 0;
        for (Pool pool: pools) {
            catTime = catTime + cat.swim(pool.getLength());
            wolfTime = wolfTime + wolf.swim(pool.getLength());
            turtleTime = turtleTime + turtle.swim(pool.getLength());
        }

        CanSwim[] canSwims = {cat, wolf, turtle};

        for (Pool pool: pools) {
            for (CanSwim swimmer: canSwims) {
                swimmer.swim(pool.getLength());
            }
        }

        System.out.println("Время черепахи:" + turtleTime);
        System.out.println("Время кота:" + catTime);
        System.out.println("Время волка:" + wolfTime);

    }

    }






