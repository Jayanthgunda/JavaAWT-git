import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class Caculator1 extends Frame implements ActionListener,WindowListener
{
    Label l1,l2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    Panel p1,p2;
    TextField tf;
    int arr[] = new int[4];
    int x,y,z,i=0;
    String str="";

    public Caculator1()
    {
        super("Calculator");

        tf = new TextField("answer",20);
       // l1 = new Label("answer");
        l2 = new Label("  ");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button("+");
        b12 = new Button("-");
        b13 = new Button("*");
        b14 = new Button("ok");

        p1 = new Panel();
        p1.add(tf);
        add(p1,BorderLayout.NORTH);

        p2 = new Panel();
        p2.setLayout(new GridLayout(6,3));
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        add(p2,BorderLayout.CENTER);
        
        addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
       if(e.getSource() == b1)
       arr[i++]=1;
       else if(e.getSource() == b2)
       arr[i++]=2;
       else if(e.getSource() == b3)
       arr[i++]=3;
       else if(e.getSource() == b4)
       arr[i++]=4;
       else if(e.getSource() == b5)
       arr[i++]=5;
       else if(e.getSource() == b6)
       arr[i++]=6;
       else if(e.getSource() == b7)
       arr[i++]=7;
       else if(e.getSource() == b8)
       arr[i++]=8;
       else if(e.getSource() == b9)
       arr[i++]=9;
       else if(e.getSource() == b10)
       arr[i++]=0;
       else if(e.getSource() == b11)
       arr[i++]=33;
       else if(e.getSource() == b12)
       arr[i++]=66;
       else if(e.getSource() == b13)
       arr[i++]=99;

       y = arr[i-1];
       str+=y+" ";
       l2.setText(str);

       if(e.getSource() == b14)
       {
        if(arr[1] == 33)
        x = arr[0] + arr[2];
        else if(arr[1] == 66 )
        x = arr[0] - arr[2];
        else 
        x = arr[0] * arr[2];

        tf.setText(x+"");
        i=0;
        str = "";
       }    
    }
    @Override
    public void windowOpened(WindowEvent e) {        
    }
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
        
    }
    @Override
    public void windowIconified(WindowEvent e) {        
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }
    @Override
    public void windowActivated(WindowEvent e) {     
    }
    @Override
    public void windowDeactivated(WindowEvent e) {        
    }
}

public class Project2 {
  public static void main(String[] args) {
      Caculator1 c = new Caculator1();
      c.setVisible(true);
      c.setSize(500,500);
  }  
}