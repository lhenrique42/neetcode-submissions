class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> anagramsHash = new LinkedHashMap<>();

        for (String s : strs) {
            int strHash = hash(s);
            anagramsHash.computeIfAbsent(strHash, k -> new ArrayList()).add(s);
        }

        return new ArrayList<>(anagramsHash.values());
    }

    public int hash(String value) {
        int arr[] = new int[26];
        for (int i = 0; i < value.length(); ++i) {
            arr[value.charAt(i) - 'a']++;
        }
        return Arrays.hashCode(arr);
    }
}
