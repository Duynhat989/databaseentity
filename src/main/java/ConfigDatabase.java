import javax.persistence.EntityManager;

public class ConfigDatabase {

	public void newUser(EntityManager entityManager,int Ma,String Ten,Integer sl,String ncc)
	{
		User nUser = new User();
		nUser.setMa(Ma);
		nUser.setTen(Ten);
		nUser.setSl(sl);
		nUser.setNcc(ncc);
		entityManager.persist(nUser);
	}
	public void updateUser(EntityManager entityManager,int Ma,String Ten,Integer sl,String ncc)
	{
		User nUser = new User();
		nUser.setMa(Ma);
		nUser.setTen(Ten);
		nUser.setSl(sl);
		nUser.setNcc(ncc);
		entityManager.merge(nUser);
	}
	
}
