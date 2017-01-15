package kuruvila.example.parser

import com.intellij.psi.tree.IElementType

class ExampleCompositeElementType(s: String) : IElementType(s, ExampleLanguage.INSTANCE)