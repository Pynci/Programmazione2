
public class ToDoList {
	private Task[] toDo;
	
	public ToDoList(int maxTask) {
		if(maxTask > 0) {
			toDo = new Task[maxTask];
		}
		else {
			toDo = new Task[5];
		}
	}
	
	public int getDurataTaskGiorno(int data) {
		int durataTotale = 0;
		
		for(int i = 0; i < toDo.length; i++) {
			if(toDo[i] != null && toDo[i].getData() == data) {
				durataTotale += toDo[i].getDurata();
			}
		}
		
		return durataTotale;
	}
	
	public int getPosizioneTask(Task task) {
		int posizione = -1;
		int i = 0;
		
		while(i < toDo.length && posizione == -1) {
			if(toDo[i] != null && toDo[i].equals(task)) {
				posizione = i;
			}
			i++;
		}
		
		return posizione;
	}
	
	public boolean aggiungiTask(Task task) {
		boolean inserita = false;
		boolean presente = false;
		
		if(task != null && task.getDurata() + getDurataTaskGiorno(task.getData()) <= 8) {
			for(int i = 0; i < toDo.length; i++) {
				if(toDo[i] != null && toDo[i].equals(task)) {
					presente = true;
				}
				
				if(!presente) {
					int j = 0;
					
					while(j < toDo.length && !inserita) {
						if(toDo[j] == null) {
							toDo[j] = task;
							inserita = true;
						}
						j++;
					}
				}
			}
		}
		
		return inserita;
	}
	
	public boolean aggiungiTask(String titolo, int durata) {
		return aggiungiTask(new Task(titolo,durata));
	}
	
	public boolean rimuoviTask(Task task) {
		boolean rimosso = false;
		int i = 0;
		
		while(i < toDo.length && !rimosso) {
			if(task.equals(toDo[i])) {
				toDo[i] = null;
				rimosso = true;
			}
			i++;
		}
		
		return rimosso;
	}
	
	
}
