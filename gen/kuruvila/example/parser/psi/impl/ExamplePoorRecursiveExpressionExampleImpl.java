// This is a generated file. Not intended for manual editing.
package kuruvila.example.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static kuruvila.example.ExampleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import kuruvila.example.parser.psi.*;
import kuruvila.example.parser.ExamplePsiImplUtil;

public class ExamplePoorRecursiveExpressionExampleImpl extends ASTWrapperPsiElement implements ExamplePoorRecursiveExpressionExample {

  public ExamplePoorRecursiveExpressionExampleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ExampleVisitor visitor) {
    visitor.visitPoorRecursiveExpressionExample(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ExampleVisitor) accept((ExampleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ExamplePoorBooleanExpression getPoorBooleanExpression() {
    return findNotNullChildByClass(ExamplePoorBooleanExpression.class);
  }

}
