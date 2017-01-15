package kuruvila.example.parser

import com.intellij.testFramework.ParsingTestCase
import java.io.File

class ParserTest: ParsingTestCase("testdata/parser", "example", ExampleParserDefinition()) {
    fun testSimpleExpression(){
        doTest(true)
    }

    fun testPoorRecursiveExpression(){
        doTest(true)
    }

    fun testRecursiveExpression(){
        doTest(true)
    }

    fun testLeftAssociativeRecursiveExpression(){
        doTest(true)
    }

    fun testRightAssociativeRecursiveExpression(){
        doTest(true)
    }

    override fun getTestDataPath(): String {
        return "src/test/resources";
    }
}
