package mes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends JFrame {
	private JPanel signUp = new JPanel(new GridLayout(3, 2));
	private JLabel idLabel = new JLabel("아이디 ");
	private JLabel pwLabel = new JLabel("비밀번호 ");
	private JTextField idText = new JTextField();
	private JPasswordField pwText = new JPasswordField();
	private JButton signupBtn = new JButton("확인");

	public SignUp() {
		super("회원가입");
		this.setContentPane(signUp);
		signUp.add(idLabel);
		signUp.add(pwLabel);
		signUp.add(idText);
		signUp.add(pwText);
		signUp.add(signupBtn);
		idLabel.setHorizontalAlignment(NORMAL);
		pwLabel.setHorizontalAlignment(NORMAL);
		setSize(350, 150);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		signupBtn.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				String id = idText.getText().trim();
				String pw = pwText.getText().trim();
				
				DB db = new DB();
				db.saveID(id, pw);
				JOptionPane.showMessageDialog(null, "회원가입 성공", "회원가입 성공",JOptionPane.DEFAULT_OPTION);
				setVisible(false);
			}
		});

	}
}
