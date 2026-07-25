class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        //List<Integer> ans=new ArrayList<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // for(Map.Entry<Integer,Integer> entry:map.entrySet())
        // {
        //     if(entry.getValue()>=k)
        //     {
        //         ans.add(entry.getKey());
        //     }
        // }

        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }

        return ans;

        // int[] result = new int[ans.size()];
        // for (int i = 0; i < ans.size(); i++) {
        //      result[i] = ans.get(i);
        //   }
        // return result;
        
    }
}
