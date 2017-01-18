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

public class ExampleGeneratedMethodsImpl extends ASTWrapperPsiElement implements ExampleGeneratedMethods {

  public ExampleGeneratedMethodsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ExampleVisitor visitor) {
    visitor.visitGeneratedMethods(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ExampleVisitor) accept((ExampleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ExampleIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ExampleIdent.class);
  }

  @Override
  @NotNull
  public ExampleIdent getLhs() {
    List<ExampleIdent> p1 = getIdentList();
    return p1.get(0);
  }

  @Override
  @Nullable
  public ExampleIdent getRhs() {
    List<ExampleIdent> p1 = getIdentList();
    return p1.size() < 2 ? null : p1.get(1);
  }

  public boolean hasEquals() {
    return ExamplePsiImplUtil.hasEquals(this);
  }

}
