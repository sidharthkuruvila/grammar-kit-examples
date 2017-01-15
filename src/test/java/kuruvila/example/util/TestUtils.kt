package kuruvila.example.util

import java.io.File
import java.io.IOException

import org.junit.Assert

    import com.google.common.base.Charsets
import com.google.common.io.Files
import com.google.common.io.Resources

object TestUtils {


    fun fixture(path: String): String {
        try {
            return Resources.toString(Resources.getResource(path), com.google.common.base.Charsets.UTF_8)
        } catch (e: IOException) {
            throw RuntimeException(e)
        }

    }

    /**
     * Compare an object's string representation with a file

     * @param fixturePath The resource path of the file
     * *
     * @param object      The object being compared
     */
    fun assertStringEquals(fixturePath: String, `object`: Any) {
        try {
            val fixture = fixture(fixturePath)
            Assert.assertEquals(fixture, `object`.toString())
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    }


    /**
     * Write into a file in the resource directory.
     *
     *
     * This is to be used to generate fixture files for testing.

     * @param fileName The name of the file to write into
     * *
     * @param object   The object to write as string
     */
    fun toStringFile(fileName: String, `object`: Any) {
        val basePath = "src/test/resources/"
        try {
            Files.write(`object`.toString(), File(basePath + fileName), com.google.common.base.Charsets.UTF_8)
        } catch (e: IOException) {
            throw RuntimeException(e)
        }

    }
}