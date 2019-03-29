package view;
import role.*;
import role.Character;
import user.User;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class MonsterSelectFrame extends JFrame {

	private JPanel contentPane;

	private Character character;
	private Monster monster;



	private JComboBox comboBox;
	private JComboBox comboBox_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonsterSelectFrame frame = new MonsterSelectFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MonsterSelectFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("\u9009\u62E9\u602A\u7269");
		setResizable(false);
		setBounds(100, 100, 200, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		comboBox = new JComboBox(new String[] {"史莱姆","精灵","巨龙"});
		comboBox.setBounds(41, 44, 127, 23);
		panel.add(comboBox);

		comboBox_1 = new JComboBox(new String[] {"简单","中等","困难"});
		comboBox_1.setBounds(41, 88, 127, 23);
		panel.add(comboBox_1);

		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setBounds(75, 132, 93, 23);


		character = User.getInstance().getCharacter();

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem().toString());
				System.out.println(comboBox_1.getSelectedItem().toString());
				if(comboBox.getSelectedItem().toString().equals("史莱姆") && comboBox_1.getSelectedItem().toString().equals("简单")){
					monster = new SimpleMonsterFactory().createSlime();
				}
				else if(comboBox.getSelectedItem().toString().equals("精灵") && comboBox_1.getSelectedItem().toString().equals("简单")){
					monster = new SimpleMonsterFactory().createElf();
				}
				else if(comboBox.getSelectedItem().toString().equals("巨龙") && comboBox_1.getSelectedItem().toString().equals("简单")){
					monster = new SimpleMonsterFactory().createDragon();
				}
				else if(comboBox.getSelectedItem().toString().equals("史莱姆") && comboBox_1.getSelectedItem().toString().equals("中等")){
					monster = new NormalMonsterFactory().createSlime();
				}
				else if(comboBox.getSelectedItem().toString().equals("精灵") && comboBox_1.getSelectedItem().toString().equals("中等")){
					monster = new NormalMonsterFactory().createElf();
				}
				else if(comboBox.getSelectedItem().toString().equals("巨龙") && comboBox_1.getSelectedItem().toString().equals("中等")){
					monster = new NormalMonsterFactory().createDragon();
				}
				else if(comboBox.getSelectedItem().toString().equals("史莱姆") && comboBox_1.getSelectedItem().toString().equals("困难")){
					monster = new HardMonsterFactory().createSlime();
				}
				else if(comboBox.getSelectedItem().toString().equals("精灵") && comboBox_1.getSelectedItem().toString().equals("困难")){
					monster = new HardMonsterFactory().createElf();
				}
				else if(comboBox.getSelectedItem().toString().equals("巨龙") && comboBox_1.getSelectedItem().toString().equals("困难")){
					monster = new HardMonsterFactory().createDragon();
				}

//				System.out.println(monster);

				FightFrame fightFrame = new FightFrame(character,monster);
				fightFrame.setVisible(true);
			}
		});
		panel.add(btnNewButton);

	}

}
