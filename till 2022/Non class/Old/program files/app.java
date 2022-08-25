import java.util.*;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double base = sc.nextDouble();
        double area = base * height / 2;
        System.out.println(area);
    }
}
