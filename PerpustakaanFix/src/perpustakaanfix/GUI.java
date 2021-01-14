/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanfix;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author patricksinaga
 */
public class GUI extends JFrame{
    final JTextField fnama = new JTextField(10);
    final JTextField fnis = new JTextField(10);
    final JTextField fpengarang = new JTextField(10);
    final JTextField fpenerbit = new JTextField(10);

    JLabel lnis = new JLabel("No");
    JLabel lnama = new JLabel(" Nama Buku ");
    JLabel lpengarang = new JLabel("Pengarang");
    JLabel lpenerbit = new JLabel(" Penerbit ");

//    JLabel ljurusan = new JLabel(" Jurusan ");
//    String[]namaJurusan = {"Rekayasa Perangkat Lunak","Informatika","Sistem Informasi","Teknik Komputer","Teknologi Informasi"};
//    JComboBox cmbnamaJurusan = new JComboBox(namaJurusan);
//
//    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
//    String[]namaJenisKelamin = {"Laki-Laki","Perempuan"};
//    JComboBox cmbjenisKelamin = new JComboBox(namaJenisKelamin);
//
//    JLabel lalamat = new JLabel("Alamat");
//    JTextArea tfalamat = new JTextArea();

    JButton btnSave = new JButton("Save");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");
    JButton btnReset = new JButton("Reset");

    Object rowData[][] ={
            {"A","B","C","D","E"},
            {"A","B","C","D","E"},
            {"A","B","C","D","E"},
            {"A","B","C","D","E"}
    };
    Object columnNames[] = {"No", "Nama Buku", "Pengarang", "Penerbit"};

    JTable tabel = new JTable(rowData,columnNames);
    JScrollPane scrollPane = new JScrollPane(tabel);
    public GUI(){
        setTitle("Perpustakaan");
        setDefaultCloseOperation(3);
        setSize(1100,500);


        setLayout(null);
        add(lnis);
        add(fnis);
        add(lnama);
        add(fnama);
        add(lpengarang);
        add(fpengarang);
        add(lpenerbit);
        add(fpenerbit);
        add(btnSave);
        add(btnUpdate);
        add(btnDelete);
        add(btnReset);
        add(scrollPane,BorderLayout.CENTER);

        lnis.setBounds(15,10,120,20);
        fnis.setBounds(130,10,220,20);
        lnama.setBounds(10,35,120,20);
        fnama.setBounds(130,35,220,20);
        lpenerbit.setBounds(10,60,120,20);
        fpenerbit.setBounds(130,60,220,20);
        lpengarang.setBounds(10,85,120,20);
        fpengarang.setBounds(130,85,220,20);
        btnSave.setBounds(130,280,120,20);
        btnUpdate.setBounds(130,310,120,20);
        btnDelete.setBounds(260,280,120,20);
        btnReset.setBounds(260,310,120,20);
        scrollPane.setBounds(500,10,350,320);
        setVisible(true);
    }
}
