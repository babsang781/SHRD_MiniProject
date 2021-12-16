package testIo;

import java.util.Scanner;

public class NewQuiz {

	public static void main(String[] args) {
		// 개미 수열 문제
		Scanner sc = new Scanner(System.in);
		int choice = 9;
		int turn = 0;

		while (choice != 0) {
			System.out.println();
			System.out.println("[휴게실]\n휴게실에는 학생대표 박상민 이(가) 있다. \n[무엇을 하겠습니까?]\n>> [1]증거찾기 [2]추궁하기 [0] 복도로 돌아가기");
			choice = sc.nextInt();

			if (choice == 1) {
				while (choice != 4) {
					System.out.println("\n[증거를 찾을 장소를 선택하세요]\n>> [1]정수기 뒤편 [2]쓰레기통 [3]휴식용 텐트 [4] 찾지 않는다.");
					choice = sc.nextInt();
					if (choice == 2) {
						if (quiz()) {
							continue;
						} else {

						}

					} else {
						System.out.println("\n[한참을 찾았지만 아무런 증거도 찾지 못했다. 다른 곳을 찾아보자.] \n");
					}
				}

			} else if (choice == 2) {
				int usertable증언2 = 0;
				int evidence2 = 0;

				if (usertable증언2 == 0 && evidence2 == 0) {
					System.out.println("(플레이어 명 : '상민씨, 어제 밤 10시 40분 경에 무엇을 하고 있었습니까?'");// get(i).getId()+
					System.out.println("상민 : '저는 그 때 휴게실에서 워크샵에 사용할 ppt를 만들고 있었습니다. "
							+ "하아... 하필이면 이런 때에... 빨리 ppt 만들어야 하는데...' ");

				} else if (true) { // usertable증언2==1 ||evidence2 ==1
					// System.out.println(get(i).getId()+"(): '상민씨, " + get(i).evidence() + " " +
					// get(i).evidence2()+ " 이(가) 있는데 아무런 이유가 없다고 하실 겁니까?!'");

					System.out.println("상민 : 네?!... 저.. 저는 결백합니다! 결코 제가 그런 일이 아닙니다! "
							+ "\n그... 아!.. 원장님, 박나영 원장님이 최근에 pbk와 싸웠습니다! "
							+ "\n원장실 밖까지 뭔가 고함이 나는 것 같았고, pbk가 화를 내면서 나왔었어요! 박나영 원장이 죽였지도 모릅니다! ");
				}
			}

			System.out.println();
		}
		sc.close();
	}

	public static boolean quiz() {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		boolean correct = false;
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
				if(count >5) {
					System.out.println("[딸깍, 자물쇠가 망가진 것 같다.]\n ['증거물: 불그스름한 녹슨 커터칼' 을(를) 습득하였습니다.]");
					}else {
						System.out.println("\n[끼릭,끼릭, 자물쇠가 열리지 않는다. 번호가 틀린 것 같다.]");
					}
			}
//			turn +=count;
			
		}

		return correct;
	}
}
