package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropDownConcept extends JFrame implements ActionListener{
    public JFrame frame = new JFrame();
    public JMenuBar bar = new JMenuBar();
    public JMenu fruits,vegetables,meat,snacks,oils,spices;
    public JMenuItem apple,banana,grapes,orane,guava,cherry;
    public JMenuItem tomato,potato, carrot,corn,beetroot,broccoli,pumpkin,capsicum;
    public JMenuItem chicken,beef,goat,lamb,duck,turkey;
    public JMenuItem samosa,popcorn,trailMax,potatoChips,cookies,crackers,paniPuri,chaat,ham,coke,juice,pringles;
    public JMenuItem sunFlower,avocado,olive,canola;
    public JMenuItem anise,cumin,cloves,pepper,redMirchi,cardamom;
    public double originalPrice,discountPercent,amountDecrease,finalOriginalAmount;

    public String name=null;
    public static double finalAmount=0;
    public JLabel label1,label2,label3,label4,label5,label6;
    public JButton button1;
    public static MoneyDisplay m;
    public DropDownConcept(){

    frame.setTitle("BILLING SYSTEM");

    button1 = new JButton("AMOUNT");
    button1.setBackground(Color.green);
    button1.setBounds(130,120,90,30);
    frame.add(button1);

    label5 = new JLabel("SHOP   AT   NAVEEN   MART");
    label5.setBounds(100,36,180,70);
    frame.add(label5);

    label6 = new JLabel("        ");
    label6.setBounds(13,13,130,20);
    frame.add(label6);

    fruits = new JMenu("FRUITS");
    vegetables = new JMenu("VEGETABLES");
    meat = new JMenu("MEAT");
    snacks = new JMenu("SNACKS");
    oils = new JMenu("OILS");
    spices = new JMenu("SPICES");

    apple = new JMenuItem("APPLE");
    banana = new JMenuItem("BANANA");
    grapes = new JMenuItem("GRAPES");
    orane = new JMenuItem("ORANGE");
    guava = new JMenuItem("GUAVA");
    cherry = new JMenuItem("CHERRY");


    tomato = new JMenuItem("TOMATO");
    potato = new JMenuItem("POTATO");
    carrot = new JMenuItem("CARROT");
    corn = new JMenuItem("CORN");
    beetroot = new JMenuItem("BEETROOT");
    broccoli = new JMenuItem("BROCCOLI");
    pumpkin  = new JMenuItem("PUMPKIN");
    capsicum = new JMenuItem("CAPSICUM");


    chicken = new JMenuItem("CHICKEN");
    beef = new JMenuItem("BEEF");
    goat = new JMenuItem("GOAT");
    lamb = new JMenuItem("LAMB");
    duck = new JMenuItem("DUCK");
    turkey = new JMenuItem("TURKEY");


    samosa = new JMenuItem("SAMOSA");
    popcorn = new JMenuItem("POPCORN");
    trailMax = new JMenuItem("TRIAL MAX");
    potatoChips = new JMenuItem("POTATO CHIPS");
    cookies = new JMenuItem("COOKIES");
    crackers = new JMenuItem("CRACKERS");
    paniPuri  = new JMenuItem("PANI PURI");
    chaat = new JMenuItem("chaat");
    ham = new JMenuItem("HAM");
    coke  = new JMenuItem("COKE");
    juice = new JMenuItem("JUICE");
    pringles = new JMenuItem("PRINGLES");


    sunFlower = new JMenuItem("SUN FLOWER OIL");
    avocado = new JMenuItem("AVOCADO OIL");
    olive = new JMenuItem("OLIVE OIL");
    canola = new JMenuItem("CANOLA");

    anise = new JMenuItem("ANISE");
    cumin = new JMenuItem("CUMIN");
    cloves = new JMenuItem("CLOVES");
    pepper = new JMenuItem("PEPPER");
    redMirchi = new JMenuItem("RED MIRCHI");
    cardamom = new JMenuItem("CARDAMOM");


    apple.addActionListener(this);
    banana.addActionListener(this);
    grapes.addActionListener(this);
    orane.addActionListener(this);
    guava.addActionListener(this);
    cherry.addActionListener(this);

    tomato.addActionListener(this);
    potato.addActionListener(this);
    carrot.addActionListener(this);
    corn.addActionListener(this);
    beetroot.addActionListener(this);
    broccoli.addActionListener(this);
    pumpkin.addActionListener(this);
    capsicum.addActionListener(this);

    chicken.addActionListener(this);
    beef.addActionListener(this);
    goat.addActionListener(this);
    lamb.addActionListener(this);
    duck.addActionListener(this);
    turkey.addActionListener(this);


    samosa.addActionListener(this);
    popcorn.addActionListener(this);
    trailMax.addActionListener(this);
    potatoChips.addActionListener(this);
    cookies.addActionListener(this);
    crackers.addActionListener(this);
    paniPuri.addActionListener(this);
    chaat.addActionListener(this);
    ham.addActionListener(this);
    coke.addActionListener(this);
    juice.addActionListener(this);
    pringles.addActionListener(this);

    sunFlower.addActionListener(this);
    avocado.addActionListener(this);
    olive.addActionListener(this);
    canola.addActionListener(this);


    anise.addActionListener(this);
    cumin.addActionListener(this);
    cloves.addActionListener(this);
    pepper.addActionListener(this);
    redMirchi.addActionListener(this);
    cardamom.addActionListener(this);

    button1.addActionListener(e -> {
        m = new MoneyDisplay();
        m.getFinalAmount();
    });


    fruits.add(apple);
    fruits.add(banana);
    fruits.add(grapes);
    fruits.add(orane);
    fruits.add(guava);
    fruits.add(cherry);


    vegetables.add(tomato);
    vegetables.add(potato);
    vegetables.add(carrot);
    vegetables.add(corn);
    vegetables.add(beetroot);
    vegetables.add(broccoli);
    vegetables.add(pumpkin);
    vegetables.add(capsicum);


    meat.add(chicken);
    meat.add(beef);
    meat.add(goat);
    meat.add(lamb);
    meat.add(duck);
    meat.add(turkey);


    snacks.add(samosa);
    snacks.add(popcorn);
    snacks.add(trailMax);
    snacks.add(potatoChips);
    snacks.add(cookies);
    snacks.add(crackers);
    snacks.add(paniPuri);
    snacks.add(chaat);
    snacks.add(ham);
    snacks.add(coke);
    snacks.add(juice);
    snacks.add(pringles);

    oils.add(sunFlower);
    oils.add(avocado);
    oils.add(olive);
    oils.add(canola);


    spices.add(anise);
    spices.add(cumin);
    spices.add(cloves);
    spices.add(pepper);
    spices.add(redMirchi);
    spices.add(cardamom);

    bar.add(fruits);
    bar.add(vegetables);
    bar.add(meat);
    bar.add(snacks);
    bar.add(oils);
    bar.add(spices);


    bar.setBackground(Color.getHSBColor(100, 149, 237));
    frame.getContentPane().add(BorderLayout.NORTH,bar);
    frame.setBounds(100,100,373,400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new  DropDownConcept();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==apple){
            this.name = "apple";
            this.originalPrice=50;
            this.discountPercent=5;
        }
        else if(e.getSource()==banana){
            this.name = "banana";
            this.originalPrice=60;
            this.discountPercent=4;
        }
        else if(e.getSource()==grapes){
            this.name = "grapes";
            this.originalPrice=40;
            this.discountPercent=3;
        }
        else if(e.getSource()==orane){
            this.name = "orange";
            this.originalPrice=80;
            this.discountPercent=6;
        }
        else if(e.getSource()==guava){
            this.name = "guava";
            this.originalPrice=100;
            discountPercent=4;
        }
        else if(e.getSource()==cherry){
            this.name = "cherry";
            originalPrice=150;
            discountPercent=14;
        }
        else if(e.getSource()==tomato){
            this.name = "tomato";
            originalPrice=200;
            discountPercent=18;
        }
        else if(e.getSource()==potato){
            this.name = "potato";
            originalPrice=90;
            discountPercent=7;
        }
        else if(e.getSource()==carrot){
            this.name = "carrot";
            originalPrice=200;
            discountPercent=15;
        }
        else if(e.getSource()==corn){
            this.name = "corn";
            originalPrice=150;
            discountPercent=14;
        }
        else if(e.getSource()==beetroot){
            this.name = "beetroot";
            originalPrice=300;
            discountPercent=20;
        }
        else if(e.getSource()==broccoli){
            this.name = "broccoli";
            originalPrice=130;
            discountPercent=12;
        }
        else if(e.getSource()==pumpkin){
            this.name = "pumpkin";
            originalPrice=80;
            discountPercent=10;
        }
        else if(e.getSource()==capsicum){
            this.name = "capsicum";
            originalPrice=250;
            discountPercent=15;
        }
        else if(e.getSource()==chicken){
            this.name = "chicken";
            originalPrice=250;
            discountPercent=10;
        }
        else if(e.getSource()==beef){
            this.name = "beef";
            originalPrice=300;
            discountPercent=10;
        }
        else if(e.getSource()==goat){
            this.name = "goat";
            originalPrice=350;
            discountPercent=8;
        }
        else if(e.getSource()==lamb){
            this.name = "lamb";
            originalPrice=150;
            discountPercent=14;
        }
        else if(e.getSource()==duck){
            this.name = "duck";
            originalPrice=250;
            discountPercent=12;
        }
        else if(e.getSource()==turkey){
            this.name = "turkey";
            originalPrice=300;
            discountPercent=15;
        }
        else if(e.getSource()==samosa){
            this.name = "samosa";
            originalPrice=20;
            discountPercent=2;
        }
        else if(e.getSource()==popcorn){
            this.name = "popcorn";
            originalPrice=30;
            discountPercent=4;
        }
        else if(e.getSource()==trailMax){
            this.name = "trail max";
            originalPrice=40;
            discountPercent=4;
        }
        else if(e.getSource()==potatoChips){
            this.name = "potato chips";
            originalPrice=30;
            discountPercent=3;
        }
        else if(e.getSource()==cookies){
            this.name = "cookies";
            originalPrice=20;
            discountPercent=1;
        }
        else if(e.getSource()==crackers){
            this.name = "crackers";
            originalPrice=140;
            discountPercent=14;
        }
        else if(e.getSource()==paniPuri){
            this.name = "pani puri";
            originalPrice=50;
            discountPercent=2;
        }
        else if(e.getSource()==chaat){
            this.name = "chaat";
            originalPrice=50;
            discountPercent=3;
        }
        else if(e.getSource()==ham){
            this.name = "ham";
            originalPrice=150;
            discountPercent=5;
        }
        else if(e.getSource()==coke){
            this.name = "coke";
            originalPrice=50;
            discountPercent=5;
        }
        else if(e.getSource()==juice){
            this.name = "juice";
            originalPrice=50;
            discountPercent=5;
        }
        else if(e.getSource()==pringles){
            this.name = "pringles";
            originalPrice=150;
            discountPercent=5;
        }
        else if(e.getSource()==sunFlower){
            this.name = "sun flower oil";
            originalPrice=200;
            discountPercent=5;
        }
        else if(e.getSource()==avocado){
            this.name = "avocado oil";
            originalPrice=100;
            discountPercent=4;
        }
        else if(e.getSource()==olive){
            this.name = "olive oil";
            originalPrice=120;
            discountPercent=12;
        }
        else if(e.getSource()==canola){
            this.name = "canola oil";
            originalPrice=200;
            discountPercent=15;
        }
        else if(e.getSource()==anise){
            this.name = "anise oil";
            originalPrice=140;
            discountPercent=12;
        }
        else if(e.getSource()==cumin){
            this.name = "cumin";
            originalPrice=150;
            discountPercent=14;
        }
        else if(e.getSource()==cloves){
            this.name = "cloves";
            originalPrice=230;
            discountPercent=13;
        }
        else if(e.getSource()==pepper){
            this.name = "pepper";
            originalPrice=350;
            discountPercent=25;
        }
        else if(e.getSource()==redMirchi){
            this.name = "red mirchi";
            originalPrice=300;
            discountPercent=3;
        }
        else if(e.getSource()==cardamom){
            this.name = "cardamom";
            originalPrice=150;
            discountPercent=14;
        }
        m = new MoneyDisplay(name,originalPrice,discountPercent);
        m.printIndividual();
    }
}
