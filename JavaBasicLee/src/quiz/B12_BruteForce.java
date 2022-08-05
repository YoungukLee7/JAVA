package quiz;

public class B12_BruteForce {

	/*
	 생성된 4자리 임시 비밀번호를 맞출때까지
	 모든 비밀번호를 생성하고 대조하는 프로그램을 만들어보시오
	 */
	public static void main(String[] args) {
			String symbol = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"
					+ "!\"#$%&'()*+,-./:;<=>?@[＼]^_`{|}~\\";

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
			System.out.println("생성된 임시 비밀번호: " + temp_password);
			
			while (true) {
				String lemp_password = "";
				if (temp_password == lemp_password) {
					break;
				} else {
					
				}
			}
		
	
			
	}

}
