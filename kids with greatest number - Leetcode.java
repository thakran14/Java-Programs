class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<Boolean>();
        int i=0;
        int max;
        max=candies[i];

        for(i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
                max=candies[i]  ;  
        }
        
        for( int candy:candies)
        {
            res.add(extraCandies+candy >= max);
        }
        
                    return res;    

    }
}