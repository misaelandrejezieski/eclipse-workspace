package Test_Package_001;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test_Class_001 implements ActionListener {
    private static JLabel idlabel;
    private static JTextField idText;
    private static JLabel departmentLabel;
    private static JPasswordField departmentText;
    private static JButton button;
    private static JLabel success;
    private static JLabel sucess001;
    
	public static void main(String[] args) {
		JFrame frame = new JFrame("Acesso");
		JPanel panel = new JPanel();
		frame.setSize(400 , 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		idlabel = new JLabel("id");
		idlabel.setBounds(10,  50,  80,  25);
		panel.add(idlabel);
		idText = new JTextField();
		idText.setBounds(100, 50,165,25);
		panel.add(idText);
		departmentLabel = new JLabel("Senha");
		departmentLabel.setBounds(10,80,80,25);
		panel.add(departmentLabel);
		departmentText = new JPasswordField();
		departmentText.setBounds(100, 80, 165, 25);
		panel.add(departmentText);
	    button = new JButton("Acessar");
		button.setBounds(100, 110, 165, 25);
		button.addActionListener(new Test_Class_001());
		panel.add(button);
	    success = new JLabel("Acesso a EAD.");
		success.setBounds(10, 10, 150, 25);
		panel.add(success);
		sucess001 = new JLabel(":p");
		sucess001.setBounds(10,140,300,25);
		panel.add(sucess001);
		frame.setVisible(true);
	}
				

	

	@Override
	public void actionPerformed(ActionEvent e)  {
		String id = idText.getText();
		@SuppressWarnings("deprecation")
		String department = departmentText.getText();
		System.out.println(id + " ," +department);
		if(id.equals("misa") && department.equals("misa")) 
		{
		  System.out.println("Oi, idiota!");		
		}
		else if(id.equals("misa") && department.equals("123"))
		{
		  System.out.println("Sua senha e 123");
		}
		else if(id.equals("misa") && department.equals("1313"))
		{
			System.out.println("Sua senha e 1313");
		}
		else
		{
			System.out.println("Errou o ID ou a SENHA.");
		}
	}




	private JLabel JLabel(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
