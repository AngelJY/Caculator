
public class Test {
	public static void main(String args[]){
		MyFrame myFrame = new MyFrame();
		MyMenu myMenu = new MyMenu(myFrame);
		myFrame.setJMenuBar(myMenu);
		myFrame.setVisible(true);
	}
}
