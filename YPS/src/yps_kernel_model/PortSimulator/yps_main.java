package yps_kernel_model.PortSimulator;

import org.lwjgl.LWJGLException;

public class yps_main {
	public static void main(String[] argv) throws Exception{
		System.out.println(argv.length);
		for(int i=0; i<argv.length; i++) System.out.println(argv[i]);
		if((argv.length>1)&&(argv[1].equals("HelloWorld"))) System.out.println("=====>Hello World");
		else SimulatorStart();
	}
	public static void SimulatorStart() throws LWJGLException{
		Game game = new port();
		game.setDisplayMode(640, 480, false);
		game.start();
	}
}
