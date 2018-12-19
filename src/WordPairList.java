import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allpairs;

    public WordPairList(String[] words)
    {
        allpairs=new ArrayList<WordPair>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                allpairs.add(new WordPair(words[i],words[j]));
            }
        }
    }

    public int numMatches()
    {
        int count=0;
        for(WordPair pair:allpairs)
        {
            if(pair.getFirst().equals(pair.getSecond()))
            {
                count++;
            }
        }
        return count;
    }
}
