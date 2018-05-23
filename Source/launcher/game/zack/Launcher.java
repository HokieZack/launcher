package launcher.game.zack;

import javax.swing.*;

import java.awt.event.*;

public class Launcher {
	
	JFrame frame;
	
	JPanel panel;
	
	JPanel steam;
	
	JPanel chrome;
	
	JPanel OBS;
	
	JPanel githubdesktop;
	
	JPanel eclipse;

	public static void main(String[] args) {
		Launcher gui = new Launcher();
		gui.go();
	}
	
	public void go() {
		
		frame = new JFrame("launcher");
		
		JButton SteamButton = new JButton("launch Steam");
		
		JButton ChromeButton = new JButton("launch Chrome");
		
		SteamListener listener1 = new SteamListener();
		
		ChromeListener listener2 = new ChromeListener();
		
		SteamButton.addActionListener(listener1);
		
		ChromeButton.addActionListener(listener2);
		
		panel = new JPanel();
		
		steam = new JPanel();
		
		chrome = new JPanel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel);
		
		frame.setSize(480, 480);
		
		frame.setVisible(true);
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(steam);
		
		panel.add(chrome);
		
		steam.add(SteamButton);
		
		chrome.add(ChromeButton);
		
	}
	
	class SteamListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	      Launchersteam.Launcher();
	    }
	  }
	
	class ChromeListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	      Launcherchrome.Launcher();
	    }
	  }


}
