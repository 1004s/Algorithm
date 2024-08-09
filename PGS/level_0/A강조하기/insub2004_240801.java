package PGS.level_0.A강조하기;

public class insub2004_240801 {
    public String solution(String myString) {
        char[] ch = myString.toLowerCase().toCharArray();

        StringBuilder answer = new StringBuilder();
        for (char c : ch) {
            if (c == 'a') {
                answer.append('A');
            } else {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
