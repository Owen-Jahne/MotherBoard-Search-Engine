package motherboardengine;
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import javax.swing.JList; 
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.*;
import javax.swing.JScrollPane;
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JComboBox;

public class GUI extends Motherboard implements ActionListener
{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel(new BorderLayout());
    JLabel label1 = new JLabel("Find your Motherboard: ");
    JTextField userText1 = new JTextField();
    JLabel label2 = new JLabel();
    DefaultListModel list1 = new DefaultListModel();
    JList list = new JList();
    private static String[] boards = {"blue", "black", "red", "green", "purple",
        "pink", "yellow"};
    Object[] JavaObjectArray = {getManu(),getModel(),getChip(),getSock(),
        getForm()};
    int index;
 public GUI(Motherboard[] arr) 
 {
     frame.setSize(1350, 750);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.pack();
     frame.setTitle("Motherboard Search Engine");
     frame.add(panel);
     
    
     label1.setBounds(10, 20, 140, 25);
     
     panel.setLayout(null);
     panel.add(label1);
     
     
     userText1.setBounds(150, 20, 165, 25);
     panel.add(userText1);
     
     JButton button1 = new JButton("Search");
     button1.setBounds(315, 20, 80, 25);
     panel.add(button1);
     
 
     label2.setBounds(20, 100, 100, 25);
     panel.add(label2);
     
     
     for (int i = 0; i <= 6; i++)
     {
         boards[i] = arr[i].getManu() + " " + arr[i].getModel();
     }
     list = new JList(boards);
     
     button1.addActionListener(this);
     
     list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     JScrollPane scroll = new JScrollPane(list);
     scroll.setBounds(150, 50, 250, 100);
     
     panel.add(scroll);
     frame.setVisible(true);
     
     list.addListSelectionListener(
        new ListSelectionListener(){
         public void valueChanged(ListSelectionEvent event){
             index = list.getSelectedIndex();
            }
        }
     );
     
     list.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
        {
            JList list = (JList)e.getSource();
            int i;
            if (e.getClickCount() == 2)
             {
                i = list.locationToIndex(e.getPoint());
                System.out.println("Double clicked on Item " + index);
                displayInfo(arr);
             }
        }
    });
 
}
protected void displayInfo(Motherboard[] arr)
{
    JFrame frame = new JFrame();
    frame.setSize(1350, 750);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.pack();
    frame.setTitle(boards[index]);
    JPanel panel = new JPanel(new BorderLayout());
    frame.add(panel);
    frame.setVisible(true);
    JLabel label = new JLabel(arr[index].toString());
    label.setBounds(10,20,140,25);
    panel.add(label);
}
@Override 
public void actionPerformed(ActionEvent e){
      System.out.println(JavaObjectArray[index]);
     
      
   }
}
