package advance.dev;

public class Student {
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private double averageScore;

	// Constructor
	public Student(String name, int age, String address, String phoneNumber, double averageScore) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.averageScore = averageScore;
	}

	// Phương thức set dữ liệu cho các thuộc tính và kiểm tra tính đúng đắn
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Tuổi phải là số nguyên lớn hơn 0.");
		}
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAverageScore(double averageScore) {
		if (averageScore >= 0) {
			this.averageScore = averageScore;
		} else {
			System.out.println("Điểm trung bình phải là số thực lớn hơn hoặc bằng 0.");
		}
	}

	// Phương thức get dữ liệu của các thuộc tính
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public double getAverageScore() {
		return averageScore;
	}
}
