import java.io.IOException;
import java.util.Scanner;

public class main2  {

    public static void main(String[] args) throws IOException {
        Scanner lector = new Scanner(System.in);
        int S = lector.nextInt();
        int T = lector.nextInt();
        int F = lector.nextInt();
        int hora = S + T + F;
        if (hora >= 24) hora -= 24;
        else if (hora < 0) hora += 24;
        System.out.println(hora);
    }

}