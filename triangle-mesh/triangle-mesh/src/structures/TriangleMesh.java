package structures;

import java.util.List;
import java.util.ArrayList;
import shapes.Triangle2D;
import shapesfactory.TriangleFactory;

public class TriangleMesh {
	List<Triangle2D> mesh;

	public TriangleMesh( ) {
		mesh = new ArrayList<Triangle2D>();
		mesh.add(TriangleFactory.build());
	}	

	public void add() {
		mesh.add(TriangleFactory.build(getLastTriangle()));
	}
	
	private Triangle2D getLastTriangle() {
		return mesh.get(mesh.size()-1);
	}
	
	public int getSize() {
		return mesh.size();
	}
	
	public Triangle2D get(int index) {
		return mesh.get(index);
	}
}