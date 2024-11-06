package soyeon.PGS;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = yellow + brown;
        
        for(int i = 3; i < total; i++){
            for(int j = i; j < total; j++){                
                if((i * j == total) && ((i - 2) * (j - 2) == yellow)){
                    // 가로가 더 커야 하니까 순서 바꾸기
                    answer[0] = j;
                    answer[1] = i;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}