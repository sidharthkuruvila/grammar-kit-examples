package kuruvila.example.parser

import com.intellij.lang.Language

class ExampleLanguage : Language("Example") {
    companion object {
        val INSTANCE = ExampleLanguage()
    }

}