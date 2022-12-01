package com.example.data

import java.util.*


class TextData {
    var content: String = ""
        get() = field
        set(value) {
            field=value
        }
     fun getCharCountWithSpaces(): Int {
         return content.length
     }
    fun getCharCountWithoutSpaces(): Int {
        var count=0;
        for(element in content)
        {
            if(element !=' ')
                count++;
        }
        return count
    }
    fun getLineCount(): Int {
        var count=0;
        for(element in content)
        {
            if(element =='\n')
                count++;
        }
        return count
    }
    fun getWordCount(): Int {
        var text=content
        text=text.trim()
        return text.split(" ").size
    }
    fun getUniqueWordCount(): Int {
        var text=content
        text=text.trim()
        val words: List<String> = text.split(" ")
        val uniqueWords = HashSet(words)
        return uniqueWords.size
    }



}