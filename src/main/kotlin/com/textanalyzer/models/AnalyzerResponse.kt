package com.textanalyzer.models


data class AnalyzerResponse (
    var word_count: Int = 0,
    var character_count_with_spaces: Int = 0,
    var character_count_without_space:Int = 0,
    var line_count:Int = 0,
    var unique_words: Int = 0
)