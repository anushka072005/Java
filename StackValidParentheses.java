import java.util.Stack;

public class StackValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            // check opening bracket 
            if (ch == '{' || ch == '[' || ch == '(') {
                s.push(ch);
            }
            // check closing bracket
            else {
                if(s.isEmpty()) {
                    return false;
                }
                if(
                (s.peek() == '{' && ch == '}') || //{}
                (s.peek() == '[' && ch == ']') || //[]
                (s.peek() == '(' && ch == ')')) { //()
                    s.pop();
                }
                else {
                    return false;
                }

            }
        }

        // check stack isEmpty or not
        if(s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({[]}())";
        System.out.println(isValid(str));
    }
}
