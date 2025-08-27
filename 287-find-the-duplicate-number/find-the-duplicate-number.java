class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                return key;  
            }
        }
        return -1; 
    }
}

