class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> resultswords=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(char ch : words[i].toCharArray())
            {
                if(ch==x)
                {
                    resultswords.add(i);
                    break;
                }
            }
        }
        return resultswords;
    }
}