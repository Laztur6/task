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
		System.out.println("-------------用户管理系统-------------");
		System.out.println("-------------1、用户注册--------------");
		System.out.println("-------------2、用户登录--------------");
		System.out.println("-------------3、密码修改--------------");
		System.out.println("-------------0、退出系统--------------");
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
			System.out.println("系统已退出！");
			System.exit(0);
		}
	}

	private static void change() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要更改的账号:");
		String userId = scan.next();
		int cont = 0;
		try (InputStream in = new FileInputStream(FILE2);
				ObjectInputStream is = new ObjectInputStream(in);) {
			ArrayList<User> readObject = (ArrayList<User>) is.readObject();
			for (int i = 0; i < readObject.size(); i++) {
				if (userId.equals(readObject.get(i).getUserId())) {
					System.out.println("这是原始密码:"
							+ readObject.get(i).getPassWord());
					System.out.println("输入更改密码");
					String passWord = scan.next();
					readObject.set(i, new User(userId, passWord));

					try (OutputStream out = new FileOutputStream(FILE2);// 输入
							ObjectOutputStream os = new ObjectOutputStream(out);) {
						os.writeObject(readObject);
						System.out.println("修改成功!");
						daoHang();
					} catch (IOException e) {
						logger.error(e);
					}
				}else {
					cont++;
				}
			}
			if (cont>0) {
				System.out.println("没有此账号,请确认");
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
		System.out.println("请输入账号:");
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
					System.out.println("输入的账号不存在!");
					daoHang();				
				}
			
		} catch (FileNotFoundException e1) {
			logger.error(e1);
			
			
		} catch (IOException e1) {
			logger.error(e1);
		} catch (ClassNotFoundException e) {
			logger.error(e);
		}
		System.out.println("请输入密码");
		String passWord = scan.next();

		int cont = 0;
		try (InputStream in = new FileInputStream(FILE2);
			ObjectInputStream is = new ObjectInputStream(in);)
		 {
			ArrayList<User> readUsers = (ArrayList<User>) is.readObject();
			for (int i = 0; i < readUsers.size(); i++) {
				if (userId.equals(readUsers.get(i).getUserId())) {
					if (passWord.equals(readUsers.get(i).getPassWord())) {
						System.out.println("登录成功！");
						cont++;
					}
				}
			}
			if (cont == 0) {
				try {
				throw new UserNotFoundException("账号密码错误,请重新输入！");
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
		System.out.println("请输入注册账号:");
		String userId = scan.next();
		System.out.println("请输入注册密码:");
		String passWord = scan.next();
		List<User> userList = (List<User>) new ArrayList();
		try (InputStream in = new FileInputStream(FILE2);// 读入
				ObjectInputStream is = new ObjectInputStream(in);) {
			ArrayList<User> readuser = (ArrayList<User>) is.readObject();
			int cont = 0;
			for (int i = 0; i < readuser.size(); i++) {
				if (userId.equals(readuser.get(i).getUserId())) {
					cont++;
				}
			}
			if (cont > 0) {
				System.out.println("输入的用户已存在！");
				daoHang();

			} else {
				System.out.println("注册成功！");
				readuser.add(new User(userId, passWord));
				try (OutputStream out = new FileOutputStream(FILE2);// 输入
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
