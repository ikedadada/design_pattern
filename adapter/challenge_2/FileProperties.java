package adapter.challenge_2;

import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    public void readFromFile(String filename) throws IOException {
        Reader reader = new FileReader(filename);
        super.load(reader);
    };
    public void writeToFile(String filename) throws IOException {
        Writer writer = new FileWriter(filename);
        super.store(writer, "written by FileProperties");
    };
    public void setValue(String key, String value) {
        this.setProperty(key, value);
    };
    public String getValue(String key) {
        return this.getProperty(key);
    };

}
