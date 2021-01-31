package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);//사용자가 크기조정 가능 여부
		setLocationRelativeTo(null);//윈도우 창 정중앙에
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 창 종료 시 프로그램 전체 종료
		setVisible(true);
	}
}
