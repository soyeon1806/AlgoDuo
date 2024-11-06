package soyeon.PGS;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = yellow + brown;
        
        for(int height = 3; height < total; height++){
            for(int width = height; width < total; width++){                
                if((height * width == total) && ((height - 2) * (width - 2) == yellow)){
                    answer[0] = width;
                    answer[1] = height;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}