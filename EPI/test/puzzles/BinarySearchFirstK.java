package puzzles;

import java.util.List;

/**
 * Created by Pankaj on 7/14/15.
 */
public class BinarySearchFirstK {
    /*
    Assumes list is sorted.
     */
    public <T extends Comparable<T>> int binarySearchFirstK(List<T> ls, T k){
        int l = 0, h = ls.size()-1, mid, index = -1;
        while(l<=h){
            mid = l + (h-l)/2;
            int c = ls.get(mid).compareTo(k);
            if(c == -1){
                l = mid+1;
            }
            else if(c == 1){
                h = mid-1;
            }
            else{
                index = mid;
                h = mid-1;
            }
        }
        return index;
    }
}
