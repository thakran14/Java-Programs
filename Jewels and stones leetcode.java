class Solution {
    public int numJewelsInStones(String J, String S) {
        
        char[] jewel = J.toCharArray();

        char[] stone = S.toCharArray();
        
        int count = 0;
        for(int i=0 ; i<jewel.length;i++)
            for(int j=0 ; j< stone.length ; j++)
                if(jewel[i]==stone[j])
                    count++;
        
        
        return count;
    }
}