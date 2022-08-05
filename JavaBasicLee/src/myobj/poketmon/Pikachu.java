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
	      System.out.println(name + "는 번개 공격이 있습니다. 데미지는 " 
	            + sAtk * 1.5 + "입니다.");
	   }
	}
