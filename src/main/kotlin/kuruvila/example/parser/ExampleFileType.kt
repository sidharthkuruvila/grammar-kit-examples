package kuruvila.example.parser

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.util.Icons
import javax.swing.Icon

class ExampleFileType : LanguageFileType(ExampleLanguage.INSTANCE) {

    companion object {
        val INSTANCE = ExampleFileType()

    }
    override fun getDescription(): String {
        return "Example source file"
    }

    override fun getDefaultExtension(): String {
        return "example"
    }


    override fun getName(): String {
        return "Example File"
    }

    override fun getIcon(): Icon? {
        return Icons.ABSTRACT_CLASS_ICON;
    }

}