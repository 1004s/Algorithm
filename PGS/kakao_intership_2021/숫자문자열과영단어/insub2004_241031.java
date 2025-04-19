package PGS.kakao_intership_2021.숫자문자열과영단어;

import java.util.Map;

public class insub2004_241031 {

    private static Map<String, Integer> map = Map.of("zero",0,
            "one",1,"two",2,"three",3,"four",4,"five",5,"six",6,"seven",7,
             "eight",8,"nine",9);

    public static int solution(String s) {
        for (String key : map.keySet()) {
            if (s.contains(key)) {
                s = s.replaceAll(key, String.valueOf(map.get(key)));
            }
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneightsevenseven"));
    }
}
