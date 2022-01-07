package MurderCase_In_SMHRD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ƽ�Ű ��Ʈ�� ������ ���λ�� ����� BGM(�����ϰ� ��ο�)'
		MurderDAO dao = new MurderDAO();
		Delay time = new Delay();
		Scanner sc = new Scanner(System.in);
		Quiz quiz = new Quiz();
		Image image = new Image();
		MusicPlayer music = new MusicPlayer();
		int cnt = 0;
		
//		String path = Main.class.getResource("").getPath();
//		System.out.println(path+"music/badEnding.mp3");
		
		// ����
		music.goodEnding();
		image.imageTitle();
		time.timeDelay(1200);
		System.out.println("\n\n���� ���� ���� ��ó�� �̽��͸��� ������ ���� ��...\n");
		time.timeDelay(1200);
		System.out.println("���� ���� �������� ���λ�� ������ ���Դ�!\n");
		time.timeDelay(1200);
		System.out.println("����� ���λ���� ������ ������ ��� ����!\n");
		time.timeDelay(1200);
		System.out.println("�̶� ���� ���ᰡ ����� �̸��� �θ���!!\n\n");

		String choice = "";
		int temp = 0;
		String temp2 = "";
		String id = "";
		String pw = "";
		String nick = "";

		while (true) {
			System.out.println("������ ã�Ƴ� ����� �̸���??");
			System.out.println("[1] ȸ������ [2] �α���");
			System.out.print("�Է� >> ");
			choice = sc.next();

			if (choice.equals("1")) {
				System.out.println("ȸ������! ���ο� ����� ȯ���մϴ�!!");
				while (true) {
					System.out.print("����� ���̵� �Է��ϼ��� >> ");
					id = sc.next();

					boolean checkPbk = id.equals("pbk") || id.equals("PBK") || id.equals("Pbk")
							|| id.equals("hodoodaddy") || id.equals("HODOODADDY") || id.equals("Hodoodaddy")
							|| id.equals("�ں���") || id.equals("������") || id.equals("ȣ�ξƺ�") || id.equals("������")
							|| id.equals("����") || id.equals("������") || id.equals("�ں�����");

					if (checkPbk) {
						System.out.println("����� �� ���� ���̵� �Դϴ�. �ٸ� ���̵� �Է����ּ���!\n");
					} else if (id.equals(dao.checkId(id))) {
						System.out.println("�ߺ��� ���̵� �Դϴ�. �ٸ� ���̵� �Է����ּ���!");
					} else {
						break;
					}
				}

				System.out.print("��й�ȣ�� �Է��ϼ��� >> ");
				pw = sc.next();
				while (true) {
					System.out.print("����� �г����� �Է��ϼ��� >> ");
					nick = sc.next();

					boolean checkPbk = nick.equals("pbk") || nick.equals("PBK") || nick.equals("Pbk")
							|| nick.equals("hodoodaddy") || nick.equals("HODOODADDY") || nick.equals("Hodoodaddy")
							|| nick.equals("�ں���") || nick.equals("������") || nick.equals("ȣ�ξƺ�") || nick.equals("������")
							|| nick.equals("����") || nick.equals("������") || nick.equals("�ں�����");

					if (checkPbk) {
						System.out.println("����� �� ���� �г��� �Դϴ�. �ٸ� �г����� �Է����ּ���!\n");
					} else {
						break;
					}
				}

				temp = dao.join(id, pw, nick);
				if (temp > 0) {
					System.out.println("ȸ������ ����!\n");
					break;
				} else {
					System.out.println("ȸ������ ����!\n");
				}

			} else if (choice.equals("2")) {
				System.out.println("����� ȯ���մϴ�! �α����� ���ּ���!");
				System.out.print("���̵� �Է��ϼ��� >> ");
				id = sc.next();
				System.out.print("��й�ȣ�� �Է��ϼ��� >> ");
				pw = sc.next();

				temp2 = dao.login(id, pw);
				if (temp2 != null) {
					System.out.println(temp2 + " ����� �ݰ����ϴ�!\n");
					nick = temp2;
					break;
				} else {
					System.out.println("�α��� ����!\n");
				}

			} else {
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
			}
		}

		while (true) {
			System.out.println("\n[1]�����ϱ� [2]�ҷ����� [3]��ŷ����");
			System.out.print("�Է� >> ");
			choice = sc.next();

			if (choice.equals("1")) {
				System.out.println("\n\n���ο� ������ �����մϴ�.\n");
				dao.deleteClue(id);
				dao.deleteCount(id);
//				dao.getClue(1, id);
//				dao.getClue(2, id);
				break;
			} else if (choice.equals("2")) {
				if (dao.showCount(id) == 0) {
					System.out.println("����� ������ �����ϴ�. '[1]�����ϱ�'�� �����ϼ���. \n");
				} else {
					System.out.println("���� ������ �̾ �����մϴ�.\n");
					cnt = dao.showCount(id);

					break;
				}

			} else if (choice.equals("3")) {
				System.out.println("��ŷ�� Ȯ���մϴ�\n");
				dao.ranking();

			} else {
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
			}

		}

		if (music.isPlaying() == true) {
			music.stopMusic();
		}

		if (choice.equals("1")) {

			// opening
			music.playScream();
			image.imageIntro();

			System.out.println("[���ѷα�]\n");
			System.out.println("�� �������� ������ ����� ��...\n");
			time.timeDelay(1200);
			System.out.println("����� ��ģ ���� �̲��� �������� �ö󰬴�..\n");

			System.out.println("�ε�!!!!!!!"); // BGM + ��ü �ƽ�Ű��Ʈ

			time.timeDelay(1200);
			music.playRain();

			System.out.println("������ �п��� ��Ÿ �������� �˸��޴� ���翴�� PBK\n");
			System.out.println("�װ� �δ��� �ְ����� �߰ߵǾ���!");
			time.timeDelay(1200);
			System.out.println("��Ȳ�� ����� �ǿ���� ��踦 ����߸��� ��ü ������ �ٰ����µ�...\n\n");
			time.timeDelay(1200);

			while (true) {
				System.out.println("��ü�� Ȯ���Ͻðڽ��ϱ�? [�⺻������ ���ź��⸦ ���� Ȯ���� �� �ֽ��ϴ�]");
				System.out.println("[1] ���׸޼��� [2] ����� ��ó [3] �������� [4] �ʿ� ���� ����ƽ [5] ���̾� ���� [6] �Ѿ��\n");
				System.out.print("�Է� >> ");
				choice = sc.next();

				System.out.println("\n");

				if (choice.equals("1")) {
					image.imageDie();
					System.out.println("����� ��ü ������ �ٰ�����. PBK�� �� �þ��� �� ���� � �޼����� �ִ�");
					time.timeDelay(1300);
					System.out.println("�ױ����� ���ο� ���� ������ �������� ���� ����...\n");
					time.timeDelay(1300);
					// ���׸޼����� �����ֱ⸸ �ϰ� ���̺� ���� X
				} else if (choice.equals("2")) {
					image.imageIntro();
					System.out.println("\n�����ڴ� ���帰 ä �׾��ִ�. ������� ���캸�� ū Ȥ�� �ھ��ִ�. " + "������ �ڿ��� �׸� ������ ���ϱ�?");
					time.timeDelay(1300);
					System.out.println("�׷��� ���� �� �ֺ��� ��ó�� ����� �ʿ� ���� ���ڱ��� ���� �����δ� " + "���������� ���������� �𸥴�.\n");
					time.timeDelay(1300);
					// �ʱ����� ����� ���� ��ó
				} else if (choice.equals("3")) {
					image.imageWatch();
					System.out.println("\n������ ��ü ��ó�� ��׷��� ���� ���̴� ���� ���ڰ� �κη��� �ִ�. ");
					time.timeDelay(1200);
					System.out.println("����� ���� ���� ���� ��½ �鿩�� ���� ��¦�̴� �ð谡 ���δ�.");
					System.out.println("���� ���� ���ڿ� �ո�ð��� �� ����.\n");
					time.timeDelay(1200);
					// �ʱ� ���� �������� �� �� �ð�
				} else if (choice.equals("4")) {
					image.imagelip();
					System.out.println("\n����� �򰥸����� ���ϰ� �ٸ� ���� �ڱ��� �������� ���ǿ� �����ִ�. �Լ� ����� " + "�ڱ�... �̰��� �����ϱ�?\n");
					time.timeDelay(1300);
					// �ʱ� ���� ����ƽ �ڱ�
				} else if (choice.equals("5")) {
					image.imageRing();
					System.out.println("\n�����ڴ� �ױ��� � ���ڿ� ����ģ ���ϱ�? ���� ������ ��ó�� �� �ٸ� ������ ���δ�. "
							+ " ��Ҽӿ����� �� ���� ���� ���� �ϳ� ���� ���̴� ���̾ƹ����� �߰��Ѵ�. ����� ��ĩ �����.\n");
					time.timeDelay(1300);
					// �ʱ� ���� ���̾� ����
				} else if (choice.equals("6")) {
					System.out.println("\n����� ��� ������ �߽����� ���󿡼� ��� ������ �Ű��Ѵ�.\n");
					System.out.println("[���ѷα� ����]\n ������ �����մϴ�.\n");
					break; // skip
				}
			}

			System.out.println(".");
			time.timeDelay(500);
			System.out.println(".");
			time.timeDelay(500);
			System.out.println(".");
			time.timeDelay(500);

			System.out.println(
					"����� �����ڰ� �ִ� ��Ҹ� �����Ͽ� �����ڸ� �߱��� �� �ֽ��ϴ�. \n" + "�߱��� ���� �������Ÿ� �߰��ϰų� �� ��Ҹ� Ž���Ͽ� �������Ÿ� �߰��� �� �ֽ��ϴ�.\n\n");

		} ////////// �����ϱ� ������ if�� ���� //
		time.timeDelay(3000);

		if (music.isPlaying() == true) {
			music.stopMusic();
		}

		dao.showOpening();
		dao.showClue(id);
		dao.showCount(id);
		System.out.println();

		while (true) {
			dao.save(cnt, id);
			System.out.println("\n����� ������ �����߽��ϴ�.");
			System.out.println("[1] Ž�� [2] �������� [3] ���ź��� [4] ������ ���� [5] ���� [6] ���� ");
			System.out.print("�Է� >> ");
			choice = sc.next();
			cnt++;
			System.out.println("\n");

			if (choice.equals("1")) {
				// Ž��
				System.out.println("Ž���� ��Ҹ� �����ϼ���.");
				System.out.println("[1] �ްԽ� [2] ����� [3] ���� [4] ���ǽ� [5] ������");
				System.out.print("Ž���� ��� �Է� >> ");
				choice = sc.next();
				music.playWalk();
				System.out.println("\n\n");

				if (choice.equals("1")) {
					// �ްԽ�
					while (true) {
						System.out.println("\n�ްԽǿ� �ڻ�� �л��� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.next();
						cnt++;
						System.out.println("\n");

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// ���ΰ��� ��ȭ - �⺻����
							music.playPushing();

							System.out.println(nick + " : " + "����� PBK ��ü ���ʹ߰��� �Դϱ�?");
							System.out.println("��� :��... 10�� 40�� �Ѿ ���� ������ PBK��������...�ý��ϴ�...\n");
							time.timeDelay(1300);
							System.out.println(nick + " : " + "���󿡴� �� �ö󰡼̳���?");
							System.out.println("��� : PBK������ ��ǥ �ڷḦ �غ��ϴٰ� �ٶ� �� �� �� �ö󰣰Ű�..\n");
							System.out.println("\t�������� ���� 8�� 40�� ���� ��ü �߰� ������ ���⼭ ��� �۾����̾����ϴ�.");

							if (dao.checkClue(15, id) == 15) {

							} else {
								dao.getClue(15, id);
							}

							// �߰� ����
							if (dao.checkClue(4, id) == 4 || dao.checkClue(10, id) == 10) {
								time.timeDelay(2000);
								System.out.println("\n\n" + nick + " : " + "��ξ� �߰��� ���� ���Ű� �ֽ��ϴ�! "
										+ "\n ����ϴٴ� �������δ� ��ξ��� ���� ������ ���� �����! ");
								time.timeDelay(1300);
								System.out.println("��� : ��? ���� ���� �ǽ��Ͻó���? ���� 6�ð��� �������� �ٹ��ϴ� �� ������� �� ���������...");
								System.out.println("\t������ ���� ����ڸ��� �ֽñ�� ����ؼ� ���������� ������ ���ϰ� �ֽ��ϴ�!\n");
								System.out.println("\t�����ͼ� �������� ���̴� �� ���� ���� ���� �ɱ��? �������� �� �ʿ��� ���Դϴ�!! ���� ����ؿ�!\n");
								time.timeDelay(2000);
								System.out.println(nick + " : �˸����̸� �������ֽ� ���� �����ʴϱ�? ");
								System.out.println("��� : ��, �װ�... ");
								time.timeDelay(1300);
								System.out.print(
										"��! �ֱٿ� �ڳ���������̶� PBK�������� ũ�� ������ ���� �ý��ϴ�! \n " + "\t�ڳ��� ������� ���������� �𸨴ϴ�!");
								time.timeDelay(1300);

								if (dao.checkClue(11, id) == 11) {

								} else {
									dao.getClue(11, id);
								}
							}

						} else if (choice.equals("2")) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1]������ ���� [2]�������� [3]�޽Ŀ� ��Ʈ ");
							System.out.print("�Է� >> ");
							choice = sc.next();
							cnt++;
							System.out.println("\n");

							if (choice.equals("1")) {
								// ������
								System.out.println("������ ������ ���캻��.");
								System.out.println("�ƹ��͵� ����.\n");

							} else if (choice.equals("2")) {
								// ��������-����
								music.playGrope();
								System.out.println("�ްԽ� ���������� ���캻��.");

								if (dao.checkClue(4, id) == 4) {
									System.out.println("���Ÿ� �̹� ȹ���߽��ϴ�.");

								} else {
									if (quiz.quizCafe() == true) {
										dao.getClue(4, id);

										System.out.println("���Ÿ� ȹ��!!\n");
										image.imageBlade();
									} else {
										System.out.println();

									}
								}

//								} else {
//									System.out.println("���� ȹ�� ����!!");
//								}

							} else if (choice.equals("3")) {
								// �޽Ŀ� ��Ʈ
								music.playGrope();
								System.out.println("��Ʈ�� ���캸�Ҵ�.");
								System.out.println("ħ���� å ��� ���δ�.\n");
								//
							} else {
								System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
							}

						} else if (choice.equals("3")) {
							System.out.println("������ �����ϴ�.\n\n");
							music.playWalk();
							break;
						} else {
							System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
						}

					}
				} else if (choice.equals("2")) {

					while (true) {
						// �����
						System.out.println("����ǿ� �ڳ��� ������ �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.next();
						cnt++;
						System.out.println("\n");

						if (music.isPlaying() == true) {
							music.stopMusic();
						}
						if (choice.equals("1")) {

//							 ���ΰ��� ��ȭ
//							 boolean true false ��ȯ
//							 true(���Ű� ���� ��)
							// �߰�����
							music.playPushing();
							System.out.println(nick + " : �����, ���� �� ������ �帮�ڽ��ϴ�. (�°� ��ǰ��.. �ſ� ȭ���� ��Ÿ���̱�..)");
							System.out.println("���� : ���� ������ ���� �ǽ��Ͻô°ǰ���? ���ƿ�. ������ �������.\n");
							time.timeDelay(1300);
							System.out.println(nick + " : ��� �����ڿ� ���� ��� ���� �ϼ̽��ϱ�?");
							System.out.println(
									"���� : �� �ǹ����� ������ ���� ���߾��. �׷��� ������ ��������. \n" + "\t��û���� �ʴٸ� ���� �׿��� �Ŷ�� �������� �ʰ���?!\n");
							time.timeDelay(1300);

							if (dao.checkClue(16, id) == 16) {

							} else {
								dao.getClue(16, id);
							}

							// �߰� ����
							if (dao.checkClue(5, id) == 5 || dao.checkClue(8, id) == 8 || dao.checkClue(11, id) == 11) {
								time.timeDelay(2000);
								System.out.println(
										"\n\n" + nick + " : ���ݱ��� �˾ƺ� �ٷδ� �ֱٿ� �������� pbk ���̿� �� ū ������ �־��µ�, �װͰ���.. ");
								System.out.println(
										"���� : ���� ��� ����ǿ� �־����! �߿��� ������Ʈ�� �־ 9�� 15�п��� 10�� 20�б��� ���⼭ ��û�������� ȸ�����̾��ٱ���!\n");
								time.timeDelay(1300);
								System.out.println("���� : �̰� �ð� �����! ���� �� ������ �� �ǽ��� ���׿�!\n"
										+ "\t��... ��ư, ���� �� ��� PBK�� ���÷� ���� �ִµ��ٰ�, ���� �ִ� �� ������?\n\t�и� ���� �־����. ������ �ӾƵ� ���� ������.\n");
								time.timeDelay(1300);
								if (dao.checkClue(12, id) == 12) {

								} else {
									dao.getClue(12, id);
								}
							}

						} else if (choice.equals("2")) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1] ����� ���� ��ǻ��  [2] Ŀ�ٶ� å��  [3] å�� ���� ");
							System.out.print("�Է� >> ");
							choice = sc.next();
							cnt++;
							System.out.println("\n");

							if (choice.equals("1")) {
								// ����� ��ǻ��-����
								cnt++;
								music.playButten();
								image.imageDesktop();
								System.out.println("����� ������ǻ�Ϳ� �����մϴ�.");
								System.out.println("\n[��й�ȣ ��Ʈ]");

								if (dao.checkClue(5, id) == 5) {
									System.out.println("���Ÿ� �̹� ȹ���߽��ϴ�.");

								} else {
									if (quiz.quizKing() == true) {
										image.imagePayDoc();
										System.out.println("���Ÿ� ȹ��!!\n");
										dao.getClue(5, id);
									} else {
										System.out.println("���� ȹ�� ����!!");

									}

								}

							} else if (choice.equals("2")) {
								// å��
								System.out.println("Ŀ�ٶ� å���� ���캻��.");
								System.out.println("å���� ��û ����.\n");

							} else if (choice.equals("3")) {
								// ����� å�� ����
								cnt++;
								music.playDrawerOpen();
								System.out.println("���� å���� ������ �����.");
								System.out.println("������ �ڹ���� ����ְ� ���� ��Ʈ�� ���� ���̰� �ִ�.");

								System.out.println("\n[��й�ȣ ��Ʈ]");

								if (dao.checkClue(8, id) == 8) {
									System.out.println("���Ÿ� �̹� ȹ���߽��ϴ�.");
								} else {

									if (quiz.quizKing2()) {
										image.imageDeposit();
										System.out.println("���Ÿ� ȹ��!!\n");
										dao.getClue(8, id);
									} else {

									}

								}

							} else {
								System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
							}

						} else if (choice.equals("3")) {
							System.out.println("������ �����ϴ�.\n\n");
							music.playWalk();
							break;
						} else {
							System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
						}

					}
				} else if (choice.equals("3")) {

					while (true) {
						// ����
						System.out.println("\n���ǿ� ������ ��� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.next();
						cnt++;
						System.out.println("\n");

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// ���ΰ��� ��ȭ - �⺻����
							music.playPushing();
							System.out.println(nick + " : ��������, ���� �� ���� �帮�ڽ��ϴ�.(��ġ�� ũ��... �������� ���� ����ϱ�.)");
							System.out.println("���� : (�ǰ��� ǥ��) �������̽ʴϱ�..? ���� ������.. ��ģ���� �׾��ٰ��.\n");
							time.timeDelay(1300);
//						 ���ΰ��� ��ȭ
//						 boolean true false ��ȯ
//						 true(���Ű� ���� ��)
							// �߰�����
							System.out.println(nick + " : �����ڿ��� ����� ����ϱ�?");
							System.out.println("���� : ���� PBK�� �ʵ��л������� ģ���Դϴ�. ���� ���� ������ �ƴϿ���.\n");
							time.timeDelay(1300);
							System.out.println(nick + " : �׷�����, 9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
							System.out.println("���� : ���� �ǹ� ��ü�� �������̾����ϴ�. 1������ 4������... ���ǽǿ����� ���϶� �������� ������, "
									+ "\n�����ǿ��� ������ �������� �־����ϴ�.\n");
							time.timeDelay(1300);

							if (dao.checkClue(17, id) == 17) {

							} else {
								dao.getClue(17, id);
							}

							if (dao.checkClue(6, id) == 6 || dao.checkClue(12, id) == 12) {
								// ���ų� ������ ������ �߰��� ���� �� �ִ� ��������
								// �߱��Ҷ��� pushing ���� �ٰ���?
								time.timeDelay(2000);
								System.out.println("\n\n���� : ���� PBK�� ������ ���� �޾ҽ��ϴ�. ���� ������ �ƴմϴ�.");
								System.out.println("���� ���϶� �������� �ǽɵ˴ϴ�. �׺� ������ PBK�� ���̹��̿���.\n");
								time.timeDelay(1300);
								System.out.println(nick + " : ���϶� �����԰� PBK ���̰� ���� �ʳ���?");
								System.out.println("���� : ��, �ֱٿ��� �� �� �����Ϸ��� �ֽ�µ�, PBK�� �� �ɷ� �˰� �ֽ��ϴ�. \n");
								time.timeDelay(1300);
								System.out.println(nick + " : Ȥ�� ���� ���� �׻� ����ֽ��ϱ�? ���� ������ �Ͻó���?");
								System.out.println("���� : �ʿ��� ���� ������... ������ �����ǿ��� �մϴ�.\n");
								time.timeDelay(1300);
								System.out.println(nick + " : PBK�� �������� �ŷ��� �־�����?");
								System.out.println("���� : ... ���� ��Ȳ�� ����� �� ģ���� ���� ������ �� ���Դϴ�. �� �����߱���.\n");
								time.timeDelay(1300);
								System.out.println(nick + " : ����� ��Ȳ�� ������ٸ� Ȥ�� ���� ���Ƚ��ϱ�? �� �ݾ��� �󸶳� �Ǵ°���?");
								System.out.println("���� : (���� ȭ�� ����)���� �׷��ͱ��� ��� �ؾ��ϳ���? ���̻� ���� ���� �ʰڽ��ϴ�!\n");

								if (dao.checkClue(13, id) == 13) {

								} else {
									dao.getClue(13, id);
								}
							}

						} else if (choice.equals("2")) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1]���� CCTV [2]���� å�� ���� [3]�������� ���� ");
							System.out.print("�Է� >> ");
							choice = sc.next();
							System.out.println("\n");

							if (choice.equals("1")) {
								// ���� �����
								System.out.println("\n���� CCTV�� ���캻��.");
								System.out.println("�ްԽ�, ������, ���ǽ�, ����ǿ� �Ѹ� ����� �ִ�.");

							} else if (choice.equals("2")) {
								// ���� å�� ����
								music.playOpen();
								System.out.println("���� å�� ������ �����.");
								System.out.println("������ �ɰ����� ����ִ�.");

							} else if (choice.equals("3")) {
								// �������� ����
								cnt++;
								music.playGrope();
								System.out.println("\n�������� ������ �����ִ�.");
								System.out.println("�߿��غ��̴� ������ ���δ�.\n");

								if (dao.checkClue(6, id) == 6) {
									System.out.println("���Ÿ� �̹� ȹ���߽��ϴ�.");

								} else {
									if (quiz.quizSecu()) {
										image.imageRent();
										System.out.println("\n���Ÿ� ȹ��!!\n");
										dao.getClue(6, id);
									} else {
										System.out.println("\n���� ȹ�� ����!!");
									}
								}
							} else {
								System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
							}

						} else if (choice.equals("3")) {
							System.out.println("������ �����ϴ�.\n\n");
							music.playWalk();
							break;

						} else {
							System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
						}

					}
				} else if (choice.equals("4")) {

					while (true) {
						// ���ǽ�
						System.out.println("\n���ǽǿ� ���϶� �������� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						choice = sc.next();
						cnt++;
						System.out.println("\n");

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// ���ΰ��� ��ȭ
							music.playPushing();
							System.out.println(nick + " : ���϶�, ���� �� ������ �帮�ڽ��ϴ�.(�Ҹ��� ���ƺ��̴� ��)");
							System.out.println("�϶� : (¥������ ǥ��) Ȥ�� PBK������ ���̳���?\n");
							time.timeDelay(1300);

							System.out.println(nick + " : �����ڿ��� ����� ����ϱ�?");
							System.out.println("�϶� : ���� PBK�� ���е�â���� ���� ���Ό��. ������ ���̴� �� ���Ҿ��.\n");
							time.timeDelay(1300);
							System.out.println(nick + " : 9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
							System.out.println("�϶� : ��ȩ�� ����� ���� ��� ģ���� ��ȭ���̾����. ģ������ �������.\n");

							if (dao.checkClue(18, id) == 18) {

							} else {
								dao.getClue(18, id);
							}
							
							// �߰�����
							if (dao.checkClue(7, id) == 7 || dao.checkClue(13, id) == 13) {
								// ���ų� ������ ������ �߰��� ���� �� �ִ� ��������
								time.timeDelay(2000);

								System.out.println("\n\n������ ������ �ð��� ���� ������ �������� �����غ��°� ���?");
								time.timeDelay(1300);
								System.out.println(nick + " : ������ ������? �׺��� �� �ǽ��Ͻô� ����?");
								System.out.println("�϶� : ���� ��ȭ�ϱ� ���� ��� PBK�� ã�ƴٳ���. ��ҿ��� ���� �Ѿƴٳ��."
										+ "\n\t���� ������ �þ��. ��� PBK���� ����Ŀ�� �־��µ� �и��� �� ���ڿ���. ��ҿ��� ������ ���ϴٱ���.\n");
								time.timeDelay(1300);
								System.out.println(nick + " : �����ϴ� ���������� �����Ƴ���?");
								System.out.println("�϶� : ��. �� ����� ���� ���ְ���, �и� �� ��� �Ƿ� ������.\n");
								time.timeDelay(1300);
								System.out.println(nick + " : ���󿡴� �� ���Űǰ���? ��ȭ�Ҷ�?");
								System.out.println("�϶� : ���� �Ȱ���. �űⰡ�� ����Ǵ� ����鸸 �־.\n");
								time.timeDelay(1300);
								System.out.println(nick + " : " + "Ȥ�� �϶� �������� ���� �Ͻó���?");
								System.out.println("�϶� : �ƴϿ� �� ��� ������ �Ⱦ ��� ��ó�� �� ���� ����̿���."
										+ "�л����̶� ���� ������ �־�� �ϴµ� �� ���� ������ ǳ��� �ȵ���.");

								if (dao.checkClue(14, id) == 14) {

								} else {
									dao.getClue(14, id);
								}
							}

						} else if (choice.equals("2")) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1] ���ǽ� ��ǻ�� [2] ���ǽ� å�� ��  [3] �л��� å�� ��  ");
							System.out.print("�Է� >> ");
							choice = sc.next();
							System.out.println("\n");
							cnt++;
							if (choice.equals("1")) {
								// ���ǽ� ��ǻ��
								music.playButten();
								System.out.println("���ǽ� ��ǻ�Ϳ� �����غ���.");
								System.out.println("������ ���� ��ȭ������ �ִ�.");

							} else if (choice.equals("2")) {
								// ���ǽ� å�� ��
								music.playGrope();
								System.out.println("���ǽ� å�� ���� ���캻��.");
								cnt++;

								if (dao.checkClue(7, id) == 7) {
									System.out.println("���Ÿ� �̹� ȹ���߽��ϴ�.");
								} else {

									if (quiz.quizLec()) {
										image.imageCiga();
										System.out.println("���Ÿ� ȹ��!!\n");
										dao.getClue(7, id);
									} else {
										System.out.println("���� ȹ�� ����!!");
									}

								}

							} else if (choice.equals("3")) {
								// �л��� å�� ��
								System.out.println("�л��� å�� ���� ���캻��.");
								System.out.println("�л��� ������� �׿��ִ�.");

							} else {
								System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
							}

						} else if (choice.equals("3")) {
							System.out.println("������ �����ϴ�.\n\n");
							music.playWalk();
							break;

						} else {
							System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
						}

					}
				} else if (choice.equals("5")) {

					while (true) {
						// ������
						System.out.println("\n�����ǿ� ������ �������� �ֽ��ϴ�.");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("[1] ������ �߱��ϱ� [2] ���� ã�� [3] �ǵ��ư���");
						System.out.print("�Է� >> ");
						cnt++;
						choice = sc.next();
						System.out.println("\n");

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						if (choice.equals("1")) {
							// ���ΰ��� ��ȭ
							music.playPushing();
							System.out.println(nick + " : " + "��������, ���� �� ������ �帮�ڽ��ϴ�.(ȭ���� ���ϳ�..)");
							System.out.println("���� : (������ �긮��..) ����� ������ �� ����ּ���...�ʹ� ���ۿ�...����\n");
							time.timeDelay(1300);
//							 ���ΰ��� ��ȭ
							// �߰�����
							System.out.println(nick + " : " + "�����ڿ��� ����� ����ϱ�?");
							System.out.println("���� : ���� PBK �� �ʹ� �����ؿ�. �����ϰ� ���� ���� ���� �����߾��....\n");
							time.timeDelay(1300);
							System.out.println(nick + " : " + "Ȥ�� ��ҿ��� ������ ����ƽ�� ��� �Ͻó���?");
							System.out.println("���� : �ַ� ������ �������̿�. ���� �������� �� ��︮�ŵ��.\n");
							time.timeDelay(1300);
							System.out.println(nick + " : 9�� �ݺ��� 10�ñ��� ������ �ϼ���?");
							System.out.println("���� : �� ���... 9�� 20�п� PBK �������� ������... ������ ����! �� �� ������ ��ư�̴ٱ���!");
							time.timeDelay(1300);
							System.out.println(nick + " : " + "��.. �׷��ٸ� �������� ����ִ� ������ ������ ����ڽñ���.");
							System.out.println("���� : �׷��� �����Ͻô� �� ���ΰ� �ǳ׿�.. ���� �������� ������ ������ ���ٴ�.. ���� �⻵��..\n");
							time.timeDelay(1300);
							System.out.println(nick + " : " + "(����..�������ΰ�?)... �� �׸��� ��� ������? �� ���Ŀ�");
							System.out.println("���� : �� �ٷ� �����ǿ� ���ƿ� ��� �۾��߾��. �� ��ǻ�� ������ ���ŵ� ���ƿ�!\n");
							
							if (dao.checkClue(19, id) == 19) {

							} else {
								dao.getClue(19, id);
							}

							if (dao.checkClue(3, id) == 3 || dao.checkClue(9, id) == 9 || dao.checkClue(14, id) == 14) {
								// ���ų� ������ ������ �߰��� ���� �� �ִ� ��������
								time.timeDelay(2000);

								System.out.println("\n\n���� : ����� �׷��� �����ǿ� ������ ���� ���谡 ������ �־����.\n");//
								time.timeDelay(1300);
								System.out.println(nick + " : " + "���� ����� �������� �����Ͻô� �ǰ���?");
								System.out.println(
										"���� : ���� �����ϴ� �� �ƴϰ� ���� ������ ���� ���� �Ѵ�ϴ�. �׻� ���� ����� �����Կ� �־��µ� ���ϱ� �������.\n");
								time.timeDelay(1300);
								System.out.println("����... ��� �л��� �ǽɰ���... PBK ������ �۾��� �����شٰ�� �ϴµ� �ʹ� ��� �پ ���� �ϰŵ��..\n");//
								System.out.println(nick + " : Ȥ�� �������� ������ �����ϴ� ���� �̻��� ������ ������ �ֳ���?");
								System.out.println("���� : ���� ������ ����� ... �̷��� ��... �׷��׿�...\n");

								if (dao.checkClue(10, id) == 10) {

								} else {
									dao.getClue(10, id);
								}
							}

						} else if (choice.equals("2")) {
							// ����ã��
							System.out.println("���Ÿ� ã�� ��Ҹ� �����ϼ���");
							System.out.println("[1]�����Ե� å��  [2]������  [3]������ ĳ��� ");
							System.out.print("�Է� >> ");
							choice = sc.next();
							cnt++;
							System.out.println("\n");

							if (choice.equals("1")) {
								// �����Ե� å��
								music.playGrope();
								System.out.println("�����Ե� å���� ���캻��.");
								// QuizTeach2 �ӱ���
								cnt++;

								if (dao.checkClue(9, id) == 9) {
									System.out.println("���Ÿ� �̹� ȹ���߽��ϴ�.");
								} else {

									if (quiz.quizTeach1() == true) {
										image.imageMug();
										System.out.println("���Ÿ� ȹ��!!\n");
										dao.getClue(9, id);
									} else {
										System.out.println("���� ȹ�� ����!!");
									}
								}

							} else if (choice.equals("2")) {
								// ������
								cnt++;
								music.playCabinetOpen();
								System.out.println("�������� �����.");
								System.out.println("����ִ� ���� �ִ�.");

								// QuizTeach ������ ����
								if (dao.checkClue(3, id) == 3) {
									System.out.println("���Ÿ� �̹� ȹ���߽��ϴ�.");
								} else {

									if (quiz.quizTeach2()) {
										image.imageKey();
										System.out.println("���Ÿ� ȹ��!!\n");
										System.out.println("�������� ���󿭼谡 ����� �ִ�. ������ ���󿭼踦 �������� ���̴�. \n"
												+ "���� ����� ����...���� �����ϴ� ���ϱ�? ������ ���� ������ ������?");
										dao.getClue(3, id);
									} else {
										System.out.println("���� ȹ�� ����!!");
									}
								}

							} else if (choice.equals("3")) {
								// ������ ĳ���
								music.playCabinetOpen();
								System.out.println("�����Ե� ĳ����� ���캻��.");
								System.out.println("���� ����ִ�.");
							} else {
								System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
							}

						} else if (choice.equals("3")) {
							System.out.println("������ �����ϴ�.\n\n");
							music.playWalk();
							break;
						} else {
							System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
						}

					}
				}
			} else if (choice.equals("2")) {

				// ���� ����
				music.playCatch();
				System.out.println("\n\n������ �����Ͻðڽ��ϱ�? ��ȸ�� �� �� ��!!");
				System.out.println("[���н� ���ݱ����� ��� ������ �ʱ�ȭ�˴ϴ�] ");
				System.out.print("\n������ ���� �����Ͻðڽ��ϱ�? \n [1]�� [2]�ƴϿ� >> ");
				choice = sc.next();
				System.out.println("\n");

				if (choice.equals("1")) {
					System.out.println("\n������ �����ϼ���");
					System.out.println("[1] �ڻ�� [2] �ڳ��� [3] ������ [4] ���϶� [5] ������");
					System.out.print("�Է� >> ");
					int criminal = sc.nextInt();

					if (criminal == 3) {

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						music.goodEnding();
						System.out.println("���� �˰� ����!!");
						System.out.println("������ PBK�� ģ�� ģ�� ���� ������ �Դϴ�.\n");
						time.timeDelay(2000);
						System.out.println(
								"�������� PBK�� �������� �������� ���������� �ž��� ������ ���� \n" + "��Ȱ�� �ô޸��� ��, �ᱹ ģ�� PBK���� �ž��� ���� ������.\n");
						time.timeDelay(2000);
						System.out.println(
								"ó������ PBK�� �������� �ſ� ���� ������, \n" + "���� �ڽ��� ���� ����ϰ� �����ϴ� PBK�� �µ��� ū �г븦 ������ �ȴ�.\n");
						time.timeDelay(2000);
						System.out.println("�׷��� ����� PBK�� ������ ���� ������� ���ϰ� �䱸�ϰ�, \n "
								+ "�������� ���� ���� �� ���ٰ� ������ ���� PBK�� ��ģ�弳�� �׸� �ͺ��Ѵ�.\n");
						time.timeDelay(2000);
						System.out.println("�������� �г�� �������� �׸� ���ϰ� �о���, pbk�� ���� ������� ũ�� �ε����� �����ϰ� �ȴ�.\n"
								+ "�׸��� ��Ȳ�� �״� Ŀ��Į�� ���� �浶���� �����Ͽ� pbk�� �����ϰ� ���� .\n");
						time.timeDelay(2000);
						System.out.println("�������� �ްԽ� �����뿡 Ŀ��Į�� ������ û�ҽð��� ���������� �ϰ� " + "�ٸ� ����� �����ڰ� �� �� �ְ� ���󿭼踦 �����.");
						dao.saveRanking(id, nick, cnt);
						dao.deleteClue(id);
						dao.deleteCount(id);
						time.timeDelay(100000);

						break;

					} else if (criminal == 1 || criminal == 2 || criminal == 4 || criminal == 5) {

						if (music.isPlaying() == true) {
							music.stopMusic();
						}

						music.badEnding();
						System.out.println("���� �˰ſ� �����Ͽ����ϴ�...\n [���ݱ��� ����� ��� ����� �����Ǿ����ϴ�]");
						dao.deleteClue(id);
						dao.deleteCount(id);
						break;

					} else {
						System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
					}

				} else if (choice.equals("2")) {

					if (music.isPlaying() == true) {
						music.stopMusic();
					}

				} else {
					System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
				}

				///
			} else if (choice.equals("3")) {
				dao.showClue(id);
				System.out.println("\n");

			} else if (choice.equals("4")) {
				dao.showOpening();
				System.out.println("\n");

			} else if (choice.equals("5")) {
				dao.save(cnt, id);
				System.out.println("����Ǿ����ϴ�.\n");

			} else if (choice.equals("6")) {
				// ����
				if (music.isPlaying() == true) {
					music.stopMusic();
				}

				System.out.println("������ �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�. �ٽ� �������ּ���\n");
			}

		}

	}

}