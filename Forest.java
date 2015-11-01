import java.util.Scanner;
public class Forest {private static Scanner input;
public static int step = 50;
Forest(){input = new Scanner(System.in);
	
	while(status.damageHp>0){
	while(step >0){
		step -= status.move;
		new attack(0);
	}
	System.out.print("You find where boss battle is located\n1- grind 2- enter");
	int x = input.nextInt();
	while(x==1){
		new attack(0);
		System.out.print("You find where boss battle is located\n1- grind 2- enter");
		x = input.nextInt();
	}
	System.out.print("You found the boss");
	new attack(1);
	}
}
public static void goingBack(){
	while(status.damageHp>0){
		while(step <49){
			step += status.move;
			new attack(0);
		}}
	step = 50;
	start.town();
}
}
