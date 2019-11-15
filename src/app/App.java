package app;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 10, b = 20;
        int max = (a < 20) ? ((b < 20) ? b * 2 : ((b > 20) ? b % 3 : b / 4)) : ((a == 10) ? a / 2 : a % 3);
        System.out.println(max);
    }
}
