public class Smartphone extends Device implements ICamera, ITelephone {
	
	private Photo[] gallery;
	private int credit;
	
	public Smartphone(int gallerySize) throws DeviceException {
		credit = 0;
		if(gallerySize > 0) {
			gallery = new Photo[gallerySize];
		}
		else {
			throw new DeviceException("dimensione galleria non valida");
		}
	}
	
	public void addCredit(int newCredit) {
		if(newCredit > 0) {
			credit += newCredit;
		}
	}

	@Override
	public boolean call(long num) {
		if(num > 0 && credit > 0) {
			credit--;
			return true;
		}
		return false;
	}

	@Override
	public boolean takePhoto() {
		if(isReady()) {
			Photo newPhoto = new Photo();
			for(int i = 0; i < gallery.length; i++) {
				if(gallery[i] == null) {
					gallery[i] = newPhoto;
					return true;
				}
			}
		}
		
		return false;
	}

}
