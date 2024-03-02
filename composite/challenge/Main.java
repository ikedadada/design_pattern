package composite.challenge;


public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        File vi = new File("vi", 10000);
        File latex = new File("latex", 20000);
        bindir.add(vi);
        bindir.add(latex);
        rootdir.printList();
        System.out.println();

        System.out.println(vi.getPath());
        System.out.println(latex.getPath());
    }

}
