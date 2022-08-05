
public class B09_BreakContinue {
/*
  # break
  - switch-case ������ ����ϸ� �ش� case�� Ż���Ѵ�
  - �ݺ��� ���ο��� ����ϸ� �ش� �ݺ����� Ż���Ѵ�
  
  # continue
  - �ݺ��� ���ο��� ����ϸ� �� ��� ���� �ݺ����� �Ѿ��
  - continue �Ʒ��� ���� �ڵ�� ��� �����Ѵ�
 */
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			
			if(i==60) {
				break; // if���� ������ �� �ִ�
			}
		}
		System.out.println("break�� �Ἥ �ݺ����� �������ϴ�");
		
		for (int dan = 1; dan < 10; dan++) {
			
			if(dan % 3!=0) {
				 continue; // if���� ������ �� �ִ� 
			}
			System.out.println(dan + "��");
			for (int num = 1; num < 10; num++) {
				if (dan > num) {
					System.out.println(dan + "�� " + dan + " X " + num + " = " + dan*num);
				}
			}
		}
	}

}
