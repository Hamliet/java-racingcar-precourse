package view;

import domain.Car;

public class PrintMessage {
	private static boolean commaFlag = false;

	public static void inputName() {
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)");
	}

	public static void inputRound() {
		System.out.println("�õ��� ȸ���� ��ȸ�ΰ���?");
	}

	public static void printCar(Car[] car) {
		for (int i = 0; i < car.length; i++) {
			car[i].printCarStatus();
		}
		System.out.println();
	}

	public static void printResult(Car[] car, int maximumPosition) {
		for (int i = 0; i < car.length; i++) {
			printWinnerCarName(car[i], maximumPosition);
		}
		System.out.println("�� ���� ����߽��ϴ�.");
	}

	private static void printWinnerCarName(Car car, int maximumPosition) {
		if (car.getPosition() == maximumPosition && commaFlag == false) {
			System.out.print(car.getName());
			commaFlag = true;
			return;
		}
		if (car.getPosition() == maximumPosition && commaFlag == true) {
			System.out.print("," + car.getName());
			return;
		}
	}
}
