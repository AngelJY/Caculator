import javax.swing.*;

import static java.lang.Math.sqrt;
import static javax.swing.JFrame.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

enum Oper{add,sub,mul,div}

public class MyFrame extends JFrame implements ActionListener ,KeyListener{
	JTextField inputText,showText;
	double currentNum = 0 ,resultNum = 0;
	int resultFlag = 0;
	Oper oper = Oper.add;			//默认为加，防止空指针异常，直接输入等于为+0
	public MyFrame(){
		setTitle("先点击输入框来键盘操作");
		setBounds(700,200,350,600);
		setLayout(null);
		init();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void mySetText(JTextField textField,String s) throws MyException{
		if(textField.getText().endsWith("。")){
			throw new MyException(s);
		}else {
			textField.setText(textField.getText() + s);
		}
	}
	void calcute() {
		switch (oper) {
			case add:
				resultNum = Double.parseDouble(inputText.getText()) + currentNum;
				inputText.setText(String.valueOf(resultNum).endsWith(".0") ? String.valueOf(resultNum).substring(0, String.valueOf(resultNum).length() - 2) : String.valueOf(resultNum));
				break;
			case sub:
				resultNum = currentNum - Double.parseDouble(inputText.getText());
				inputText.setText(String.valueOf(resultNum).endsWith(".0") ? String.valueOf(resultNum).substring(0, String.valueOf(resultNum).length() - 2) : String.valueOf(resultNum));
				break;
			case mul:
				resultNum = Double.parseDouble(inputText.getText()) * currentNum;
				inputText.setText(String.valueOf(resultNum).endsWith(".0") ? String.valueOf(resultNum).substring(0, String.valueOf(resultNum).length() - 2) : String.valueOf(resultNum));
				break;
			case div:
				if (Integer.parseInt(inputText.getText()) == 0) {
					inputText.setText(String.valueOf("除数不能为零。"));
				} else {
					resultNum = currentNum / Double.parseDouble(inputText.getText());
					inputText.setText(String.valueOf(resultNum).endsWith(".0") ? String.valueOf(resultNum).substring(0, String.valueOf(resultNum).length() - 2) : String.valueOf(resultNum));
				}
				break;
		}
	}
	void init(){

		int x = 15, y = 450, length = 70, width = 50;		//基础坐标大小

		JButton button_num0 = new JButton("0");
		button_num0.setBounds(x,y,2*length,width);
		button_num0.setBackground(Color.cyan);
		add(button_num0);
		button_num0.addActionListener(this);//添加关联

		x = 15; y = y - 50;
		JButton button_num1 = new JButton("1");
		button_num1.setBounds(x,y,length,width);
		button_num1.setBackground(Color.cyan);
		add(button_num1);
		button_num1.addActionListener(this);//添加关联

		x = x + 70;
		JButton button_num2 = new JButton("2");
		button_num2.setBounds(x,y,length,width);
		button_num2.setBackground(Color.cyan);
		add(button_num2);
		button_num2.addActionListener(this);//添加关联

		x = x + 70;
		JButton button_num3 = new JButton("3");
		button_num3.setBounds(x,y,length,width);
		button_num3.setBackground(Color.cyan);
		add(button_num3);
		button_num3.addActionListener(this);//添加关联

		x = 15; y = y - 50;
		JButton button_num4 = new JButton("4");
		button_num4.setBounds(x,y,length,width);
		button_num4.setBackground(Color.cyan);
		add(button_num4);
		button_num4.addActionListener(this);//添加关联


		x = x + 70;
		JButton button_num5 = new JButton("5");
		button_num5.setBounds(x,y,length,width);
		button_num5.setBackground(Color.cyan);
		add(button_num5);
		button_num5.addActionListener(this);//添加关联


		x = x + 70;
		JButton button_num6 = new JButton("6");
		button_num6.setBounds(x,y,length,width);
		button_num6.setBackground(Color.cyan);
		add(button_num6);
		button_num6.addActionListener(this);//添加关联

		x = 15; y = y - 50;
		JButton button_num7 = new JButton("7");
		button_num7.setBounds(x,y,length,width);
		button_num7.setBackground(Color.cyan);
		add(button_num7);
		button_num7.addActionListener(this);//添加关联

		x = x + 70;
		JButton button_num8 = new JButton("8");
		button_num8.setBounds(x,y,length,width);
		button_num8.setBackground(Color.cyan);
		add(button_num8);
		button_num8.addActionListener(this);//添加关联

		x = x + 70;
		JButton button_num9 = new JButton("9");
		button_num9.setBounds(x,y,length,width);
		button_num9.setBackground(Color.cyan);
		add(button_num9);
		button_num9
				.addActionListener(this);//添加关联

	    x = 155; y = 450; 	//基础坐标大小
		JButton button_point = new JButton(".");
		button_point.setBounds(x,y,length,width);
		button_point.setBackground(Color.cyan);
		add(button_point);
		button_point.addActionListener(this);//添加关联

		x = x + 70;
		JButton button_equ = new JButton("=");
		button_equ.setBounds(x,y,length,width);
		button_equ.setBackground(Color.PINK);
		add(button_equ);
		button_equ.addActionListener(this);//添加关联

		y = y - 50;
		JButton button_div = new JButton("/");
		button_div.setBounds(x,y,length,width);
		button_div.setBackground(Color.yellow);
		add(button_div);
		button_div.addActionListener(this);//添加关联


		y = y - 50;
		JButton button_mul = new JButton("*");
		button_mul.setBounds(x,y,length,width);
		button_mul.setBackground(Color.yellow);
		add(button_mul);
		button_mul.addActionListener(this);//添加关联


		y = y - 50;
		JButton button_sub = new JButton("-");
		button_sub.setBounds(x,y,length,width);
		button_sub.setBackground(Color.yellow);
		add(button_sub);
		button_sub.addActionListener(this);//添加关联


		y = y - 50;
		JButton button_add = new JButton("+");
		button_add.setBounds(x,y,length,width);
		button_add.setBackground(Color.yellow);
		add(button_add);
		button_add.addActionListener(this);//添加关联

		x = x - 70;
		JButton button_back = new JButton("←");
		button_back.setBounds(x,y,length,width);
		button_back.setBackground(Color.ORANGE);
		add(button_back);
		button_back.addActionListener(this);//添加关联

		x = x - 70;
		JButton button_c = new JButton("C");
		button_c.setBounds(x,y,length,width);
		button_c.setBackground(Color.ORANGE);
		add(button_c);
		button_c.addActionListener(this);//添加关联

		x = x - 70;
		JButton button_ce = new JButton("CE");
		button_ce.setBounds(x,y,length,width);
		button_ce.setBackground(Color.ORANGE);
		add(button_ce);
		button_ce.addActionListener(this);//添加关联

		y = y - 50;
		JButton button_sqrt = new JButton("x^2");
		button_sqrt.setBounds(x,y,length,width);
		button_sqrt.setBackground(Color.ORANGE);
		add(button_sqrt);
		button_sqrt.addActionListener(this);//添加关联

		x = x + 70;
		JButton button_exsqrt = new JButton("√x");
		button_exsqrt.setBounds(x,y,length,width);
		button_exsqrt.setBackground(Color.ORANGE);
		add(button_exsqrt);
		button_exsqrt.addActionListener(this);//添加关联

		x = x + 70;
		JButton button_reci = new JButton("1/x");
		button_reci.setBounds(x,y,length,width);
		button_reci.setBackground(Color.ORANGE);
		add(button_reci);
		button_reci.addActionListener(this);//添加关联

		x = x + 70;
		JButton button_oppo = new JButton("+/-");
		button_oppo.setBounds(x,y,length,width);
		button_oppo.setBackground(Color.ORANGE);
		add(button_oppo);
		button_oppo.addActionListener(this);//添加关联


		x = x - 70 * 3;
		y = y - 100;
		inputText = new JTextField(20);
		inputText.setBounds(x,y ,4 * length,  2*width);
		inputText.setFont(new Font("宋体",Font.BOLD,35));
		inputText.setHorizontalAlignment(JTextField.RIGHT);
		inputText.setEditable(false);
		add(inputText);
		inputText.addActionListener(this);//添加关联
		inputText.addKeyListener(this);


		y = y - 50;
		showText = new JTextField(20);
		showText.setBounds(x,y ,4 * length, width);
		showText.setFont(new Font("宋体",Font.BOLD,25));
		showText.setHorizontalAlignment(JTextField.RIGHT);
		showText.setEditable(false);
		add(showText);
		showText.addActionListener(this);//添加关联


	}

	public void actionPerformed(ActionEvent e){
		try {
			if (e.getActionCommand().equals("0")) {
				if(resultFlag == 0)
					mySetText(inputText, "0");
				else {
					inputText.setText("");
					mySetText(inputText, "0");
					resultFlag = 0;
				}
			}
			if (e.getActionCommand().equals("1")) {
				if(resultFlag == 0)
					mySetText(inputText, "1");
				else {
					inputText.setText("");
					mySetText(inputText, "1");
					resultFlag = 0;
				}
			}
			if (e.getActionCommand().equals("2")) {
				if(resultFlag == 0)
					mySetText(inputText, "2");
				else {
					inputText.setText("");
					mySetText(inputText, "2");
					resultFlag = 0;
				}
			}
			if (e.getActionCommand().equals("3")) {
				if(resultFlag == 0)
					mySetText(inputText, "3");
				else {
					inputText.setText("");
					mySetText(inputText, "3");
					resultFlag = 0;
				}
			}
			if (e.getActionCommand().equals("4")) {
				if(resultFlag == 0)
					mySetText(inputText, "4");
				else {
					inputText.setText("");
					mySetText(inputText, "4");
					resultFlag = 0;
				}
			}
			if (e.getActionCommand().equals("5")) {
				if(resultFlag == 0)
					mySetText(inputText, "5");
				else {
					inputText.setText("");
					mySetText(inputText, "5");
					resultFlag = 0;
				}
			}
			if (e.getActionCommand().equals("6")) {
				if(resultFlag == 0)
					mySetText(inputText, "6");
				else {
					inputText.setText("");
					mySetText(inputText, "6");
					resultFlag = 0;
				}
			}
			if (e.getActionCommand().equals("7")) {
				if(resultFlag == 0)
					mySetText(inputText, "7");
				else {
					inputText.setText("");
					mySetText(inputText, "7");
					resultFlag = 0;
				}
			}
			if (e.getActionCommand().equals("8")) {
				if(resultFlag == 0)
					mySetText(inputText, "8");
				else {
					inputText.setText("");
					mySetText(inputText, "8");
					resultFlag = 0;
				}
			}
			if (e.getActionCommand().equals("9")) {
				if(resultFlag == 0)
					mySetText(inputText, "9");
				else {
					inputText.setText("");
					mySetText(inputText, "9");
					resultFlag = 0;
				}
			}
			if (e.getActionCommand().equals(".")) {
				if (!(inputText.getText().indexOf(".") >= 0)) {
					mySetText(inputText, ".");
				}
			}
		}catch (MyException n){
			currentNum = 0 ;
			resultNum = 0;
			inputText.setText(n.getMessage());
		}
		try{
			if (e.getActionCommand().equals("+")){

				resultFlag = 1;
				if (showText.getText().equals("")){
					showText.setText(inputText.getText() + "+");
					currentNum = Double.parseDouble(inputText.getText());
				}else {
					showText.setText(showText.getText()  + inputText.getText() + "+");
					calcute();
					currentNum = Double.parseDouble(inputText.getText());
				}
				oper = Oper.add;
			}
			if (e.getActionCommand().equals("-")){
				resultFlag = 1;
				if (showText.getText().equals("")){
					showText.setText(inputText.getText() + "-");
					currentNum = Double.parseDouble(inputText.getText());
				}else {
					showText.setText(showText.getText()  + inputText.getText() + "-");
					calcute();
					currentNum = Double.parseDouble(inputText.getText());
				}
				oper = Oper.sub;
			}
			if (e.getActionCommand().equals("*")){
				resultFlag = 1;
				if (showText.getText().equals("")){
					showText.setText(inputText.getText() + "*");
					currentNum = Double.parseDouble(inputText.getText());
				}else {
					showText.setText(showText.getText()  + inputText.getText() + "*");
					calcute();
					currentNum = Double.parseDouble(inputText.getText());
				}
				oper = Oper.mul;
			}
			if (e.getActionCommand().equals("/")){
				resultFlag = 1;
				if (showText.getText().equals("")){
					showText.setText(inputText.getText() + "/");
					currentNum = Double.parseDouble(inputText.getText());
				}else {
					showText.setText(showText.getText()  + inputText.getText() + "/");
					calcute();
					currentNum = Double.parseDouble(inputText.getText());
				}
				oper = Oper.div;
			}
			if (e.getActionCommand().equals("←")){
				int stringLength = inputText.getText().length();
				if (stringLength > 0){
					inputText.setText(inputText.getText().substring(0, stringLength - 1));
				}
			}
			if (e.getActionCommand().equals("C")){
				currentNum = 0;
				inputText.setText("");
				showText.setText("");
			}
			if (e.getActionCommand().equals("CE")){
				inputText.setText("");
			}
			if (e.getActionCommand().equals("x^2")){
				currentNum = Double.parseDouble(inputText.getText());
				resultNum = currentNum * currentNum;
				showText.setText(String.valueOf(currentNum) + "^2");
				inputText.setText(String.valueOf(resultNum).endsWith(".0") ? String.valueOf(resultNum).substring(0,String.valueOf(resultNum).length()-2):String.valueOf(resultNum));
			}
			if (e.getActionCommand().equals("√x")){
				currentNum = Double.parseDouble(inputText.getText());
				if ( currentNum >= 0){
					resultNum = sqrt(currentNum) ;
					showText.setText("√" + currentNum);
					inputText.setText(String.valueOf(resultNum).endsWith(".0") ? String.valueOf(resultNum).substring(0,String.valueOf(resultNum).length()-2):String.valueOf(resultNum));
				}else {
					inputText.setText("根号下面不能为负数。");
				}
			}
			if (e.getActionCommand().equals("1/x")){
				currentNum = Double.parseDouble(inputText.getText());
				resultNum = 1 / currentNum;
				showText.setText("1/" + currentNum);
				inputText.setText(String.valueOf(resultNum).endsWith(".0") ? String.valueOf(resultNum).substring(0,String.valueOf(resultNum).length()-2):String.valueOf(resultNum));
			}
			if (e.getActionCommand().equals("+/-")){
				currentNum = Double.parseDouble(inputText.getText());
				resultNum = - currentNum;
				inputText.setText(String.valueOf(resultNum).endsWith(".0") ? String.valueOf(resultNum).substring(0,String.valueOf(resultNum).length()-2):String.valueOf(resultNum));
			}


			if (e.getActionCommand().equals("=")) {
				calcute();
				showText.setText("");
			}
		}catch (NumberFormatException n){
			currentNum = 0;
			resultNum = 0;
			inputText.setText("");
		}
	}
	public void keyPressed(KeyEvent e){
		try {
			if (e.getKeyCode() == KeyEvent.VK_0 || e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
				if(resultFlag == 0)
					mySetText(inputText, "0");
				else {
					inputText.setText("");
					mySetText(inputText, "0");
					resultFlag = 0;
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
				if(resultFlag == 0)
					mySetText(inputText, "1");
				else {
					inputText.setText("");
					mySetText(inputText, "1");
					resultFlag = 0;
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
				if(resultFlag == 0)
					mySetText(inputText, "2");
				else {
					inputText.setText("");
					mySetText(inputText, "2");
					resultFlag = 0;
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
				if(resultFlag == 0)
					mySetText(inputText, "3");
				else {
					inputText.setText("");
					mySetText(inputText, "3");
					resultFlag = 0;
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_4|| e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
				if(resultFlag == 0)
					mySetText(inputText, "4");
				else {
					inputText.setText("");
					mySetText(inputText, "4");
					resultFlag = 0;
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
				if(resultFlag == 0)
					mySetText(inputText, "5");
				else {
					inputText.setText("");
					mySetText(inputText, "5");
					resultFlag = 0;
				}			}
			if (e.getKeyCode() == KeyEvent.VK_6 || e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
				if(resultFlag == 0)
					mySetText(inputText, "6");
				else {
					inputText.setText("");
					mySetText(inputText, "6");
					resultFlag = 0;
				}			}
			if (e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
				if(resultFlag == 0)
					mySetText(inputText, "7");
				else {
					inputText.setText("");
					mySetText(inputText, "7");
					resultFlag = 0;
				}			}
			if (e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
				if(resultFlag == 0)
					mySetText(inputText, "8");
				else {
					inputText.setText("");
					mySetText(inputText, "8");
					resultFlag = 0;
				}			}
			if (e.getKeyCode() == KeyEvent.VK_9 || e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
				if(resultFlag == 0)
					mySetText(inputText, "9");
				else {
					inputText.setText("");
					mySetText(inputText, "9");
					resultFlag = 0;
				}			}
			if (e.getKeyCode() == KeyEvent.VK_DECIMAL) {
				if (!(inputText.getText().indexOf(".") >= 0)) {
					mySetText(inputText, ".");
				}
			}
		}catch (MyException n){
			currentNum = 0 ;
			resultNum = 0;
			inputText.setText(n.getMessage());
		}

		try{
			if (e.getKeyCode() == KeyEvent.VK_ADD ){

				resultFlag = 1;
				if (showText.getText().equals("")){
					showText.setText(inputText.getText() + "+");
					currentNum = Double.parseDouble(inputText.getText());
				}else {
					showText.setText(showText.getText()  + inputText.getText() + "+");
					calcute();
					currentNum = Double.parseDouble(inputText.getText());
				}
				oper = Oper.add;
			}
			if (e.getKeyCode() == KeyEvent.VK_SUBTRACT){
				resultFlag = 1;
				if (showText.getText().equals("")){
					showText.setText(inputText.getText() + "-");
					currentNum = Double.parseDouble(inputText.getText());
				}else {
					showText.setText(showText.getText()  + inputText.getText() + "-");
					calcute();
					currentNum = Double.parseDouble(inputText.getText());
				}
				oper = Oper.sub;
			}
			if (e.getKeyCode() == KeyEvent.VK_MULTIPLY){
				resultFlag = 1;
				if (showText.getText().equals("")){
					showText.setText(inputText.getText() + "*");
					currentNum = Double.parseDouble(inputText.getText());
				}else {
					showText.setText(showText.getText()  + inputText.getText() + "*");
					calcute();
					currentNum = Double.parseDouble(inputText.getText());
				}
				oper = Oper.mul;
			}
			if (e.getKeyCode() == KeyEvent.VK_DIVIDE){
				resultFlag = 1;
				if (showText.getText().equals("")){
					showText.setText(inputText.getText() + "/");
					currentNum = Double.parseDouble(inputText.getText());
				}else {
					showText.setText(showText.getText()  + inputText.getText() + "/");
					calcute();
					currentNum = Double.parseDouble(inputText.getText());
				}
				oper = Oper.div;
			}
			if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
				int stringLength = inputText.getText().length();
				if (stringLength > 0){
					inputText.setText(inputText.getText().substring(0, stringLength - 1));
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				calcute();
				showText.setText("");
			}
		}catch (NumberFormatException n){
			currentNum = 0;
			resultNum = 0;
			inputText.setText("");
		}
	}
	public void keyReleased(KeyEvent e){

	}
	public void keyTyped(KeyEvent e){

	}
}
