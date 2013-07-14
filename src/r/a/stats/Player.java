package r.a.stats;

public class Player {
	
	String name;
	int strength;
	int hp;
	int defense;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public Player(int defense, int strength, int hp) {
		this.strength = strength;
		this.defense = defense;
		this.hp = hp;
	}

}
