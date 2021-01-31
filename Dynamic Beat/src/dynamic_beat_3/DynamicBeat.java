package dynamic_beat_3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic;
	private Image introBackground;

	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);//사용자가 크기조정 가능 여부
		setLocationRelativeTo(null);//윈도우 창 정중앙에
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//윈도우 창 종료 시 프로그램 전체 종료
		setVisible(true);
		
		introBackground = new ImageIcon(Main.class.getResource("../images/IntroBackground2.jpg")).getImage();
		
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0 , 0 , null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
}
