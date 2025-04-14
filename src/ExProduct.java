import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExProduct {
    public static void main(String[] args) {

        String path = "/home/jrr/Documents/Estudo e Otimização/teste/manipulandoArquivos/input/produtos.txt";
        List<Product> list = new ArrayList<Product>();
        String targetFileStr = "/home/jrr/Documents/Estudo e Otimização/teste/manipulandoArquivos/saida/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null){
                String[] vetor = line.split(",");
                String name =  vetor[0];
                double price =  Double.parseDouble(vetor[1]);
                Integer quantity = Integer.parseInt(vetor[2]);
                Product product = new Product(name,price,quantity);
                list.add(product);
                line = br.readLine();

            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                System.out.println("PRODUCTS");
                for(Product p: list){
                    System.out.println(p);
                    bw.write(p.getName() + "," + String.format("%.2f", p.valorTotal()) + "\n");
                }
                System.out.println("\n\n" + targetFileStr + " CREATED");

            }catch(IOException e){
                System.out.println(e.getMessage());
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}

