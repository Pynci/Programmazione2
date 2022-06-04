
public abstract class Device implements IDevice {

	private boolean ready;

	@Override
	public void start() {
		ready = true;
	}

	@Override
	public void stop() {
		ready = false;
	}
	
	public boolean isReady() {
		return ready;
	}

}
