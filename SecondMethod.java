import java.awt.*;

class MyFrame extends Frame{

    Label l;
    TextField tf;
    Button b;

    public MyFrame()
    {
        super("ORIGIN");
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");
        

        add(l);
        add(tf);
        add(b);

        }

}
 
 
 class SecondMethod {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setLayout(new FlowLayout());


        f.setSize(400,400);
        f.setVisible(true);

    }
}
