import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Q4 implements ActionListener {
     JFrame frame =new JFrame();
     JButton btn = new JButton();
     JTextField tf = new JTextField();


    public void actionPerformed(ActionEvent e) {
        String s = "";
        if (e.getSource()==btn){
            String str = tf.getText();
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length ; i++) {
                if(arr[i]<=122 && arr[i]>=97){
                    s = s + (Character.toString(arr[i])).toUpperCase();
                } else {
                    s = s + (Character.toString(arr[i])).toLowerCase();
                }
            }
        }
        tf.setText(s);
    }

    public Q4(){
         btn.setBounds(0,0,400,200);
         tf.setBounds(0,200,400,200);

         frame.setBounds(100,100,400,400);
         frame.setLayout(null);
         frame.setVisible(true);

         frame.add(btn);
         frame.add(tf);

         btn.addActionListener(this);
     }
}

class Try{
    public static void main(String[] args) {
        new Q4();
    }
}
