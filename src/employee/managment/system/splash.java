package employee.managment.system;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class splash extends JFrame {
    splash(){
        
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Assets/front.gif"));
Image i2=i1.getImage().getScaledInstance(1200,650,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel image=new JLabel(i3);
image.setBounds(0,0,1200,650);
add(image);


setSize(1200,650);
setLocation(200,50);
setLayout(null);
setVisible(true);
try{
    Thread.sleep(4000);
    setVisible(false);
    new login();
}catch(Exception e){
    e.printStackTrace();
}
    }

    public static void main(String args[]) {
        new splash();
        int a;
    }
}
