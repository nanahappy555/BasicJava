package chapter08;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		//DataAccessObject dao1 = new OracleDao();
		//DataAccessObject dao2 = new MysqlDao();
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
		
		DataAccessObject a = new DataAccessObject() {
			@Override
			public void select() {
				System.out.println("");
			}

			@Override
			public void insert() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void update() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void delete() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
