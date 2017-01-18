package kuruvila.example.parser

import com.intellij.testFramework.ParsingTestCase
import kuruvila.example.parser.psi.ExampleGeneratedMethods
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

    fun testPrivateRule(){
        doTest(true)
    }

    fun testMethods(){
        doTest(false)

        val text = loadFile(testName + "." + myFileExt)
        val myFile = createPsiFile(name, text)
        val assignment = myFile.children[2].children[0] as ExampleGeneratedMethods
        assert(assignment.lhs.text == "a")
        assert(assignment.rhs!!.text == "b")
        assert(assignment.hasEquals())

    }

    override fun getTestDataPath(): String {
        return "src/test/resources"
    }

    fun getTestFile(): File {
        val fn = testName + "." + myFileExt
        return File(myFullDataPath, fn)
    }
}
