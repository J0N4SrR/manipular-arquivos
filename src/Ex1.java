import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Leitura simples com File e Scanner
public class Ex1 {
    public static void main(String[] args) {

        File file = new File("/home/jrr/Documents/Estudo e Otimização/teste/manipulandoArquivos/input/in.txt");
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            if(scanner != null) {
                scanner.close();
            }
        }

    }
}