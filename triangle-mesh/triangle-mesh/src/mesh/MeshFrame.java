package mesh;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MeshFrame extends JFrame {
	private MeshDrawPanel drawPanel;
	private MeshInputPanel inputPanel;
	
	public MeshFrame() {
		super("Triangle Mesh");
		
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		
		add(inputPanel = new MeshInputPanel(), BorderLayout.PAGE_START);
		add(drawPanel = new MeshDrawPanel());
	}
	
	public MeshDrawPanel getDrawPanel() {
		return drawPanel;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new MeshFrame().setVisible(true);
			}
		});
	}
}
