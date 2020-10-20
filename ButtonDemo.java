// Demonstrate Buttons
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="ButtonDemo" width=250 height=150>
</applet>
*/
public class ButtonDemo extends Applet implements ActionListener {
String msg = "";
Button yes, no, maybe,thanks;
public void init() {
yes = new Button("Yes");
no = new Button("No");
maybe = new Button("Undecided");
thanks= new Button("Thanks");
add(yes);
add(no);
add(maybe);
add(thanks);
yes.addActionListener(this);
no.addActionListener(this);
maybe.addActionListener(this);
thanks.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
String str = ae.getActionCommand();
if(str.equals("Yes")) {
msg = "You pressed Yes.";
}
else if(str.equals("No")) {
msg = "You pressed No.";
}
else if(str.equals("Thanks")) {
msg = "You pressed Thanks.";
}
else {
msg = "You pressed Undecided.";
}
repaint();
}
public void paint(Graphics g) {
g.drawString(msg, 6, 100);
}
}