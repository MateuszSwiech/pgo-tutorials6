public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lexus", "IS250", 2006, 500, 50);
        System.out.println("Efektywność paliwowa samochodu: " + car.calculateFuelEfficiency() + " mil/galon");

        Truck truck = new Truck("Skoda", "Fabia", 2018, 300, 70, 2); // 2 tony ładunku
        System.out.println("Efektywność paliwowa ciężarówki: " + truck.calculateFuelEfficiency() + " mil/galon");
    }
}