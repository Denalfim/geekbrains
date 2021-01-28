package homework1;

public class Orange extends Fruit {
    private float weight = 1.2f;
    private String name = "Orange";

    @Override
    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
