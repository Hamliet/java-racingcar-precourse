package view;

import domain.Car;

public class PrintMessage {
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
}
