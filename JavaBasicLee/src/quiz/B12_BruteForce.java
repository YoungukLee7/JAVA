package quiz;

public class B12_BruteForce {

	/*
	 ������ 4�ڸ� �ӽ� ��й�ȣ�� ���⶧����
	 ��� ��й�ȣ�� �����ϰ� �����ϴ� ���α׷��� �����ÿ�
	 */
	public static void main(String[] args) {
			String symbol = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"
					+ "!\"#$%&'()*+,-./:;<=>?@[��]^_`{|}~\\";

			System.out.println(symbol);
			System.out.println(symbol.length());

			String temp_password = "";
			
			int i = 0;
			while(i < 4) {
				int random_index = (int) (Math.random() * symbol.length());
				char random_char = symbol.charAt(random_index);
				temp_password += random_char;
				i++;
			}
			System.out.println("������ �ӽ� ��й�ȣ: " + temp_password);
			
			while (true) {
				String lemp_password = "";
				if (temp_password == lemp_password) {
					break;
				} else {
					
				}
			}
		
	
			
	}

}
