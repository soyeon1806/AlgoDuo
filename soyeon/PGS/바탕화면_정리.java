public class 바탕화면_정리 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int top = -1;
        int bottom = -1;
        int left = -1;
        int right = -1;

        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    if(top == -1 ||top > i){
                        top = i;
                    }

                    if(left == -1 || left > j){
                        left = j;
                    }

                    if(right < j){
                        right = j;
                    }

                    if(bottom < i){
                        bottom = i;
                    }
                }
            }
        }

        answer[0] = top;
        answer[1] = left;
        answer[2] = bottom + 1;
        answer[3] = right + 1;

        return answer;
    }
}
