import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputStudent in = new InputStudent();
        OutPutAboutme out = new OutPutAboutme();
        String regExp = "^[가-힇]*$";

        String name = "";
        String major = "";

        while (true) {
            System.out.printf("이름 입력 : ");
            name = sc.nextLine();
            System.out.printf("학과 입력 : ");
            major = sc.nextLine();
            if (name.matches(regExp) && major.matches(regExp)) {
                break;
            } else {
                System.out.println("전공과 이름은 한글로만 입력하세요");
            }
        }
        System.out.printf("자기소개 입력 : ");
        String myinfo = sc.nextLine();



        in.setName(name);
        in.setMajor(major);
        in.setMyInfo(myinfo);

        out.about(in.getName(), in.getMajor(), in.getMyInfo());
    }
}