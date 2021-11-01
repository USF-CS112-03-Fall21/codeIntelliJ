package lecture18Examples;

/**
 * From the book : Java 1.4 Game programming. Represents an Alien, a subclass of
 * Creature. Overrides speak() method to say: Alien from planet
 * <nameOfPlanet> says <getGreeting()> ! Has a fight() method that is not in the
 * superclass.
 */

public class Alien extends Creature {

	private String planet; // the name of the planet

	public Alien(String greeting, String planet) {
		super(greeting);
		this.planet = planet;

	}

	/*	@Override
	public void speak() {
		System.out.println("Alien from planet " + planet + " says: " + getGreeting() + ". ");

	}

	*/
}
