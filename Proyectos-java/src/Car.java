public class Car {
    private String description;

    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(description + " is a " + instanceType);
    }

    public void drive(){
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car is running");
    }

    public static Car getCar(String carType, String description){
        return switch (carType.toUpperCase().charAt(0)){
            case 'G' -> new GasPoweredCar(description);
            case 'E' -> new ElectricCar(description);
            case 'H' -> new HybridCar(description);
            default -> new Car(description);
        };
    }

}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description){
        super(description);
    }

    public GasPoweredCar(String description, int cylinders, double avgKmPerLitre){
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        System.out.println("Gas -> All " + cylinders + " Cylinders are running" );
        super.drive();
    }

    @Override
    protected void runEngine(){
        System.out.println("Gas -> usage exceeded the average: " + avgKmPerLitre);
    }
}

class ElectricCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String description){
        super(description);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Electric Car Star Engine");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Electric Car is driving");
    }

    @Override
    protected void runEngine(){
        System.out.println("Electric Car is running");
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description){
        super(description);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Hybrid Car Star Engine");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Hybrid Car is driving");
    }

    @Override
    protected void runEngine(){
        System.out.println("Hybrid Car is running");
    }
}