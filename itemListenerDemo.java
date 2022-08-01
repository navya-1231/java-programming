import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class itemListenerDemo extends Frame implements ItemListener {
    Checkbox checkbox1,Checkbox2;
    Label label;
    public itemListenerDemo(){
        //Frame settings
        setTitle("Checkbox Demo");
        setSize(400,400);
        setLayout(null);
        setVisible(true);

        //label settings
        label=new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        add(label);

        checkbox1=new Checkbox("c++");
        checkbox1.setBounds(100,100,50,50);
        add(checkbox1);

        Checkbox2=new Checkbox("java");
        Checkbox2.setBounds(100,150,50,50);
        add(Checkbox2);

        checkbox1.addItemListener(this);
        Checkbox2.addItemListener(this);


    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==checkbox1) {
            boolean isChecked=checkbox1.getState();
            if(isChecked){
                label.setText("c++ checkbox checked");
            }
            else{
                label.setText("c++ checkbox unchecked");
            }
        }
        else{
            boolean isChecked=Checkbox2.getState();
            if(isChecked){
                label.setText("java checkbox checked");
            }
            else{
                label.setText("java checkbox unchecked");
            }
        }
    }
    public static void main(String[] args){
        new itemListenerDemo();

    }
    
}

