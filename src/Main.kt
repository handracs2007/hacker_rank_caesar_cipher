//https://www.hackerrank.com/challenges/caesar-cipher-1/problem

fun caesarCipher(s: String, k: Int): String {
    val smallLetters = ('a'..'z').joinToString(separator = "")
    val capitalLetters = smallLetters.toUpperCase()

    return s.map {
        if (it.isLetter()) {
            if (it.isLowerCase()) {
                smallLetters[(it - 'a' + k) % 26]
            } else {
                capitalLetters[(it - 'A' + k) % 26]
            }
        } else {
            it
        }
    }.joinToString(separator = "")
}

fun main() {
    println(caesarCipher("middle-Outz", 2))
}