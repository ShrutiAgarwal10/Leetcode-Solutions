package LC_1233_removeSubfolders

class RemoveSubFolders_K {
    fun removeSubfolders(folder: Array<String>): List<String> {
        val sortedFolder = folder.sorted()
        val ans = mutableListOf<String>()
        for (st in sortedFolder) {
            if (ans.isEmpty() || !st.startsWith(ans.last() + "/")) {
                ans.add(st)
            }
        }
        return ans
    }
}

fun main(){
    val obj = RemoveSubFolders_K()
    val input : Array<Array<String>> = arrayOf(
        arrayOf("/a","/a/b","/c/d","/c/d/e","/c/f"),
        arrayOf("/a","/a/b/c","/a/b/d"),
        arrayOf("/a/b/c","/a/b/ca","/a/b/d")
    )
    for(i in input){
        println("${i.joinToString()} ->>> ${obj.removeSubfolders(i)}")
    }
}