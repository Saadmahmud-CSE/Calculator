package pkg13.pkg12.pkg21;
import java.awt.Color;
import javax.swing.*;

public class SimpleCalculator {
    static String expression = "";
    static JFrame f = new JFrame("Calculator");
    static JTextField field = new JTextField("");

    public static void calculate_expression(){
        String[] operand;
        String operator;
        try{
            operand = expression.split("[+\\-*/%]");
            operator = expression.replaceAll("\\d","");
        }
        catch (Exception exc){
            return;
        }
        clear_expression(false);
        switch (operator){
            case "+":
                modify_expression(Integer.toString(Integer.parseInt(operand[0]) + Integer.parseInt(operand[1])));
                break;
            case "-":
                modify_expression(Integer.toString(Integer.parseInt(operand[0]) - Integer.parseInt(operand[1])));
                break;
            case "*":
                modify_expression(Integer.toString(Integer.parseInt(operand[0]) * Integer.parseInt(operand[1])));
                break;
            case "/":
                modify_expression(Integer.toString(Integer.parseInt(operand[0]) / Integer.parseInt(operand[1])));
                break;
            case "%":
                modify_expression(Integer.toString(Integer.parseInt(operand[0]) % Integer.parseInt(operand[1])));
                break;
            default:
                modify_expression("Error!");
        }
    }
    public static void clear_expression(Boolean terminate){
        expression = "";
        field.setText(expression);
        if (terminate){
            System.exit(0);
        }
    }

    public static void modify_expression(String element){
        if (element.equals("")){
            expression = expression.substring(0,expression.length()-1);
        }
        else{
            expression += element;
        }
        field.setText(expression);
    }

    public static void main(String[] args){
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        field.setBounds(20,10,350,50);
        field.setBackground(Color.lightGray);
        f.add(field);
        
        CalculatorButton zero = new CalculatorButton(f,"0",20,300,80,40);
        CalculatorButton one = new CalculatorButton(f,"1",20,250,80,40);
        CalculatorButton two = new CalculatorButton(f,"2",110,250,80,40);
        CalculatorButton three = new CalculatorButton(f,"3",200,250,80,40);
        CalculatorButton four = new CalculatorButton(f,"4",20,200,80,40);
        CalculatorButton five = new CalculatorButton(f,"5",110,200,80,40);
        CalculatorButton six = new CalculatorButton(f,"6",200,200,80,40);
        CalculatorButton seven = new CalculatorButton(f,"7",20,150,80,40);
        CalculatorButton eight = new CalculatorButton(f,"8",110,150,80,40);
        CalculatorButton nine = new CalculatorButton(f,"9",200,150,80,40);
        CalculatorButton on = new CalculatorButton(f,"ON/AC",20,100,110,40);
        CalculatorButton off = new CalculatorButton(f,"OFF",140,100,110,40);
        CalculatorButton add = new CalculatorButton(f,"+",290,150,80,40);
        CalculatorButton sub = new CalculatorButton(f,"-",290,200,80,40);
        CalculatorButton mul = new CalculatorButton(f,"*",290,250,80,40);
        CalculatorButton div = new CalculatorButton(f,"/",290,300,80,40);
        CalculatorButton equal = new CalculatorButton(f,"=",200,300,80,40);
        CalculatorButton delete = new CalculatorButton(f,"DELETE",260,100,110,40);
        CalculatorButton mod = new CalculatorButton(f,"%",110,300,80,40);
    }
}
