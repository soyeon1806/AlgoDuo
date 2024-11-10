import java.util.Stack;

public class 짝지어_제거하기 {

    /*
     * 정확성 테스트는 통과하지만, 효율성 테스트에서 시간 초과 발생
     * 
     * public int solution(String s)
     * {
     *   StringBuilder sb = new StringBuilder(s);
     *   boolean removed;
     *   
     *   do{
     *       removed = false;
     *       for(int i = 1; i < sb.length(); i++){
     *           if(sb.charAt(i) == sb.charAt(i - 1)){
     *               sb.delete(i - 1, i + 1);
     *               removed = true;
     *               break;
     *           }
     *       }
     *   } while(removed);
     *   
     *   return sb.length() == 0 ? 1 : 0;
     * }
     */

    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}
