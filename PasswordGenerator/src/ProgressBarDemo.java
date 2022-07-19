import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;

import javax.swing.*;

public class ProgressBarDemo extends main implements ActionListener {

	
	JFrame frame = new JFrame("PasswordGenerator");
	JProgressBar bar = new JProgressBar();
	JButton ver = new JButton("Copy Password");
	JFrame frame2 = new JFrame("PasswordGenerator");
	
	
	ProgressBarDemo() {
		
		//barra
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		
		//canvas
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,90);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
		
		//butão
		ver.setBounds(0,0,420,50);
		ver.addActionListener(this);
		
		//abrir nova janela
		frame2.add(ver);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(420,90);
		frame2.setLayout(null);
		frame2.setVisible(true);
	
	}
 
	
	
	public void fill() {
		int counter = 0;
		
		while(counter <=100) {
			
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter +=1;
		}
		bar.setString("Generated.");
		
		//fechar janela apos 1000ms de "generated"
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.dispose();
		
	    }



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ver.setText("Copied");
		String myString = main.teste(null);
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}
	

	}





