
public class battle {

	public class battle {
	
		public static void main(String[] args) {
			pokemon p1 = new pokemon();
			p1.type= "fire ";
			p1.name="Charmander";
			
			pokemon p2 = new pokemon();
			p2.name = "squirtel";
			p2.type="water";
			
			System.out.println("A wild "+p1.name+" appeared!");
			System.out.println(p2.hp);
			
			System.out.println("Attacked");
			checkType(p1,p2);
			battle.damage(p1,p2);
			System.out.println(p1.hp);
			
			
			
	
		}
		
		public static  void checkType(pokemon p ,pokemon p2) {
			if(p.type.contains("fire")&&p2.type.contains("water")) {
				p2.supere= 3;
			}
			else if(p.type.contains("water")&&p2.type.contains("fire")){
				p.supere=1 ;
			}
		}
		public static  int damage(pokemon p1, pokemon p2) {
			p1.hp =p1.hp- p1.supere*20;
			return p1.hp ;
		}
		
		
	
	}
	public static void main(String[] args) {
		pokemon p1 = new pokemon();
		p1.type= "fire ";
		p1.name="Charmander";
		
		pokemon p2 = new pokemon();
		p2.name = "squirtel";
		p2.type="water";
		
		System.out.println("A wild "+p1.name+" appeared!");
		System.out.println(p2.hp);
		
		System.out.println("Attacked");
		checkType(p1,p2);
		battle.damage(p1,p2);
		System.out.println(p1.hp);
		
		
		

	}
	
	public static  void checkType(pokemon p ,pokemon p2) {
		if(p.type.contains("fire")&&p2.type.contains("water")) {
			p2.supere= 3;
		}
		else if(p.type.contains("water")&&p2.type.contains("fire")){
			p.supere=1 ;
		}
	}
	public static  int damage(pokemon p1, pokemon p2) {
		p1.hp =p1.hp- p1.supere*20;
		return p1.hp ;
	}
	
	

}

class pokemon{
	
	int hp = 100;
	
	int supere =0;
	
	String type = null;
	
	String name = null;
	
	pokemon(){
		
	}
}

