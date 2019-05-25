public class App {

    private final Vehicle vehicle;


    public App(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public static void main(String[] args) {

        App app = new App(new Car());
        app.set_num_of_wheels();
        app.set_num_of_passengers();
        app.hasGas();


        app = new App(new Plane());
        app.set_num_of_wheels();
    }

    private void hasGas() {
        System.out.println(vehicle.has_gas());
    }

    private void set_num_of_passengers() {
        System.out.println(vehicle.set_num_of_passengers());
    }

    private void set_num_of_wheels() {

        System.out.println(vehicle.set_num_of_wheels());


    }
}
