package MurderCase_In_SMHRD;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Quiz {

	boolean correct = false;

	public boolean quizTeach1() {
		// �ӱ׿� ����ƽ �ڱ�
		correct = false;
		String temp2 = "";
		System.out.println("�ӱ����� �ϳ� �����ִ�. �ڼ��� ���ðڽ��ϱ�?");
		System.out.println("�ӱ��ܿ� �����ִ°� �����ϱ�? ������ ���� �ܾ ã�� �Է��ϼ���!");
		System.out.println("��Ʈ! _ _ _   _ _ _   _ _ _ _ _");
		System.out.println("D A D E O");
		System.out.println("I E B C L");
		System.out.println("Y Y R O I");
		System.out.println("E A L E P");
		System.out.println("K C I T S");
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է��ϼ��� >> ");
		String answer = sc.nextLine();
		temp2 = answer.replaceAll(" ", "");

		if (temp2.equals("REDLIPSTICK") || temp2.equals("redlipstick")) {
			System.out.println("�ӱ����� ���... ��𼱰� �� �ͼ��� �����̴�! " + "���� ����� ����...���� �����ϴ� ���ϱ�? ������ ���� ������ ������?");
			correct = true;
		} else {
			System.out.println("����!! ���Ÿ� ���� �� �� �����ϴ�!");
			System.out.println();
		}
		return correct;
	}

	public boolean quizTeach2() {
		correct = false;
		System.out.println("\n������ ���߾� � ���谡 ��������� �˾Ƴ���!");
		System.out.println("�̸��� ������ ���ڸ� ���� ���� �̸��� ������! �ױ����� ��� �ʼ��� �����Ͽ� ������ �̸��� ���߼���!");
		String kje = "������";
		String psm = "�ڻ��";
		String pny = "�ڳ���";
		String shr = "���϶�";
		String jhd = "������";
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

		System.out.print("���� �Է��ϼ��� (4����) >> ");
		String answer = sc.next();

		if (answer.equals("���󿭼�")) {
			correct = true;
		} else {
			System.out.println("����!! ���Ÿ� ���� �� �� �����ϴ�!");
			System.out.println();

		}

		return correct;

	}

	public boolean quizLec() {
		// ��� ���߾� ���Ź��� ȹ���ϼ���!
//		���Ź��� ���õ� �ܾ�� �Ұ�
//		[ S,  M,  O,   K,   I,  N,  G ]
//		[ 1,   2,   3,   4,  5,  6,   7 ]
//		���ĺ� �� ���� �ܾ� ���� , ������ ���Ź� ȹ��  => ��� ��� �׸� ���̱�  OR ���ϸ� �ٽ� ���� ����
		correct = false;
		Scanner sc = new Scanner(System.in);

		System.out.println(" ������ ���߾� ���Ÿ� ȹ���ϼ���. ");
		System.out.println("     I = 5 ");
		System.out.println("     M = ( ? ) "); // 2
		System.out.println("     O = 3 ");
		System.out.println("     G = 7 ");
		System.out.println("     S = 1 ");
		System.out.println("     K = 4 ");
		System.out.println("     N = 6 ");

		System.out.println(" ����ǥ(?)�� �� ���� ? ");
		System.out.print("( ? )�Է� >> ");
		int answer1 = sc.nextInt();

		if (answer1 != 2) {
			System.out.println("�ٽ� �غ���~~~");

		}
		if (answer1 == 2) {

			System.out.println(" �迭 �� �ƽó�~~~");
			System.out.println(" ���ĺ��� �����Ͽ� �ܾ �����ּ���.");
			System.out.print(" �ܾ� �Է� >> ");
			String answer2 = sc.next();
			if (answer2.equals("smoking") || answer2.equals("SMOKING")) {
				System.out.println("��!!! ���� �� �ϴµ�~~");
				System.out.println("������ ���Ÿ� ȹ���ϼ̽��ϴ�.");
				correct = true;
			} else {
				System.out.println("�ٽ� �����ּ���!!");
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

		// int count = 0; //������ Ʋ��Ƚ��

//		String[] ���� = { "Labor", "Rival", "Love", "Friend", "Money" };
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
		System.out.print("�ƽ�Ű�ڵ带 �����Ͽ� �� �ѹ��� �ص��Ͻÿ�\n�Է�>>");
		String Q = sc.next();
		if (Q.equals("Friend")) {
			System.out.println("�����!");
			System.out.println("��Ʈ�� ȹ�� �߽��ϴ�");
			correct = true;

		} else {

			System.out.println("�����̴�");
			System.out.println("��Ʈ�� ȹ������ ���ߴ�...");

		}
		return correct;
	}

	public boolean quizCafe() {
		correct = false;
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int count = 0;
		while (correct == false && count < 6) {
			System.out.print("\n[���ȴ���, �������뿡 ���� ������ �� ����. �׷��� �콼 ��ȣ �ڹ���� ����ְ� ��� �����ִ�.]\n"
					+ "[(�ͼ���) ���� ������ ������ �� ���ڸ� ���߽ÿ�],[0]����\n" + "[ 1 , 11 , 12 , 1121 , 122111 ,   ?   ]\n>> ");
			count++;
			answer = sc.nextInt();

			if (answer == 112213) {
				System.out.println("\n[����, �ڹ��谡 Ǯ�Ƚ��ϴ�]\n['���Ź�: �ұ׽����� �콼 Ŀ��Į' ��(��) �����Ͽ����ϴ�.]");
				correct = true;
			} else if (answer == 0) {
//			turn +=count;
				break;
			} else {
				if (count > 5) {
					System.out.println("[����, �ڹ��谡 ������ �� ����.]\n ['���Ź�: �ұ׽����� �콼 Ŀ��Į' ��(��) �����Ͽ����ϴ�.]");
				} else {
					System.out.println("\n[����,����, �ڹ��谡 ������ �ʴ´�. ��ȣ�� Ʋ�� �� ����.]");
				}
			}
//			turn +=count;
		}

		return correct;
	}

	public boolean quizKing() {
		correct = false;
		// ������ �ִ� Tread Ŭ���� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("(77*1)+(76*2)+(75*3)+...+(1*77)�� ����ϴ� �ڵ��� ��ĭ�� ä��ÿ�");
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
		// ������ �ִ� Tread Ŭ���� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("10!(���丮��) ���� ����ϴ� �ڵ��� ��ĭ�� ä��ÿ�");
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
