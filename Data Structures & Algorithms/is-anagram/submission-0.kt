class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val countS= HashMap<Char, Int>()
        val countT = HashMap<Char, Int>()

        // immediately check if lengths are different because
        // an anagram cannot contain two different lengths
        if(s.length != t.length){
            return false;
        } else{
            // frequency map for first string using getOrDefault
            for(i in 0 until s.length){
                countS[s[i]] = countS.getOrDefault(s[i], 0) + 1;
            }
            //frequency map for second string
            for(i in 0 until t.length){
                countT[t[i]] = countT.getOrDefault(t[i], 0) + 1;
            }
        }
        // compare results
        return countS == countT
    }
}

