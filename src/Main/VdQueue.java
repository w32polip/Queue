package Main;

import java.util.LinkedList;
import java.util.Queue;

public class VdQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new LinkedList<String>();
		
		danhSachSV.offer("Pham Thai Cong");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Nguyen Van C");
		
		while (true) {
			String ten = danhSachSV.poll();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
			
		}
	}
}
