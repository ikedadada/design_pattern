package command;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import command.command.Command;
import command.command.MacroCommand;
import command.drawer.DrawCanvas;
import command.drawer.DrawerCommand;

public class Main extends JFrame implements MouseMotionListener, WindowListener {
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    private JButton clearButton = new JButton("clear");

    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint();

        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    // MouseMotionListener用
    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawerCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener用
    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowActivated(java.awt.event.WindowEvent e) {}
    @Override
    public void windowClosed(java.awt.event.WindowEvent e) {}
    @Override
    public void windowDeactivated(java.awt.event.WindowEvent e) {}
    @Override
    public void windowDeiconified(java.awt.event.WindowEvent e) {}
    @Override
    public void windowIconified(java.awt.event.WindowEvent e) {}
    @Override
    public void windowOpened(java.awt.event.WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }

}
