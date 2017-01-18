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

public class ExamplePrivateRuleExampleImpl extends ASTWrapperPsiElement implements ExamplePrivateRuleExample {

  public ExamplePrivateRuleExampleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ExampleVisitor visitor) {
    visitor.visitPrivateRuleExample(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ExampleVisitor) accept((ExampleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ExampleIdentifierExpression> getIdentifierExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ExampleIdentifierExpression.class);
  }

  @Override
  @NotNull
  public List<ExamplePublicRule> getPublicRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ExamplePublicRule.class);
  }

}
