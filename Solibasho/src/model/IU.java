package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;

public class IU {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IU window = new IU();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Partida part = new Partida();
		
		JLabel lblNewLabel = new JLabel("Solibasho UNO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblEligeLaCarta = new JLabel("Elige la carta que vas a jugar");
		lblEligeLaCarta.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblEligeLaCarta, BorderLayout.CENTER);
		
		JList list = new JList();
		frame.getContentPane().add(list, BorderLayout.WEST);
	}

}
