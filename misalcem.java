
public class misalcem {
    public static void main(String[] args) {
        int a = 1556488;
        int cem = 0;

        while (a > 0) {
            cem += a % 10;
            a /= 10;
        }

        System.out.println("Reqemlerin cemi: " + cem);
    }
}
