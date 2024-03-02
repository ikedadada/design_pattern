package adapter.challenge_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("./adapter/challenge_2/file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("./adapter/challenge_2/newfile.txt");
            System.out.println("newfile.txt is created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
