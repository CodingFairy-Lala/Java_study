package contents.resources.loginsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import contents.game.StartGame;

public class LoginApplication {

	private static int usernum = 0;
	private static User user[] = new User[20];
	private static Scanner scanner = new Scanner(System.in);
	private static String inputId, inputPassword, inputNickname;
	private static String inputNewPassword;
	public static File userFile = new File("bearUsers.ser");

	public static void main(String[] args) {

		boolean run = true;

		do {

			System.out.println("═════════════════════════════════════");
			System.out.println("║   	                             ║");
			System.out.println("║    My Happy Bear Member Setting    ║");
			System.out.println("║                                    ║");
			System.out.println("═════════════════════════════════════");
			System.out.println("");

			System.out.println("♡✧。°₊·ˈ∗♡∗ˈ‧₊°。✧♡ ʕ•͡ᴥ•͡ʔ ♡✧。°₊·ˈ∗♡∗ˈ‧₊°。✧♡");
			System.out.println("");
			System.out.println("======================================      		");
			System.out.println("1.회원가입 ✅ 	           				 				");
			System.out.println("======================================      		");
			System.out.println("2.로그인  ✅	           								");
			System.out.println("======================================      		");
			System.out.println("3.사용자조회 ✅   											");
			System.out.println("======================================      		");
			System.out.println("4.비밀번호변경 ✅							        	   ");
			System.out.println("======================================      		");
			System.out.println("5.종료 ✅	   										    ");
			System.out.println("======================================      		");

			System.out.println(" ");
			System.out.println("╔═══════╗         ");
			System.out.println("  선택   ");
			System.out.println("╚═══════╝        ");
			System.out.print("");

			int select = scanner.nextInt();
			if (select == 1) { // 회원가입 선택
				if (usernum == 20) {
					System.out.println("용량 초과 회원가입 실패 (정원: 20명)");
					break;
				} else
					createAccount();
			} else if (select == 2) { // 로그인 선택
				loginAccount();
			} else if (select == 3) { // 사용자조회 선택
				lookAccount();
			} else if (select == 4) { // 비밀번호변경 선택
				deleteAccount();
			} else if (select == 5) { // 종료 선택
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} while (run);

		System.out.println("");
		System.out.println("My Happy Bear End!!");
		System.out.println("============================");
		System.out.println("");
		System.out.println("Bye Bye ~~ 🐻💤💤💤");
		System.out.println("");
		System.out.println("((`'-\"``\"\"-'`))");
		System.out.println("  )   -    -  (");
		System.out.println(" /   (o _ o)   \\");
		System.out.println(" \\   ( 0 )    /");
		System.out.println("  '-.._'='_..-'_");
		System.out.println("/`;#'#'#.-.#'#'#;`\\");
		System.out.println(" \\_))  '#'    ((_/");
		System.out.println("  #.           .#");
		System.out.println("' #.  💗BYE💗  #' \\");
		System.out.println(" / '#.     .#' \\");
		System.out.println("(((___)'#' (___)))");

	}

	private static void createAccount() { // 회원가입 선택
		System.out.println(" ");
		System.out.print("아이디를 입력하세요🐻 : ");
		inputId = scanner.next();
		System.out.print("비밀번호를 입력하세요🐻 : ");
		inputPassword = scanner.next();
		System.out.print("닉네임을 입력하세요🐻 : ");
		inputNickname = scanner.next();

		user[usernum] = new User(inputId, inputPassword, inputNickname);
		usernum++;

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userFile));) {
			oos.writeObject(user);
			System.out.println(" ");
			System.out.println("    ✷ 　 　　✧ 　 · ");
			System.out.println(" ˚        *   ✧   .");
			System.out.println(" *　　 * ⋆ 　 *      ✷    .");
			System.out.println(" · 　　 ⋆ 　🐻가입완료🐻˚ ˚ 　　 ✦ ");
			System.out.println(" ⋆ ·      *  　✧         *");
			System.out.println(" 　 ⋆ ✧　 　 · 　 ✧　✵");
			System.out.println(" ·      ✵");
			System.out.println(" ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void loginAccount() { // 로그인 선택
		System.out.println(" ");
		System.out.print("아이디를 입력하세요🐻 : ");
		inputId = scanner.next();
		System.out.print("비밀번호를 입력하세요🐻 : ");
		inputPassword = scanner.next();
		int loginSuccess = 0;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userFile))) {
			Object obj = ois.readObject();
			User[] users = (User[]) obj;
			for (User user : users) {
				if (user.getId() == null) {
					break;
				}
				if (inputId.equals(user.getId()) && inputPassword.equals(user.getPassword())) {
					System.out.println(" ");
					System.out.println("╭╼|══════════|╾╮");
					System.out.println("   로그인 성공");
					System.out.println("╰╼|══════════|╾╯");
					System.out.println(user.getNickname() + "님, 어서오세요 ! ");
					System.out.println();
					loginSuccess = 1;
					StartGame.startGame(); // 게임 시작
					break;
				}
			}
			if (loginSuccess == 0)
				System.out.println("로그인 실패🐻");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void lookAccount() { // 사용자조회 선택

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userFile))) {
			Object obj = ois.readObject();
			User[] users = (User[]) obj;
			for (User user : users) {
				if (user == null || user.getId() == null || user.getPassword() == null || user.getNickname() == null) {
					break;
				}
				System.out.println(user); // 회원 정보 출력
				System.out.println();
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void deleteAccount() { // 비밀번호변경 선택
		System.out.println(" ");
		System.out.print("아이디를 입력하세요🐻 : ");
		inputId = scanner.next();
		System.out.print("비밀번호 입력하세요🐻 : ");
		inputPassword = scanner.next();
		int deleteSuccess = 0;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userFile))) {
			Object obj = ois.readObject();
			User[] users = (User[]) obj;
			for (int i = 0; i < users.length; i++) {
				if (users[i] == null || users[i].getId() == null || users[i].getPassword() == null
						|| users[i].getNickname() == null) {
					break;
				}
				if (inputId.equals(users[i].getId()) && inputPassword.equals(users[i].getPassword())) {
					try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userFile));) {
						System.out.print("변경할 비밀번호를 입력하세요🐻 : ");
						inputNewPassword = scanner.next();
						users[i].setPassword(inputNewPassword);
						oos.writeObject(users);
						System.out.println(" ");
						System.out.println("🐻변경 완료🐻");
						deleteSuccess = 1;
					}
					break;
				}
			}
			// for (User user : users) {
			// if (user == null || user.getId() == null || user.getPassword() == null ||
			// user.getNickname() == null) {
			// break;
			// }
			// if (inputId.equals(user.getId()) && inputPassword.equals(user.getPassword()))
			// {
			// try (ObjectOutputStream oos = new ObjectOutputStream(new
			// FileOutputStream(userFile, true));) {
			// System.out.print("변경할 비밀번호를 입력하세요🐻 : ");
			// inputNewPassword = scanner.next();
			// user.setPassword(inputNewPassword);
			// oos.writeObject(user);
			// System.out.println(" ");
			// System.out.println("🐻변경 완료🐻");
			// deleteSuccess = 1;
			// }
			// break;
			// }
			// }
			if (deleteSuccess == 0)
				System.out.println("사용자 조회 실패🐻");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		// System.out.print("변경할 비밀번호를 입력하세요🐻 : ");
		// inputPassword = scanner.next();
		// int deleteSuccess = 0;
		// for (int i = 0; i < user.length; i++) {
		// if (inputId.equals(user[i].getId()) &&
		// inputPassword.equals(user[i].getPassword())) {
		// System.out.println("🐻변경 완료🐻");
		// user[i].setId(null);
		// user[i].setPassword(null);
		// user[i].setNickname(null);
		// deleteSuccess = 1;
		// }
		// }
		// if (deleteSuccess == 0)
		// System.out.println("🐻변경완료🐻");
	}

}

// - [ ] 로그인
// - 회원가입 (아디, 비번, 이름 입력) + 곰돌이 분양받기 (곰돌이 이름, 성별 입력)
// - 아이디 조회 (회원 이름 입력하고 아이디 조회하기)
// - 비밀번호 변경
// - 곰돌이 정보 수정 (이름, 성별 등)
// - 회원 정보파일 / 곰돌이 정보파일 입출력 - 회원가입했을때 아이디, 비번, 이름 파일을 하나 생성 / 만약 비번변경시 이 파일의
// 비밀번호 변경
