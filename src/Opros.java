import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Opros {

    public static void main(String[] args) throws IOException {
        File file = new File("filename.txt");
        if(!file.exists());
        file.createNewFile();

        FileWriter writer = new FileWriter(file,true);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String answer1 = scanner.nextLine();

        System.out.println("Введите ваш возраст");
        String answer2 = scanner.nextLine();

        writer.write("Name: " + answer1);
        writer.append("\n");
        writer.write("Age: " + answer2);
        writer.append("\n");
        writer.close();

    }

}
