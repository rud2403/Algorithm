class Solution {
    public String solution(String p) {
        // 0. 빈 문자열이면 그대로 반환
        if(p.isEmpty()) return p;
        
        // 1. 최소 균형 접두사로 u,  나머지를 v로 분리
        int cut = splitBalanced(p);
        String u = p.substring(0, cut);
        String v = p.substring(cut);
        
        // 2. u가 올바른 괄호 문자열이면: u + solution(v)
        if(isCorrect(u)) {
            return u + solution(v);
        }
        
        // 3. u가 올바르지 않으면: "(" + solution(v) + ")" + invert(u의 내부);
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(solution(v));
        sb.append(")");
        
        // u의 첫/마지막 문자 제거 후 뒤집어서 붙이기
        String inner = u.length() <= 2 ? "" : u.substring(1, u.length() - 1);
        sb.append(invert(inner));
        return sb.toString();
    
    }
    
    private int splitBalanced(String s) {
        int bal = 0;
        for(int i = 0; i < s.length(); i++) {
            bal += (s.charAt(i) == '(') ? 1 : -1;
            if(bal == 0) return i + 1;
        }
        
        return s.length();
    }
    
    private boolean isCorrect(String s) {
        int bal = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                bal++;
            } else {
                bal--;
                if(bal < 0) return false;
            }
        }
        return bal == 0;
    }
    
    private String invert(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for(int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) == '(' ? ')' : '(');
        }
        return sb.toString();
    }
}