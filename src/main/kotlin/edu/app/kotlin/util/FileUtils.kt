package edu.app.kotlin.util

class FileUtils {

    companion object Methods {
        fun readFileUsingGetResources(fileName: String) = this::class.java.getResource(fileName).readText(Charsets.UTF_8)
    }
}
