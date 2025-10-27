public class AreaCalculator {
        public static void main(String[] args) {
            System.out.println(area(5.0));
            System.out.println(area(-1.0));
            System.out.println(area(5.0, 4.0));
            System.out.println(area(-1.0, 4.0));
        }

        public static double area(double radious){
            if (radious < 0){
                return -1.0;
            }
            double areaCircule = Math.PI * (radious * radious);
            return areaCircule;
        }

        public static double area(double x, double y){
            if (x < 0 || y < 0){
                return -1.0;
            }
            return x * y;
        }
    }
