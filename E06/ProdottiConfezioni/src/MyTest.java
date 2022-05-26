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

}
