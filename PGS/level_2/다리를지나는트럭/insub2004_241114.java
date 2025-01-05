package PGS.level_2.다리를지나는트럭;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class insub2004_241114 {

    public static void main(String[] args) {
        System.out.println(solution(100,100,new int[]{10,10,10,10,10,10,10,10,10,10}));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        Deque<Integer> trucks = new LinkedList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            trucks.add(truck_weights[i]);
        }

        Deque<Integer> bridge = new ArrayDeque<>(bridge_length);

        int currentBridgeWeight = 0;
        int time = 0;

        while (!trucks.isEmpty()) {
            if (bridge.size() == bridge_length) {
                int pollBridgeTruck = bridge.pollFirst();
                currentBridgeWeight -= pollBridgeTruck;
            }
            int beforePollTruck = trucks.peek();
            if (weight < currentBridgeWeight + beforePollTruck) {       // 만약에 대기줄에 맨 앞에 있는 트럭 무게를 현재 다리에 놓았을 때 최대하중을 넘으면 0을 넣어서 밀어낸다.
                bridge.addLast(0);
            } else {    // 안넘으면
                int pollTruck = trucks.poll(); // 맨 앞에꺼 꺼내서
                currentBridgeWeight += pollTruck; // 현재 다리 무게 업데이트
                bridge.addLast(pollTruck);      // 트럭을 다리에 입장시키기
            }
            time++;
        }

        // 마지막에 bridge_length를 더해주는 이유는 다리에 남은 마지막 트럭이 다리를 완전히 통과하기 위한 시간까지 더하기 위함이다.
        // bridge 맨 뒤에 마지막 트럭이 들어가자마자 위의 while문이 끝나기 때문에 어떤 경우에도 bridge 상황은 맨 마지막 위치에 마지막 트럭이 위치해있다.
        // 마지막 트럭이 bridge를 통과하는 초는 bridge_length 만큼이다.
        return time + bridge_length;
    }
}
