package pkg13.pkg12.pkg21;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CalculatorButton extends JButton {
    CalculatorButton(JFrame f, String button_label, int x_pos, int y_pos, int width, int height){
        super(button_label);
        setBounds(x_pos, y_pos, width, height);
        f.add(this);
        decideClickAction(button_label);
    }

    void decideClickAction(String button_label){
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (button_label.equals("=")){
                    SimpleCalculator.calculate_expression();
                }else if(button_label.equals("DELETE")){
                    SimpleCalculator.modify_expression("");
                }else if(button_label.equals("ON/AC")){
                    SimpleCalculator.clear_expression(false);
                }else if (button_label.equals("OFF")){
                    SimpleCalculator.clear_expression(true);
                }else{
                    SimpleCalculator.modify_expression(button_label);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
