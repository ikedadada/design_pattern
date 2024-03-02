package memento.challenge.game;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Memento implements Serializable {
    private int money;
    private List<String> fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return fruits;
    }

    public static boolean saveToFile(String filename, Memento memento) {
        try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(filename))) {
            writer.writeObject(memento);
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
        return true;
    }

    public static Memento loadFromFile(String filename) {
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(filename))) {
            return (Memento) reader.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
