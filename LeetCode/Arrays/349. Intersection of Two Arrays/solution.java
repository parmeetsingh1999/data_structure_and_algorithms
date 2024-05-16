class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        for (Integer i : nums1)
        {
            hs.add(i);
        }

        for (Integer i : nums2)
        {
            if (hs.contains(i))
                intersect.add(i);
        }

        int size = intersect.size();
        int[] ans = new int[size];
        int index = 0;

        for (Integer i : intersect)
        {
            ans[index++] = i;
        }

        return ans;
    }
}
