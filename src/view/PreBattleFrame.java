package view;

import Equipment.*;
import role.Character;
import role.CharacterStateManage;
import skill.ISkill;
import user.User;
import utils.GameCode;

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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class PreBattleFrame extends JFrame {

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

	private JList<String> list;  //物品库列表
	private JList<String> list_1; //技能库列表
	private JList<String> list_2; //已装备技能列表

	private JTextArea textArea;   //装备描述文本框

	private JButton button_3;  //战斗按钮

	private JComboBox comboBox;  //宝石列表





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

		list = new JList<String>();
		list.setBounds(28, 56, 102, 177);
		panel_4.add(list);
		//list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		String[] arrayEquip = {};
		List<IEquip> list_equip = User.getInstance().getCharacter().getEquipBag();
		if(list_equip!=null){
			List<String> list_equip_string = new ArrayList<>();
			for(IEquip equip:list_equip){
				list_equip_string.add(equip.description().split("\\+")[0]);
			}
			String[] array_temp = new String[list_equip.size()];
			arrayEquip=list_equip_string.toArray(array_temp);
		}
		list.setListData(arrayEquip);

		list.setSelectedIndex(1);

		JScrollPane jsp = new JScrollPane(list);
		jsp.setBounds(28, 56, 102, 177);
		panel_4.add(jsp);

		list_1 = new JList<String>();
		list_1.setBounds(200, 56, 102, 177);
		panel_4.add(list_1);

		list_1.setListData(new String[]{"螺旋丸螺旋丸", "仙法·螺旋连丸", "风遁·超大玉螺旋手里剑", "仙法·风遁·超大玉螺旋手里剑",
				"仙法·磁遁·螺旋丸", "仙法·熔遁·螺旋手里剑", "六道·超大玉螺旋手里剑", "气遁·飓风水涡之术", "灼遁·光轮疾风漆黑矢零式",
				"风遁·朱之螺旋丸", "尾兽螺旋丸", "火遁·豪杰螺旋丸", "真·太极螺旋丸", "真·太极螺旋丸", "尾兽行星螺旋手里剑",
				"超漩涡螺旋丸", "炎遁·螺旋手里剑", "威装·超加具土命尾兽玉"});

		JScrollPane jsp_1 = new JScrollPane(list_1);
		jsp_1.setBounds(200, 56, 102, 177);
		panel_4.add(jsp_1);

		list_2 = new JList<String>();
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
		button_1.setBounds(209, 266, 93, 23);
		panel_4.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//装备技能
				int index = list_1.getSelectedIndex();
				Character c = User.getInstance().getCharacter();
				List<ISkill> skillBag = c.getSkillBag();
				ISkill skill = skillBag.get(index);
				//装备上
				if(c.getSkill1() == null){
					c.setSkill1(skill);
					updateCharacterState();
					contentPane.updateUI();
					return;
				}
				if(c.getSkill2() == null){
					c.setSkill2(skill);
					updateCharacterState();
					contentPane.updateUI();
					return;
				}
				if(c.getSkill3() == null){
					c.setSkill3(skill);
					updateCharacterState();
					contentPane.updateUI();
					return;
				}
				if(c.getSkill4() == null){
					c.setSkill4(skill);
					updateCharacterState();
					contentPane.updateUI();
					return;
				}
			}
		});

		JButton button_2 = new JButton("卸下");
		button_2.setBounds(380, 266, 93, 23);
		button_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = list_2.getSelectedIndex();
				Character c = User.getInstance().getCharacter();
				switch (index) {
					case 0:
						if (c.getSkill1() != null) {
							c.setSkill1(null);
							System.out.println(c);
						}
						break;
					case 1:
						if (c.getSkill2() != null) {
							c.setSkill2(null);
						}
						break;
					case 2:
						if (c.getSkill3() != null) {
							c.setSkill3(null);
						}
						break;
					case 3:
						if (c.getSkill4() != null) {
							c.setSkill4(null);
						}
						break;
				}
				updateCharacterState();
				contentPane.updateUI();
			}
		});
		panel_4.add(button_2);

		JButton button_4 = new JButton("\u4F7F\u7528");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//定位到选择了哪一个装备
				int index = list.getSelectedIndex();
				Character c = User.getInstance().getCharacter();
				List<IEquip> list = c.getEquipBag();
				IEquip equip = list.get(index);
				if(equip.description().indexOf("头")!=-1){
					c.setHelmet(equip);
				} else if((equip.description().indexOf("斧")!=-1)||(equip.description().indexOf("杖")!=-1)||(equip.description().indexOf("剑")!=-1)){
					c.setWeapon(equip);
				} else if (equip.description().indexOf("衣")!=-1){
					c.setClothes(equip);
				} else if(equip.description().indexOf("鞋")!=-1){
					c.setShoes(equip);
				} else if (equip.description().indexOf("戒")!=-1){
					c.setRing(equip);
				}
				//更新数值
				updateCharacterState();
				contentPane.updateUI();
			}
		});
		button_4.setBounds(37, 264, 93, 23);
		panel_4.add(button_4);

		JButton btnNewButton = new JButton("描述");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = list.getSelectedIndex();
				IEquip equip = User.getInstance().getCharacter().getEquipBag().get(index);
				textArea.setText(equip.description()+'\n'+equip.toString());
				contentPane.updateUI();
			}
		});
		btnNewButton.setBounds(38, 241, 93, 23);
		panel_4.add(btnNewButton);

		JButton button_5 = new JButton("描述");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list_1.getSelectedIndex();
				ISkill skill = User.getInstance().getCharacter().getSkillBag().get(index);
				textArea.setText(skill.description()+'\n'+skill.toString());
				contentPane.updateUI();
			}
		});
		button_5.setBounds(210, 243, 93, 23);
		panel_4.add(button_5);

		JButton btnNewButton_1 = new JButton("描述");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(380, 241, 93, 23);
		panel_4.add(btnNewButton_1);

		String[] gemList = {"光芒石","舍利子","翡翠石","蓝宝石","太阳石","月亮石"};
		comboBox = new JComboBox(gemList);
		comboBox.setToolTipText("\u5B9D\u77F3");
		comboBox.setBounds(130, 78, 60, 21);
		panel_4.add(comboBox);

		JButton btnNewButton_2 = new JButton("强化");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gem = comboBox.getSelectedItem().toString();
				int index = list.getSelectedIndex();
				Character character = User.getInstance().getCharacter();
				IEquip equip = character.getEquipBag().get(index);

				switch (gem){
					case "光芒石":
						if (character.getMoney()> GameCode.HP_GEM){
							character.spendMoney(GameCode.HP_GEM);
							equip = new GemHp(equip);
							character.getEquipBag().set(index,equip);
						}
						break;
					case "舍利子":
						if (character.getMoney()> GameCode.ATK_GEM){
							character.spendMoney(GameCode.ATK_GEM);
							equip = new GemMatk(equip);
							character.getEquipBag().set(index,equip);
						}
						break;
					case "翡翠石":
						if (character.getMoney()> GameCode.MDEF_GEM){
							character.spendMoney(GameCode.MDEF_GEM);
							equip = new GemMdef(equip);
							character.getEquipBag().set(index,equip);
						}
						break;
					case "蓝宝石":
						if (character.getMoney()> GameCode.MP_GEM){
							character.spendMoney(GameCode.MP_GEM);
							equip = new GemMp(equip);
							character.getEquipBag().set(index,equip);
						}
						break;
					case "太阳石":
						if (character.getMoney()> GameCode.ATK_GEM){
							character.spendMoney(GameCode.ATK_GEM);
							equip = new GemPatk(equip);
							character.getEquipBag().set(index,equip);
						}
						break;
					case "月亮石":
						if (character.getMoney()> GameCode.PDEF_GEM){
							character.spendMoney(GameCode.PDEF_GEM);
							equip = new GemPdef(equip);
							character.getEquipBag().set(index,equip);
						}
						break;
				}
