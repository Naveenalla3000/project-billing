package GUI;

import javax.swing.*;

public class MoneyDisplay extends DropDownConcept{
    PrintAmountInGui p;
    public MoneyDisplay(){}
    public MoneyDisplay(String name,double originalPrice,double discountPercent){
        super.name = name;
        super.originalPrice = originalPrice;
        super.discountPercent = discountPercent;
    }
    public void printIndividual(){
        amountDecrease = (discountPercent/100)*originalPrice;
        finalOriginalAmount = originalPrice -amountDecrease;
        finalAmount += finalOriginalAmount;
        new PrintAmountInGui(name,originalPrice,discountPercent,amountDecrease,finalOriginalAmount);
        System.out.printf("%s    %.1f    %.1f%c    %c%.1f   %.1f\n",name,originalPrice,discountPercent,37,45,amountDecrease,finalOriginalAmount);
    }
    public void getFinalAmount(){
        System.out.println("                              ===================");
        System.out.printf("        TOTAL AMOUNT TO BE PAID : %.1f\n" ,finalAmount);
        p = new PrintAmountInGui(finalAmount);

    }
}
