import java.util.*;

class 요격시스템 {
    public int solution(int[][] targets) {
        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);
        int currEnd = -1;
        int answer = 0;
        
        for(int[] t: targets){
            if(currEnd == -1){
                answer++;
                currEnd = t[1];
                continue;
            }
            
            if(t[0] < currEnd){
                continue;
            }
            
            answer++;
            currEnd = t[1];
        }
        
        return answer;
    }
}