package decorator.challenge;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends decorator.Display {
    private List<String> strings = new ArrayList<>();

    @Override
    public int getColumns() {
        int max = 0;
        for (String string : strings) {
            if (string.length() > max) {
                max = string.length();
            }
        }
        return max;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        return strings.get(row);
    }

    public void add(String string) {
        strings.add(string);
    }

}
