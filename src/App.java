
public class App {
	
	public static void main(String[] args) {
		String driver = "org.mariadb.jdbc.Driver";
		try {
			System.out.println("JDBC Start!");
			Class.forName(driver);
		} catch (ClassNotFoundException e) {

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
