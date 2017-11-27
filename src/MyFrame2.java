import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by J on 2017/10/21.
 */
public class MyFrame2 extends JFrame implements ActionListener ,KeyListener {
    JTextField inputText,showText;
    public MyFrame2(){
        setTitle("摄氏度转华氏度");
        setBounds(700,200,350,600);
        setLayout(null);
        init();
        setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    void init() {
        int x = 15, y = 450, length = 90, width = 70;        //基础坐标大小

        JButton button_num0 = new JButton("0");
        button_num0.setBounds(x, y, 2 * length, width);
        button_num0.setBackground(Color.cyan);
        add(button_num0);
        button_num0.addActionListener(this);//添加关联

        x = 15;
        y = y - 70;
        JButton button_num1 = new JButton("1");
        button_num1.setBounds(x, y, length, width);
        button_num1.setBackground(Color.cyan);
        add(button_num1);
        button_num1.addActionListener(this);//添加关联

        x = x + 90;
        JButton button_num2 = new JButton("2");
        button_num2.setBounds(x, y, length, width);
        button_num2.setBackground(Color.cyan);
        add(button_num2);
        button_num2.addActionListener(this);//添加关联

        x = x + 90;
        JButton button_num3 = new JButton("3");
        button_num3.setBounds(x, y, length, width);
        button_num3.setBackground(Color.cyan);
        add(button_num3);
        button_num3.addActionListener(this);//添加关联

        x = 15;
        y = y - 70;
        JButton button_num4 = new JButton("4");
        button_num4.setBounds(x, y, length, width);
        button_num4.setBackground(Color.cyan);
        add(button_num4);
        button_num4.addActionListener(this);//添加关联


        x = x + 90;
        JButton button_num5 = new JButton("5");
        button_num5.setBounds(x, y, length, width);
        button_num5.setBackground(Color.cyan);
        add(button_num5);
        button_num5.addActionListener(this);//添加关联


        x = x + 90;
        JButton button_num6 = new JButton("6");
        button_num6.setBounds(x, y, length, width);
        button_num6.setBackground(Color.cyan);
        add(button_num6);
        button_num6.addActionListener(this);//添加关联

        x = 15;
        y = y - 70;
        JButton button_num7 = new JButton("7");
        button_num7.setBounds(x, y, length, width);
        button_num7.setBackground(Color.cyan);
        add(button_num7);
        button_num7.addActionListener(this);//添加关联

        x = x + 90;
        JButton button_num8 = new JButton("8");
        button_num8.setBounds(x, y, length, width);
        button_num8.setBackground(Color.cyan);
        add(button_num8);
        button_num8.addActionListener(this);//添加关联

        x = x + 90;
        JButton button_num9 = new JButton("9");
        button_num9.setBounds(x, y, length, width);
        button_num9.setBackground(Color.cyan);
        add(button_num9);
        button_num9.addActionListener(this);//添加关联

        x = 15;
        y = y - 70;
        JButton button_back = new JButton("←");
        button_back.setBounds(x,y,length,width);
        button_back.setBackground(Color.ORANGE);
        add(button_back);
        button_back.addActionListener(this);//添加关联

        x = x + 90;
        JButton button_oppo = new JButton("+/-");
        button_oppo.setBounds(x,y,length,width);
        button_oppo.setBackground(Color.ORANGE);
        add(button_oppo);
        button_oppo.addActionListener(this);//添加关联

        x = x + 90;
        JButton button_ce = new JButton("CE");
        button_ce.setBounds(x,y,length,width);
        button_ce.setBackground(Color.ORANGE);
        add(button_ce);
        button_ce.addActionListener(this);//添加关联

        x = x - 90 * 2;
        y = y - 70;
        inputText = new JTextField(20);
        inputText.setBounds(x,y ,3 * length,  width);
        inputText.setFont(new Font("宋体",Font.BOLD,35));
        inputText.setHorizontalAlignment(JTextField.RIGHT);
        inputText.setEditable(false);
        add(inputText);
        inputText.addActionListener(this);//添加关联

        y = y - 70;
        showText = new JTextField(20);
        showText.setBounds(x,y ,3 * length, width);
        showText.setFont(new Font("宋体",Font.BOLD,25));
        showText.setHorizontalAlignment(JTextField.RIGHT);
        showText.setEditable(false);
        add(showText);
        showText.addActionListener(this);//添加关联

        x = 195;
        y = 450;    //基础坐标大小
        JButton button_point = new JButton(".");
        button_point.setBounds(x, y, length, width);
        button_point.setBackground(Color.cyan);
        add(button_point);
        button_point.addActionListener(this);//添加关联
    }
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("0")) {
            inputText.setText(inputText.getText() + "0");
        }
        if (e.getActionCommand().equals("1")) {
            inputText.setText(inputText.getText() + "1");
        }
        if (e.getActionCommand().equals("2")) {
            inputText.setText(inputText.getText() + "2");
        }
        if (e.getActionCommand().equals("3")) {
            inputText.setText(inputText.getText() + "3");
        }
        if (e.getActionCommand().equals("4")) {
            inputText.setText(inputText.getText() + "4");
        }
        if (e.getActionCommand().equals("5")) {
            inputText.setText(inputText.getText() + "5");
        }
        if (e.getActionCommand().equals("6")) {
            inputText.setText(inputText.getText() + "6");
        }
        if (e.getActionCommand().equals("7")) {
            inputText.setText(inputText.getText() + "7");
        }
        if (e.getActionCommand().equals("8")) {
            inputText.setText(inputText.getText() + "8");
        }
        if (e.getActionCommand().equals("9")) {
            inputText.setText(inputText.getText() + "9");
        }
        if (e.getActionCommand().equals(".")) {
            if (!(inputText.getText().indexOf(".") >= 0)) {
                inputText.setText(inputText.getText() + ".");
            }
        }

