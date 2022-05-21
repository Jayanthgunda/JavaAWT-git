import java.awt.*;

class FirstMethod
{
    public static void main(String[] args) {
        
        Frame f = new Frame("ORIGIN");
        f.setLayout(new FlowLayout());

        Label l = new Label("Name");
        TextField tf = new TextField(20);
        Button b = new Button("OK");

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setVisible(true);
        f.setSize(300,300);

        
    }

}