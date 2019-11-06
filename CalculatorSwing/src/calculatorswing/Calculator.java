/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorswing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author mateu
 */
public class Calculator implements ActionListener {

    JFrame frame;
    JTextField resultfield, operationfield;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bp, badd, bsub, bmul, bdiv, bres, bc, bac, bnp;
    double tmp = 0;
    int operation = 0;
    
    
    public Calculator()
            {
                frame = new JFrame("Kalkulator");
                frame.setSize(340, 490);
                frame.setLocation(500,300);
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
                resultfield = new JTextField();
                resultfield.setBounds(50, 60, 230, 50);
                resultfield.setEditable(false);
                frame.add(resultfield);
                
                operationfield = new JTextField();
                operationfield.setBounds(50, 20, 230, 25);
                operationfield.setEditable(false);
                operationfield.setBackground(Color.LIGHT_GRAY);
                frame.add(operationfield);
                
                b1 = new JButton("1");
                b2 = new JButton("2");
                b3 = new JButton("3");
                b4 = new JButton("4");
                b5 = new JButton("5");
                b6 = new JButton("6");
                b7 = new JButton("7");
                b8 = new JButton("8");
                b9 = new JButton("9");
                b0 = new JButton("0");
                bp = new JButton(",");
                badd = new JButton("+");
                bsub = new JButton("-");
                bmul = new JButton("*");
                bdiv = new JButton("/");
                bres = new JButton("=");
                bnp = new JButton("+/-");
                bc = new JButton("C");
                bac = new JButton("AC");
                
                b1.setBounds(50, 180, 50, 50);
                b2.setBounds(110, 180, 50, 50);
                b3.setBounds(170, 180, 50, 50);
                b4.setBounds(50, 240, 50, 50);
                b5.setBounds(110, 240, 50, 50);
                b6.setBounds(170, 240, 50, 50);
                b7.setBounds(50, 300, 50, 50);
                b8.setBounds(110, 300, 50, 50);
                b9.setBounds(170, 300, 50, 50);
                b0.setBounds(50, 360, 50, 50);
                bnp.setBounds(110, 360, 50, 50);
                bp.setBounds(170, 360, 50, 50);
                
                badd.setBounds(230, 120, 50, 50);
                badd.setBackground(Color.orange);
                bsub.setBounds(230, 180, 50, 50);
                bsub.setBackground(Color.orange);
                bmul.setBounds(230, 240, 50, 50);
                bmul.setBackground(Color.orange);
                bdiv.setBounds(230, 300, 50, 50);
                bdiv.setBackground(Color.orange);
                bres.setBounds(230, 360, 50, 50);
                bres.setBackground(Color.orange);
                
                bc.setBounds(140, 120, 80, 50);
                bc.setBackground(Color.gray);
                bac.setBounds(50, 120, 80, 50);
                bac.setBackground(Color.gray);
                
                frame.add(b1);
                frame.add(b2);
                frame.add(b3);
                frame.add(b4);
                frame.add(b5);
                frame.add(b6);
                frame.add(b7);
                frame.add(b8);
                frame.add(b9);
                frame.add(b0);
                frame.add(bnp);
                frame.add(bp);
                
                frame.add(badd);
                frame.add(bsub);
                frame.add(bmul);
                frame.add(bdiv);
                frame.add(bres);
                
                frame.add(bc);
                frame.add(bac);
                
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                b5.addActionListener(this);
                b6.addActionListener(this);
                b7.addActionListener(this);
                b8.addActionListener(this);
                b9.addActionListener(this);
                b0.addActionListener(this);
                bp.addActionListener(this);
                bnp.addActionListener(this);
                
                badd.addActionListener(this);
                bsub.addActionListener(this);
                bmul.addActionListener(this);
                bdiv.addActionListener(this);
                bres.addActionListener(this);
                
                bc.addActionListener(this);
                bac.addActionListener(this);
                
                frame.setVisible(true);
            }
    
    @Override
    public void actionPerformed(ActionEvent s) {
        Object source = s.getSource();
        if(source==b1)
        {
            resultfield.setText(resultfield.getText()+"1");
        }
        if(source==b2)
        {
            resultfield.setText(resultfield.getText()+"2");
        }
        if(source==b3)
        {
            resultfield.setText(resultfield.getText()+"3");
        }
        if(source==b4)
        {
            resultfield.setText(resultfield.getText()+"4");
        }
        if(source==b5)
        {
            resultfield.setText(resultfield.getText()+"5");
        }
        if(source==b6)
        {
            resultfield.setText(resultfield.getText()+"6");
        }
        if(source==b7)
        {
            resultfield.setText(resultfield.getText()+"7");
        }
        if(source==b8)
        {
            resultfield.setText(resultfield.getText()+"8");
        }
        if(source==b9)
        {
            resultfield.setText(resultfield.getText()+"9");
        }
        if(source==b0)
        {
            resultfield.setText(resultfield.getText()+"0");
        }
        if(source==bp)
        {
            resultfield.setText(resultfield.getText()+".");
        }
        if(source==bnp)
        {
            String result = resultfield.getText();
            if(!result.startsWith("-"))
            {
                resultfield.setText("-"+resultfield.getText());
            } 
            else
            {
                resultfield.setText(result.replace("-", ""));  
            }
        }
        if(source==badd)
        {
            tmp = Double.parseDouble(resultfield.getText());
            operationfield.setText(resultfield.getText()+" + ");
            resultfield.setText("");
            operation = 1;
        }
        if(source==bsub)
        {
            tmp = Double.parseDouble(resultfield.getText());
            operationfield.setText(resultfield.getText()+" - ");
            resultfield.setText("");
            operation = 2;
        }
        if(source==bmul)
        {
            tmp = Double.parseDouble(resultfield.getText());
            operationfield.setText(resultfield.getText()+" * ");
            resultfield.setText("");
            operation = 3;
        }
        if(source==bdiv)
        {
            tmp = Double.parseDouble(resultfield.getText());
            operationfield.setText(resultfield.getText()+" / ");
            resultfield.setText("");
            operation = 4;
        }
        if(source==bc)
        {
            resultfield.setText("");
        }
        if(source==bac)
        {
            tmp = 0;
            resultfield.setText("");
            operationfield.setText("");
            operation = 0;
        }
        if(source==bres)
        {   
            
            switch(operation)
            {
                case 1: 
                {
                  operationfield.setText(operationfield.getText()+resultfield.getText());
                  resultfield.setText(String.valueOf(tmp+Double.parseDouble(resultfield.getText())));
                  operation = 0;
                  tmp = 0;
                  break;
                }
                case 2:
                {
                  operationfield.setText(operationfield.getText()+resultfield.getText());
                  resultfield.setText(String.valueOf(tmp-Double.parseDouble(resultfield.getText())));
                  operation = 0;
                  tmp=0;
                  break;    
                }
                case 3:
                { 
                  operationfield.setText(operationfield.getText()+resultfield.getText());
                  resultfield.setText(String.valueOf(tmp*Double.parseDouble(resultfield.getText())));
                  operation = 0;
                  tmp=0;
                  break;    
                }
                case 4:
                {
                  operationfield.setText(operationfield.getText()+resultfield.getText());
                  resultfield.setText(String.valueOf(tmp/Double.parseDouble(resultfield.getText())));
                  operation = 0;
                  tmp=0;
                  break;    
                }
            }        
        }
    }
}
