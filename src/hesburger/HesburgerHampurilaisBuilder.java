package hesburger;

import hamppariBuilder.HampurilaisBuilder;

public class HesburgerHampurilaisBuilder implements HampurilaisBuilder{

	private StringBuilder hesburgerHampurilainen;

	public void luoUusiHampurilainen(){
		hesburgerHampurilainen = new StringBuilder();
		rakennaSampyla();
		rakennaPihvi();
		rakennaMausteet();
		rakennaTaytteet();
		rakennaSampyla();
	}
	
	public String getHampurilainen(){ return hesburgerHampurilainen.toString();}
	
	@Override
	public void rakennaSampyla() {
		hesburgerHampurilainen.append("Hesburgerin sämpylä ");
		
	}

	@Override
	public void rakennaPihvi() {
		hesburgerHampurilainen.append("Hesburgerin pihvi ");
		
	}

	@Override
	public void rakennaTaytteet() {
		hesburgerHampurilainen.append("Hesburgerin salaatti ");
		hesburgerHampurilainen.append("Hesburgerin juusto ");
	}

	@Override
	public void rakennaMausteet() {
		hesburgerHampurilainen.append("Hesburgerin ketsuppi ");
		hesburgerHampurilainen.append("Hesburgerin majoneesi ");
	}

	
}
