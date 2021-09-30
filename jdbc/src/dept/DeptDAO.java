package dept;

public class DeptDAO {
       //empDAO stafic, Connection
	static {
		try {
			Class.forName("oracle. jdbc.OracleDriver");
			
		} catch (ClassNotFoundException e)  {
			e.printStackTrace();
		}
	
    }
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@local"
	}
