
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
		
		if(task != null) {
			int durataGiorno = getDurataTaskGiorno(task.getData());
			int posizioneTaskUguale = getPosizioneTask(task);
			
			if(posizioneTaskUguale == -1 && (durataGiorno + task.getDurata() <= 8)){
				int i = 0;
				while(i < toDo.length && !inserita) {
					if(toDo[i] == null) {
						toDo[i] = task;
						inserita = true;
					}
					i++;
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
