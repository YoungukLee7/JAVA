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
	      System.out.println(name + "는 몸통 박치기로 데미지는 " 
	            + atk * 0.7 + "입니다.");
	   }
	}

