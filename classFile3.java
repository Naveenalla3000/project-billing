package GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class PrintAmountInGui extends MoneyDisplay{
    JFrame framePrint = new JFrame("BILL");
    public PrintAmountInGui(double finalAmount){
        framePrint.setBounds(800,100,400,400);
        framePrint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrint.setLayout(null);
        framePrint.setVisible(true);
        System.out.println("holo");
    }
    public PrintAmountInGui(String name,double originalPrice,double discountPercent,double amountDecrease,double finalOriginalAmount){
        super.label1 = new JLabel(String.valueOf(originalPrice));
        super.label2 = new JLabel(String.valueOf(discountPercent));
        super.label3 = new JLabel(String.valueOf(finalOriginalAmount));
        super.label4 = new JLabel(String.valueOf(finalAmount));


      
      
      
      
      
      
      
      
      
      
    }
}
