package PGS.level_0.공백으로구분하기2;

import java.util.ArrayList;
import java.util.List;

public class insub2004_240801 {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split(" ");
        List<String> list = new ArrayList<>();

        for (String s : answer) {
            if (!s.equals("")) {
                list.add(s);
            }
        }

        String[] s = new String[list.size()];
        // my_string.trim().split("//s+"); 또는 my_string.trim().split("[ ]+");
        return list.toArray(s);
    }

    public static void main(String[] args) {
        char a = ' ';
        int i = (int) a;
        System.out.println(i);
    }
}
