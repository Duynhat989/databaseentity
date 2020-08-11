
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		while (true) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("shop");
			EntityManager entityManager = factory.createEntityManager();
			entityManager.getTransaction().begin();
			ConfigDatabase kc = new ConfigDatabase();
			System.out.println("-----Config Database----");
			System.out.println("-1. Add new User ");
			System.out.println("-2. Update User ");
			System.out.println("-3. Find (MaVT) ");
			System.out.println("-4. Delete User with MaVT ");
			System.out.print("- Moi chon : ");
			Scanner sc = new Scanner(System.in);
			int kt = sc.nextInt();
			switch (kt) {
			case 1: {
				System.out.print(" Nhap Ma: ");
				int Ma = sc.nextInt();
				System.out.print(" Nhap Ten: ");
				String name = sc.next();
				System.out.print(" Nhap Sl: ");
				int sl = sc.nextInt();
				System.out.print(" Nhap ncc: ");
				String ncc = sc.next();
				kc.newUser(entityManager, Ma, name, sl, ncc);
			}
				break;
			case 2: {
				System.out.print(" Nhap Ma Update: ");
				int Ma = sc.nextInt();
				System.out.print(" Nhap Ten: ");
				String name = sc.next();
				System.out.print(" Nhap Sl: ");
				int sl = sc.nextInt();
				System.out.print(" Nhap ncc: ");
				String ncc = sc.next();
				kc.updateUser(entityManager, Ma, name, sl, ncc);
			}
				break;
			case 3: {
				System.out.print(" Nhap Ma Update: ");
				int Ma = sc.nextInt();
				try {
					User user = entityManager.find(User.class, Ma);
					System.out.print(user.toString());
				} catch (Exception ex) {
					System.out.print("Can't find it");
				}
			}
				break;
			case 4: {
				System.out.print(" Nhap Ma Delete: ");
				int Ma = sc.nextInt();
				try {
					User user = entityManager.getReference(User.class, Ma);
					entityManager.remove(user);
					System.out.print(user.toString());
				} catch (Exception ex) {
					System.out.print("Can't delete it");
				}
			}
				break;
			default:{
				System.out.print("Can't find funtion ");
			}
			}
			System.out.println("Success !");
			entityManager.getTransaction().commit();
			entityManager.close();
			factory.close();
		}
	}
}
