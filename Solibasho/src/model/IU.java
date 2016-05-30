package model;

import java.awt.EventQueue;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import tipoEnum.Numero;

import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.Box;

public class IU {

	JPanel panel_mano_cartas;
	JPanel panel_baraja;
	JPanel panel_cartas_bot;
	JPanel panel_cartas_medio;
	JPanel panel_5;
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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(IU.class.getResource("/img/Tapete.jpg")));
		frame.setBounds(200, 200, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		ImageIcon image = new ImageIcon(IU.class.getResource("/img/Tapete.jpg"));
		Image scaleImage = image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
		ImageIcon imagescales = new ImageIcon();
		imagescales.setImage(scaleImage);
		ImagePanel panelx = new ImagePanel(imagescales.getImage());

		frame.getContentPane().add(panelx);
		panelx.setLayout(new BorderLayout(0, 0));

		JPanel containerpane = new JPanel();

		containerpane.setBackground(new Color(255, 255, 255));

		containerpane.setBackground(new Color(0, 0, 0, 0));
		panelx.add(containerpane);
		containerpane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		containerpane.add(panel);
		panel_5 = new JPanel();
		containerpane.add(panel_5);
		panel_5.setOpaque(false);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_14 = new JPanel();
		panel_5.add(panel_14);
		panel_14.setOpaque(false);
		panel_cartas_medio = new JPanel();
		panel_5.add(panel_cartas_medio);
		panel_cartas_medio.setOpaque(false);
		JPanel mesa = new JPanel();
		panel_5.add(mesa);
		mesa.setOpaque(false);

		

	
		JPanel northpane = new JPanel();
		northpane.setBackground(new Color(255, 255, 255));
		northpane.setOpaque(false);

		panelx.add(northpane, BorderLayout.NORTH);
		northpane.setLayout(new BorderLayout(0, 0));
		northpane.setOpaque(false);
		panel_cartas_bot = new JPanel();
		panel_cartas_bot.setBackground(new Color(255, 255, 255));
		panel_cartas_bot.setOpaque(false);
		northpane.add(panel_cartas_bot);
		panel_cartas_bot.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		northpane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setOpaque(false);
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		panel_3.setOpaque(false);
		JPanel panel_12 = new JPanel();
		panel_1.add(panel_12, BorderLayout.WEST);
		panel_12.setOpaque(false);

		JPanel panel_18 = new JPanel();
		panel_1.add(panel_18, BorderLayout.CENTER);
		panel_18.setLayout(new GridLayout(5, 1, 0, 0));
		panel_18.setOpaque(false);
		JButton btnNewButton = new JButton("New button");

		panel_18.add(btnNewButton);
		JPanel eastpane = new JPanel();

		eastpane.setOpaque(false);
		panelx.add(eastpane, BorderLayout.EAST);
		eastpane.setLayout(new BorderLayout(0, 0));

		panel_baraja = new JPanel();
		eastpane.add(panel_baraja);
		panel_baraja.setLayout(new BorderLayout(0, 0));
		panel_baraja.setOpaque(false);

		JButton btnRobarCarta = new JButton("Robar carta");
		panel_baraja.add(btnRobarCarta, BorderLayout.SOUTH);

		JPanel southpane = new JPanel();
		panelx.add(southpane, BorderLayout.SOUTH);
		southpane.setLayout(new BorderLayout(0, 0));
		southpane.setOpaque(false);
		JPanel panel_4 = new JPanel();
		southpane.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new GridLayout(0, 4, 0, 0));
		panel_4.setOpaque(false);
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		panel_6.setOpaque(false);
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));
		panel_7.setOpaque(false);
		JPanel panel_10 = new JPanel();
		panel_7.add(panel_10);
		panel_10.setOpaque(false);
		JButton btnPlayCard = new JButton("PLAY CARD");
		panel_10.add(btnPlayCard);

		JPanel panel_11 = new JPanel();
		panel_7.add(panel_11);
		panel_11.setOpaque(false);
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8);
		panel_8.setOpaque(false);
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9);
		panel_9.setOpaque(false);
		panel_mano_cartas = new JPanel();
		panel_mano_cartas.setMaximumSize(new Dimension(300, 100));

		southpane.add(panel_mano_cartas, BorderLayout.CENTER);
		panel_mano_cartas.setOpaque(false);

		
	
		add_baraja_img();
		

		
		
		
		
		//GetScaled instance te resizea las cartas
	}

	public void draw_cartas_player(ArrayList<Carta> manoplayer) {
		

		panel_mano_cartas.removeAll();
		
		
		
		for (Carta c : manoplayer){
			
		JLabel lblMiscartaspane = new JLabel();
		lblMiscartaspane.setHorizontalAlignment(SwingConstants.CENTER);

		ImageIcon image = new ImageIcon(IU.class.getResource("/img/"+c.image()));
		Image scaleImage = image.getImage().getScaledInstance(90, 180, Image.SCALE_DEFAULT);
		ImageIcon imagescales = new ImageIcon();
		imagescales.setImage(scaleImage);

		lblMiscartaspane.setIcon(imagescales);
		panel_mano_cartas.add(lblMiscartaspane);
		//panel_mano_cartas.repaint();
		
		}
		panel_mano_cartas.validate();
		panel_mano_cartas.repaint();
		//frame.getContentPane().validate();
		//frame.getContentPane().repaint();
	}
	
	public void draw_carta_mesa(Carta c){
		
		
		panel_cartas_medio.removeAll();
			
		//panel_cartas_medio.validate();
		//panel_cartas_medio.repaint();
		
		
		JLabel lblMiscartaspane = new JLabel();
		lblMiscartaspane.setHorizontalAlignment(SwingConstants.CENTER);
		
		ImageIcon image = new ImageIcon(IU.class.getResource("/img/"+c.image()));
		Image scaleImage = image.getImage().getScaledInstance(120, 180, Image.SCALE_DEFAULT);
		ImageIcon imagescales = new ImageIcon();
		imagescales.setImage(scaleImage);
		panel_cartas_medio.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		lblMiscartaspane.setIcon(imagescales);
		
		panel_cartas_medio.add(lblMiscartaspane);
		
		
		panel_cartas_medio.validate();
		panel_cartas_medio.repaint();
	}
	

	public void draw_cartas_bot(ArrayList<Carta> manobot) {
		
		panel_cartas_bot.removeAll();
		
		//panel_cartas_bot.repaint();
		
		for (int i = 0; i < manobot.size(); i++) {

			JLabel lblMiscartaspane = new JLabel();
			lblMiscartaspane.setHorizontalAlignment(SwingConstants.LEFT);
			ImageIcon image = new ImageIcon(IU.class.getResource("/img/Java Back.png"));

			Image scaleImage = image.getImage().getScaledInstance(90, 180, Image.SCALE_DEFAULT);
			ImageIcon imagescales = new ImageIcon();
			imagescales.setImage(scaleImage);

			lblMiscartaspane.setIcon(imagescales);

			panel_cartas_bot.add(lblMiscartaspane);
		}
		panel_cartas_bot.validate();
		panel_cartas_bot.repaint();
	}
	
	public void hacervisible(){
		this.frame.setVisible(true);
	}

	public void add_baraja_img() {
		JLabel lblBaraja = new JLabel("");
		panel_baraja.add(lblBaraja);

		ImageIcon image = new ImageIcon(IU.class.getResource("/img/Java Back.png"));
		Image scaleImage = image.getImage().getScaledInstance(90, 180, Image.SCALE_DEFAULT);
		ImageIcon imagescales = new ImageIcon();
		imagescales.setImage(scaleImage);

		lblBaraja.setIcon(imagescales);
		lblBaraja.setHorizontalAlignment(SwingConstants.CENTER);
	}

	private void card_listener(JLabel mylabel) {
		mylabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JLabel pressed = (JLabel) e.getComponent();

				// delete and...

				panel_mano_cartas.remove(pressed);
				panel_mano_cartas.validate();
				panel_mano_cartas.repaint();

				frame.getContentPane().validate();
				frame.getContentPane().repaint();
			}
		});
	}

}

class ImagePanel extends JPanel {

	private Image img;

	public ImagePanel(String img) {
		this(new ImageIcon(img).getImage());
	}

	public ImagePanel(Image img) {
		this.img = img;
		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

}
