public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(0,24,24));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;

        }
        if (goal > ((bigCount*5) + smallCount)) {
            return false;
        }
        int maxBigByGoal = goal / 5;
        int bigToUse = Math.min(bigCount, maxBigByGoal);

        int remainig   = goal - (bigToUse * 5);

        if (smallCount >= remainig) {
            return true;
        }


        return false;


    }


}