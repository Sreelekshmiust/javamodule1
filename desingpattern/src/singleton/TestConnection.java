package singleton;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
	
	if(con1.equals(con2)) {
		System.out.println("singleton");
	}
	else {
		System.out.println("Not singleton");
	}
	}
}