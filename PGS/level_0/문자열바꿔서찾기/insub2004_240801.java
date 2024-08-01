package PGS.level_0.문자열바꿔서찾기;

public class insub2004_240801 {
    public int solution(String myString, String pat) {

        char[] ch = myString.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : ch) {
            if (c == 65) {
                sb.append("B");
            } else {
                sb.append("A");
            }
        }

        return sb.toString().contains(pat) ? 1 : 0;
    }
    public static void main(String[] args) {

    }
}
