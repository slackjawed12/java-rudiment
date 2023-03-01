package chap11.example;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map =new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");
        map.put("eplf", "1234");

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = s.nextLine().trim();

            System.out.print("password : ");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("입력한 id가 존재하지 않습니다.");
                continue;
            }

            if(!(map.get(id)).equals(password)){
                System.out.println("비밀번호가 일치하지 않습니다.");
            } else {
                System.out.println("로그인 성공");
                break;
            }
        }
    }
}
