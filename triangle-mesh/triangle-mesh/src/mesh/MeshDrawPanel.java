package mesh;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import shapes.Point2D;
import shapes.Triangle2D;
import structures.TriangleMesh;
import toolbox.JFrameNormalization;
import toolbox.TriangleMeshTools;

public class MeshDrawPanel extends JPanel {
	private TriangleMesh tm;
	private JFrameNormalization norm;
	
	public MeshDrawPanel() {
		super();
		
		setBackground(Color.BLACK);
		drawMesh(10);
	}
	
	public void drawMesh(int size) {
		tm = new TriangleMesh();
		
		for(int i = 0; i<size-1;++i) {
			tm.add();
		}
		
		norm = new JFrameNormalization(0, getHeight(), getWidth(), getHeight(), 
				TriangleMeshTools.getMaxX(tm), TriangleMeshTools.getMaxY(tm));
		
		repaint();
		invalidate();
	}
	
	private void drawTriangle(Graphics g, Triangle2D triangle) {
		Graphics2D g2d = (Graphics2D)g;
		Point2D[] vertexes = triangle.getVertexes();
		
		g2d.setColor(Color.GREEN);
		
		norm.setOrigin(0, getHeight(), getWidth(), getHeight(), 
					   TriangleMeshTools.getMaxX(tm), TriangleMeshTools.getMaxY(tm));
		
		g2d.drawPolygon(new int[] { norm.x(vertexes[0].getX()), norm.x(vertexes[1].getX()), norm.x(vertexes[2].getX()) },
						new int[] { norm.y(vertexes[0].getY()), norm.y(vertexes[1].getY()), norm.y(vertexes[2].getY()) },3);
	}
	
	private void drawScene(Graphics g) {
		for(int i = 0; i<tm.getSize();++i) {
			drawTriangle(g, tm.get(i));
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		drawScene(g);
	}
	
}