import java.awt.event.*;
import javax.swing.*;

import java.awt.Font;
import java.net.URL;

class Main extends eval {
  public static void main(String[] args){
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Calculator");

    // BufferedImage 
    // background = ImageIO.read(getClass().getResource("/wood.jpeg"));

    URL iconURL = Main.class.getResource("icon.png");
    // iconURL is null when not found
    ImageIcon icon = new ImageIcon(iconURL);
    frame.setIconImage(icon.getImage());
    
    // frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("icon.png"))/*new ImageIcon("icon.png").getImage()*/);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(240, 400);

    JPanel pane = new JPanel();
    pane.setLayout(null);
    frame.add(pane);

    JTextArea disp = new JTextArea(2, 20);
    disp.setBounds(10, 10, 210, 50);
    disp.setLineWrap(true);
    // disp.setEditable(false);
    // JScrollPane scrollPane = new JScrollPane(disp);
    // disp.add(scrollPane);

    Font font = new Font("Verdana", Font.PLAIN, 20);
    disp.setFont(font);

    JButton exp = new JButton("^");
    exp.setBounds(175, 70, 45, 40);
    exp.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("^");
      }
    });
    JButton root = new JButton("√");
    root.setBounds(10, 120, 45, 40);
    root.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("sqrt(");
      }
    });
    JButton lpar = new JButton("(");
    lpar.setBounds(65, 120, 45, 40);
    lpar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("(");
      }
    });
    JButton rpar = new JButton(")");
    rpar.setBounds(120, 120, 45, 40);
    rpar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append(")");
      }
    });
    JButton ac = new JButton("AC");
    ac.setBounds(10, 70, 72, 40);
    ac.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.setText("");
      }
    });
    JButton del = new JButton("Del");
    del.setBounds(92, 70, 73, 40);
    del.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.setText(disp.getText().substring(0, disp.getText ().length() - 1));
      }
    });
    JButton enter = new JButton("=");
    enter.setBounds(175, 320, 45, 40);
    enter.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        String ans = disp.getText();
        disp.append("=" + eval(ans));
      }
    });
    JButton add = new JButton("+");
    add.setBounds(175, 270, 45, 40);
    add.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("+");
      }
    });
    JButton sub = new JButton("-");
    sub.setBounds(175, 220, 45, 40);
    sub.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("-");
      }
    });
    JButton multi = new JButton("×");
    multi.setBounds(175, 170, 45, 40);
    multi.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("*");
      }
    });
    JButton div = new JButton("÷");
    div.setBounds(175, 120, 45, 40);
    div.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("/");
      }
    });
    JButton dec = new JButton(".");
    dec.setBounds(120, 320, 45, 40);
    dec.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append(".");
      }
    });
    JButton zero = new JButton("0");
    zero.setBounds(10, 320, 100, 40);
    zero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("0");
      }
    });
    JButton one = new JButton("1");
    one.setBounds(10, 270, 45, 40);
    one.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("1");
      }
    });
    JButton two = new JButton("2");
    two.setBounds(65, 270, 45, 40);
    two.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("2");
      }
    });
    JButton three = new JButton("3");
    three.setBounds(120, 270, 45, 40);
    three.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("3");
      }
    });
    JButton four = new JButton("4");
    four.setBounds(10, 220, 45, 40);
    four.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("4");
      }
    });
    JButton five = new JButton("5");
    five.setBounds(65, 220, 45, 40);
    five.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("5");
      }
    });
    JButton six = new JButton("6");
    six.setBounds(120, 220, 45, 40);
    six.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("6");
      }
    });
    JButton seven = new JButton("7");
    seven.setBounds(10, 170, 45, 40);
    seven.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("7");
      }
    });
    JButton eight = new JButton("8");
    eight.setBounds(65, 170, 45, 40);
    eight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("8");
      }
    });
    JButton nine = new JButton("9");
    nine.setBounds(120, 170, 45, 40);
    nine.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("9");
      }
    });
    JButton sin = new JButton("sin");
    sin.setBounds(230, 70, 73, 40);
    sin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("sin(");
      }
    });
    JButton cos = new JButton("cos");
    cos.setBounds(230, 120, 73, 40);
    cos.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("cos(");
      }
    });
    JButton tan = new JButton("tan");
    tan.setBounds(230, 170, 73, 40);
    tan.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        disp.append("tan(");
      }
    });

    // JLabel content = new JLabel("Test"/* , new ImageIcon("textures/grass_top.png") */);
    // content.setBounds(155, 140, 100, 100);

    pane.add(root);
    pane.add(lpar);
    pane.add(rpar);
    pane.add(exp);
    pane.add(ac);
    pane.add(del);
    pane.add(disp);
    pane.add(enter);
    pane.add(add);
    pane.add(sub);
    pane.add(multi);
    pane.add(div);
    pane.add(dec);
    pane.add(zero);
    pane.add(one);
    pane.add(two);
    pane.add(three);
    pane.add(four);
    pane.add(five);
    pane.add(six);
    pane.add(seven);
    pane.add(eight);
    pane.add(nine);
    pane.add(sin);
    pane.add(cos);
    pane.add(tan);

    frame.setVisible(true);
  }
}