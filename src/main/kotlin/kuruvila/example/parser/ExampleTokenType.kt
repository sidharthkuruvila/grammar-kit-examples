package kuruvila.example.parser


import com.intellij.psi.tree.IElementType

/**
 * I created this because the parser throws a NullPointerException if the language is not set
 *
 * TODO: Find out why the null pointer exeption gets thrown and if there an alternative way to solve this.
 */
class ExampleTokenType(debug: String) : IElementType(debug, ExampleLanguage.INSTANCE)
