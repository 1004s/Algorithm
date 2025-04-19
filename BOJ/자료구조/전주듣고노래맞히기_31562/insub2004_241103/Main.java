package BOJ.자료구조.전주듣고노래맞히기_31562.insub2004_241103;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        for (int i = 0; i < N; i++) {
            String[] songData = br.readLine().split(" ");
            map.put(songData[1], songData[2]+" "+songData[3]+" "+songData[4]);  // ( "TwinkleStar", "C C G" )
        }


        for (int i = 0; i < M; i++) {
            int cnt = 0;
            String name = "";
            String sound = br.readLine();
            for (String s : map.values()) {
                if (s.equals(sound)) {
                    name = getSongName(sound);
                    ++cnt;
                }
            }
            if (cnt == 0) {
                System.out.println("!");
            } else if (cnt >= 2) {
                System.out.println("?");
            } else {
                System.out.println(name);
            }
        }

    }

    public static String getSongName(String sound) {
        for (String title : map.keySet()) {
            String titleSound = map.get(title);
            if (titleSound.equals(sound)) {
                return title;
            }
        }

        return "";
    }
}
