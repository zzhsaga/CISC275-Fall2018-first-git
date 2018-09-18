
public class Animal implements Comparable<Animal>{
	String name;
	int legs;
	
	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}
	
	public String toString() {
		return name+" "+legs;
	}

	@Override
	public int compareTo(Animal o) {
		 return this.getLegs()-o.getLegs();
	}

}
