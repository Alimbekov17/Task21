import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        fileWriter();
        fileReader();
    }

    private static void fileReader() {
        try (FileReader fileReader = new FileReader("engAlphabet.txt")){
            Scanner scanner = new Scanner(fileReader);
            int counter = 1;
            while (scanner.hasNextLine()){
                System.out.println(counter + ": " + scanner.nextLine());
                counter++;
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void fileWriter() {
        try (FileWriter fileWriter = new FileWriter("engAlphabet.txt")){
            fileWriter.write("""
                    A a
                    B b
                    C c
                    D d
                    E e
                    F f
                    G g
                    H h
                    I i
                    J j
                    K k
                    L l
                    M m
                    N n
                    O o
                    P p
                    Q q
                    R r
                    S s
                    T t
                    U u
                    V v
                    W w
                    X x
                    Y y
                    Z z
                    0
                    1
                    2
                    3
                    4
                    5
                    6
                    7
                    8
                    9""");
            fileWriter.write("\nThere are 26 letters in English alphabet.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}