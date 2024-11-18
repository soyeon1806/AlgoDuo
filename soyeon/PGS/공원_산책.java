public class 공원_산책 {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int x = -1;
        int y = -1;
        int height = park.length;
        int width = park[0].length();
        
        for(int i = 0; i < height; i++){
            if(park[i].indexOf('S') != -1){
                x = park[i].indexOf('S');
                y = i;
                break;
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            String[] tmp = routes[i].split(" ");
            String direction = tmp[0];
            int distance = Integer.parseInt(tmp[1]);
            int curX = x;
            int curY = y;
            
            boolean flag = true;
            
            switch(direction){
                case "E":
                    for(int j = 0; j < distance; j++){
                        curX++;
                        if(curX >= width){
                            flag = false;
                            break;
                        }
                        else if(park[curY].charAt(curX) == 'X'){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        x = curX;
                    }
                    break;
                    
                case "W":
                    for(int j = 0; j < distance; j++){
                        curX--;
                        if(curX < 0){
                            flag = false;
                            break;
                        }
                        else if(park[curY].charAt(curX) == 'X'){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        x = curX;
                    }
                    break;
                    
                case "N":
                    for(int j = 0; j < distance; j++){
                        curY--;
                        if(curY < 0){
                            flag = false;
                            break;
                        }
                        else if(park[curY].charAt(curX) == 'X'){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        y = curY;
                    }
                    break;
                    
                case "S":
                    for(int j = 0; j < distance; j++){
                        curY++;
                        if(curY >= height){
                            flag = false;
                            break;
                        }
                        else if(park[curY].charAt(curX) == 'X'){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        y = curY;
                    }
                    break;
            }
        }
        
        answer[0] = y;
        answer[1] = x;
        
        return answer;
    }
}
