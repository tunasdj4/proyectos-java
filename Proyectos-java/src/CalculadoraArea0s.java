public class CalculadoraArea0s {
    public static void main(String[] args) {
        double areaCirculo = calculadoraAreas(10.0);
        System.out.println("Calculculando el area de un circulo " + areaCirculo);
        double arearectangulo= calculadoraAreas(15.3, 16.0);
        System.out.println("Calculculando el area de un rectangulo " +  arearectangulo);

    }
    public static double calculadoraAreas(double radio){
        return Math.PI * radio * radio;
    }

    public static double calculadoraAreas(double base, double altura){

        return base*altura;
    }

}
