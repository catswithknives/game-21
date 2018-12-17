package game21package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;

public class game21gui {

	private JFrame frame;
	private JTextField textField;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					game21gui window = new game21gui();
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
	public game21gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 239, 213));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("card one");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(46, 37, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("dealer one");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(344, 37, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("card two");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(46, 75, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("card three");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(46, 113, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);

		//JLabel lblNewLabel_4 = new JLabel("card four");
		//lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//lblNewLabel_4.setBounds(46, 151, 46, 14);
		//frame.getContentPane().add(lblNewLabel_4);

		//JLabel label = new JLabel("card five");
		//label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//label.setBounds(46, 189, 46, 14);
		//frame.getContentPane().add(label);

		JLabel lblNewLabel_5 = new JLabel("dealer two");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(344, 75, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("dealer 3");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(344, 113, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);

		//JLabel lblNewLabel_7 = new JLabel("dealer 4");
		//lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//lblNewLabel_7.setBounds(344, 151, 46, 14);
		//frame.getContentPane().add(lblNewLabel_7);

		//JLabel lblNewLabel_8 = new JLabel("dealer 5");
		//lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		//lblNewLabel_8.setBounds(344, 189, 46, 14);
		//frame.getContentPane().add(lblNewLabel_8);

		JButton btnDraw = new JButton("Draw");

		btnDraw.setBounds(166, 170, 89, 23);
		frame.getContentPane().add(btnDraw);
		JButton btnDrawAgain = new JButton("Draw");
		btnDrawAgain.setBounds(166, 170, 89, 23);
		frame.getContentPane().add(btnDrawAgain);

		JButton btnHold = new JButton("Hold");

		btnHold.setBounds(166, 214, 89, 23);
		frame.getContentPane().add(btnHold);

		JLabel lblResults = new JLabel("  Results: ");
		lblResults.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResults.setBounds(166, 22, 89, 46);
		frame.getContentPane().add(lblResults);

		textField = new JTextField();
		textField.setBounds(166, 57, 89, 100);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Player:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(46, 11, 74, 14);
		frame.getContentPane().add(lblNewLabel_9);

		JLabel lblComputer = new JLabel("Dealer:");
		lblComputer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblComputer.setBounds(344, 11, 80, 14);
		frame.getContentPane().add(lblComputer);

		JButton btnplayagain = new JButton("Play Again");
		btnplayagain.setBounds(166, 214, 89, 23);
		frame.getContentPane().add(btnplayagain);
		btnplayagain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDraw.setVisible(true);
				btnDrawAgain.setEnabled(true);
				btnplayagain.setVisible(false);
				btnHold.setVisible(true);
				lblNewLabel.setText("player");
				lblNewLabel_2.setText("player");
				lblNewLabel_1.setText("dealer");
				lblNewLabel_5.setText("dealer");
				lblNewLabel_3.setText("player");
				lblNewLabel_6.setText("dealer");
				textField.setText("");

			}
		});



		game21 p = new game21();
		game21 d = new game21();

		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("poi");
				d.random();
				p.random();
				lblNewLabel.setText(Integer.toString(p.getCard1()));
				lblNewLabel_2.setText(Integer.toString(p.getCard2()));
				lblNewLabel_1.setText(Integer.toString(d.getCard1()));
				lblNewLabel_5.setText(Integer.toString(d.getCard2()));

				if (d.getCard1() + d.getCard2() < 13){
					lblNewLabel_6.setText(Integer.toString(d.getCard3()));
					d.addThird();
				}
				btnDraw.setVisible(false);
				btnDrawAgain.setVisible(true);
			}
		});
		btnDrawAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_3.setText(Integer.toString(p.getCard3()));
				btnDrawAgain.setEnabled(false); 
				p.addThird();
			}
		});

		btnHold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(p.gettotal() + "this one");
				System.out.println(p.gettotal() + "is it");
				btnHold.setVisible(false);
				btnplayagain.setVisible(true);
				textField.setText(game21.check(p.gettotal(), d.gettotal()));
			}
		});
	}
}
