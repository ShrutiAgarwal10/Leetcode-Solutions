package LC_3136_ValidWord

/**
 * A word is considered valid if:
 *
 * It contains a minimum of 3 characters.
 * It contains only digits (0-9), and English letters (uppercase and lowercase).
 * It includes at least one vowel.
 * It includes at least one consonant.
 *
 * You are given a string word.
 * Return true if word is valid, otherwise, return false.
 *
 * Notes:
 *
 * 'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
 * A consonant is an English letter that is not a vowel.*/

class ValidWord_K {

    //20ms
    fun isValid(word: String): Boolean {
        if(word.length < 3) return false
        if(!hasAtLeastOneVowel(word)) return false
        if(!hasDigitsAndLetters(word)) return false
        if(!hasAtLeastOneConsonant(word)) return false
        return true
    }
    fun hasAtLeastOneVowel(st : String) : Boolean {
        val vowels = setOf<Char>('a', 'e', 'i', 'o', 'u')
        for(ch in st){
            if(vowels.contains(ch.lowercaseChar()))
                return true
        }
        return false
    }
    fun hasDigitsAndLetters(st : String) : Boolean {
        for(ch in st){
            if(!ch.isLetterOrDigit())
                return false
        }
        return true;
    }
    fun hasAtLeastOneConsonant(st : String) : Boolean {
        val vowels = setOf<Char>('a', 'e', 'i', 'o', 'u')
        for(ch in st){
            if(ch.isLetter() && !vowels.contains(ch.lowercaseChar())){
                return true
            }
        }
        return false
    }

    fun outputPrint(){
        val input: Array<String> = arrayOf<String>(
            "234Adas", "b3", "a3\$e", "UuE6"
        )
        for (i in input) {
            println("${i} = ${isValid2(i)}")
        }
    }

    //9ms
    fun isValid2(word: String): Boolean {
        val vowels = "aeiouAEIOU"
        var atLeastOneVowel = false
        var atLeastOneConsonant = false
        var onlyDigitsAndEnglishLetters = true
        val minimumOf3Chars = word.length >= 3
        for (i in word) {
            if (i.isLetter()) {
                if (i in vowels) atLeastOneVowel = true
                else atLeastOneConsonant = true
            }
            if (!i.isLetterOrDigit()) onlyDigitsAndEnglishLetters = false
        }
        return atLeastOneConsonant && atLeastOneVowel && onlyDigitsAndEnglishLetters && minimumOf3Chars
    }
}