// This is a generated file. Not intended for manual editing.
package kuruvila.example;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import kuruvila.example.parser.ExampleCompositeElementType;
import kuruvila.example.parser.psi.impl.*;

public interface ExampleTypes {

  IElementType ADD_EXPRESSION = new ExampleCompositeElementType("ADD_EXPRESSION");
  IElementType CONS_EXPRESSION = new ExampleCompositeElementType("CONS_EXPRESSION");
  IElementType GENERATED_METHODS = new ExampleCompositeElementType("GENERATED_METHODS");
  IElementType IDENT = new ExampleCompositeElementType("IDENT");
  IElementType IDENTIFIER_EXPRESSION = new ExampleCompositeElementType("IDENTIFIER_EXPRESSION");
  IElementType METHODS_EXAMPLE = new ExampleCompositeElementType("METHODS_EXAMPLE");
  IElementType OR_EXPRESSION = new ExampleCompositeElementType("OR_EXPRESSION");
  IElementType POOR_ADDITION_EXPRESSION = new ExampleCompositeElementType("POOR_ADDITION_EXPRESSION");
  IElementType POOR_BOOLEAN_EXPRESSION = new ExampleCompositeElementType("POOR_BOOLEAN_EXPRESSION");
  IElementType POOR_RECURSIVE_EXPRESSION_EXAMPLE = new ExampleCompositeElementType("POOR_RECURSIVE_EXPRESSION_EXAMPLE");
  IElementType PRIVATE_RULE_EXAMPLE = new ExampleCompositeElementType("PRIVATE_RULE_EXAMPLE");
  IElementType PUBLIC_RULE = new ExampleCompositeElementType("PUBLIC_RULE");
  IElementType RECURSIVE_EXPRESSION = new ExampleCompositeElementType("RECURSIVE_EXPRESSION");
  IElementType RECURSIVE_EXPRESSION_EXAMPLE = new ExampleCompositeElementType("RECURSIVE_EXPRESSION_EXAMPLE");
  IElementType SIMPLE_EXPRESSION = new ExampleCompositeElementType("SIMPLE_EXPRESSION");
  IElementType SIMPLE_EXPRESSION_EXAMPLE = new ExampleCompositeElementType("SIMPLE_EXPRESSION_EXAMPLE");

  IElementType AND = new IElementType("and", null);
  IElementType CLOSE_CURLY = new IElementType("}", null);
  IElementType COLONCOLON = new IElementType("::", null);
  IElementType COMMENT = new IElementType("comment", null);
  IElementType EQUALS = new IElementType("=", null);
  IElementType FAKE_RULE_KEYWORD = new IElementType("fake_rule", null);
  IElementType LIDENT = new IElementType("LIDENT", null);
  IElementType METHODS_KEYWORD = new IElementType("methods", null);
  IElementType MINUS = new IElementType("-", null);
  IElementType OPEN_CURLY = new IElementType("{", null);
  IElementType OR = new IElementType("or", null);
  IElementType PLUS = new IElementType("+", null);
  IElementType POOR_RECURSIVE_EXPRESSION_KEYWORD = new IElementType("poor_recursive_expression", null);
  IElementType PRIVATE = new IElementType("private", null);
  IElementType PRIVATE_RULE_KEYWORD = new IElementType("private_rule", null);
  IElementType PUBLIC = new IElementType("public", null);
  IElementType RECURSIVE_EXPRESSION_KEYWORD = new IElementType("recursive_expression", null);
  IElementType SIMPLE_EXPRESSION_KEYWORD = new IElementType("simple_expression", null);
  IElementType STRING = new IElementType("string", null);
  IElementType WHITESPACE = new IElementType("WHITE_SPACE", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADD_EXPRESSION) {
        return new ExampleAddExpressionImpl(node);
      }
      else if (type == CONS_EXPRESSION) {
        return new ExampleConsExpressionImpl(node);
      }
      else if (type == GENERATED_METHODS) {
        return new ExampleGeneratedMethodsImpl(node);
      }
      else if (type == IDENT) {
        return new ExampleIdentImpl(node);
      }
      else if (type == IDENTIFIER_EXPRESSION) {
        return new ExampleIdentifierExpressionImpl(node);
      }
      else if (type == METHODS_EXAMPLE) {
        return new ExampleMethodsExampleImpl(node);
      }
      else if (type == OR_EXPRESSION) {
        return new ExampleOrExpressionImpl(node);
      }
      else if (type == POOR_ADDITION_EXPRESSION) {
        return new ExamplePoorAdditionExpressionImpl(node);
      }
      else if (type == POOR_BOOLEAN_EXPRESSION) {
        return new ExamplePoorBooleanExpressionImpl(node);
      }
      else if (type == POOR_RECURSIVE_EXPRESSION_EXAMPLE) {
        return new ExamplePoorRecursiveExpressionExampleImpl(node);
      }
      else if (type == PRIVATE_RULE_EXAMPLE) {
        return new ExamplePrivateRuleExampleImpl(node);
      }
      else if (type == PUBLIC_RULE) {
        return new ExamplePublicRuleImpl(node);
      }
      else if (type == RECURSIVE_EXPRESSION_EXAMPLE) {
        return new ExampleRecursiveExpressionExampleImpl(node);
      }
      else if (type == SIMPLE_EXPRESSION) {
        return new ExampleSimpleExpressionImpl(node);
      }
      else if (type == SIMPLE_EXPRESSION_EXAMPLE) {
        return new ExampleSimpleExpressionExampleImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
