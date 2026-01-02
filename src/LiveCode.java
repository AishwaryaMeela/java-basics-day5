public class LiveCode {
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args){
        int result1= add(15, 18);
        double result2= add(15,18);
        System.out.println(result1);
        System.out.println(result2);
    }
}