package yps_kernel_model.PortSimulator;

import org.lwjgl.LWJGLException;

public class yps_main {
	public static void main(String[] argv) throws Exception{
		SimulatorStart();
	}
	public static void SimulatorStart() throws LWJGLException{
		port.SingleItem = new port();
		port.SingleItem.setDisplayMode(640, 480, false);
		port.SingleItem.start();
	}
}
