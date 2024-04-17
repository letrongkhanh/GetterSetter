package advance.dev;

import java.util.Scanner;

public class MainApp {
	// Phương thức input() nhập danh sách sinh viên từ bàn phím
	public static Student[] input() {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[10];

		System.out.println("Nhập thông tin cho 10 sinh viên:");

		for (int i = 0; i < 10; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			System.out.print("Tên: ");
			String name = scanner.nextLine();

			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine(); // Consume newline character

			System.out.print("Địa chỉ: ");
			String address = scanner.nextLine();

			System.out.print("Số điện thoại: ");
			String phoneNumber = scanner.nextLine();

			System.out.print("Điểm trung bình: ");
			double averageScore = scanner.nextDouble();
			scanner.nextLine(); // Consume newline character

			students[i] = new Student(name, age, address, phoneNumber, averageScore);
		}

		return students;
	}

	// Phương thức print() in ra danh sách sinh viên
	public static void print(Student[] students) {
		System.out.println("Danh sách sinh viên:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Thông tin sinh viên thứ " + (i + 1) + ":");
			System.out.println("Tên: " + students[i].getName());
			System.out.println("Tuổi: " + students[i].getAge());
			System.out.println("Địa chỉ: " + students[i].getAddress());
			System.out.println("Số điện thoại: " + students[i].getPhoneNumber());
			System.out.println("Điểm trung bình: " + students[i].getAverageScore());
			System.out.println();
		}
	}

	// Hàm sắp xếp mảng sinh viên theo thứ tự điểm trung bình tăng dần
	public static void sortByAverageScore(Student[] students) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - i - 1; j++) {
				if (students[j].getAverageScore() > students[j + 1].getAverageScore()) {
					// Swap students[j] and students[j+1]
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Student[] students = input();
		System.out.println("Danh sách sinh viên trước khi sắp xếp:");
		print(students);

		sortByAverageScore(students);
		System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm trung bình tăng dần:");
		print(students);
	}
}
