import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Usando bloco 'try with resources'
public class Ex3 {

    public static void main(String[] args) {

        String path = "/home/jrr/Documents/Estudo e Otimização/teste/manipulandoArquivos/input/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        }


    }



