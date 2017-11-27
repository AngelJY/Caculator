import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by J on 2017/10/20.
 */
public class MyMenu extends JMenuBar implements ActionListener{
    JMenuItem menuItem1,menuItem2,menuItem3,menuItem4;
    JMenu menu1,menu2;
    JFrame jFrame;
    public MyMenu(JFrame jFrame){
        this.jFrame = jFrame;
        menu1 = new JMenu("菜单");
        add(menu1);
        menuItem1 = new JMenuItem("标准");
        menuItem1.addActionListener(this);
        menu1.add(menuItem1);
        menuItem2 = new JMenuItem("温度");
        menu1.add(menuItem2);
        menuItem2.addActionListener(this);
        menuItem3 = new JMenuItem("角度");
        menu1.add(menuItem3);
        menuItem3.addActionListener(this);

        menu2 = new JMenu("关于");
        add(menu2);
        menu2.addActionListener(this);
        menuItem4 = new JMenuItem("关于");
        menu2.add(menuItem4);
        menuItem4.addActionListener(this);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource() == menuItem1){
            System.out.println("123");
        }
        if(e.getSource() == menuItem4){
            MyFrame4 myFrame4 = new MyFrame4();
        }
        if(e.getSource() == menuItem2){
            jFrame = new MyFrame2();
        }
        if(e.getSource() == menuItem3){
            jFrame = new MyFrame3();
        }
    }
}
