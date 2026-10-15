class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> kCount = new HashMap<>();

        for (int num : nums) {
            kCount.merge(num, 1, Integer::sum);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : kCount.keySet()) {
            int frequency = kCount.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList();
            }
            bucket[frequency].add(key);
        }

        int index = 0;
        int[] result = new int[k];

        for (int i = bucket.length - 1; i >= 0 && index < k; --i) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index++] = num;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
