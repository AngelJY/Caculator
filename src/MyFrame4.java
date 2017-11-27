import javax.swing.*;
import java.awt.*;

/**
 * Created by J on 2017/10/21.
 */
public class MyFrame4 extends JFrame{
    JTextArea text;
    public MyFrame4(){
        setTitle("关于");
        setBounds(600,300,300,200);
        setLayout(null);
        init();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        text = new JTextArea();
        text.setBounds(10,10,270,100);
        add(text);

        text.setLineWrap(true);         //可自动换行
        text.setEditable(false);        //不可编辑
        text.setText("这是一个简易版的计算器\n可以进行实数的加减乘除以及平方、开方、求倒数、求相反数运算。\n鼠标点击输入框可以实行键盘输入\nCreated by Jing");
    }

}
