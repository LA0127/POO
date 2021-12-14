
package com.mycompany.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Interfaz extends JFrame implements ActionListener{

    JTextField txtnum1;
    JTextField txtnum2;
    
    JButton btnresta;
    JButton btnsuma;
    JButton btndivision;
    JButton btnproducto;
    
    JLabel numero1;
    JLabel numero2;
    JLabel resultado;
    JLabel mostrarResultado;
    
    JPanel panel = (JPanel)this.getContentPane();
    
    Operaciones op = new Operaciones();
    
    double num1, num2;
    
    //interfaz
    public Interfaz(){
        //se carga todo
        setLayout(null);
        //localizacion
        setLocation(100,80);
        //No se puede redimensionar
        setResizable(false);
        //tamaño
        setSize(250,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //se cargan los componentes
        
        componentes();
       
        
        
    }
    
    private void componentes(){//Los componentes
        
        panel.setLayout(null);
        numero1 = new JLabel("Numero 1: ");
        numero1.setBounds(10, 10, 70, 25);
        panel.add(numero1);
        
        txtnum1 = new JTextField();
        txtnum1.setBounds(80, 10, 70, 25);
        panel.add(txtnum1);
        
        numero2 = new JLabel("Numero 2: ");
        numero2.setBounds(10, 50, 70, 25);
        panel.add(numero2);
        
        txtnum2 = new JTextField();
        txtnum2.setBounds(80, 50, 70, 25);
        panel.add(txtnum2);
        
        resultado = new JLabel("Resultado: ");
        resultado.setBounds(10, 80, 70, 25);
        panel.add(resultado);
        
        mostrarResultado = new JLabel("");
        mostrarResultado.setBounds(100, 80, 70, 25);
        panel.add(mostrarResultado);
        
        btnsuma = new JButton("+");
        btnsuma.setBounds(10, 110, 70, 25);
        panel.add(btnsuma);
        btnsuma.addActionListener(this);
        
        btnresta = new JButton("-");
        btnresta.setBounds(10, 150, 70, 25);
        panel.add(btnresta);
        btnresta.addActionListener(this);
        
        btnproducto = new JButton("*");
        btnproducto.setBounds(10, 190, 70, 25);
        panel.add(btnproducto);
        btnproducto.addActionListener(this);
        
        btndivision = new JButton("/");
        btndivision.setBounds(10, 230, 70, 25);
        panel.add(btndivision);
        btndivision.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        //Aqui se diferencian las acciones
        
        if(event.getSource()==btnsuma){
            num1=Double.parseDouble(txtnum1.getText());            
            op.setNum1(num1);
            
            num2=Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);
            
            mostrarResultado.setText(String.valueOf(op.suma()));
            
        }else if(event.getSource()==btnresta){
            num1=Double.parseDouble(txtnum1.getText());            
            op.setNum1(num1);
            
            num2=Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);
            
            mostrarResultado.setText(String.valueOf(op.resta()));
        }else if(event.getSource()==btnproducto){
            num1=Double.parseDouble(txtnum1.getText());            
            op.setNum1(num1);
            
            num2=Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);
            
            mostrarResultado.setText(String.valueOf(op.multiplicacion()));
        }else if(event.getSource()==btndivision){
            num1=Double.parseDouble(txtnum1.getText());            
            op.setNum1(num1);
            
            num2=Double.parseDouble(txtnum2.getText());
            op.setNum2(num2);
            
            mostrarResultado.setText(String.valueOf(op.division()));
        }
    }
    
    
    
}
