class Solution {
    public boolean containsDuplicate(int[] nums) {
// set use becuse set have property that same elements are not repeated, it only comes one so I used this login to just check this also there is one more logic which I can use is after converting actual array to set we can compare the size of set and array if different which means it have some repeated element
        Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;    
    }
}
