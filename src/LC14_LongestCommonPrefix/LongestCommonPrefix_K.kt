package LC14_LongestCommonPrefix

class LongestCommonPrefix_K {
    //6ms
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""
        var prefix = strs[0];
        for(i in 1 until strs.count()){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length -1)
                if (prefix.isEmpty()) {
                    prefix = ""
                }
            }
        }
        return prefix;
    }
}