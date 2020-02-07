package _11_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
public static void main(String[] args) {
	String choose = JOptionPane.showInputDialog("What store so you want to go to(target or the bean store)");
	if (choose.equals("target")) {
		String food = JOptionPane.showInputDialog("you go to target and you cant choose if you want a croissant or a cookie?");
		if (food.equals("croissant")) {
			JOptionPane.showMessageDialog(null, "you choked on a crossant 25 years later");
			}
		else if (food.equals("cookie")) {
			JOptionPane.showMessageDialog(null, "you were exiting the store and you got robbed, you have no money and your cookie is gone.");
		}
	}
	if(choose.equals("bean store")) {
		String bean = JOptionPane.showInputDialog("would you like greenbeans or kidney beans?");
		if (bean.equals("kidney beans")) {
			JOptionPane.showMessageDialog(null, "You had a good night with your kidney beans and you ate all of them in one sitting.");
		}
			else if(bean.equals("greenbeans")) {
				JOptionPane.showMessageDialog(null, "you got eaten by your green beans.");
				}
	}
	
		
	}
}


