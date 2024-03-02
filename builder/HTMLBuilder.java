package builder;

public class HTMLBuilder extends Builder {
    private String fileName = "untitled.html";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";
        sb.append("<html><head><title>" + title + "</title></head><body>\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("<p>" + str + "</p>\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("<ul>\n");
        for (String s : items) {
            sb.append("<li>" + s + "</li>\n");
        }
        sb.append("</ul>\n");
    }

    @Override
    public void close() {
        sb.append("</body></html>\n");
        try {
            java.io.FileWriter writer = new java.io.FileWriter("builder/" + fileName);
            writer.write(sb.toString());
            writer.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public String getResult() {
        return fileName;
    }


}
