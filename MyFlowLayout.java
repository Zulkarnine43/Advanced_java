    import java.awt.*;
    import javax.swing.*;

    public class MyFlowLayout{
    JFrame f;
    MyFlowLayout(){
        f=new JFrame();

        JButton b0=new JButton("Zero");
        JButton b1=new JButton("One");
        JButton b2=new JButton("Two");
        JButton b3=new JButton("Three");
        JButton b4=new JButton("Four");
        JButton b5=new JButton("Five");
        JButton b6=new JButton("Six");
        JButton b7=new JButton("Seven");
        JButton b8=new JButton("Eight");
        JButton b9=new JButton("Nine");


        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);


        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        //setting flow layout of right alignment

        f.setSize(600,600);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MyFlowLayout();
    }
    }