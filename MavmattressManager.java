/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavmattressmanager;

/**
 *
 * @author Student
 */
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MavmattressManager {

  
public class Main extends JFrame implements ActionListener {

    JLabel lblCustomer, lblProduct, lblPrice;
    JLabel lblVAT, lblCommission, lblTotal;

    JTextField txtCustomer, txtProduct, txtPrice;
    JTextField txtVAT, txtCommission, txtTotal;

    JButton btnCalculate, btnClear, btnExit;

    public Main() {

        setTitle("Product App");
        setSize(400, 400);
        setLayout(new GridLayout(10, 2, 5, 5));

        lblCustomer = new JLabel("Customer Name:");
        txtCustomer = new JTextField();

        lblProduct = new JLabel("Product Name:");
        txtProduct = new JTextField();

        lblPrice = new JLabel("Product Price:");
        txtPrice = new JTextField();

        lblVAT = new JLabel("VAT Amount:");
        txtVAT = new JTextField();
        txtVAT.setEditable(false);

        lblCommission = new JLabel("Commission Amount:");
        txtCommission = new JTextField();
        txtCommission.setEditable(false);

        lblTotal = new JLabel("Total Sale Amount:");
        txtTotal = new JTextField();
        txtTotal.setEditable(false);

        btnCalculate = new JButton("Calculate");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");

        btnCalculate.addActionListener(this);
        btnClear.addActionListener(this);
        btnExit.addActionListener(this);

        add(lblCustomer);
        add(txtCustomer);

        add(lblProduct);
        add(txtProduct);

        add(lblPrice);
        add(txtPrice);

        add(lblVAT);
        add(txtVAT);

        add(lblCommission);
        add(txtCommission);

        add(lblTotal);
        add(txtTotal);

        add(btnCalculate);
        add(btnClear);

        add(btnExit);
        add(new JLabel(""));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCalculate) {

            double price = Double.parseDouble(txtPrice.getText());

            double vat = price * 0.15;
            double commission = price * 0.05;
            double total = price + vat + commission;

            txtVAT.setText(String.format("%.2f", vat));
            txtCommission.setText(String.format("%.2f", commission));
            txtTotal.setText(String.format("%.2f", total));

        }

        if (e.getSource() == btnClear) {

            txtCustomer.setText("");
            txtProduct.setText("");
            txtPrice.setText("");
            txtVAT.setText("");
            txtCommission.setText("");
            txtTotal.setText("");

        }

        if (e.getSource() == btnExit) {

            System.exit(0);

        }
    }

   
    }
}
