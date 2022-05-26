import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {

	
	@Test
	public void testPrezzoEString(){
		Prodotto p1=new Prodotto("Vino Rosso",10,1.2);
		Confezione p5=new Confezione("Girelle",5,1.2,10);
		
		assertEquals(p1.getPrezzo(),12,0);
		assertEquals(p5.getPrezzo(),60,0);
		
		System.out.println(p1.toString());
		System.out.println(p5.toString());
	}
	

	//svolgimento primo esercizio
	@Test
	public void testEquals(){
		Prodotto p1=new Prodotto("Vino Rosso",10,1.2);
		Prodotto p2=new Prodotto("Vino ROSSO",10,1.2);
		Prodotto p3=new Prodotto("Vino Rosso",20,1.2);
		Prodotto p4=new Confezione("Macine",10,1.2,30);
		Confezione p5=new Confezione("Girelle",5,1.2,10);
		Prodotto p6=new Confezione("Girelle",5,1.2,10);
		
		
		assertTrue(p1.equals(p2));
	
		assertFalse(p1.equals(p3));
		
		assertFalse(p1.equals(null));
		
		assertFalse(p4.equals(p5));
		
		assertTrue(p5.equals(p6));
		
		assertFalse(p5.equals(p1));
		
		assertFalse(p4.equals(p1));
		
	}
	
	/*
	 * Qua per qualche motivo c'è un testRegalo()
	 * La classe Regalo non viene nemmeno vagamente nominata nella consegna, io boh
	@Test
	public void testRegalo(){
		Prodotto p1=new Prodotto("Vino Rosso",10,1.2);
		Confezione p5=new Confezione("Girelle",5,1.2,10);
		
		Regalo r=new Regalo(p1);
		
		System.out.println(r.scarta());
		assertEquals(r.getPrezzo(),12,0);
		
		r=new Regalo(p5);

		assertEquals(r.getPrezzo(),60,0);
		System.out.println(r.scarta());
		
		r=new Regalo(new Object());
		assertEquals(r.getPrezzo(),0,0);
		System.out.println(r.scarta());
		
		
	}
<<<<<<< HEAD
=======
	*/
	
	/*
	 * 
	 * Togliete questo commento, e sostituite i vari ? con true/false per le assert,
	 * e i numeri che vi aspettate nelle assertEquals
	 * 
	@Test
	public void testDividi(){
		Prodotto p1=new Prodotto("Vino Rosso",10,1.2);
		Prodotto c=new Confezione("Girelle",10,1.2,10);
		
		Prodotto p2;
		
		p2= p1.dividi();
		assert?(p2 instanceof Prodotto);
		assertEquals(p2.getCosto_base(),?,0);
		
		p2= p1.dividi(4);
		assert?(p2 instanceof Prodotto);
		assertEquals(p2.getCosto_base(),?,0);
		
		p2= c.dividi();
		assert?(p2 instanceof Confezione);
		assertEquals(p2.getCosto_base(),?,0);
		assertEquals(((Confezione)p2).getPezzi(),?);
		
		p2= c.dividi(2);
		assert?(p2 instanceof Confezione);
		assertEquals(p2.getCosto_base(),?,0);
		assertEquals(((Confezione)p2).getPezzi(),?);
		
	}
	
	*/
>>>>>>> c46a9de6cbe0acc15d10fb9b1baea0a77c31fc9d
}
