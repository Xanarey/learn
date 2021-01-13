import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите размер массива (больше 3-х): ");
            n = sc.nextInt();
            n = (int)((Math.random()*(n+1)));
        } while (n <= 3);
        System.out.println(n);

    }
}
/*
public class Test {
    public static void main(String[] args) {
        int i = 0;
        while(i == 0) {
            System.out.println((int)(Math.random()*5)-0);
        }

    }
}*/