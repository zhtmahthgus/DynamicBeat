package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);//����ڰ� ũ������ ���� ����
		setLocationRelativeTo(null);//������ â ���߾ӿ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ â ���� �� ���α׷� ��ü ����
		setVisible(true);
	}
}
