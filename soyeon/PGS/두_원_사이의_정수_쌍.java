public class 두_원_사이의_정수_쌍 {
    public long solution(int r1, int r2) {
        long answer = 0;
        
        for(int i = 1; i <= r2; i++){
            int min_Y = (int)Math.ceil(Math.sqrt((long)r1 * r1 - (long)i * i));
            int max_Y = (int)Math.floor(Math.sqrt((long)r2 * r2 - (long)i * i));
            
            answer += max_Y - min_Y + 1;
        }
        
        return answer * 4;
    }
}