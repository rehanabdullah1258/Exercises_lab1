import javax.swing.*;
import javax.swing.JOptionPane;
public class Ex10 {
    public static void main(String[] args)
    {
        String name= JOptionPane.showInputDialog("what is your name?");
        JOptionPane.showInputDialog("My name is Hal! What would you like to me do?");
        JOptionPane.showMessageDialog(null,"I am sorry, "+name+" I can not do that");

}}
