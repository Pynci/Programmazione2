
public class Locale {
	private int mq;
	private String tipo;
	
	public Locale(int mq, String tipo) {
		this.setMq(mq);
		this.setTipo(tipo);
	}
	
	public Locale(String tipo) {
		this(10,tipo);
	}
	
	public int getMq() {
		return mq;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setMq(int mq) {
		if(mq < 1) {
			this.mq = 5;
		}
		else {
			this.mq = mq;
		}
	}
	
	public void setTipo(String tipo) {
		if(tipo == null || tipo.equals("")) {
			this.tipo = "camera";
		}
		else {
			this.tipo = tipo;
		}
	}
	
	
	public boolean equals(Locale altro) {
		if(altro == null) {
			return false;
		}
		else if(altro == this) {
			return true;
		}
		else if(altro.getMq() == this.getMq() && altro.getTipo().equals(this.getTipo())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Locale " + tipo + " di superficie " + mq;
	}
	
	
}
