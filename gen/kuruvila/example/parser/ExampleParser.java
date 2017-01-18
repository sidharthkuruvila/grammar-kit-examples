// This is a generated file. Not intended for manual editing.
package kuruvila.example.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static kuruvila.example.ExampleTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ExampleParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == GENERATED_METHODS) {
      result_ = GeneratedMethods(builder_, 0);
    }
    else if (root_ == IDENT) {
      result_ = Ident(builder_, 0);
    }
    else if (root_ == METHODS_EXAMPLE) {
      result_ = MethodsExample(builder_, 0);
    }
    else if (root_ == POOR_ADDITION_EXPRESSION) {
      result_ = PoorAdditionExpression(builder_, 0);
    }
    else if (root_ == POOR_BOOLEAN_EXPRESSION) {
      result_ = PoorBooleanExpression(builder_, 0);
    }
    else if (root_ == POOR_RECURSIVE_EXPRESSION_EXAMPLE) {
      result_ = PoorRecursiveExpressionExample(builder_, 0);
    }
    else if (root_ == PRIVATE_RULE_EXAMPLE) {
      result_ = PrivateRuleExample(builder_, 0);
    }
    else if (root_ == PUBLIC_RULE) {
      result_ = PublicRule(builder_, 0);
    }
    else if (root_ == RECURSIVE_EXPRESSION) {
      result_ = RecursiveExpression(builder_, 0, -1);
    }
    else if (root_ == RECURSIVE_EXPRESSION_EXAMPLE) {
      result_ = RecursiveExpressionExample(builder_, 0);
    }
    else if (root_ == SIMPLE_EXPRESSION) {
      result_ = SimpleExpression(builder_, 0);
    }
    else if (root_ == SIMPLE_EXPRESSION_EXAMPLE) {
      result_ = SimpleExpressionExample(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return Examples(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ADD_EXPRESSION, CONS_EXPRESSION, IDENTIFIER_EXPRESSION, OR_EXPRESSION,
      RECURSIVE_EXPRESSION),
  };

  /* ********************************************************** */
  // COMMENT? (
  //     SimpleExpressionExample
  //   | PoorRecursiveExpressionExample
  //   | RecursiveExpressionExample
  //   | PrivateRuleExample
  //   | MethodsExample)
  static boolean Examples(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Examples")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Examples_0(builder_, level_ + 1);
    result_ = result_ && Examples_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMENT?
  private static boolean Examples_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Examples_0")) return false;
    consumeToken(builder_, COMMENT);
    return true;
  }

  // SimpleExpressionExample
  //   | PoorRecursiveExpressionExample
  //   | RecursiveExpressionExample
  //   | PrivateRuleExample
  //   | MethodsExample
  private static boolean Examples_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Examples_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = SimpleExpressionExample(builder_, level_ + 1);
    if (!result_) result_ = PoorRecursiveExpressionExample(builder_, level_ + 1);
    if (!result_) result_ = RecursiveExpressionExample(builder_, level_ + 1);
    if (!result_) result_ = PrivateRuleExample(builder_, level_ + 1);
    if (!result_) result_ = MethodsExample(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Ident EQUALS Ident
  public static boolean GeneratedMethods(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GeneratedMethods")) return false;
    if (!nextTokenIs(builder_, LIDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Ident(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQUALS);
    result_ = result_ && Ident(builder_, level_ + 1);
    exit_section_(builder_, marker_, GENERATED_METHODS, result_);
    return result_;
  }

  /* ********************************************************** */
  // LIDENT
  public static boolean Ident(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Ident")) return false;
    if (!nextTokenIs(builder_, LIDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LIDENT);
    exit_section_(builder_, marker_, IDENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // METHODS_KEYWORD OPEN_CURLY GeneratedMethods CLOSE_CURLY
  public static boolean MethodsExample(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodsExample")) return false;
    if (!nextTokenIs(builder_, METHODS_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, METHODS_KEYWORD, OPEN_CURLY);
    result_ = result_ && GeneratedMethods(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_CURLY);
    exit_section_(builder_, marker_, METHODS_EXAMPLE, result_);
    return result_;
  }

  /* ********************************************************** */
  // LIDENT ((PLUS | MINUS) PoorAdditionExpression) ?
  public static boolean PoorAdditionExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PoorAdditionExpression")) return false;
    if (!nextTokenIs(builder_, LIDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LIDENT);
    result_ = result_ && PoorAdditionExpression_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, POOR_ADDITION_EXPRESSION, result_);
    return result_;
  }

  // ((PLUS | MINUS) PoorAdditionExpression) ?
  private static boolean PoorAdditionExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PoorAdditionExpression_1")) return false;
    PoorAdditionExpression_1_0(builder_, level_ + 1);
    return true;
  }

  // (PLUS | MINUS) PoorAdditionExpression
  private static boolean PoorAdditionExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PoorAdditionExpression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PoorAdditionExpression_1_0_0(builder_, level_ + 1);
    result_ = result_ && PoorAdditionExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PLUS | MINUS
  private static boolean PoorAdditionExpression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PoorAdditionExpression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PoorAdditionExpression ((AND|OR) PoorBooleanExpression) ?
  public static boolean PoorBooleanExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PoorBooleanExpression")) return false;
    if (!nextTokenIs(builder_, LIDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PoorAdditionExpression(builder_, level_ + 1);
    result_ = result_ && PoorBooleanExpression_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, POOR_BOOLEAN_EXPRESSION, result_);
    return result_;
  }

  // ((AND|OR) PoorBooleanExpression) ?
  private static boolean PoorBooleanExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PoorBooleanExpression_1")) return false;
    PoorBooleanExpression_1_0(builder_, level_ + 1);
    return true;
  }

  // (AND|OR) PoorBooleanExpression
  private static boolean PoorBooleanExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PoorBooleanExpression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PoorBooleanExpression_1_0_0(builder_, level_ + 1);
    result_ = result_ && PoorBooleanExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // AND|OR
  private static boolean PoorBooleanExpression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PoorBooleanExpression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, OR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // POOR_RECURSIVE_EXPRESSION_KEYWORD OPEN_CURLY PoorBooleanExpression CLOSE_CURLY
  public static boolean PoorRecursiveExpressionExample(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PoorRecursiveExpressionExample")) return false;
    if (!nextTokenIs(builder_, POOR_RECURSIVE_EXPRESSION_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, POOR_RECURSIVE_EXPRESSION_KEYWORD, OPEN_CURLY);
    result_ = result_ && PoorBooleanExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_CURLY);
    exit_section_(builder_, marker_, POOR_RECURSIVE_EXPRESSION_EXAMPLE, result_);
    return result_;
  }

  /* ********************************************************** */
  // PRIVATE IdentifierExpression
  static boolean PrivateRule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrivateRule")) return false;
    if (!nextTokenIs(builder_, PRIVATE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PRIVATE);
    result_ = result_ && IdentifierExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PRIVATE_RULE_KEYWORD OPEN_CURLY (PrivateRule | PublicRule) +  CLOSE_CURLY
  public static boolean PrivateRuleExample(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrivateRuleExample")) return false;
    if (!nextTokenIs(builder_, PRIVATE_RULE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, PRIVATE_RULE_KEYWORD, OPEN_CURLY);
    result_ = result_ && PrivateRuleExample_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_CURLY);
    exit_section_(builder_, marker_, PRIVATE_RULE_EXAMPLE, result_);
    return result_;
  }

  // (PrivateRule | PublicRule) +
  private static boolean PrivateRuleExample_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrivateRuleExample_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PrivateRuleExample_2_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!PrivateRuleExample_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PrivateRuleExample_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PrivateRule | PublicRule
  private static boolean PrivateRuleExample_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrivateRuleExample_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PrivateRule(builder_, level_ + 1);
    if (!result_) result_ = PublicRule(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PUBLIC IdentifierExpression
  public static boolean PublicRule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PublicRule")) return false;
    if (!nextTokenIs(builder_, PUBLIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PUBLIC);
    result_ = result_ && IdentifierExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, PUBLIC_RULE, result_);
    return result_;
  }

  /* ********************************************************** */
  // RECURSIVE_EXPRESSION_KEYWORD OPEN_CURLY RecursiveExpression CLOSE_CURLY
  public static boolean RecursiveExpressionExample(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecursiveExpressionExample")) return false;
    if (!nextTokenIs(builder_, RECURSIVE_EXPRESSION_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, RECURSIVE_EXPRESSION_KEYWORD, OPEN_CURLY);
    result_ = result_ && RecursiveExpression(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, CLOSE_CURLY);
    exit_section_(builder_, marker_, RECURSIVE_EXPRESSION_EXAMPLE, result_);
    return result_;
  }

  /* ********************************************************** */
  // LIDENT
  public static boolean SimpleExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimpleExpression")) return false;
    if (!nextTokenIs(builder_, LIDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LIDENT);
    exit_section_(builder_, marker_, SIMPLE_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // SIMPLE_EXPRESSION_KEYWORD OPEN_CURLY SimpleExpression CLOSE_CURLY
  public static boolean SimpleExpressionExample(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SimpleExpressionExample")) return false;
    if (!nextTokenIs(builder_, SIMPLE_EXPRESSION_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SIMPLE_EXPRESSION_KEYWORD, OPEN_CURLY);
    result_ = result_ && SimpleExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_CURLY);
    exit_section_(builder_, marker_, SIMPLE_EXPRESSION_EXAMPLE, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression root: RecursiveExpression
  // Operator priority table:
  // 0: BINARY(OrExpression)
  // 1: BINARY(AddExpression)
  // 2: BINARY(ConsExpression)
  // 3: ATOM(IdentifierExpression)
  public static boolean RecursiveExpression(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "RecursiveExpression")) return false;
    addVariant(builder_, "<recursive expression>");
    if (!nextTokenIs(builder_, LIDENT)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<recursive expression>");
    result_ = IdentifierExpression(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && RecursiveExpression_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean RecursiveExpression_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "RecursiveExpression_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 0 && OrExpression_0(builder_, level_ + 1)) {
        result_ = RecursiveExpression(builder_, level_, 0);
        exit_section_(builder_, level_, marker_, OR_EXPRESSION, result_, true, null);
      }
      else if (priority_ < 1 && AddExpression_0(builder_, level_ + 1)) {
        result_ = RecursiveExpression(builder_, level_, 1);
        exit_section_(builder_, level_, marker_, ADD_EXPRESSION, result_, true, null);
      }
      else if (priority_ < 2 && consumeTokenSmart(builder_, COLONCOLON)) {
        result_ = RecursiveExpression(builder_, level_, 1);
        exit_section_(builder_, level_, marker_, CONS_EXPRESSION, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  // AND | OR
  private static boolean OrExpression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OrExpression_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, AND);
    if (!result_) result_ = consumeTokenSmart(builder_, OR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PLUS | MINUS
  private static boolean AddExpression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AddExpression_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, PLUS);
    if (!result_) result_ = consumeTokenSmart(builder_, MINUS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LIDENT
  public static boolean IdentifierExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IdentifierExpression")) return false;
    if (!nextTokenIsSmart(builder_, LIDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LIDENT);
    exit_section_(builder_, marker_, IDENTIFIER_EXPRESSION, result_);
    return result_;
  }

}
