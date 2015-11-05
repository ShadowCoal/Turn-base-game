import java.util.Scanner;
public class attack {
	private static Scanner input;
	attack(int x){
		if(x == 0){
			if(status.level < 2)
				monster.WildWolf();
			else
				monster.randomEncounter();
		}
		else
			monster.Floor1Boss();
		System.out.println(monster.name + " showed up ");
		ourTurn();
		if (status.weapon != "bow" ||  status.weapon != "staff")
			theirTurn();
		else
			System.out.print(monster.name + " is to far away to attack");
		while(status.damageHp>1 && monster.hp >1){
			ourTurn();
			if(monster.hp > 0)
			theirTurn();
		}
		if (status.damageHp<=0){
			new Gameover();
		}
		else{
			System.out.println(monster.name + " ran away");
			status.totalExp += monster.drop;
			status.exp += monster.drop;
			if(status.exp >= status.next)
				status.levelUp();
		}
}
	public static void theirTurn(){
		int damage = monster.attack - status.defence;
		if(damage >0){
		System.out.println(monster.name + " attacks deals " + damage);
		status.damageHp -= damage;
		}
		else
			System.out.println(monster.name + " does no damage ");
	}
	public static void ourTurn(){
		input = new Scanner(System.in);
		System.out.println(status.damageHp + "/" + status.hp + " " + status.usedMp + "/" + status.mp);
		System.out.println("1- attack ");
		if(status.weapon == "staff" && status.usedMp >0)
			System.out.println("2- fire magic (uses 1 mp) ");
		if(status.item[0] != "used")
			System.out.println("3- item");
		System.out.println("4- run away");
		int x = input.nextInt();
		if(x > 5 || x <0){
			System.out.println("auto attack");
			x = 1;
		}
		if(x ==2 && status.usedMp< 1){
			System.out.println("out of mp ");
			x = 1;
		}
		if (x == 3 && status.item[0] == "used"){
			System.out.println("no item " );
			x = 1;
		}
		if(x == 1){
			int damage = status.attack - monster.defense;
			System.out.println("you dealt " + damage);
			monster.hp -= damage;
		}
		else if (x == 2){
			if(monster.weak == "Fire"){
				int damage = status.Int *2 - monster.res;
				System.out.print("Super effective! did " + damage);
				monster.hp -= damage;
			}
			else{
				int damage = status.Int - monster.res;
				System.out.print("does " + damage);
				monster.hp -= damage;
			}
		}
		else if (x == 3){
			if((int)status.item[1]>1){
				status.damageHp+=10;
				if (status.damageHp> status.hp){
					status.damageHp = status.hp;
				}
				System.out.print("you know have " + status.damageHp);
				
			}
			else{
				status.usedMp+=10;
				if (status.usedMp> status.mp){
					status.usedMp = status.mp;
				}
				System.out.print("you know have " + status.usedMp);
				
			}
			status.item[0]="used";
		}
		else if (x == 4){
			Forest.goingBack();
		}
	}

}
