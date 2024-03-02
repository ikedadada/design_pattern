package command.drawer;

import command.command.Command;
import java.awt.Point;

public class DrawerCommand implements Command {
    protected Drawable drawable;

    private Point position;

    public DrawerCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }

}
