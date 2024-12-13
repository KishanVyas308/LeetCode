class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int len = searchWord.length();
  

        for(int i=0; i<words.length; i++) {
            if(words[i].charAt(0) == searchWord.charAt(0)) {
                boolean check = true;
                for(int j=0; j<len; j++) {
                    if(words[i].charAt(j) != searchWord.charAt(j)) {
                        check = false;
                        break;
                    }
                }   
                if(check == true) {
                    return (i+1);
                }
            }
        }

        return -1;

    }
}