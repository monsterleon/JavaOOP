import model.Student;
public class main {
    public static void main(String[] args) {
        Student test = new Student("小张",18,"男","1");
        System.out.println(test.getName()+""+test.getAge()+""+test.getGender()+""+test.getIdNo());
    }
}
