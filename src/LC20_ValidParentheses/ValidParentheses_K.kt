package LC20_ValidParentheses

import java.util.*

class ValidParentheses_K {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val map = mapOf(')' to '(', '}' to '{', ']' to '[')
        for(ch in s){
            if(map.containsValue(ch)) {
                stack.push(ch)
            } else {
                if(map.containsKey(ch)){
                    if(stack.isNotEmpty() && stack.peek() == map[ch])
                        stack.pop()
                    else return false
                }
            }
        }
        return stack.isEmpty()
    }
    
    fun isValid2(s: String): Boolean {
        val stack = Stack<Char>()
        for (char in s) {
            when (char) {
                '{', '(', '[' -> stack.push(char)
                '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
                ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
                ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
            }
        }
        return stack.isEmpty()
    }

}

fun main(){
    val obj = ValidParentheses_K()
    val input = arrayOf("()", "()[]{}", "(]", "([])", "([)]", "]", "((", "[}", "]]")
    for(i in input){
        println("$i - ${obj.isValid2(i)}")
    }
}