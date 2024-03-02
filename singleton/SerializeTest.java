package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectInput;

public class SerializeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonEnum enumInstance = SingletonEnum.INSTANCE;
        try (ObjectOutput out =
                new ObjectOutputStream(new FileOutputStream("singleton/enumSerialize.ser"))) {
            out.writeObject(enumInstance);
        }

        try (ObjectInput in =
                new ObjectInputStream(new FileInputStream("singleton/enumSerialize.ser"))) {
            SingletonEnum enumInstance2 = (SingletonEnum) in.readObject();
            System.out.println("Enum Singleton:" + (enumInstance == enumInstance2));
        }

        Singleton staticInstance = Singleton.getInstance();
        try (ObjectOutput out =
                new ObjectOutputStream(new FileOutputStream("singleton/staticSerialize.ser"))) {
            out.writeObject(staticInstance);
        }

        try (ObjectInput in =
                new ObjectInputStream(new FileInputStream("singleton/staticSerialize.ser"))) {
            Singleton staticInstance2 = (Singleton) in.readObject();
            System.out.println("Static Singleton:" + (staticInstance == staticInstance2));
        }
    }

}
