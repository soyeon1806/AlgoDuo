public class 최댓값과_최솟값 {
    public String solution(String s) {
        String answer = "";
        
        String[] num = s.split(" ");

        int[] number = new int[num.length];
        for(int i = 0; i < num.length; i++){
            number[i] = Integer.parseInt(num[i]);
        }
        
        int min = number[0];
        int max = number[0];
        
        for(int i = 1; i < number.length; i++){
            if(number[i] < min){
                min = number[i];
            }
            if(number[i] > max){
                max = number[i];
            }
        }
        
        answer = Integer.toString(min) + " " + Integer.toString(max);
        
        return answer;
    }
}