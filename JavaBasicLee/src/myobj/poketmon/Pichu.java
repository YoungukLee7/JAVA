package myobj.poketmon;

public class Pichu extends Poketmon{
	static String defaultName = "Pichu";
	   
	   public Pichu() {
	      super(
	         defaultName,
	         (int)(Math.random() * 30 + 70),            
	         (int)(Math.random() * 30 + 70), 
	         (int)(Math.random() * 30 + 70), 
	         (int)(Math.random() * 30 + 70), 
	         (int)(Math.random() * 30 + 70), 
	         (int)(Math.random() * 30 + 70)
	      );      
	   }

	   public void tackle() {
	      System.out.println(name + "�� ���� ��ġ��� �������� " 
	            + atk * 0.7 + "�Դϴ�.");
	   }
	}

