class Maxfre {
    public int maxFreqSum(String s) {
        int[] arr = new int[26];
        int maxVowel = 0;
        int maxConsonent = 0;

        for( char ch : s.toCharArray() ) {
            arr[ ch - 'a' ] += 1;
        }

        for( int i = 0; i < 26; i++ ) {

            if( isVowel( (char) (i + 'a' ) )) {
                maxVowel = Math.max( arr[i], maxVowel );
            }
            else{
                maxConsonent = Math.max( arr[i], maxConsonent );
            }
        }

        return maxVowel + maxConsonent;
        

    }

    private boolean isVowel( char ch ) {
        int temp = "aeiou".indexOf(ch);
        return temp != -1;
    }
}