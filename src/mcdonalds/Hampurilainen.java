package mcdonalds;

public class Hampurilainen {
	private Sampyla sampyla1;
	private Sampyla sampyla2;
    private Majoneesi majoneesi;
	private Ketsuppi ketsuppi;
	private Juusto juusto;
	private Pihvi pihvi;
	private Salaatti salaatti;
	
	
	public void setSampyla1(Sampyla sampyla) {
		this.sampyla1 = sampyla;
	}
	public void setSampyla2(Sampyla sampyla) {
		this.sampyla2 = sampyla;
	}

	public void setMajoneesi(Majoneesi majoneesi) {
		this.majoneesi = majoneesi;
	}


	public void setKetsuppi(Ketsuppi ketsuppi) {
		this.ketsuppi = ketsuppi;
	}


	public void setJuusto(Juusto juusto) {
		this.juusto = juusto;
	}


	public void setPihvi(Pihvi pihvi) {
		this.pihvi = pihvi;
	}


	public void setSalaatti(Salaatti salaatti) {
		this.salaatti = salaatti;
	}


	public Sampyla getSampyla1() {
		return sampyla1;
	}
	public Sampyla getSampyla2() {
		return sampyla2;
	}
	public Majoneesi getMajoneesi() {
		return majoneesi;
	}
	public Ketsuppi getKetsuppi() {
		return ketsuppi;
	}
	public Juusto getJuusto() {
		return juusto;
	}
	public Pihvi getPihvi() {
		return pihvi;
	}
	public Salaatti getSalaatti() {
		return salaatti;
	}
	public String toString() {return sampyla1 + "" + pihvi + "" + ketsuppi + "" + majoneesi + "" + salaatti + "" + juusto + "" + sampyla2;} // näyttää pizzan


}
