package Main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class VdDequeue {
public static void main(String[] args) {
	Deque<String> danhSachSV = new ArrayDeque<String>();
	
	
	danhSachSV.offer("Pham Thai Cong");
	
	danhSachSV.offer("Nguyen Van B");
	danhSachSV.offer("Nguyen Van A");
	danhSachSV.offer("Nguyen Van C");
	danhSachSV.offerLast("Nguyen Van D");
	danhSachSV.offerFirst("Nguyen Van 0");
	
	
	while (true) {
		String ten = danhSachSV.poll();
		if(ten == null) {
			break;
		}
		System.out.println(ten);
		
	}
}
}
