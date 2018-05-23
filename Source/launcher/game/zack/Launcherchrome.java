package launcher.game.zack;

import java.io.IOException;

public class Launcherchrome {


	public static void Launcher() {
		Runtime runtime = Runtime.getRuntime();     //getting Runtime object
		
		String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"};
		
        try
        {
            runtime.exec(s); 
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
		
	}
}