package quiz;

public class B12_BruteForce1 {
	/*
	 생성된 4자리 임시 비밀번호를 맞출때까지
	 모든 비밀번호를 생성하고 대조하는 프로그램을 만들어보시오
	 강사님 풀이
	 */
	public static void main(String[] args) {
		String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" 
						+ "0123456789!\"#$%&'()*+,-./:;<=>?@[]^_`{|}~\\";

		String password = "0234"; // 랜덤 비밀번호 나왔다 치고
		
		for (int i = 0; i < symbols.length(); i++) { // 모든 비밀번호를 생성하는 프로그램
			String temp = ""; 
			temp += symbols.charAt(i);
			for (int j = 0; j < symbols.length(); j++) {
				String temp2 = temp + symbols.charAt(j);
				for (int k = 0; k < symbols.length(); k++) {
					String temp3 = temp2 + symbols.charAt(k);
					for (int l = 0; l < symbols.length(); l++) {
						String temp4 = temp3 + symbols.charAt(l);
						
						if (temp4.equals(password)) { // 문자열 끼리 비교할때는 .equals()를 사용
							System.out.println("찾은 비밀번호는 " + temp4 + "입니다.");
							return;
						}
					}
				}
			}
		}
	}

}
