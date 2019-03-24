package src.main.java;

import java.util.ArrayList;

public class Baseball {
	
	/**
	 * 1���� 9���� ������ ���� 3�� ����
	 * ������ 3�� ���ڴ� ���� �ٸ� ��
	 * @param randNum
	 */
	public void createNum(int[] randNum) {
		int cnt, temp;
		ArrayList num_list = new ArrayList();
		
		cnt = 0;
		while(cnt <= 2) {
			// 1���� 9����
			temp = (int) (Math.random() * 9) + 1;
			
			// �ߺ� ������ ���� �Ǻ�
			if(num_list.contains(temp))
				continue;
			
			randNum[cnt] = temp;
			num_list.add(temp);
			cnt++;
		}
	}

	public void game() {
		
		int[] answer = new int[3];
		
		createNum(answer);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(answer[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Baseball bb_obj = new Baseball();
		bb_obj.game();
	}
}
