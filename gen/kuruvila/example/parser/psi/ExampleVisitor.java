// This is a generated file. Not intended for manual editing.
package kuruvila.example.parser.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class ExampleVisitor extends PsiElementVisitor {

  public void visitAddExpression(@NotNull ExampleAddExpression o) {
    visitRecursiveExpression(o);
  }

  public void visitConsExpression(@NotNull ExampleConsExpression o) {
    visitRecursiveExpression(o);
  }

  public void visitGeneratedMethods(@NotNull ExampleGeneratedMethods o) {
    visitPsiElement(o);
  }

  public void visitIdent(@NotNull ExampleIdent o) {
    visitPsiElement(o);
  }

  public void visitIdentifierExpression(@NotNull ExampleIdentifierExpression o) {
    visitRecursiveExpression(o);
  }

  public void visitMethodsExample(@NotNull ExampleMethodsExample o) {
    visitPsiElement(o);
  }

  public void visitOrExpression(@NotNull ExampleOrExpression o) {
    visitRecursiveExpression(o);
  }

  public void visitPoorAdditionExpression(@NotNull ExamplePoorAdditionExpression o) {
    visitPsiElement(o);
  }

  public void visitPoorBooleanExpression(@NotNull ExamplePoorBooleanExpression o) {
    visitPsiElement(o);
  }

  public void visitPoorRecursiveExpressionExample(@NotNull ExamplePoorRecursiveExpressionExample o) {
    visitPsiElement(o);
  }

  public void visitPrivateRuleExample(@NotNull ExamplePrivateRuleExample o) {
    visitPsiElement(o);
  }

  public void visitPublicRule(@NotNull ExamplePublicRule o) {
    visitPsiElement(o);
  }

  public void visitRecursiveExpression(@NotNull ExampleRecursiveExpression o) {
    visitPsiElement(o);
  }

  public void visitRecursiveExpressionExample(@NotNull ExampleRecursiveExpressionExample o) {
    visitPsiElement(o);
  }

  public void visitSimpleExpression(@NotNull ExampleSimpleExpression o) {
    visitPsiElement(o);
  }

  public void visitSimpleExpressionExample(@NotNull ExampleSimpleExpressionExample o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
