
package com.example.unscramble.data

const val MAX_NO_OF_WORDS = 10
const val SCORE_INCREASE = 20

val allWords: Set<String> =
    setOf(
        "en",
        "mar",
        "hogar",
        "surgir",
        "plátano",
        "android",
        "cumpleaños",
        "portafolios",
        "motocicleta",
        "coliflor" )

private val wordLengthMap: Map<Int, String> = allWords.associateBy({ it.length }, { it })

internal fun getUnscrambledWord(scrambledWord: String) = wordLengthMap[scrambledWord.length] ?: ""
