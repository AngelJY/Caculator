import javax.swing.*;
import java.awt.*;

/**
 * Created by J on 2017/10/21.
 */
public class MyFrame4 extends JFrame{
    JTextArea text;
    public MyFrame4(){
        setTitle("����");
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

        text.setLineWrap(true);         //���Զ�����
        text.setEditable(false);        //���ɱ༭
        text.setText("����һ�����װ�ļ�����\n���Խ���ʵ���ļӼ��˳��Լ�ƽ�������������������෴�����㡣\n�������������ʵ�м�������\nCreated by Jing");
    }

}
