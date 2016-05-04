package qLifeEvent.interview.solution;

import java.util.Iterator;
import java.util.List;

/**
 * https://leetcode.com/problems/flatten-2d-vector/
 * 
 * @author ql030422
 * 
 */
public class Solution_251 implements Iterator<Integer> {

    private final Iterator<List<Integer>> vec2d;
    private Iterator<Integer> vec1d;

    public Solution_251(final List<List<Integer>> vec2dList) {
        this.vec2d = vec2dList.iterator();
    }

    @Override
    public Integer next() {
        return vec1d.next();
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public boolean hasNext() {
        if (vec1d != null && vec1d.hasNext()) {
            return true;
        }

        while (vec2d.hasNext()) {
            final List sublist = vec2d.next();
            vec1d = sublist.iterator();
            if (vec1d.hasNext()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }
}
