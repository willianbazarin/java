import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Modulo4_Poo {

    public static void main(String[] args) {
        Set<Character> conjunto = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', null));

        Map<Character, Integer> mapa = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            char letra = (char) ('A' + i);
            mapa.put(letra, i);
        }

        percorrerConjunto(conjunto, mapa);
    }

    public static void percorrerConjunto(Set<Character> conjunto, Map<Character, Integer> mapa) {
        for (Character item : conjunto) {
            try {
                System.out.println(mapa.get(item));
            } catch (NullPointerException e) {
                writeFile("erro.txt");
            }
        }
    }
    public static void writeFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Erro ao percorrer coleção!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
