import javax.swing.*;
import java.awt.*;
public class Window2 extends JFrame {
private Container pane;

private JButton b;
private JLabel l;
private JTextField t;
private JCheckBox c;
    public Window2() {
this.setTitle("My first GUI");
this.setSize(600,400);
this.setLocation(100,100);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);


pane = this.getContentPane();
pane.setLayout(new FlowLayout());

b = new JButton("Convert");
l = new JLabel("This is AWESOME! (lies)",null,JLabel.CENTER);
t = new JTextField(12);
c = new JCheckBox("Farenheit");
d = new JCheckBox("Celcius");

pane.add(l);
pane.add(b);
pane.add(t);
pane.add(c);
pane.add(d);
}
    public void actionPerformed(ActionEvent){

    }

    public static void main(String[] args) {
        Window2 g = new Window2();
        g.setVisible(true);
    }
}
