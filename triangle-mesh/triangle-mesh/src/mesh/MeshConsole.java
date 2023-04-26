package mesh;
import structures.*;
import java.util.Scanner;

public class MeshConsole {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TriangleMesh tm = new TriangleMesh();
		
		System.out.print("Triangles: ");
		int size = scan.nextInt();
		scan.close();
		for(int i=1;i<size;++i) {
			tm.add();
		}
		
		for(int i = 0; i < size; ++i) {
			System.out.println(tm.get(i));
		}
	}
}
