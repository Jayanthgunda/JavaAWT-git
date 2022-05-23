import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;

    public MyFrame()
    {
        super("CheckBoxDemo");
        cbg = new CheckboxGroup();

        c1=new Checkbox("Java",false,cbg);
        c2=new Checkbox("Python",false,cbg);
        c3=new Checkbox("C#",false,cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        add(l);
        add(c1);
        add(c2);
        add(c3);

        setLayout(new FlowLayout());
             
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
                String str="";
                if(c1.getState())
                str=str+" "+c1.getLabel();
                if(c2.getState())
                str=str+" "+c2.getLabel();
                if(c3.getState())
                str=str+" "+c3.getLabel();
                if(str.isEmpty())
                str="Nothing is Selected";

                l.setText(str);
    }

}


public class CheckBox {
    public static void main(String[] args) {
        MyFrame m = new MyFrame();
        m.setSize(500,500);
        m.setVisible(true);
      
    }
}
