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

    //0ms
    fun longestCommonPrefix2(strs: Array<String>): String {
        var endIndex = strs[0].length
        for (i in 1 until strs.size){
            while(strs[i].length < endIndex ||
                strs[0].substring(0,endIndex) != strs[i].substring(0,endIndex)
            ){
                endIndex -= 1
            }
        }
        return strs[0].substring(0,endIndex)
    }
}