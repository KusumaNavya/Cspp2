public class StudentDetails {
	private StudentDetails() {

	}
	public static void main(String[] args) {
		Student sangay = new Student("Sangay", "IT201985001", 7.5, 7.0, 8.0);
        System.out.println(sangay.gpa());
        Student bidhya = new Student("Bidhya", "IT201985003", 8.5, 6.0, 7.5);
        System.out.println(bidhya.gpa());
        Student kelzang = new Student("Kelzang", "IT201985065", 7.5, 8.0, 9.0);
        System.out.println(kelzang.gpa());
		
	}
}
	/*roll Number, Student Name, marks of three subjects.
 	*/
 class Student {
 	private String name;
 	private String rollnumber;
 	private double m1;
 	private double m2;
 	private double m3;
 	/*creating a constructor
 	 *
 	 */
 	public Student(String name, String rollnumber, double m1, double m2, double m3) {
 		this.name = name;
 		this.rollnumber = rollnumber;
 		this.m1 = m1;
 		this.m2 = m2;
 		this.m3 = m3;
 	}
 	public double gpa(){
 		return (m1 + m2 + m3) / 3;
 	}
}