//				updateCharacterState();
				contentPane.updateUI();
			}
		});
		btnNewButton_2.setBounds(130, 111, 60, 23);
		panel_4.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("升级");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list_1.getSelectedIndex();
				Character character = User.getInstance().getCharacter();
				ISkill skill = character.getSkillBag().get(index);
				if(skill.getLevel()<5){
					if(character.getMoney() > skill.getLevelUpNeedMoney()){
						character.spendMoney(skill.getLevelUpNeedMoney());
						skill.upLevel();
					}
				}
				character.getSkillBag().set(index,skill);
				updateCharacterState();
				contentPane.updateUI();
			}
		});
		btnNewButton_3.setBounds(302, 111, 60, 23);
		panel_4.add(btnNewButton_3);

		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(14, 469, 526, 181);
		panel_1.add(panel_5);
		panel_5.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(263, 24, 234, 144);
		panel_5.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setText("物品/技能描述：\r\n名称：  蓝蓝药水\r\n效果：  1.增加使用者HP上限9999\r\n\t2.增加使用者MP上限9999\r\n\t3.学会技能《天那么蓝》");

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(14, 24, 209, 144);
		panel_5.add(panel_6);

		button_3 = new JButton("战斗");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MonsterSelectFrame monsterSelectFrame = new MonsterSelectFrame();
				monsterSelectFrame.setVisible(true);
			}
		});
		button_3.setBounds(508, 13, 119, 88);
		panel_1.add(button_3);


		//第一次初始化的时候更新一下数值
		updateCharacterState();
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



	public void updateCharacterState(){
		Character updateCharacter = User.getInstance().getCharacter();

		//先用备忘录模式记录下原来的状态，然后计算装备包装过后的人物属性
		CharacterStateManage characterStateManage = new CharacterStateManage();
		characterStateManage.setMemento(updateCharacter.saveMemento());

		System.out.println(updateCharacter);
		//根据装备信息更新角色数值
		updateCharacter.setHp(updateCharacter.calculateHp());
		updateCharacter.setMp(updateCharacter.calculateMp());
		updateCharacter.setPhysicalAtk(updateCharacter.calculatePhysicalAtk());
		updateCharacter.setMagicalAtk(updateCharacter.calculateMagicalAtk());
		updateCharacter.setPhysicalDef(updateCharacter.calculatePhysicalDef());
		updateCharacter.setMagicalDef(updateCharacter.calculateMagicalDef());
		updateCharacter.setCritRate(updateCharacter.calculateCritRate());
		updateCharacter.setBloodSucking(updateCharacter.calculateSuckBloodRate());

		getLblNewLabel_1().setText(updateCharacter.getNickName());
		getLblNewLabel_2().setText(String.valueOf(updateCharacter.getLevel()));
		getLblNewLabel_3().setText(String.valueOf(updateCharacter.getHp()));
		getLblNewLabel_4().setText(String.valueOf(updateCharacter.getMp()));
		getLblNewLabel_5().setText(String.valueOf(updateCharacter.getPhysicalAtk()));
		getLblNewLabel_6().setText(String.valueOf(updateCharacter.getMagicalAtk()));
		getLblNewLabel_7().setText(String.valueOf(updateCharacter.getPhysicalDef()));
		getLblNewLabel_8().setText(String.valueOf(updateCharacter.getMagicalDef()));
		getLblNewLabel_9().setText(String.valueOf(updateCharacter.getBloodSucking()));
		getLblNewLabel_10().setText(String.valueOf(updateCharacter.getCritRate()));
		if(updateCharacter.getHelmet()!=null){
			getLabel_14().setText(updateCharacter.getHelmet().description().split("\\+")[0]);
		} else{
			getLabel_14().setText("无");
		}
		if(updateCharacter.getWeapon()!=null){
			getLblNewLabel_11().setText(updateCharacter.getWeapon().description().split("\\+")[0]);
		} else{
			getLblNewLabel_11().setText("无");
		}
		if(updateCharacter.getClothes()!=null){
			getLblNewLabel_12().setText(updateCharacter.getClothes().description().split("\\+")[0]);
		} else{
			getLblNewLabel_12().setText("无");
		}
		if(updateCharacter.getShoes()!=null){
			getLblNewLabel_13().setText(updateCharacter.getShoes().description().split("\\+")[0]);
		} else{
			getLblNewLabel_13().setText("无");
		}
		if(updateCharacter.getRing()!=null){
			getLblNewLabel_14().setText(updateCharacter.getRing().description().split("\\+")[0]);
		} else{
			getLblNewLabel_14().setText("无");
		}
		getLblNewLabel_15().setText(String.valueOf(updateCharacter.getExperience()));
		getLblNewLabel_16().setText(String.valueOf(updateCharacter.getMoney()));


		//恢复状态
		updateCharacter.recover(characterStateManage.getMemento());
		System.out.println(updateCharacter);

		//物品库刷新
		String[] arrayEquip = {};
		List<IEquip> list_equip = User.getInstance().getCharacter().getEquipBag();
		if(list_equip!=null){
			List<String> list_equip_string = new ArrayList<>();
			for(IEquip equip:list_equip){
				list_equip_string.add(equip.description().split("\\+")[0]);
			}
			String[] array_temp = new String[list_equip.size()];
			arrayEquip=list_equip_string.toArray(array_temp);
		}
		list.setListData(arrayEquip);



		//技能库刷新
		String[] arraySkill = {};
		List<ISkill> list_skill = User.getInstance().getCharacter().getSkillBag();
		if(list_skill!=null){
			List<String> list_skill_string = new ArrayList<>();
			for(ISkill skill:list_skill){
				list_skill_string.add(skill.description());
			}
			String[] array_temp_skill = new String[list_skill.size()];
			arraySkill=list_skill_string.toArray(array_temp_skill);
		}
		list_1.setListData(arraySkill);



		//已装备技能列表
		String[] arraySkillUsed = {};
		List<ISkill> list_skill_used = new ArrayList<>();
		Character tempC = User.getInstance().getCharacter();
		if(tempC.getSkill1()!=null){
			list_skill_used.add(tempC.getSkill1());
		}
		if(tempC.getSkill2()!=null){
			list_skill_used.add(tempC.getSkill2());
		}
		if(tempC.getSkill3()!=null){
			list_skill_used.add(tempC.getSkill3());
		}
		if(tempC.getSkill4()!=null){
			list_skill_used.add(tempC.getSkill4());
		}
		if(list_skill_used.size()>0){
			List<String> list_skill_used_string = new ArrayList<>();
			for(ISkill skill:list_skill_used){
				list_skill_used_string.add(skill.description());
			}
			String[] array_temp_used_skill = new String[list_skill_used.size()];
			arraySkillUsed=list_skill_used_string.toArray(array_temp_used_skill);
		}
		list_2.setListData(arraySkillUsed);


	}
}
