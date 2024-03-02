package proxy.challenge;

import proxy.Printable;

public class PrinterProxy implements Printable {
    private String name;
    private String realName;
    private Printable real;

    public PrinterProxy(String realName) {
        this.name = "No Name";
        this.realName = realName;
    }

    public PrinterProxy(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            try {
                real = (Printable) Class.forName(realName).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
