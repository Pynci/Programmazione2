public class Smartphone extends Device implements ICamera, ITelephone {
	
	private Photo[] gallery;
	private int credit;
	
	public Smartphone(int gallerySize) {
		gallery = new Photo[gallerySize];
		credit = 0;
	}

	@Override
	public boolean call(long num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean takePhoto() {
		// TODO Auto-generated method stub
		return false;
	}

}
