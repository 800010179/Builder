


import hamppariBuilder.HampurilaisBuilder;
import hesburger.HesburgerHampurilaisBuilder;
import mcdonalds.*;

public class Main {

	/* A customer ordering a pizza. */
		
	public static void main(String[] args) {
	    	
		HampurilaisBuilder mcBuilder = new McDonaldsHampurilaisBuilder();
		HampurilaisBuilder heseBuilder = new HesburgerHampurilaisBuilder();
	    
		mcBuilder.luoUusiHampurilainen();
		
	    Hampurilainen mcHamppari = (Hampurilainen)mcBuilder.getHampurilainen();

		System.out.println("Syödään " + mcHamppari);
		
		heseBuilder.luoUusiHampurilainen();
		
		String heseHamppari = (String)heseBuilder.getHampurilainen();
		
		System.out.println("Syödään " + heseHamppari);

	}
	

}
