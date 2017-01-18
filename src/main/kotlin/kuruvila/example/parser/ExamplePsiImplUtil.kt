package kuruvila.example.parser

import com.intellij.psi.tree.TokenSet
import kuruvila.example.ExampleTypes
import kuruvila.example.parser.psi.ExampleGeneratedMethods


class ExamplePsiImplUtil {
    companion object {
        @JvmStatic
        fun hasEquals(o: ExampleGeneratedMethods): Boolean {
            return o.node.findChildByType(TokenSet.create(ExampleTypes.EQUALS)) != null
        }
    }
}
