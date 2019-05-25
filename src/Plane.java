public class Plane implements Vehicle {
    @Override
    public int set_num_of_wheels() {
        return 18;
    }

    @Override
    public int set_num_of_passengers() {
        return 1000;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
