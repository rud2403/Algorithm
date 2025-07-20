import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Data> list = new ArrayList<>();
        List<Data> filtered = new ArrayList<>();
        
        for(int[] e : data) {
            list.add(new Data(e[0], e[1], e[2], e[3]));
        }
        
        for(Data l : list) {
            if("code".equals(ext) && l.getCode() < val_ext) filtered.add(l);
            if("date".equals(ext) && l.getDate() < val_ext) filtered.add(l);
            if("maximum".equals(ext) && l.getMaximum() < val_ext) filtered.add(l);
            if("remain".equals(ext) && l.getRemain() < val_ext) filtered.add(l);
        }
        
        int[][] answer = new int[filtered.size()][4];
        
        if("code".equals(sort_by)) filtered.sort(Comparator.comparingInt(Data::getCode));
        if("date".equals(sort_by)) filtered.sort(Comparator.comparingInt(Data::getDate));
        if("maximum".equals(sort_by)) filtered.sort(Comparator.comparingInt(Data::getMaximum));
        if("remain".equals(sort_by)) filtered.sort(Comparator.comparingInt(Data::getRemain));
        
        for(int i=0; i < filtered.size(); i++) {
            answer[i][0] = filtered.get(i).getCode();
            answer[i][1] = filtered.get(i).getDate();
            answer[i][2] = filtered.get(i).getMaximum();
            answer[i][3] = filtered.get(i).getRemain();
        }
        
        return answer;
    }
}

class Data {
    int code, date, maximum, remain;
    
    public Data(int code, int date, int maximum, int remain) {
        this.code = code;
        this.date = date;
        this.maximum = maximum;
        this.remain = remain;
    }
    
    public int getCode() {
        return this.code;
    }
    
    public int getDate() {
        return this.date;
    }
    
    public int getMaximum() {
        return this.maximum;
    }
    
    public int getRemain() {
        return this.remain;
    }
}