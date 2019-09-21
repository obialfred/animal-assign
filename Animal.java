import java.util.Scanner;

public class Animal 

{

		// define instance variables for species name, population, and growth rate. */
		// define constructors

	public Animal(String species_name, int population, float growth_rate)
	{
	species_name = "";
	population = 0;
	growth_rate = 0;
	this.species_name = species_name;
	this.population = population;
	this.growth_rate = growth_rate;
	}

	public Animal() {
		this(DEFAULT_TYPE);
		System.out.println("Returning from no argument Animal constructor");
	}

	public Animal(String type) {
		System.out.println("Animal Constructor called with type=" + type);
		this.type = type;
	}

	public void set_name(String nm) //mutator method to set name
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a new name for your animal: ")
		nm = userInput.nextLine();
	}
	// add all mutator methods
	public String get_name(String nm) //accessor method for name
	{
		set_name(nm);
		return nm;
	}

	public void set_species(Stirng species_name){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a new name for your animal: ")
		species_name = userInput.nextLine();
	}

	public String get_species(String species_name){
		return species_name;

	}

	public void set_population(){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the population: ");
		population = userInput.nextInt();
	}

	public int get_population(int population){
		return population;
	}
	
	public void set_growth(){
		System.out.println("What's the population now?: ");
		Scanner userInput = new Scanner(System.in);
		int new_pop = userInput.nextInt();
		growth_rate = (float)((get_population(population)/new_pop)*100);
	}

	public double get_growth(int growth_rate){
		return growth_rate;
	}

	boolean endangered (){
		boolean enDang = false;
		if (double growth_rate < 0){
			enDang = true;
		} else {
			enDang = false;
		}
		return enDang;
	}

	public String toString() {
		return "Animals of type " + type;

	}

	public boolean equals(Animal other)
	{
		if((this.type==other.type))
			return true;
		else
			return false;
}

public static void main(String[] args){
	Animal a = new Animal();
	a.set_name();
	a.set_species(species_name);
	a.set_population();
	a.set_growth();
	a.endangered();
	a.toString();
	a.equals(other);
}
}