// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        return quick(pairs, 0, pairs.size() - 1);
    }

    private List<Pair> quick(List<Pair> pairs, int left, int right) {

        if (right - left + 1 <= 1) {
            return pairs;
        }

        Pair pivot = pairs.get(right);
        int l = left;

        for (int i = l; i < right; ++i) {
            if (pairs.get(i).key < pivot.key) {
                Pair temp = pairs.get(l);
                pairs.set(l, pairs.get(i));
                pairs.set(i, temp);
                l++;
            }
        }

        pairs.set(right, pairs.get(l));
        pairs.set(l, pivot);

        quick(pairs, left, l - 1);
        quick(pairs, l + 1, right);

        return pairs;
    }
}
