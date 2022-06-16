package ua.lviv.lgs;

public class Droid {
	
	@Fielder(params = "Droid - name annotation")
	private String name;
	@Fielder(params = "Droid - height annotation")
	private int height;
	@Fielder(params = "Droid - impactlevel1 annotation")
	private int impactlevel1;
	private int damage;
	
	public Droid(String name, int height, int impactlevel1, int damage) {
		super();
		this.name = name;
		this.height = height;
		this.impactlevel1 = impactlevel1;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getImpactlevel1() {
		return impactlevel1;
	}

	public void setImpactlevel1(int impactlevel1) {
		this.impactlevel1 = impactlevel1;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Droid [name=" + name + ", height=" + height + ", impactlevel1=" + impactlevel1 + ", damage=" + damage
				+ "]";
	}
	
	

}
