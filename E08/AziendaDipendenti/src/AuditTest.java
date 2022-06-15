import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AuditTest {

	@Test
	void testBenefitAlto1() throws Exception {
		Dirigente d = new Dirigente("Topolino", 10, 10000, 100000);
		Audit audit = new Audit();
		boolean result = audit.benefitTroppoAlto(d);
		assertTrue(result);		
	}

	@Test
	void testBenefitAlto2() throws Exception {
		Impiegato i = new Impiegato("Paperino", 10, 1000);
		Audit audit = new Audit();
		boolean result = audit.benefitTroppoAlto(i);
		assertFalse(result);		
	}
	
	@Test
	void testBenefitAlto3() {
		Audit audit = new Audit();
		boolean result = audit.benefitTroppoAlto(null);
		assertFalse(result);		
	}
	
}
