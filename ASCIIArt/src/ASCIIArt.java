/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void verticalHydro() {
		System.out.println("\t|               |");
		System.out.println("\t|               |");
		System.out.println("\t|               |");
		System.out.println("\t|               |");
		System.out.println("\t|    \\ ||| /    |");
		System.out.println("\t|     \\\\_//     |");
		System.out.println("\t|     /   \\     |");
		System.out.println("\t|    /     \\    |");
		System.out.println("\t|               |");
		System.out.println("\t|               |");
		System.out.println("\t|  Hydro Flask® |");
		System.out.println("\t|               |");

	}

	public static void baseHydro() {
		System.out.print("\t|_______________|");

	}

	public static void topHydro() {
		System.out.println("\t      _____");
		System.out.println("\t     //|||\\\\   ");
		System.out.println("\t    |=======|   ");
		System.out.println("\t ___|_______|___");
	}

	public static void spaceHydro() {
		System.out.println("");

	}

	public static void sunHydro() {
		System.out.println("\t\t\t\t\t    \\       /");
		System.out.println("\t\t\t\t\t     \\_____/");
		System.out.println("\t\t\t\t\t     | \" \" |");
		System.out.println("\t\t\t\t\t-----|\\___/|-----");
		System.out.println("\t\t\t\t\t     |_____|    ");
		System.out.println("\t\t\t\t\t     /     \\");
		System.out.println("\t\t\t\t\t    /       \\");

	}

	public static void main(String[] args) {
		spaceHydro();
		System.out.println("\"A Hydro Flask on a sunny day!\"");
		spaceHydro();
		sunHydro();
		spaceHydro();
		spaceHydro();
		topHydro();
		verticalHydro();
		baseHydro();

	}

}
