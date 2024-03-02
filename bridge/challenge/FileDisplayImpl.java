package bridge.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileDisplayImpl extends bridge.DisplayImpl {
    private ArrayList<String> fileData;
    private int maxWidth;

    public FileDisplayImpl(String filePath) {
        fileData = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                fileData.add(line);
                if (line.length() > maxWidth) {
                    maxWidth = line.length();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        for (String line : fileData) {
            int spaceNum = maxWidth - line.length();
            StringBuilder sb = new StringBuilder();
            sb.append("|");
            sb.append(line);
            for (int i = 0; i < spaceNum; i++) {
                sb.append(" ");
            }
            sb.append("|");
            System.out.println(sb.toString());
        }
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("*");
        for (int i = 0; i < maxWidth; i++) {
            System.out.print("-");
        }
        System.out.print("*");
        System.out.println();
    }


}
