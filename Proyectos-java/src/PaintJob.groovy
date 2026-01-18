public class PaintJob {
    public static void main(String[] args) {
        // ejercicio de sobrecarga de metodos


        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.26, 0.75));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double totalArea = width * height;

        double totalBuckets = Math.ceil(totalArea / areaPerBucket);

        int tBA = (int) totalBuckets;

        tBA = tBA -extraBuckets;

        if (tBA < 0){
            return 0;
        }
        return tBA;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double buckets = area / areaPerBucket;

        buckets = Math.ceil(buckets);

        int b = (int) buckets;

        return b;
    }





}
