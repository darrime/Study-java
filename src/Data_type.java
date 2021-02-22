import java.util.Locale;
import java.util.Scanner;

public class Data_type {
    public static void main(String[] args) {
        //원하는 문자 입력
        System.out.println("원하는 문자: ");
        Scanner sc1 = new Scanner(System.in);
        String strWant = sc1.next();
        //반복할 횟수 입력
        System.out.println("반복할 횟수: ");
        Scanner sc = new Scanner(System.in);
        int want = sc.nextInt();

        //결과 출력
        System.out.println("-------\n" + "결과\n" + "-------");
        Fun(want, strWant);
    }
    //결과 출력 함수(원하는 문자 반복하는 메소드)
    public static void Fun(int num, String wantStr){
        if(num == 0){
            return;
        } else {
            System.out.println(wantStr);
            Fun(num - 1, wantStr);
        }
    }
}
