class FrequencyCounter {
    public void findFrequency(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n]; // to track counted elements

        System.out.println("Element Frequency:");

        for (int i = 0; i < n; i++) {
            if (visited[i])  // skip if already counted
                continue;

            int count = 1; // count current element

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark as counted
                }
            }

            System.out.println(arr[i] + " - " + count);
        }
    }
}

public class array_frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 3, 2};

        FrequencyCounter fc = new FrequencyCounter();
        fc.findFrequency(arr);
    }
}

