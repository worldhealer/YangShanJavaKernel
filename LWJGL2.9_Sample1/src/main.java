import RealGame.Game;

public class main {
    public static void main(String[] argv) {
    	main_2();
    }
    static void main_1(String[] argv){
        RealGame.Game.isApplication = true;
        System.out.println("Use -fullscreen for fullscreen mode");
        new Game((argv.length > 0 && "-fullscreen".equalsIgnoreCase(argv[0]))).execute();
        System.exit(0);
    }
    static void main_2(){
    	Basic3 displayExample = new Basic3();
        displayExample.start();
    }
}
