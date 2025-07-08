import java.util.*;

class Solution {
    public List solution(int[] fees, String[] records) {
        Queue<Car> inPq = new PriorityQueue<>((a, b) -> a.number.compareTo(b.number));
        Queue<Car> outPq = new PriorityQueue<>((a, b) -> a.number.compareTo(b.number));
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> total = new HashMap<>();
        
        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int perTime = fees[2];
        int perFee = fees[3];
        
        for(String record : records) {
            String[] strArr = record.split(" ");
            
            int time = getMinutes(strArr[0]);
            String number = strArr[1];
            String io = strArr[2];
            
            if("IN".equals(io)) inPq.add(new Car(number, time));
            else outPq.add(new Car(number, time));
            
        }
        
        // 전체 이용 시간 세팅
        while(!inPq.isEmpty()) {
            Car inCar = inPq.poll();
            
            int fee = 0;
            int inTime = inCar.getTime();
            String inNumber = inCar.getNumber();
            
            if(!outPq.isEmpty() && inNumber.equals(outPq.peek().getNumber())) { // 일치하는 outPq가 존재하는 경우
                Car outCar = outPq.poll();
                int outTime = outCar.getTime();
                String outNumber = outCar.getNumber();
                
                if(total.containsKey(inNumber)) {
                    int time = total.get(inNumber);
                    total.replace(inNumber, time + (outTime - inTime));
                } else {
                    total.put(inNumber, outTime - inTime);
                }
                

            } else {
                if(total.containsKey(inNumber)) {
                    int time = total.get(inNumber);
                    total.replace(inNumber, time + 1439 - inTime);
                } else {
                    total.put(inNumber, 1439 - inTime);
                }
                
            }
            
        }
        
        List<String> carList = new ArrayList<>(total.keySet());
        Collections.sort(carList); // 차량 번호 오름차순
        
        for (String carNum : carList) {
            int totalTime = total.get(carNum);
            int fee = calculateFee(totalTime, defaultTime, defaultFee, perTime, perFee);
            answer.add(fee);
        }
        
        return answer;
    }
    
    public int getMinutes(String beforeTime) {
        int hour = Integer.parseInt(beforeTime.split(":")[0]);
        int minutes = Integer.parseInt(beforeTime.split(":")[1]);
        
        minutes = hour * 60 + minutes;
        return minutes;
    }
    
    private int calculateFee(int totalTime, int defaultTime, int defaultFee, int perTime, int perFee) {
        if (totalTime <= defaultTime) return defaultFee;

        int extraTime = totalTime - defaultTime;
        int units = (int)Math.ceil(extraTime / (double)perTime);
        return defaultFee + units * perFee;
    }

}

class Car {
    String number;
    int time;
    
    public Car(String number, int time) {
        this.number = number;
        this.time = time;
    }
    
    public String getNumber() {
        return number;
    }
    
    public int getTime() {
        return time;
    }
}