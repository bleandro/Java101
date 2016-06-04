import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bruno on 03/06/2016.
 */
public class FormExample1 {

    private JButton button1 = new JButton("THIS IS A BUTTON");
    private JButton button2 = new JButton("THIS IS ANOTHER BUTTON");

    public void buildForm(){
        //These are visual components
        JFrame frame = new JFrame();

        //This is used to register the button to the listener
        //If We don't define this, the click isn't executed to the button
        button1.addActionListener(new ListenerButton1());
        button2.addActionListener(new ListenerButton2());

        //We use a layout defined by Java to add the button to the Frame
        //BorderLayout can be used to add components to the NORTH, SOUTH, EAST, WEST in general
        frame.getContentPane().add(button1, BorderLayout.NORTH);
        frame.getContentPane().add(button2, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //We create some classes down here to use as Listeners
    public class ListenerButton1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            button1.setText("HEY! YOU CLICKED ME");
        }
    }

    public class ListenerButton2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            button2.setText("THERE YOU GO! CLICKING SOME BUTTONS!");
        }
    }
}
