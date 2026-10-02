import java.io.IOException;

public class TestFiles {

    public static void main(String[] args) throws IOException {

        String javaText = FileReaderUtil.readFile("data/java.txt");
        String dsaText = FileReaderUtil.readFile("data/dsa.txt");
        String springText = FileReaderUtil.readFile("data/spring.txt");

        System.out.println("Java file:");
        System.out.println(javaText);

        System.out.println("DSA file:");
        System.out.println(dsaText);

        System.out.println("Spring file:");
        System.out.println(springText);
    }
}