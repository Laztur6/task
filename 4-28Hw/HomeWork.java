package priv.szq.base.hw4_28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.log4j.Logger;

public class HomeWork {
	private static final File FILE2 = Paths.get("E:/HomeWork", "4-28Hw",
			"UserList.txt").toFile();
	private static final Logger logger = Logger.getLogger(HomeWork.class);

	public static void main(String[] args) {
		daoHang();

	}

	private static void daoHang() {
		Scanner scan = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("-------------�û�����ϵͳ-------------");
		System.out.println("-------------1���û�ע��--------------");
		System.out.println("-------------2���û���¼--------------");
		System.out.println("-------------3�������޸�--------------");
		System.out.println("-------------0���˳�ϵͳ--------------");
		System.out.println("--------------------------------------");
		int nextInt = scan.nextInt();

		switch (nextInt) {
		case 1:
			HomeWork.register();
			break;

		case 2:
			HomeWork.login();
			break;
		case 3:
			HomeWork.change();
			break;
		case 0:
			System.out.println("ϵͳ���˳���");
			System.exit(0);
		}
	}

	private static void change() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ���ĵ��˺�:");
		String userId = scan.next();
		int cont = 0;
		try (InputStream in = new FileInputStream(FILE2);
				ObjectInputStream is = new ObjectInputStream(in);) {
			ArrayList<User> readObject = (ArrayList<User>) is.readObject();
			for (int i = 0; i < readObject.size(); i++) {
				if (userId.equals(readObject.get(i).getUserId())) {
					System.out.println("����ԭʼ����:"
							+ readObject.get(i).getPassWord());
					System.out.println("�����������");
					String passWord = scan.next();
					readObject.set(i, new User(userId, passWord));

					try (OutputStream out = new FileOutputStream(FILE2);// ����
							ObjectOutputStream os = new ObjectOutputStream(out);) {
						os.writeObject(readObject);
						System.out.println("�޸ĳɹ�!");
						daoHang();
					} catch (IOException e) {
						logger.error(e);
					}
				}else {
					cont++;
				}
			}
			if (cont>0) {
				System.out.println("û�д��˺�,��ȷ��");
				daoHang();
				
			}
		} catch (IOException e) {
			logger.error(e);
		} catch (ClassNotFoundException e) {
			logger.error(e);

		}

	}

	private static void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������˺�:");
		String userId = scan.next();
		try (InputStream in = new FileInputStream(FILE2);
				ObjectInputStream is = new ObjectInputStream(in);){
				ArrayList<User> ro = (ArrayList<User>) is.readObject();
				int cont = 0;
				for (int i = 0; i < ro.size(); i++) {
					if (userId.equals(ro.get(i).getUserId())) {
						cont++;
					}
				}
				if (cont<=0) {
					System.out.println("������˺Ų�����!");
					daoHang();				
				}
			
		} catch (FileNotFoundException e1) {
			logger.error(e1);
			
			
		} catch (IOException e1) {
			logger.error(e1);
		} catch (ClassNotFoundException e) {
			logger.error(e);
		}
		System.out.println("����������");
		String passWord = scan.next();

		int cont = 0;
		try (InputStream in = new FileInputStream(FILE2);
			ObjectInputStream is = new ObjectInputStream(in);)
		 {
			ArrayList<User> readUsers = (ArrayList<User>) is.readObject();
			for (int i = 0; i < readUsers.size(); i++) {
				if (userId.equals(readUsers.get(i).getUserId())) {
					if (passWord.equals(readUsers.get(i).getPassWord())) {
						System.out.println("��¼�ɹ���");
						cont++;
					}
				}
			}
			if (cont == 0) {
				try {
				throw new UserNotFoundException("�˺��������,���������룡");
				} catch (UserNotFoundException e) {
					e.printStackTrace();
				}

			} else {
				daoHang();
			}
		} catch (IOException e) {
			logger.error(e);

		} catch (ClassNotFoundException e) {
			logger.error(e);
		}

	}

	private static void register() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ע���˺�:");
		String userId = scan.next();
		System.out.println("������ע������:");
		String passWord = scan.next();
		List<User> userList = (List<User>) new ArrayList();
		try (InputStream in = new FileInputStream(FILE2);// ����
				ObjectInputStream is = new ObjectInputStream(in);) {
			ArrayList<User> readuser = (ArrayList<User>) is.readObject();
			int cont = 0;
			for (int i = 0; i < readuser.size(); i++) {
				if (userId.equals(readuser.get(i).getUserId())) {
					cont++;
				}
			}
			if (cont > 0) {
				System.out.println("������û��Ѵ��ڣ�");
				daoHang();

			} else {
				System.out.println("ע��ɹ���");
				readuser.add(new User(userId, passWord));
				try (OutputStream out = new FileOutputStream(FILE2);// ����
						ObjectOutputStream os = new ObjectOutputStream(out);) {
					os.writeObject(readuser);
					daoHang();
				} catch (IOException e) {
					logger.error(e);

				}
			}
		} catch (FileNotFoundException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		} catch (ClassNotFoundException e) {
			logger.error(e);

		}
	}

}
