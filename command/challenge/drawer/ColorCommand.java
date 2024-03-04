package command.challenge.drawer;

import command.challenge.command.Command;

public class ColorCommand implements Command {
    protected Drawable drawable;
    private String color;

    public ColorCommand(Drawable drawable, String color) {
        this.drawable = drawable;
        this.color = color;
    }

    public void execute() {
        drawable.setColor(color);
    }

}
