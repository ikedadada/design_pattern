package command.challenge.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import command.challenge.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color = Color.red;
    private int radius = 6;

    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public void setColor(String color) {
        switch (color) {
            case "red":
                this.color = Color.red;
                break;
            case "green":
                this.color = Color.green;
                break;
            case "blue":
                this.color = Color.blue;
                break;

            default:
                this.color = Color.black;
                break;
        }
    }

}