        if (e.getActionCommand().equals("CE")){
            inputText.setText("");
        }
        if (e.getActionCommand().equals("←")){
            int stringLength = inputText.getText().length();
            if (stringLength > 0){
                inputText.setText(inputText.getText().substring(0, stringLength - 1));
            }
        }
        if (e.getActionCommand().equals("+/-")){
            int stringLength = inputText.getText().length();
            if (stringLength > 0) {
                inputText.setText(String.valueOf(-Double.parseDouble(inputText.getText())).substring(0,15));
            }
        }
        if(!inputText.getText().equals("")) {
            showText.setText(String.valueOf(Double.parseDouble(inputText.getText())*1.8+32));
        }
    }
    public void keyPressed(KeyEvent e){

            if (e.getKeyCode() == KeyEvent.VK_0 || e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
                inputText.setText(inputText.getText() + "0");
            }
            if (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
                inputText.setText(inputText.getText() + "1");
            }
            if (e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
                inputText.setText(inputText.getText() + "2");
            }
            if (e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
                inputText.setText(inputText.getText() + "3");
            }
            if (e.getKeyCode() == KeyEvent.VK_4|| e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
                inputText.setText(inputText.getText() + "4");
            }
            if (e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
                inputText.setText(inputText.getText() + "5");
            }
            if (e.getKeyCode() == KeyEvent.VK_6 || e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
                inputText.setText(inputText.getText() + "6");
            }
            if (e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
                inputText.setText(inputText.getText() + "7");
            }
            if (e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
                inputText.setText(inputText.getText() + "8");
            }
            if (e.getKeyCode() == KeyEvent.VK_9 || e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
                inputText.setText(inputText.getText() + "9");
            }
            if (e.getKeyCode() == KeyEvent.VK_DECIMAL) {
                if (!(inputText.getText().indexOf(".") >= 0)) {
                    inputText.setText(inputText.getText() + ".");
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
                int stringLength = inputText.getText().length();
                if (stringLength > 0){
                    inputText.setText(inputText.getText().substring(0, stringLength - 1));
                }
            }
    }
    public void keyReleased(KeyEvent e){

    }
    public void keyTyped(KeyEvent e){

    }
}
