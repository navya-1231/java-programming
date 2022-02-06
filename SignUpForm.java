import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class SignUpForm extends Frame implements ActionListener{
	TextField t1 = new TextField(30);
	TextField t2 = new TextField(30);
	TextField t3 = new TextField(30);
    TextField t4 = new TextField(30);
	Button b1;

	public SignUpForm() {
		setTitle("SIGNUP FORM");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());

		Label f1 = new Label("Username ");
        Label f2 = new Label("DOB      ");
        Label f3 = new Label("E-mail   ");
		Label f4 = new Label("Password ");
		
		f1.setAlignment(Label.CENTER);
		f2.setAlignment(Label.CENTER);
		f3.setAlignment(Label.CENTER);
        f4.setAlignment(Label.CENTER);
		
	    b1 = new Button("SUBMIT");
	    b1.addActionListener(this);
	    
		add(f1);
		add(t1);
		add(f2);
		add(t2);
		add(f3);
		add(t3);
        add(f4);
		add(t4);
		add(b1);
		t1.setText(" ");
		t2.setText(" ");
		t3.setText(" ");
        t4.setText(" ");
        
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
			
		});
		
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Username    : "+t1.getText());
		System.out.println("DOB         : "+t2.getText());
        System.out.println("E-mail      : "+t3.getText());
        System.out.println("Password    : "+t4.getText());
	}
    public static void main(String[] args) {
    	 new SignUpForm();
     }
}
