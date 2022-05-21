import java.awt.*;
import java.awt.event.*;

class MyApp extends Frame implements ActionListener{

    Button b,b2;
    Label l;
    private int count;
    

    public MyApp()
    {
        super("PenIn");

        b = new Button("Click");
        b.addActionListener(this);
        b2 = new Button("Second click");
        b2.addActionListener(this);
        l = new Label("  "+count);
        setLayout(new FlowLayout());

        add(l);
        add(b);
        add(b2);
        add(l2);
    }

    public void actionPerformed(ActionEvent e) {
            count++;
            l.setText("  "+count);
    }
    public void actionPerformed(ActionEvent e)
    {
        count=count+10;
        l.setText("  "+count);
    }
}



public class EventHandling_ {

    public static void main(String[] args) {
        MyApp m = new MyApp();
        m.setSize(500,500);
        m.setVisible(true);
    }
}
