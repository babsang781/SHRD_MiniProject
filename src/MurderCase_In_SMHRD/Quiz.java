package MurderCase_In_SMHRD;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Quiz {

	boolean correct = false;

	public boolean quizTeach1() {
		// 머그와 립스틱 자국
		correct = false;
		String temp2 = "";
		System.out.println("머그잔이 하나 놓여있다. 자세히 보시겠습니까?");
		System.out.println("머그잔에 묻어있는게 무엇일까? 세가지 영어 단어를 찾아 입력하세요!");
		System.out.println("힌트! _ _ _   _ _ _   _ _ _ _ _");
		System.out.println("D A D E O");
		System.out.println("I E B C L");
		System.out.println("Y Y R O I");
		System.out.println("E A L E P");
		System.out.println("K C I T S");
		Scanner sc = new Scanner(System.in);

		System.out.print("답을 입력하세요 >> ");
		String answer = sc.nextLine();
		temp2 = answer.replaceAll(" ", "");

		if (temp2.equals("REDLIPSTICK") || temp2.equals("redlipstick")) {
			System.out.println("머그잔의 얼룩... 어디선가 본 익숙한 색깔이다! " + "옥상 열쇠는 보통...누가 관리하는 것일까? 범인이 아직 가지고 있을까?");
			correct = true;
		} else {
			System.out.println("오답!! 증거를 수집 할 수 없습니다!");
			System.out.println();
		}
		return correct;
	}

	public boolean quizTeach2() {
		correct = false;
		System.out.println("\n문제를 맞추어 어떤 열쇠가 사라졌는지 알아내자!");
		System.out.println("이름의 순서와 숫자를 보고 열쇠 이름을 맞추자! 네글자의 모든 초성을 조합하여 열쇠의 이름을 맞추세요!");
		String kje = "김지은";
		String psm = "박상민";
		String pny = "박나영";
		String shr = "서하라";
		String jhd = "장현도";
		Scanner sc = new Scanner(System.in);

//		System.out.printf("1." + kje + "\t" + jhd + "\t" + psm);
		System.out.printf("1. %s\t%s\t%s\n", kje, jhd, psm);
//		System.out.println(" " + "3-1"+ "\t" + "3-2" + "\t" + "1-3\n");
		System.out.printf("   %s\t%s\t%s\n", "3-1", "3-2", "1-3");

//		System.out.println("2." + psm + "\t" + shr + "\t" + pny);
		System.out.printf("2. %s\t%s\t%s\n", psm, shr, pny);
//		System.out.println(" " + "2-1" + "\t" + "2-2" + "\t" + "3-1\n");
		System.out.printf("   %s\t%s\t%s\n", "2-1", "2-2", "3-1");

//		System.out.println("3." + psm + "\t" + jhd + "\t" + shr);
		System.out.printf("3. %s\t%s\t%s\n", psm, jhd, shr);
//		System.out.println(" " + "2-3" + "\t" + "2-2" + "\t" + "3-1\n");
		System.out.printf("   %s\t%s\t%s\n", "2-3", "2-2", "3-1");

//		System.out.println("4." + shr + "\t" + jhd + "\t" + kje);
		System.out.printf("4. %s\t%s\t%s\n", shr, jhd, kje);
//		System.out.println(" " + "1-1" + "\t" + "3-2" + "\t" + "1-2");
		System.out.printf("   %s\t%s\t%s\n", "1-1", "3-2", "1-2");
		System.out.println(" ");

		System.out.print("답을 입력하세요 (4글자) >> ");
		String answer = sc.next();

		if (answer.equals("옥상열쇠")) {
			correct = true;
		} else {
			System.out.println("오답!! 증거를 수집 할 수 없습니다!");
			System.out.println();

		}

		return correct;

	}

	public boolean quizLec() {
		// 퀴즈를 맞추어 증거물을 획득하세요!
//		증거물과 관련된 단어로 할것
//		[ S,  M,  O,   K,   I,  N,  G ]
//		[ 1,   2,   3,   4,  5,  6,   7 ]
//		알파벳 을 보고 단어 유추 , 맞으면 증거물 획득  => 담배 모양 그림 보이기  OR 못하면 다시 문제 제시
		correct = false;
		Scanner sc = new Scanner(System.in);

		System.out.println(" 문제를 맞추어 증거를 획득하세요. ");
		System.out.println("     I = 5 ");
		System.out.println("     M = ( ? ) "); // 2
		System.out.println("     O = 3 ");
		System.out.println("     G = 7 ");
		System.out.println("     S = 1 ");
		System.out.println("     K = 4 ");
		System.out.println("     N = 6 ");

		System.out.println(" 물음표(?)에 들어갈 것은 ? ");
		System.out.print("( ? )입력 >> ");
		int answer1 = sc.nextInt();

		if (answer1 != 2) {
			System.out.println("다시 해봐요~~~");

		}
		if (answer1 == 2) {

			System.out.println(" 배열 좀 아시네~~~");
			System.out.println(" 알파벳을 조합하여 단어를 맞춰주세요.");
			System.out.print(" 단어 입력 >> ");
			String answer2 = sc.next();
			if (answer2.equals("smoking") || answer2.equals("SMOKING")) {
				System.out.println("오!!! 영어 좀 하는데~~");
				System.out.println("결정적 증거를 획득하셨습니다.");
				correct = true;
			} else {
				System.out.println("다시 맞춰주세요!!");
			}
		}

		return correct;
	}

	public boolean quizSecu() {
		correct = false;
		int[] a = { 70, 114, 105, 101, 110, 100 }; // Friend
//		int[] b = { 82, 105, 118, 97, 108 }; // Rival
//		int[] c = { 76, 111, 118, 101 }; // Love
//		int[] d = { 76, 97, 98, 111, 114 }; // Labor
//		int[] e = { 77, 111, 110, 101, 121 }; // Money

		// int count = 0; //문제를 틀린횟수

//		String[] 정답 = { "Labor", "Rival", "Love", "Friend", "Money" };
//		getRandom(b);
//		getQ("Rival");
//		getRandom(c);
//		getQ("Love");
//
//		getRandom(d);
//		getQ("Friend");
//		getRandom(e);
//		getQ("Money");

		Random random = new Random();
		int[] array1 = new int[a.length];
		int x = 0;

		for (int i = 0; i < array1.length; i++) {
			x = random.nextInt(array1.length);

			array1[i] = a[x];

			for (int j = 0; j < i; j++) {
				if (array1[i] == array1[j]) {
					i--;
				}
			}
		}
		System.out.println();
		for (int j = 0; j < array1.length; j++) {
			System.out.print(array1[j] + " ");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("아스키코드를 참고하여 위 넘버를 해독하시오\n입력>>");
		String Q = sc.next();
		if (Q.equals("Friend")) {
			System.out.println("맞췄다!");
			System.out.println("힌트를 획득 했습니다");
			correct = true;

		} else {

			System.out.println("오답이다");
			System.out.println("힌트를 획득하지 못했다...");

		}
		return correct;
	}

	public boolean quizCafe() {
		correct = false;
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int count = 0;
		while (correct == false && count < 6) {
			System.out.print("\n[덜컹덜컹, 쓰레기통에 뭔가 버려진 것 같다. 그런데 녹슨 번호 자물쇠로 잠겨있고 퀴즈가 적혀있다.]\n"
					+ "[(넌센스) 다음 수열의 다음에 올 숫자를 맞추시오],[0]포기\n" + "[ 1 , 11 , 12 , 1121 , 122111 ,   ?   ]\n>> ");
			count++;
			answer = sc.nextInt();

			if (answer == 112213) {
				System.out.println("\n[딸깍, 자물쇠가 풀렸습니다]\n['증거물: 불그스름한 녹슨 커터칼' 을(를) 습득하였습니다.]");
				correct = true;
			} else if (answer == 0) {
//			turn +=count;
				break;
			} else {
				if (count > 5) {
					System.out.println("[딸깍, 자물쇠가 망가진 것 같다.]\n ['증거물: 불그스름한 녹슨 커터칼' 을(를) 습득하였습니다.]");
				} else {
					System.out.println("\n[끼릭,끼릭, 자물쇠가 열리지 않는다. 번호가 틀린 것 같다.]");
				}
			}
//			turn +=count;
		}

		return correct;
	}

	public boolean quizKing() {
		correct = false;
		// 기존에 있던 Tread 클래스 파일 삭제
		Scanner sc = new Scanner(System.in);
		System.out.println("(77*1)+(76*2)+(75*3)+...+(1*77)를 계산하는 코드의 빈칸을 채우시오");
		System.out.println("int sum = 0; for(int i = 1; i <= 77; i++){ sum += (      ) }System.out.println(sum);");
		String answer = sc.nextLine();
		String temp2 = answer.replaceAll(" ", "");

		if (temp2.equals("i*(78-i)") || temp2.equals("(78-i)*i") || temp2.equals("(-i+78)*i")
				|| temp2.equals("i*(-i+78)")) {
			correct = true;
		}

//		sc.close();
		return correct;
	}

	public boolean quizKing2() {
		correct = false;
		// 기존에 있던 Tread 클래스 파일 삭제
		Scanner sc = new Scanner(System.in);
		System.out.println("10!(팩토리얼) 값을 계산하는 코드의 빈칸을 채우시오");
		System.out.println("int sum = 1; for(int i = 1; i <= 10; i++){ sum ( ) i;}System.out.println(sum);");
		
		String answer = sc.nextLine();
//		String txt = sc.next();
		String temp2 = answer.replaceAll(" ", "");

		if (temp2.equals("*=") || temp2.equals("=sum*")) {
			correct = true;
		}

//		sc.close();
		return correct;
	}

}
