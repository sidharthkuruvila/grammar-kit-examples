package kuruvila.example.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

import static kuruvila.example.ExampleTypes.*;
import static com.intellij.psi.TokenType.*;
%%

%{
  private int tokenStartIndex;
  private CharSequence quotedStringId;
  private int commentDepth;

  //Store the start index of a token
  private void tokenStart() {
    tokenStartIndex = zzStartRead;
  }

  //Set the start index of the token to the stored index
  private void tokenEnd() {
    zzStartRead = tokenStartIndex;
  }
%}

%public
%class _ExampleLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
//%eof{  return;
//%eof}

EOL= \n|\r|\r\n
WHITE_SPACE_CHAR=[\ \t\f]|{EOL}
WHITE_SPACE={WHITE_SPACE_CHAR}+

NEWLINE=("\r"* "\n")

LOWERCASE=[a-z_]
UPPERCASE=[A-Z]
IDENTCHAR=[A-Za-z_0-9']

%state INITIAL
%state IN_COMMENT

%%

<YYINITIAL>  {
      [^]                             { yybegin(INITIAL); yypushback(1); }
}

<INITIAL> {
        {WHITE_SPACE} { return WHITESPACE; }


        "simple_expression" { return SIMPLE_EXPRESSION_KEYWORD; }
        "poor_recursive_expression" { return POOR_RECURSIVE_EXPRESSION_KEYWORD; }
        "recursive_expression" { return RECURSIVE_EXPRESSION_KEYWORD; }

        "and" { return AND;}
        "or" { return OR;}

        { LOWERCASE } { IDENTCHAR }  * { return LIDENT; }

        "::" { return COLONCOLON; }
        "+" { return PLUS; }
        "-" { return MINUS; }
        "{" { return OPEN_CURLY; }
        "}" { return CLOSE_CURLY; }

        "/*" { yybegin(IN_COMMENT); commentDepth = 1; tokenStart(); }

}


<IN_COMMENT> {
    "/*" { commentDepth += 1; }
    "*/" { commentDepth -= 1; if(commentDepth == 0) { yybegin(INITIAL); tokenEnd(); return COMMENT; } }
    . | { NEWLINE } { }
    <<EOF>> { yybegin(INITIAL); tokenEnd(); return COMMENT; }
}

//[^] { System.out.println("Bad char:" + yytext()); return BAD_CHARACTER; } //Copied this need to know how it works