/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquqte;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javafx.scene.text.Font;
import static javafx.scene.text.Font.font;
import static javafx.scene.text.Font.font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author sebas
 */
public class Pelicula extends JFrame implements ActionListener {

  int p1,p2,p3, u=0;
  int a=0,b=0,c=0;
  JButton b1,b2,b3;
  JTextField t1,tr;
  JTextField t2,t21,t22;
  int d=0,w=0,f=0;
  JPanel panel,panel1;
  JLabel tit,t5,t6,t7,t8,t14,titulo;
  JLabel t9,t10,t11,t12,t13,t15;
  Logica miLogica;
  JTextArea as;
  int h=0,i=0,x=0;
   
    public Pelicula(){
    
        setSize(816, 586);
      
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CINEMA");
        
        miLogica= new Logica();
        
        panel= new JPanel();
        panel.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(panel);
        panel.setLayout(null);
        
        tit= new JLabel();
        tit.setBounds(40, 5, 400, 200);
        tit.setText("1.Rapido y furioso:\n");
        panel.add(tit);
        
        t5= new JLabel();
        t5.setBounds(40, 5, 400, 250);
        t5.setText("2.Anabelle:\n");
        panel.add(t5);
        
        t6= new JLabel();
        t6.setBounds(180, 5, 400, 200);
        t6.setText("3.El oso ted:\n");
        panel.add(t6);
        
        t7= new JLabel();
        t7.setBounds(180, 5, 400, 250);
        t7.setText("4.La niña del aro:\n");
        panel.add(t7);
        
        t8= new JLabel();
        t8.setBounds(350, 5, 400, 200);
        t8.setText("5.Nerve:\n");
        panel.add(t8);
        
        t9= new JLabel();
        t9.setBounds(350, 5, 400, 250);
        t9.setText("6.El hoyo:\n");
        panel.add(t9);
        
        t10= new JLabel();
        t10.setBounds(500, 5, 400, 200);
        t10.setText("7.The avengers:\n");
        panel.add(t10);
        
        t11= new JLabel();
        t11.setBounds(500, 5, 400, 250);
        t11.setText("8.Soy leyenda:\n");
        panel.add(t11);
        
        t12= new JLabel();
        t12.setBounds(660, 5, 400, 200);
        t12.setText("9.The purge 2:\n");
        panel.add(t12);
        
        t13= new JLabel();
        t13.setBounds(660, 5, 400, 250);
        t13.setText("10.Toy story 2:\n");
        panel.add(t13);
        
        
        
       titulo= new JLabel();
        titulo.setBounds(85, 10, 550, 80);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.RED);
        titulo.setText("..: CINEMA :.."); 
        panel.add(titulo);
        
        t15= new JLabel();
        t15.setBounds(50, 60, 500, 250);
        t15.setText("Digite la opcion de la pelicula :\n");
        panel.add(t15);
        
        t2= new JTextField();
        t2.setBounds(50, 200, 60, 20);
        panel.add(t2);
       
        t21= new JTextField();
        t21.setBounds(600,600,600,600);
        panel.add(t21);
       
        t22= new JTextField();
        t22.setBounds(460,200,40,20);
        panel.add(t22);
       
        tr= new JTextField();
        tr.setBounds(250, 200, 65, 20);
        panel.add(tr);
        
        as= new JTextArea();
        as.setLineWrap(true);
        panel.add(as);
        
        JScrollPane so= new JScrollPane();
        so.setViewportView(as);
        so.setBounds(35, 249, 739,215 );
        panel.add(so);
        
        b1= new JButton("ACEPTAR");
        b1.setBounds(110, 200, 90, 20 );
        panel.add(b1);
        b1.addActionListener(this);
        
        b2= new JButton("CANTIDAD");
        b2.setBounds(300, 200, 110, 20 );
        panel.add(b2);
        b2.addActionListener(this);
        
        b3= new JButton("TOTAL");
        b3.setBounds(500, 200, 110, 20 );
        panel.add(b3);
        b3.addActionListener(this);
  }

   
   public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
           p1= Integer.parseInt(t2.getText());
           String q=miLogica.descripcion(p1);
           as.setText(q);
           t21.setText(String.valueOf(p1));
        } 
        if (e.getSource()==b2) {
          int p4=Integer.parseInt(tr.getText());
          JOptionPane.showMessageDialog(null, "Su compra ha sido exitosa");
           if(p1==1){
           u=u+p4;
           }else if(p1==2){
           a=a+p4;
           }else if(p1==3){
            b=b+p4;
           }else if(p1==4){
           c=c+p4;
           }else if(p1==5){
           d=d+p4;
           }else if(p1==6){
            f=f+p4;
           }else if(p1==7){
            h=h+p4;
           }else if(p1==8){
            i=i+p4;
           }else if(p1==9){
            x=x+p4;
           }else if(p1==10){
            w=w+p4;
           }
      }
        if(e.getSource()==b3){
          int p1= Integer.parseInt(t22.getText());
          if(p1==1){
          JOptionPane.showMessageDialog(null, "Se vendieron "+u+" boletas");
          }else if(p1==2){
          JOptionPane.showMessageDialog(null, "Se vendieron "+a+" boletas");
          }else if(p1==3){
          JOptionPane.showMessageDialog(null, "Se vendieron "+b+" boletas");
          }else if(p1==4){
          JOptionPane.showMessageDialog(null, "Se vendieron "+c+" boletas");
          }else if(p1==5){
          JOptionPane.showMessageDialog(null, "Se vendieron "+d+" boletas");
          }else if(p1==6){
          JOptionPane.showMessageDialog(null, "Se vendieron "+f+" boletas");
          }else if(p1==7){
          JOptionPane.showMessageDialog(null, "Se vendieron "+h+" boletas");
          }else if(p1==8){
          JOptionPane.showMessageDialog(null, "Se vendieron "+i+" boletas");
          }else if(p1==9){
          JOptionPane.showMessageDialog(null, "Se vendieron "+x+" boletas");
          }else if(p1==10){
          JOptionPane.showMessageDialog(null, "Se vendieron "+w+" boletas");
          }
       }
  
    }
    
 }

