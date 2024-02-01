class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int[] cur = new int[2];
        
        // 스타트 위치 잡기
        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[i].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    cur[0] = i;
                    cur[1] = j;
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++) {
            String act = routes[i].split(" ")[0];
            int num = Integer.parseInt(routes[i].split(" ")[1]);
            int[] tempCur = new int[2];
            tempCur[0] = cur[0];
            tempCur[1] = cur[1];
            
            for(int j = 0; j < num; j++) {
               if("E".equals(act)) {
                   if((park[tempCur[0]].length() - 1) >= (tempCur[1] + 1)) {
                     if(park[tempCur[0]].charAt(tempCur[1] + 1) == 'X') { // 장애물 만남
                         tempCur = cur;
                         break;
                     } else { // 진행
                         tempCur[1]++;
                     }
                     
                   } else { // 맵 밖으로 튀어 나감
                       tempCur = cur;
                       break;
                   }
                   
               } else if("W".equals(act)) {
                   if(0 <= (tempCur[1] - 1)) {
                     if(park[tempCur[0]].charAt(tempCur[1] - 1) == 'X') { // 장애물 만남
                         tempCur = cur;
                         break;
                     } else { // 진행
                         tempCur[1]--;
                     }
                     
                   } else { // 맵 밖으로 튀어 나감
                       tempCur = cur;
                       break;
                   }
               } else if("S".equals(act)) {
                   if((park.length - 1) >= (tempCur[0] + 1)) {
                     if(park[tempCur[0] + 1].charAt(tempCur[1]) == 'X') { // 장애물 만남
                         tempCur = cur;
                         break;
                     } else { // 진행
                         tempCur[0]++;
                     }
                     
                   } else { // 맵 밖으로 튀어 나감
                       tempCur = cur;
                       break;
                   }
               } else {
                   if(0 <= (tempCur[0] - 1)) {
                     if(park[tempCur[0] - 1].charAt(tempCur[1]) == 'X') { // 장애물 만남
                         tempCur = cur;
                         break;
                     } else { // 진행
                         tempCur[0]--;
                     }
                     
                   } else { // 맵 밖으로 튀어 나감
                       tempCur = cur;
                       break;
                   }
               }
            }
            cur = tempCur;
        }

        return cur;
    }
}