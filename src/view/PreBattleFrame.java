package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PreBattleFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreBattleFrame frame = new PreBattleFrame();
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
	public PreBattleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 736);
		setTitle("站前准备");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBounds(100, 100, 400, 300);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(14, 13, 210, 663);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(14, 13, 182, 104);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(14, 130, 182, 520);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("名字：");
		lblNewLabel.setBounds(14, 15, 45, 18);
		panel_3.add(lblNewLabel);
		
		JLabel label = new JLabel("等级：");
		label.setBounds(14, 45, 45, 18);
		panel_3.add(label);
		
		JLabel lblHp = new JLabel("HP：");
		lblHp.setBounds(14, 75, 32, 18);
		panel_3.add(lblHp);
		
		JLabel lblMp = new JLabel("MP：");
		lblMp.setBounds(14, 105, 32, 18);
		panel_3.add(lblMp);
		
		JLabel label_1 = new JLabel("物理攻击：");
		label_1.setBounds(14, 135, 80, 18);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("法术攻击：");
		label_2.setBounds(14, 165, 80, 18);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("物理防御：");
		label_3.setBounds(14, 195, 80, 18);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("法术防御：");
		label_4.setBounds(14, 225, 80, 18);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("吸血率：");
		label_5.setBounds(14, 255, 60, 18);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("暴击率：");
		label_6.setBounds(14, 285, 60, 18);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("头盔：");
		label_7.setBounds(14, 315, 45, 18);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("武器：");
		label_8.setBounds(14, 345, 45, 18);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("衣服：");
		label_9.setBounds(14, 375, 45, 18);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("鞋子：");
		label_10.setBounds(14, 405, 45, 18);
		panel_3.add(label_10);
		
		JLabel label_11 = new JLabel("戒指：");
		label_11.setBounds(14, 435, 45, 18);
		panel_3.add(label_11);
		
		JLabel label_12 = new JLabel("经验：");
		label_12.setBounds(14, 465, 45, 18);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("金钱：");
		label_13.setBounds(14, 495, 45, 18);
		panel_3.add(label_13);
		
		JLabel lblNewLabel_1 = new JLabel("天蓝蓝");
		lblNewLabel_1.setBounds(69, 15, 72, 18);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LV.99");
		lblNewLabel_2.setBounds(69, 45, 72, 18);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("9999");
		lblNewLabel_3.setBounds(56, 75, 72, 18);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("9999");
		lblNewLabel_4.setBounds(56, 105, 72, 18);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("999");
		lblNewLabel_5.setBounds(104, 135, 60, 18);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("999");
		lblNewLabel_6.setBounds(104, 165, 60, 18);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("999");
		lblNewLabel_7.setBounds(104, 195, 60, 18);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("999");
		lblNewLabel_8.setBounds(104, 225, 60, 18);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("99%");
		lblNewLabel_9.setBounds(84, 255, 72, 18);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("99%");
		lblNewLabel_10.setBounds(84, 285, 72, 18);
		panel_3.add(lblNewLabel_10);
		
		JLabel label_14 = new JLabel("蓝蓝盔");
		label_14.setBounds(69, 315, 72, 18);
		panel_3.add(label_14);
		
		JLabel lblNewLabel_11 = new JLabel("蓝蓝剑");
		lblNewLabel_11.setBounds(69, 345, 72, 18);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("蓝蓝甲");
		lblNewLabel_12.setBounds(69, 375, 72, 18);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("蓝蓝靴");
		lblNewLabel_13.setBounds(69, 405, 72, 18);
		panel_3.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("蓝蓝戒");
		lblNewLabel_14.setBounds(69, 435, 72, 18);
		panel_3.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Max");
		lblNewLabel_15.setBounds(69, 465, 72, 18);
		panel_3.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Max");
		lblNewLabel_16.setBounds(69, 495, 72, 18);
		panel_3.add(lblNewLabel_16);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(266, 13, 641, 663);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("战 前 准 备");
		lblNewLabel_17.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel_17.setBounds(155, 13, 171, 105);
		panel_1.add(lblNewLabel_17);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(14, 131, 526, 304);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_15 = new JLabel("物品库");
		label_15.setBounds(45, 13, 102, 18);
		panel_4.add(label_15);
		
		JLabel label_16 = new JLabel("技能库");
		label_16.setBounds(220, 13, 102, 18);
		panel_4.add(label_16);
		
		JLabel label_17 = new JLabel("已装备技能 ");
		label_17.setBounds(371, 13, 102, 18);
		panel_4.add(label_17);
		
		JList<String> list = new JList<String>();
		list.setBounds(28, 56, 102, 177);
		panel_4.add(list);
		//list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setListData(new String[]{"蓝蓝药水", "蓝蓝圣剑", "蓝蓝圣甲", "蓝蓝圣盔", "蓝蓝圣靴", "蓝蓝圣戒",
				"蓝蓝神水", "蓝蓝神剑", "蓝蓝神甲", "蓝蓝神盔", "蓝蓝神靴", "蓝蓝神戒",
				"蓝蓝仙水", "蓝蓝仙剑", "蓝蓝仙甲", "蓝蓝仙盔", "蓝蓝仙靴", "蓝蓝仙戒"});
		list.setSelectedIndex(1);
		
		JScrollPane jsp = new JScrollPane(list);
		jsp.setBounds(28, 56, 102, 177);
		panel_4.add(jsp);
		
		JList<String> list_1 = new JList<String>();
		list_1.setBounds(200, 56, 102, 177);
		panel_4.add(list_1);
		list_1.setListData(new String[]{"螺旋丸螺旋丸", "仙法·螺旋连丸", "风遁·超大玉螺旋手里剑", "仙法·风遁·超大玉螺旋手里剑",
				"仙法·磁遁·螺旋丸", "仙法·熔遁·螺旋手里剑", "六道·超大玉螺旋手里剑", "气遁·飓风水涡之术", "灼遁·光轮疾风漆黑矢零式",
				"风遁·朱之螺旋丸", "尾兽螺旋丸", "火遁·豪杰螺旋丸", "真·太极螺旋丸", "真·太极螺旋丸", "尾兽行星螺旋手里剑", 
				"超漩涡螺旋丸", "炎遁·螺旋手里剑", "威装·超加具土命尾兽玉"});
		
		JScrollPane jsp_1 = new JScrollPane(list_1);
		jsp_1.setBounds(200, 56, 102, 177);
		panel_4.add(jsp_1);
		
		JList<String> list_2 = new JList<String>();
		list_2.setBounds(371, 56, 102, 177);
		panel_4.add(list_2);
		list_2.setListData(new String[]{"螺旋丸", "仙法·螺旋连丸", "风遁·超大玉螺旋手里剑", "仙法·风遁·超大玉螺旋手里剑"});
		
		JScrollPane jsp_2 = new JScrollPane(list_2);
		jsp_2.setBounds(371, 56, 102, 177);
		panel_4.add(jsp_2);
		
		JButton button = new JButton("使用");
		button.setBounds(371, 56, 102, 177);
		panel_4.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton button_1 = new JButton("装备");
		button_1.setBounds(201, 264, 102, 27);
		panel_4.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JButton button_2 = new JButton("卸下");
		button_2.setBounds(371, 264, 102, 27);
		panel_4.add(button_2);
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(14, 469, 526, 181);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setText("物品/技能描述：\r\n名称：  蓝蓝药水\r\n效果：  1.增加使用者HP上限9999\r\n\t2.增加使用者MP上限9999\r\n\t3.学会技能《天那么蓝》");
		textArea.setBounds(263, 24, 234, 144);
		panel_5.add(textArea);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(14, 24, 209, 144);
		panel_5.add(panel_6);
		
		JButton button_3 = new JButton("战斗");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_3.setBounds(508, 13, 119, 88);
		panel_1.add(button_3);
		
		
	}
}
