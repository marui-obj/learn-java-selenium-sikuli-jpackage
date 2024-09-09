package org.sikuli;

import org.sikuli.script.App;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import java.net.URL;
import java.nio.file.Paths;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;

import java.io.File;

public class Sikuli {
    public static String resourceLoader(){
        String resource = new File("resources/test.bat").getAbsolutePath();
        return resource;
    }

    public static void sikuliTest(){
        // App myapp = new App("\"C:\\Windows\\System32\\taskmgr.exe\"");
        // App myapp = new App("\"C:\\Windows\\System32\\calc.exe\"");
        // App myapp = new App("\"C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe\"");

        System.out.println("\"C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe\"");
        System.out.println("C:\\Program Files\\Google\\Chrome\\Application\\Chrome.exe");

        String file = resourceLoader();
        System.out.println(file);
        System.out.println("\""+file+"\"");
        App myapp = new App("\""+file+"\"");
        myapp.open();
        try{
            Thread.sleep(2000);
            System.out.println(myapp.focus());
            Thread.sleep(1000);
        }
        catch(Exception e){

        }
        System.out.println(myapp.hasWindow());
        System.out.println(myapp.getExec());
        System.out.println(myapp.getTitle());
        System.out.println(myapp.getWindowTitle());
        System.out.println(myapp.hasFocus());
        
        Screen screen = new Screen();
        Region appRegion = screen.getScreen();
        appRegion.highlight(2);
        try{
            ImageIO.write(screen.capture(appRegion).getImage(), "png", new File("c:\\tmp\\cap.png"));
        }
        catch(Exception e){

        }

        myapp.close();
        System.out.println("GOODBYE!");
        
    }
}
