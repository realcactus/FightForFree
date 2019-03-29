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

public class PreBattleFrameBak extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	private JPanel panel_2;       //头像panel
	private JLabel lblNewLabel_1; //昵称
	private JLabel lblNewLabel_19; //职业
	private JLabel lblNewLabel_2;  //等级
	private JLabel lblNewLabel_3;  //HP
	private JLabel lblNewLabel_4;  //MP
	private JLabel lblNewLabel_5;  //物理攻击
	private JLabel lblNewLabel_6;  //法术攻击
	private JLabel lblNewLabel_7;  //物理防御
	private JLabel lblNewLabel_8;  //法术防御
	private JLabel lblNewLabel_9;  //吸血率
	private JLabel lblNewLabel_10; //暴击率
	private JLabel label_14; //头盔
	private JLabel lblNewLabel_11; //武器
	private JLabel lblNewLabel_12; //衣服
	private JLabel lblNewLabel_13; //鞋子
	private JLabel lblNewLabel_14; //戒指
	private JLabel lblNewLabel_15; //经验
	private JLabel lblNewLabel_16; //金钱



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreBattleFrameBak frame = new PreBattleFrameBak();
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
	public PreBattleFrameBak() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 704);
		setTitle("战前准备");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBounds(100, 100, 400, 300);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 13, 210, 663);
		contentPane.add(panel);
		panel.setLayout(null);

		panel_2 = new JPanel();
		panel_2.setBounds(14, 13, 182, 93);
		panel.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(14, 119, 182, 531);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("名字：");
		lblNewLabel.setBounds(14, 10, 45, 18);
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_18 = new JLabel("职业：");
		lblNewLabel_18.setBounds(14, 35, 45, 18);
		panel_3.add(lblNewLabel_18);

		JLabel label = new JLabel("等级：");
		label.setBounds(14, 60, 45, 18);
		panel_3.add(label);

		JLabel lblHp = new JLabel("HP：");
		lblHp.setBounds(14, 85, 32, 18);
		panel_3.add(lblHp);

		JLabel lblMp = new JLabel("MP：");
		lblMp.setBounds(14, 110, 32, 18);
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

		lblNewLabel_1 = new JLabel("天蓝蓝");
		lblNewLabel_1.setBounds(69, 10, 72, 18);
		panel_3.add(lblNewLabel_1);

		lblNewLabel_19 = new JLabel("蓝蓝神");
		lblNewLabel_19.setBounds(69, 35, 45, 18);
		panel_3.add(lblNewLabel_19);

		lblNewLabel_2 = new JLabel("LV.99");
		lblNewLabel_2.setBounds(69, 60, 72, 18);
		panel_3.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("9999");
		lblNewLabel_3.setBounds(56, 85, 72, 18);
		panel_3.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("9999");
		lblNewLabel_4.setBounds(56, 110, 72, 18);
		panel_3.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("999");
		lblNewLabel_5.setBounds(104, 135, 60, 18);
		panel_3.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("999");
		lblNewLabel_6.setBounds(104, 165, 60, 18);
		panel_3.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("999");
		lblNewLabel_7.setBounds(104, 195, 60, 18);
		panel_3.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("999");
		lblNewLabel_8.setBounds(104, 225, 60, 18);
		panel_3.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("99%");
		lblNewLabel_9.setBounds(84, 255, 72, 18);
		panel_3.add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("99%");
		lblNewLabel_10.setBounds(84, 285, 72, 18);
		panel_3.add(lblNewLabel_10);

		label_14 = new JLabel("蓝蓝盔");
		label_14.setBounds(69, 315, 72, 18);
		panel_3.add(label_14);

		lblNewLabel_11 = new JLabel("蓝蓝剑");
		lblNewLabel_11.setBounds(69, 345, 72, 18);
		panel_3.add(lblNewLabel_11);

		lblNewLabel_12 = new JLabel("蓝蓝甲");
		lblNewLabel_12.setBounds(69, 375, 72, 18);
		panel_3.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("蓝蓝靴");
		lblNewLabel_13.setBounds(69, 405, 72, 18);
		panel_3.add(lblNewLabel_13);

		lblNewLabel_14 = new JLabel("蓝蓝戒");
		lblNewLabel_14.setBounds(69, 435, 72, 18);
		panel_3.add(lblNewLabel_14);

		lblNewLabel_15 = new JLabel("Max");
		lblNewLabel_15.setBounds(69, 465, 72, 18);
		panel_3.add(lblNewLabel_15);

		lblNewLabel_16 = new JLabel("Max");
		lblNewLabel_16.setBounds(69, 495, 72, 18);
		panel_3.add(lblNewLabel_16);





		JPanel panel_1 = new JPanel();
		panel_1.setBounds(225, 13, 564, 658);
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
		button_3.setBounds(444, 29, 82, 55);
		panel_1.add(button_3);


	}


	@Override
	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JPanel getPanel_2() {
		return panel_2;
	}

	public void setPanel_2(JPanel panel_2) {
		this.panel_2 = panel_2;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblNewLabel_19() {
		return lblNewLabel_19;
	}

	public void setLblNewLabel_19(JLabel lblNewLabel_19) {
		this.lblNewLabel_19 = lblNewLabel_19;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
	}

	public JLabel getLblNewLabel_6() {
		return lblNewLabel_6;
	}

	public void setLblNewLabel_6(JLabel lblNewLabel_6) {
		this.lblNewLabel_6 = lblNewLabel_6;
	}

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
	}

	public JLabel getLblNewLabel_8() {
		return lblNewLabel_8;
	}

	public void setLblNewLabel_8(JLabel lblNewLabel_8) {
		this.lblNewLabel_8 = lblNewLabel_8;
	}

	public JLabel getLblNewLabel_9() {
		return lblNewLabel_9;
	}

	public void setLblNewLabel_9(JLabel lblNewLabel_9) {
		this.lblNewLabel_9 = lblNewLabel_9;
	}

	public JLabel getLblNewLabel_10() {
		return lblNewLabel_10;
	}

	public void setLblNewLabel_10(JLabel lblNewLabel_10) {
		this.lblNewLabel_10 = lblNewLabel_10;
	}

	public JLabel getLabel_14() {
		return label_14;
	}

	public void setLabel_14(JLabel label_14) {
		this.label_14 = label_14;
	}

	public JLabel getLblNewLabel_11() {
		return lblNewLabel_11;
	}

	public void setLblNewLabel_11(JLabel lblNewLabel_11) {
		this.lblNewLabel_11 = lblNewLabel_11;
	}

	public JLabel getLblNewLabel_12() {
		return lblNewLabel_12;
	}

	public void setLblNewLabel_12(JLabel lblNewLabel_12) {
		this.lblNewLabel_12 = lblNewLabel_12;
	}

	public JLabel getLblNewLabel_13() {
		return lblNewLabel_13;
	}

	public void setLblNewLabel_13(JLabel lblNewLabel_13) {
		this.lblNewLabel_13 = lblNewLabel_13;
	}

	public JLabel getLblNewLabel_14() {
		return lblNewLabel_14;
	}

	public void setLblNewLabel_14(JLabel lblNewLabel_14) {
		this.lblNewLabel_14 = lblNewLabel_14;
	}

	public JLabel getLblNewLabel_15() {
		return lblNewLabel_15;
	}

	public void setLblNewLabel_15(JLabel lblNewLabel_15) {
		this.lblNewLabel_15 = lblNewLabel_15;
	}

	public JLabel getLblNewLabel_16() {
		return lblNewLabel_16;
	}

	public void setLblNewLabel_16(JLabel lblNewLabel_16) {
		this.lblNewLabel_16 = lblNewLabel_16;
	}
}

