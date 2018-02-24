package org.itstep;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Alex Ignatenko
 * 
 */
public class MainWindow extends JFrame {
	private JTextField names;
	private JTextField outField;

	public MainWindow(String title) {
		setTitle(title);
		setSize(400, 140);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(200, 200);

		setResizable(false);
		getContentPane().setLayout(null);

		JLabel lblFirsName = new JLabel("First and second names:");
		lblFirsName.setBounds(10, 11, 122, 20);
		getContentPane().add(lblFirsName);

		names = new JTextField();
		names.setText("input first and second names");
		names.setBounds(139, 11, 245, 20);
		getContentPane().add(names);
		names.setColumns(10);

		JButton btnShowFirsName = new JButton("REVERSE NAMES");
		btnShowFirsName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outField.setText(reverseText(names.getText()));
				names.setText("");
				getContentPane().repaint();
			}
		});
		btnShowFirsName.setBounds(10, 42, 374, 23);
		getContentPane().add(btnShowFirsName);

		outField = new JTextField();
		outField.setEditable(false);
		outField.setBounds(10, 76, 374, 20);
		getContentPane().add(outField);
		outField.setColumns(10);

		getContentPane().repaint();

	}

	public MainWindow() {
	}

	public String reverseText(String text) {
		if (text.contains(" ")) {
			String[] words = text.split(" ");
			String reversedNames = "";
			for (int i = (words.length - 1); i >= 0; i--) {
				reversedNames += words[i] + " ";
			}
			return reversedNames.trim();
		}
		return text;
	}

}
