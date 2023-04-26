package mesh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MeshInputPanel extends JPanel implements ActionListener, KeyListener{
	JTextField textField;
	JButton submit;
	
	public MeshInputPanel() {
		super();
		
		inizialize();
	}
	
	private void inizialize() {
		add(textField = new JTextField(20));
		textField.addKeyListener(this);
		
		add(submit = new JButton("Draw"));
		submit.addActionListener(this);
	}

	private void redraw() {
		int size = 1;
		
		try {
			size = Integer.parseInt(textField.getText());
		} catch(Exception e) {
			textField.setText("1");
		}
		
		MeshFrame mf = (MeshFrame) SwingUtilities.getWindowAncestor(this);
		mf.getDrawPanel().drawMesh(size);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case KeyEvent.VK_ENTER: 
			redraw();
			break;
		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		redraw();
		
		
	}
}
