import javax.swing.*;
import java.awt.*;

/*
    * JPanel(): creates a new panel with a flow layout
    * JPanel(LayoutManager l): creates a new JPanel with specified layoutManager
    * JPanel(boolean isDoubleBuffered): creates a new JPanel with a specified buffering strategy
    * add(Component c): Adds a component to a specified container
    * setLayout(LayoutManager l): sets the layout of the container to the specified layout manager
    * updateUI(): resets the UI property with a value from the current look and feel.
    * setUI(PanelUI ui): sets the look and feel of an object that renders this component.
    * getUI(): returns the look and feel object that renders this component.
    * paramString(): returns a string representation of this JPanel.
    *
 * */
public class GUI {


     class solution extends JFrame{
        // [OBJs]
         static JFrame f;
         static JButton b, b1, b2, b3; // JButton
         static JLabel l; // Label to display text

     }

    public static void main (String[] args){
        //new GUI(); // call to class properties

        // [OBJs]
        JFrame f = new JFrame("panel-frame");
        JLabel l = new JLabel("panel-label");

        // [BUTTONS-OBJ]
        JButton b = new JButton("button01");
        JButton b1 = new JButton("button02");
        JButton b2 = new JButton("button03");
        JButton b3 = new JButton("button04");

        // [FRAME-OBJ]
        JPanel p = new JPanel(new BorderLayout());

        // [CONSTRUCTION - P - LAYOUT]
        p.add(b, BorderLayout.NORTH);
        p.add(b1, BorderLayout.NORTH);
        p.add(b2, BorderLayout.EAST);
        p.add(b3, BorderLayout.WEST);
        p.add(l, BorderLayout.CENTER);

        // [BK-GROUND COLOR]
        p.setBackground(Color.green);

        // [CONSTRUCTION - ADD 2 FRAME]
        f.add(p);
        f.setSize(300, 300);
        f.show();

    }
}
