package quiz;

public class B12_BruteForce1 {
	/*
	 ������ 4�ڸ� �ӽ� ��й�ȣ�� ���⶧����
	 ��� ��й�ȣ�� �����ϰ� �����ϴ� ���α׷��� �����ÿ�
	 ����� Ǯ��
	 */
	public static void main(String[] args) {
		String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" 
						+ "0123456789!\"#$%&'()*+,-./:;<=>?@[]^_`{|}~\\";

		String password = "0234"; // ���� ��й�ȣ ���Դ� ġ��
		
		for (int i = 0; i < symbols.length(); i++) { // ��� ��й�ȣ�� �����ϴ� ���α׷�
			String temp = ""; 
			temp += symbols.charAt(i);
			for (int j = 0; j < symbols.length(); j++) {
				String temp2 = temp + symbols.charAt(j);
				for (int k = 0; k < symbols.length(); k++) {
					String temp3 = temp2 + symbols.charAt(k);
					for (int l = 0; l < symbols.length(); l++) {
						String temp4 = temp3 + symbols.charAt(l);
						
						if (temp4.equals(password)) { // ���ڿ� ���� ���Ҷ��� .equals()�� ���
							System.out.println("ã�� ��й�ȣ�� " + temp4 + "�Դϴ�.");
							return;
						}
					}
				}
			}
		}
	}

}
