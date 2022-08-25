package assignment5;

public class sysProperty {

	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("path.separator"));
		System.getProperties().list(System.out);
		//System.out.println(System.getProperty("null.device"));
	}

}
