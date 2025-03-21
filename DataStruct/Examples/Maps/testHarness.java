package Examples.Maps;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class testHarness {

	private static Cipher c;
	private static SecretKeySpec secretKeySpec;
	public static final String ENC_KEY = "abcdefghijklmnop";

	public static void main(String args[]) {

		try {
			c = Cipher.getInstance("AES");
			secretKeySpec = new SecretKeySpec(ENC_KEY.getBytes("UTF-8"), "AES");

			test();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String encrypt(String strClearText, String strKey) throws Exception {
		String strData = "";

		try {
			SecretKeySpec skeyspec = new SecretKeySpec(strKey.getBytes(), "Blowfish");
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
			byte[] encrypted = cipher.doFinal(strClearText.getBytes());
			strData = new String(encrypted);

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return strData;
	}

	public static String decrypt(String strEncrypted, String strKey) throws Exception {
		String strData = "";

		try {
			c.init(Cipher.ENCRYPT_MODE, secretKeySpec);
			byte[] encBytes = c.doFinal(DATA.getBytes("UTF-8"));
			String encStr = new String(encBytes, "UTF-8");
			System.out.println("Encrypted String: " + encStr);

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return strData;
	}

	public static final String DATA = "Hello World";

	public static void test() {

		try {

			c.init(Cipher.ENCRYPT_MODE, secretKeySpec);
			byte[] encBytes = c.doFinal(DATA.getBytes("UTF-8"));
			String encStr = new String(encBytes, "UTF-8");
			System.out.println("Encrypted String: " + encStr);

			c.init(Cipher.DECRYPT_MODE, secretKeySpec);
			String decStr = new String(c.doFinal(encBytes), "UTF-8");
			System.out.println("Decrypted String: " + decStr);

		} catch (Exception ex) {
			System.out.println("Error in encrypting data");
			ex.printStackTrace();
		}
	}

}
