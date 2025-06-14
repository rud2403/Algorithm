import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        PriorityQueue<Integer> roomEndTime = new PriorityQueue<>();        
        List<Reservation> reservations = new ArrayList<>();
        
        for(int i = 0; i < book_time.length; i++) {
            String start = book_time[i][0];
            String end = book_time[i][1];
            
            reservations.add(new Reservation(start, end));
        }
        
        Collections.sort(reservations);
        
        for(Reservation r : reservations) {
            if(!roomEndTime.isEmpty() && roomEndTime.peek() <= r.start) {
                roomEndTime.poll();
            }
            
            roomEndTime.offer(r.end + 10);
        }
        
        return roomEndTime.size();
    }
    
    class Reservation implements Comparable<Reservation> {
        int start;
        int end;

        public Reservation(String startTime, String endTime) {
            this.start = toMinutes(startTime);
            this.end = toMinutes(endTime);
        }

        @Override
        public int compareTo(Reservation o) {
            return this.start - o.start;
        }
    }
    
    public int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}

