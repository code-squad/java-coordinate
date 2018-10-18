package lotto;

import java.util.*;
import java.lang.*;

public class RankingMap {
    Map<Rank,Integer> map = new HashMap<>();

    public RankingMap() {
        map.put(new Rank(6,false),1);
        map.put(new Rank(5,true),2);
        map.put(new Rank(5,false),3);
        map.put(new Rank(4,false),4);
        map.put(new Rank(3,false),5);
    }

    public int getRank(Rank rank){
        return map.get(rank);
    }

//    private <K, V> K getKey(Map<K, V> map, V value) {
//        for (Map.Entry<K, V> entry : map.entrySet()) {
//            if (value.equals(entry.getValue())) {
//                return entry.getKey();
//            }
//        }
//        return null;
//    }

//    public int getKey(int value) {
//        if (getKey(map, value) == null)
//            return 0;
//        return getKey(map, value);
//    }
}