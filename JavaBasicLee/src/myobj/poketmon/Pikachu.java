package myobj.poketmon;

public class Pikachu extends Poketmon{
	static String defaultName = "Pikachu";
	   
	   public Pikachu() {
	      super(
	         defaultName,
	         (int)(Math.random() * 50 + 100),            
	         (int)(Math.random() * 50 + 100), 
	         (int)(Math.random() * 50 + 100), 
	         (int)(Math.random() * 50 + 100), 
	         (int)(Math.random() * 50 + 100), 
	         (int)(Math.random() * 50 + 100)
	      );      
	   }

	   public void thunder() {
	      System.out.println(name + "�� ���� ������ �ֽ��ϴ�. �������� " 
	            + sAtk * 1.5 + "�Դϴ�.");
	   }
	}
