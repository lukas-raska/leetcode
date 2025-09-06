package leetcode.easy.task_3516_find_closest_person;

public class Solution3516 {

    public int findClosest2(int x,
                           int y,
                           int z) {
        int xz = (x > z) ? x - z : z - x;
        int yz = (y > z) ? y - z : z - y;
        return (xz == yz) ? 0 : ((xz < yz) ? 1 : 2);
    }

    public int findClosest(int x, int y, int z){
        int xz = Math.abs(x-z);
        int yz = Math.abs(y-z);
        return (xz == yz) ? 0 : ((xz < yz) ? 1 : 2);
    }


}
