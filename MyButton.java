import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import java.awt.Font;

public class MyButton extends JButton implements ActionListener
{
	TextBox box;
	Double[] num;
	MyButton(String text,TextBox box,Double Num[]){
		// this.setBounds(210,110,100,50);
		this.box=box;
		this.num=Num;
		this.setText(text);
		this.setFocusable(false);
		this.setFont(new Font("Arial",Font.PLAIN,30));
		this.addActionListener(this);
		this.setBorder(BorderFactory.createEtchedBorder());
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==this){
			switch(this.getText()){
			case "Clr":
				box.setText("");
				num[0]=num[1]=num[2]=0.0;
				break;
			case "Del":
				String s=box.getText();
				if (s.length()>0)
					box.setText(s.substring(0,s.length()-1));
				break;
			case "+":
				if(box.getText().length()!=0){
					try{
						num[0]=Double.parseDouble(box.getText());
						box.setText("");
					}
					catch(NumberFormatException exception){box.setText(this.getText());}
					num[1]=1.0;
				}
				else{
					box.setText(this.getText());
				}
				break;

			case "-":
				if(box.getText().length()!=0){
					try{
						num[0]=Double.parseDouble(box.getText());
						box.setText("");
					}
					catch(NumberFormatException exception){box.setText(this.getText());}
					num[1]=2.0;
				}
				else{
					box.setText(this.getText());
				}
				break;

			case "*":
				if(box.getText().length()!=0){
					num[0]=Double.parseDouble(box.getText());
					num[1]=3.0;
					box.setText("");
				}
				break;

			case "/":
				if(box.getText().length()!=0){
					num[0]=Double.parseDouble(box.getText());
					num[1]=4.0;
					box.setText("");

				}
				break;

			case "=":
				try{
					if(num[1]!=0){
						num[2]=Double.parseDouble(box.getText());
					if(num[1]==1.0){
						num[0]=num[0]+num[2];
					}
					else if(num[1]==2.0){
						num[0]=num[0]-num[2];
					}
					else if(num[1]==3.0){
						num[0]=num[0]*num[2];
					}
					else{
						num[0]=num[0]/num[2];
					}
					box.setText(String.valueOf(num[0]));
					}
				}catch(NullPointerException err){}
				break;
			default:
				box.setText(box.getText()+this.getText());
			}
		}
	}
}