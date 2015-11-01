
public class monster {
	public static String name;
	public static int hp;
	public static int attack;
	public static int defense;
	public static int res;
	public static int spd;
	public static int hit;
	public static int drop;
	public static String weak;
public static void WildWolf(){
	name = "WildWolf";
	monster.hp = 15;
	monster.attack = 11;
	monster.defense = 10;
	monster.res = 8;
	monster.spd= 10;
	monster.hit = 4;
	monster.drop = 12;
	monster.weak = "Fire";
}
public static void WildBear(){
	name = "WildBear";
	monster.hp = 17;
	monster.attack = 17;
	monster.defense = 12;
	monster.res = 9;
	monster.spd=7;
	monster.hit = 7;
	monster.drop = 15;
	monster.weak = "Fire";
}
public static void Floor1Boss(){
	name = "Dino";
	monster.hp = 15;
	monster.attack = 11;
	monster.defense = 10;
	monster.res=10;
	monster.spd = 4;
	monster.hit = 10;
	monster.drop = 25;
	monster.weak = "Fire";
}
public static void randomEncounter(){
	final int HIGH = 10;
	final int LOW = 1;
	int random = ((int)(Math.random() * 100) % HIGH + LOW);
	if (status.level < random)
		WildWolf();
	else
		WildBear();
}
}
