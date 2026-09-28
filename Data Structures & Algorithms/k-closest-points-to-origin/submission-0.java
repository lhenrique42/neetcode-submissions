class Solution {
    public int[][] kClosest(int[][] points, int k) {
        if (points == null || points.length == 0) {
            return points;
        }
        Map<Integer, Double> distances = new HashMap<>();

        for (int i = 0; i < points.length; ++i) {
            double distance = Math.sqrt(Math.pow((points[i][0]), 2) + Math.pow(points[i][1], 2));
            distances.put(i, distance);
        }

        Map<Integer, Double> sortedMap = distances.entrySet()
                                            .stream()
                                            .sorted(Map.Entry.comparingByValue())
                                            .collect(Collectors.toMap(
                                                Map.Entry::getKey,
                                                Map.Entry::getValue,
                                                (oldValue, newValue) -> oldValue, LinkedHashMap::new
                                            ));

        int[][] result = new int[k][];

        List<Integer> positionsSorted = new ArrayList(sortedMap.keySet());
        for (int i = 0; i < k; ++i) {
            result[i] = points[positionsSorted.get(i)];
        }

        return result;
    }
}
