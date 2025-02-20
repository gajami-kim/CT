class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone(); //arr 복사
        
        for(int[] query : queries) {
            int i = query[0];
            int j = query[1];
            
            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }
            
        return answer;
    }
}