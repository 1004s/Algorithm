package PGS.level_0.특정한문자를대문자로바꾸기;

public class insub2004_240801 {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();

        StringBuilder sb = new StringBuilder(my_string);
        for (int i = 0; i < sb.length(); i++) {
            if (alp.equals(String.valueOf(sb.charAt(i)))) {
                answer.append(alp.toUpperCase());
            } else {
                answer.append(sb.charAt(i));
            }
        }

        return answer.toString();
    }
}
