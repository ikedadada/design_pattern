package command.challenge;

import java.awt.Choice;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import command.challenge.drawer.ColorCommand;
import command.challenge.command.Command;
import command.challenge.command.MacroCommand;
import command.challenge.drawer.DrawCanvas;
import command.challenge.drawer.DrawerCommand;

public class Main extends JFrame {
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    private JButton clearButton = new JButton("clear");
    private Choice colorChooser = new Choice();
    private JButton undoButton = new JButton("undo");
    private MouseMotionListener mouseMotionAdapter = new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            Command cmd = new DrawerCommand(canvas, e.getPoint());
            history.append(cmd);
            cmd.execute();
        };

    };
    private WindowListener windowListener = new WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
        }

    };

    public Main(String title) {
        super(title);

        this.addWindowListener(windowListener);
        canvas.addMouseMotionListener(mouseMotionAdapter);
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint();

        });
        colorChooser.add("red");
        colorChooser.add("green");
        colorChooser.add("blue");
        colorChooser.addItemListener(e -> {
            String color = colorChooser.getSelectedItem();
            ColorCommand cmd = new ColorCommand(canvas, color);
            cmd.execute();
        });
        undoButton.addActionListener(e -> {
            history.undo();
            canvas.repaint();
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(colorChooser);
        buttonBox.add(undoButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }

}
