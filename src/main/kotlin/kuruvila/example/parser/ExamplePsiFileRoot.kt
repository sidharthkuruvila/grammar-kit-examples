package kuruvila.example.parser

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class ExamplePsiFileRoot(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, ExampleLanguage.INSTANCE) {
    override fun getFileType(): FileType {
        return ExampleFileType.INSTANCE
    }
}