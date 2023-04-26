package toolbox;

import structures.TriangleMesh;

public class TriangleMeshTools {
	public static double getMaxX(TriangleMesh tm) {
		double maxX = 0.0f;
		for(int i = 0; i<tm.getSize();++i) {
			for(int j = 0; j<tm.get(i).getVertexes().length;++j) {
				if(maxX < tm.get(i).getVertexes()[j].getX()) {
					maxX = tm.get(i).getVertexes()[j].getX();
				}
			}
		}
		return maxX;
	}
	
	public static double getMaxY(TriangleMesh tm) {
		double maxY = 0.0f;
		for(int i = 0; i<tm.getSize();++i) {
			for(int j = 0; j<tm.get(i).getVertexes().length;++j) {
				if(maxY < tm.get(i).getVertexes()[j].getY()) {
					maxY = tm.get(i).getVertexes()[j].getY();
				}
			}
		}
		return maxY;
	}
	
	
}
