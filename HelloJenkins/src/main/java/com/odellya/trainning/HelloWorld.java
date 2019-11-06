/**
 * 
 */
package com.odellya.trainning;

/**
 * @author odellyaconsulting
 *
 */
public class HelloWorld {

	public static void main(String[] args) {

		Personne personne = new Personne();
		personne.setName("Roland Chruisbel");
		personne.setLastName("malonga");
		System.out.println("Name: " + personne.getName() + " - " + "Prénom: " + personne.getLastName());
	}

}
