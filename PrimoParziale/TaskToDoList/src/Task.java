
public class Task {
	private String titolo;
	private int data;
	private boolean eseguito;
	private int durata;
	
	public Task(String titolo, int data, int durata) {
		setTitolo(titolo);
		setData(data);
		setDurata(durata);
		eseguito = false;
	}
	
	public Task(String titolo, int durata) {
		this(titolo,DataUtil.getDataDiOggi(),durata);
	}

	public String getTitolo() {
		return titolo;
	}

	public int getData() {
		return data;
	}

	public int getDurata() {
		return durata;
	}
	
	public boolean isEseguito() {
		return eseguito;
	}
	
	public void setTitolo(String titolo) {
		if(titolo != null && !titolo.equals("")){
			this.titolo = titolo;
		}
		else {
			this.titolo = "Da specificare";
		}
	}
	
	public void setData(int data) {
		if(data >= DataUtil.getDataDiOggi()) {
			this.data = data;
		}
		else {
			this.data = DataUtil.getDataDiOggi();
		}
	}
	
	public void setDurata(int durata) {
		if(durata >= 1 && durata <= 8) {
			this.durata = durata;
		}
		else {
			this.durata = 1;
		}
	}
	
	public void eseguito() {
		eseguito = true;
	}
	
	public boolean equals(Task altra) {
		if(altra == null) {
			return false;
		}
		else if(this == altra) {
			return true;
		}
		else if(titolo.equalsIgnoreCase(altra.titolo) && data == altra.data && durata == altra.durata) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "\ntitolo: " + titolo + "\ndata: " + data + "\ndurata: " + durata + "\neseguito: " + eseguito;
	}
	
	
	
}
