class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        // A, B측 최대 공약수 구하기
        for(int i = 1; i < arrayA.length; i++) {
            gcdA = GCD(gcdA, arrayA[i]);
            gcdB = GCD(gcdB, arrayB[i]);
        }
        
        // A측 최대공약수가 있는경우(1이상인 경우)
        int validA = isValid(gcdA, arrayB);
        int validB = isValid(gcdB, arrayA);
        
        return Math.max(validA, validB);
    }

    // 검증하기
    public static int isValid(int gcd, int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] % gcd == 0) {
                return 0;
            }
        }
        
        return gcd;
    }
    
    // 최대공약수 구하기
    public static int GCD(int a, int b){
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}