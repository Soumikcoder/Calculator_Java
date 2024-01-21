import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame
{
	Double[] Num=new Double[3];
	MyButton[] numbutton=new MyButton[10];
	TextBox box=new TextBox();
	MyButton addButton=new MyButton("+",box,Num);
	MyButton subButton=new MyButton("-",box,Num);
	MyButton mulButton=new MyButton("*",box,Num);
	MyButton divButton=new MyButton("/",box,Num);
	MyButton dotButton=new MyButton(".",box,Num);
	MyButton equalButton=new MyButton("=",box,Num);
	MyButton delButton=new MyButton("Del",box,Num);
	MyButton clrButton=new MyButton("Clr",box,Num);
	JPanel panel=new JPanel();
	calculator(){
		panel.setBounds(20,90,300,240);
		panel.setLayout(new GridLayout(4,4,20,20));
		for(int i=0;i<numbutton.length;i++){
			numbutton[i]=new MyButton(String.valueOf(i),box,Num);
		}
		panel.add(numbutton[1]);
		panel.add(numbutton[2]);
		panel.add(numbutton[3]);
		panel.add(addButton);
		panel.add(numbutton[4]);
		panel.add(numbutton[5]);
		panel.add(numbutton[6]);
		panel.add(subButton);
		panel.add(numbutton[7]);
		panel.add(numbutton[8]);
		panel.add(numbutton[9]);
		panel.add(mulButton);
		panel.add(dotButton);
		panel.add(numbutton[0]);
		panel.add(equalButton);
		panel.add(divButton);

		delButton.setBounds(20,340,140,40);
		clrButton.setBounds(180,340,140,40);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(340,440);
		this.setLayout(null);
		this.setResizable(false);
		this.add(box);
		this.add(panel);
		this.add(delButton);
		this.add(clrButton);
		this.setVisible(true);
	}

}