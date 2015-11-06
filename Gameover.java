
public class Gameover {
	Gameover(){
		if (status.damageHp <=0){
			dead();
		}
		else{
		alive();	
		}
	}
	public static void dead(){
		System.out.print(status.hero+" died\nGameOver");
		System.exit(0);
	}
	public static void alive(){
		System.out.print(status.hero+" win!\nScore: " + status.totalExp);
		System.exit(0);
	}
}
