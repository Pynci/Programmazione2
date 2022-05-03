
public class AssicurazioneBonusMalus extends Assicurazione {
	int classeMerito;
	
	public AssicurazioneBonusMalus(Auto auto, int classeMerito) {
		super(auto);
		if(classeMerito < 1 || classeMerito > 3) {
			this.classeMerito = 1;
		}
		else {
			this.classeMerito = classeMerito;
		}
	}
	
	@Override
	public double calcolaPremio() {
		return super.calcolaPremio() * classeMerito;
	}
	
	@Override
	public String toString() {
		return super.toString() + " classeMerito=" + classeMerito;
	}
	
}
