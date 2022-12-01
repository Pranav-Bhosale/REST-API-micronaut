package com.textanalyzer.services

import com.textanalyzer.models.AnalyzerResponse

fun sayHello(): String{
    return "Hello From Micronaut"
}


fun getWordCount(content: String): Int {
    if (content.isEmpty()) return 0
    return content.trim().split("\\s+".toRegex()).size
}


fun getCountOfLines(content: String): Int {
    if (content.isEmpty()) return 0
    return content.trim().split('.').size - 1
}

fun getCountOfCharacters(content: String): Int {
    if (content.isEmpty()) return 0
    return content.trim().length
}

fun getCountOfCharactersWithoutSpaces(content: String): Int {
    if (content.isEmpty()) return 0
    val spaces = content.trim().count{it == ' '}
    return getCountOfCharacters(content) - spaces
}

fun getUniqueWordsCount(content: String): Int {
    if (content.isEmpty()) return 0
    val words = content.trim().replace("[^a-zA-Z ]".toRegex(), "").split("\\s+".toRegex())
    return words.toHashSet().size
}

fun textAnalyzerUtil(content: String): AnalyzerResponse{
    return AnalyzerResponse(
        getWordCount(content),
        getCountOfCharacters(content),
        getCountOfCharactersWithoutSpaces(content),
        getCountOfLines(content),
        getUniqueWordsCount(content)
    )
}