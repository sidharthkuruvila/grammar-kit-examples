package kuruvila.example.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import kuruvila.example.ExampleTypes
import kuruvila.example.lexer.ExampleLexer

class ExampleParserDefinition : ParserDefinition {

    companion object {
        val FILE = IFileElementType(ExampleLanguage.INSTANCE);
    }

    override fun createParser(project: Project?): PsiParser? {
        return ExampleParser()
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile? {
        return ExamplePsiFileRoot(viewProvider)
    }

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements? {
        return ParserDefinition.SpaceRequirements.MAY;
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.create(ExampleTypes.STRING)
    }

    override fun getFileNodeType(): IFileElementType? {
        return FILE
    }

    override fun createLexer(project: Project?): Lexer {
        return ExampleLexer()
    }

    override fun createElement(node: ASTNode): PsiElement {
        return ExampleTypes.Factory.createElement(node);
    }

    override fun getCommentTokens(): TokenSet {
        return TokenSet.create(ExampleTypes.COMMENT)
        throw NotImplementedError()
    }

    override fun getWhitespaceTokens(): TokenSet {
        return TokenSet.create(ExampleTypes.WHITESPACE)
    }

}