/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChildCare;

/**
 *
 * @author ACER
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pediCare {
    private JFrame frame;
    private JTextField idField;
    private JTextField nameField;
    private JTextField ageField;
    private JTable table;
    private String[] columnNames = {"Detail", "Value"};

    public pediCare() {
        frame = new JFrame("Pedicare");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Panel untuk input user
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Nama:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Umur:"));
        ageField = new JTextField();
        inputPanel.add(ageField);

        frame.add(inputPanel, BorderLayout.NORTH);

        // Panel untuk tombol
        JPanel buttonPanel = new JPanel();
        JButton immunizationButton = new JButton("Imunisasi");
        JButton growthButton = new JButton("Pertumbuhan");
        JButton nutritionButton = new JButton("Nutrisi");

        buttonPanel.add(immunizationButton);
        buttonPanel.add(growthButton);
        buttonPanel.add(nutritionButton);

        frame.add(buttonPanel, BorderLayout.CENTER);

        // Panel untuk tabel
        JPanel tablePanel = new JPanel();
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        tablePanel.add(scrollPane);
        frame.add(tablePanel, BorderLayout.SOUTH);

        // Action listener untuk tombol
        immunizationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showImmunizationData();
            }
        });

        growthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showGrowthData();
            }
        });

        nutritionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNutritionData();
            }
        });

        frame.setVisible(true);
    }

    private void showImmunizationData() {
        String[][] data = {
            {"Vaksin Hepatitis B", "Diberikan pada usia 0 bulan"},
            {"Vaksin DTP", "Diberikan pada usia 2, 4, dan 6 bulan"},
            {"Vaksin Polio", "Diberikan pada usia 2, 4, dan 6 bulan"},
        };
        table.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
    }

    private void showGrowthData() {
        String[][] data = {
            {"Tinggi Badan", "Diukur setiap 6 bulan"},
            {"Berat Badan", "Diukur setiap bulan"},
            {"Lingkar Kepala", "Diukur setiap 3 bulan"},
        };
        table.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
    }

    private void showNutritionData() {
        String[][] data = {
            {"Porsi Makan", "3 kali sehari"},
            {"Asupan Susu", "Minimal 500 ml sehari"},
            {"Buah dan Sayur", "2 porsi sehari"},
        };
        table.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new pediCare());
    }
}