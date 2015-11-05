public class status {
	public static String hero;
	public static String weapon;
	public static String armor;
	public static Object[] item = new Object[3];
	public static int level = 1;
	public static double counter = .02;
	public static int move = 6;
	public static int jump = 20;
	public static int hp = 17;
	public static int damageHp = hp;
	public static int mp = 7;
	public static int usedMp = mp;
	public static int attack = 11;
	public static int defence = 8;
	public static int Int = 9;
	public static int spd = 10;
	public static int hit = 11;
	public static int res = 8;
	public static int totalExp;
	public static int exp;
	public static int next=10;
	status(){
		System.out.println("Name: " + hero + " level: " + level + " counter " + counter +
				"\nWeapon: " + weapon + " Armor: " + armor + " item" + item[0] + " move " + move + " Jump " + jump +
				"\nHP " + damageHp + "/" + hp + " Mp " + usedMp + "/" +mp + " attack " + attack + " defence " + defence +
				"\nInt " + 9 + " res " + res + " total Exp " + totalExp + " next " + (next - exp));
	}
	static void levelUp(){
		level +=1;
		counter += .01;
		hp +=3;
		damageHp = hp;
		mp += 2;
		usedMp = mp;
		attack += 2;
		defence += 1;
		Int += 1;
		spd +=1;
		hit +=1;
		res +=1;
		exp = exp - next;
		next += 5;
		new status();
	}
}
