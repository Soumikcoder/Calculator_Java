import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

public class TextBox extends JTextField
{
	TextBox(){
		this.setBounds(20,25,300,50);
		this.setEditable(false);
		this.setBackground(Color.LIGHT_GRAY);
		this.setFont(new Font("Arial",Font.PLAIN,40));
	}
}