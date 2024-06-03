# Programmazione2
Una raccolta del codice scritto seguendo il corso di Programmazione 2 (unimib).
```java
import unimib;

public class RepositoryProgrammazione2{
  Subject prog2;
  Testo testoEsercizi;
  String[] argomenti;
  
  public RepositoryProgrammazione2(){
    prog2 = new Subject("Programmazione2");
    testoEsercizi = new Testo(unimib.getCourse("Informatica").getSource(prog2));
    argomenti = {"incapsulamento", "ereditarietà", "polimorfismo",
                 "classi astratte", "interfacce", "gestione eccezioni",
                 "collezioni", "I/O"};
  }
  
}
```

**DISCLAIMER**: alcuni esercizi potrebbero essere mancanti o incompleti.
