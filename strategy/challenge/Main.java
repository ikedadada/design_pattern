package strategy.challenge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "E", "C", "A", "B");

        // 辞書順に小さい順に並び替え
        Comparator<String> c = (o1, o2) -> o1.compareTo(o2);
        list.sort(c);
        System.out.println(list);

        c = (o1, o2) -> o2.compareTo(o1);
        list.sort(c);
        System.out.println(list);
    }

}
