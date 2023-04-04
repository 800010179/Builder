package mcdonalds;

import hamppariBuilder.HampurilaisBuilder;

public class McDonaldsHampurilaisBuilder implements HampurilaisBuilder{
	private Hampurilainen makkariHamppari;

	@Override
	public void luoUusiHampurilainen() {
		makkariHamppari = new Hampurilainen();
		rakennaSampyla();
		rakennaPihvi();
		rakennaMausteet();
		rakennaTaytteet();
		rakennaSampyla();
	}

	@Override
	public void rakennaSampyla() {
		if(makkariHamppari.getSampyla1() == null) {
			makkariHamppari.setSampyla1(new Sampyla("McDonalds sämpylä"));
		}
		else {
			makkariHamppari.setSampyla2(new Sampyla("McDonalds sämpylä"));
		}
		
	}

	@Override
	public void rakennaPihvi() {
		makkariHamppari.setPihvi(new Pihvi("McDonalds pihvi"));
		
	}

	@Override
	public void rakennaTaytteet() {
		makkariHamppari.setJuusto(new Juusto("McDonalds juusto"));
		makkariHamppari.setSalaatti(new Salaatti("McDonalds salaatti"));
	}

	@Override
	public void rakennaMausteet() {
		makkariHamppari.setKetsuppi(new Ketsuppi("McDonalds ketsuppi"));
		makkariHamppari.setMajoneesi(new Majoneesi("McDonalds majoneesi"));
	}

	@Override
	public Object getHampurilainen() {
		return makkariHamppari;
	}

	}

