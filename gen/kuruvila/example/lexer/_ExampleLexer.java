/* The following code was generated by JFlex 1.6.0 */

package kuruvila.example.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

import static kuruvila.example.ExampleTypes.*;
import static com.intellij.psi.TokenType.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>parser/Lexer.flex</tt>
 */
public class _ExampleLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int INITIAL = 2;
  public static final int IN_COMMENT = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\43\1\44\1\2\22\0\1\3\6\0\1\5"+
    "\2\0\1\42\1\34\1\0\1\35\1\0\1\41\12\5\1\33\2\0"+
    "\1\40\3\0\32\5\4\0\1\14\1\0\1\24\1\32\1\21\1\31"+
    "\1\13\1\26\1\4\1\30\1\7\1\4\1\27\1\12\1\10\1\20"+
    "\1\17\1\11\1\4\1\16\1\6\1\25\1\22\1\23\1\4\1\15"+
    "\2\4\1\36\1\0\1\37\7\0\1\43\u1fa2\0\1\43\1\43\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\10\3\1\0\1\4\1\5\1\6"+
    "\1\7\1\10\1\0\1\11\1\0\2\11\6\3\1\12"+
    "\2\3\1\13\1\14\1\15\1\16\6\3\1\17\23\3"+
    "\1\20\3\3\1\21\1\22\14\3\1\23\11\3\1\24"+
    "\16\3\1\25\7\3\1\26\4\3\1\27";

  private static int [] zzUnpackAction() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1\0\157\0\157"+
    "\0\157\0\157\0\157\0\u0206\0\157\0\u022b\0\u0250\0\u0275"+
    "\0\u029a\0\u02bf\0\u02e4\0\u0309\0\u032e\0\u0353\0\271\0\u0378"+
    "\0\u039d\0\157\0\157\0\157\0\157\0\u03c2\0\u03e7\0\u040c"+
    "\0\u0431\0\u0456\0\u047b\0\271\0\u04a0\0\u04c5\0\u04ea\0\u050f"+
    "\0\u0534\0\u0559\0\u057e\0\u05a3\0\u05c8\0\u05ed\0\u0612\0\u0637"+
    "\0\u065c\0\u0681\0\u06a6\0\u06cb\0\u06f0\0\u0715\0\u073a\0\271"+
    "\0\u075f\0\u0784\0\u07a9\0\271\0\u07ce\0\u07f3\0\u0818\0\u083d"+
    "\0\u0862\0\u0887\0\u08ac\0\u08d1\0\u08f6\0\u091b\0\u0940\0\u0965"+
    "\0\u098a\0\271\0\u09af\0\u09d4\0\u09f9\0\u0a1e\0\u0a43\0\u0a68"+
    "\0\u0a8d\0\u0ab2\0\u0ad7\0\271\0\u0afc\0\u0b21\0\u0b46\0\u0b6b"+
    "\0\u0b90\0\u0bb5\0\u0bda\0\u0bff\0\u0c24\0\u0c49\0\u0c6e\0\u0c93"+
    "\0\u0cb8\0\u0cdd\0\271\0\u0d02\0\u0d27\0\u0d4c\0\u0d71\0\u0d96"+
    "\0\u0dbb\0\u0de0\0\271\0\u0e05\0\u0e2a\0\u0e4f\0\u0e74\0\271";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\45\4\1\0\3\5\1\6\1\0\1\7\1\6\1\10"+
    "\1\11\4\6\1\12\1\13\4\6\1\14\1\6\1\15"+
    "\4\6\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\2\0\1\5\2\25\1\26\36\25\1\27\1\30\50\0"+
    "\3\5\40\0\1\5\4\0\27\6\16\0\3\6\1\31"+
    "\23\6\16\0\7\6\1\32\17\6\16\0\12\6\1\33"+
    "\1\34\2\6\1\35\10\6\16\0\7\6\1\36\17\6"+
    "\16\0\12\6\1\37\14\6\16\0\14\6\1\40\12\6"+
    "\16\0\20\6\1\41\6\6\45\0\1\42\53\0\1\43"+
    "\3\0\1\25\1\26\104\0\1\44\43\0\1\45\7\0"+
    "\4\6\1\46\22\6\16\0\21\6\1\47\5\6\16\0"+
    "\3\6\1\50\23\6\16\0\13\6\1\51\13\6\16\0"+
    "\26\6\1\52\16\0\15\6\1\53\11\6\16\0\25\6"+
    "\1\54\1\6\16\0\23\6\1\55\3\6\16\0\5\6"+
    "\1\56\21\6\16\0\24\6\1\57\2\6\16\0\17\6"+
    "\1\60\7\6\16\0\12\6\1\61\14\6\16\0\6\6"+
    "\1\62\20\6\16\0\16\6\1\63\10\6\16\0\7\6"+
    "\1\64\17\6\16\0\6\6\1\65\20\6\16\0\13\6"+
    "\1\66\13\6\16\0\20\6\1\67\6\6\16\0\10\6"+
    "\1\70\16\6\16\0\3\6\1\71\23\6\16\0\12\6"+
    "\1\72\14\6\16\0\10\6\1\73\16\6\16\0\7\6"+
    "\1\74\17\6\16\0\25\6\1\75\1\6\16\0\21\6"+
    "\1\76\5\6\16\0\12\6\1\77\14\6\16\0\15\6"+
    "\1\100\11\6\16\0\2\6\1\101\24\6\16\0\12\6"+
    "\1\102\14\6\16\0\10\6\1\103\16\6\16\0\2\6"+
    "\1\104\24\6\16\0\7\6\1\105\17\6\16\0\7\6"+
    "\1\106\17\6\16\0\3\6\1\107\23\6\16\0\16\6"+
    "\1\110\10\6\16\0\7\6\1\111\17\6\16\0\10\6"+
    "\1\112\16\6\16\0\15\6\1\113\11\6\16\0\17\6"+
    "\1\114\7\6\16\0\6\6\1\115\20\6\16\0\11\6"+
    "\1\116\15\6\16\0\12\6\1\117\14\6\16\0\16\6"+
    "\1\120\10\6\16\0\7\6\1\121\17\6\16\0\7\6"+
    "\1\122\17\6\16\0\5\6\1\123\21\6\16\0\16\6"+
    "\1\124\10\6\16\0\12\6\1\125\14\6\16\0\10\6"+
    "\1\126\16\6\16\0\12\6\1\127\14\6\16\0\6\6"+
    "\1\130\20\6\16\0\2\6\1\131\24\6\16\0\7\6"+
    "\1\132\17\6\16\0\7\6\1\133\17\6\16\0\7\6"+
    "\1\134\17\6\16\0\3\6\1\135\23\6\16\0\11\6"+
    "\1\136\15\6\16\0\2\6\1\137\24\6\16\0\17\6"+
    "\1\140\7\6\16\0\5\6\1\141\21\6\16\0\2\6"+
    "\1\142\24\6\16\0\7\6\1\143\17\6\16\0\12\6"+
    "\1\144\14\6\16\0\3\6\1\145\23\6\16\0\10\6"+
    "\1\146\16\6\16\0\7\6\1\147\17\6\16\0\13\6"+
    "\1\150\13\6\16\0\7\6\1\151\17\6\16\0\2\6"+
    "\1\152\24\6\16\0\14\6\1\153\12\6\16\0\11\6"+
    "\1\154\15\6\16\0\2\6\1\155\24\6\16\0\5\6"+
    "\1\156\21\6\16\0\3\6\1\157\23\6\16\0\12\6"+
    "\1\160\14\6\16\0\13\6\1\161\13\6\16\0\7\6"+
    "\1\162\17\6\16\0\14\6\1\163\12\6\16\0\2\6"+
    "\1\164\24\6\16\0\2\6\1\165\24\6\16\0\3\6"+
    "\1\166\23\6\16\0\13\6\1\167\13\6\16\0\14\6"+
    "\1\170\12\6\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3737];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\11\1\1\0\5\11\1\0\1\11\1\0"+
    "\13\1\4\11\123\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBufferedSequence = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBuffer;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _ExampleLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 152) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence seq, int start, int end,int initialState){
    zzBufferedSequence = seq;
    //zzBuffer = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(seq);
    zzBuffer = com.intellij.util.text.CharArrayUtil.fromSequence(seq);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBufferedSequence.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer != null ? zzBuffer[zzStartRead+pos]:zzBufferedSequence.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;

    //CharSequence zzBufferL = zzBuffer;
    //char[] zzBufferArrayL = zzBufferArray;

    char[] zzBufferL = zzBuffer;

    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { yybegin(INITIAL); yypushback(1);
          }
        case 24: break;
        case 2: 
          { return WHITESPACE;
          }
        case 25: break;
        case 3: 
          { return LIDENT;
          }
        case 26: break;
        case 4: 
          { return PLUS;
          }
        case 27: break;
        case 5: 
          { return MINUS;
          }
        case 28: break;
        case 6: 
          { return OPEN_CURLY;
          }
        case 29: break;
        case 7: 
          { return CLOSE_CURLY;
          }
        case 30: break;
        case 8: 
          { return EQUALS;
          }
        case 31: break;
        case 9: 
          { 
          }
        case 32: break;
        case 10: 
          { return OR;
          }
        case 33: break;
        case 11: 
          { return COLONCOLON;
          }
        case 34: break;
        case 12: 
          { yybegin(IN_COMMENT); commentDepth = 1; tokenStart();
          }
        case 35: break;
        case 13: 
          { commentDepth += 1;
          }
        case 36: break;
        case 14: 
          { commentDepth -= 1; if(commentDepth == 0) { yybegin(INITIAL); tokenEnd(); return COMMENT; }
          }
        case 37: break;
        case 15: 
          { return AND;
          }
        case 38: break;
        case 16: 
          { return PUBLIC;
          }
        case 39: break;
        case 17: 
          { return METHODS_KEYWORD;
          }
        case 40: break;
        case 18: 
          { return PRIVATE;
          }
        case 41: break;
        case 19: 
          { return FAKE_RULE_KEYWORD;
          }
        case 42: break;
        case 20: 
          { return PRIVATE_RULE_KEYWORD;
          }
        case 43: break;
        case 21: 
          { return SIMPLE_EXPRESSION_KEYWORD;
          }
        case 44: break;
        case 22: 
          { return RECURSIVE_EXPRESSION_KEYWORD;
          }
        case 45: break;
        case 23: 
          { return POOR_RECURSIVE_EXPRESSION_KEYWORD;
          }
        case 46: break;

        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;

            switch (zzLexicalState) {
            case IN_COMMENT: {
              yybegin(INITIAL); tokenEnd(); return COMMENT;
            }
            case 121: break;
            default:
            return null;
            }
          } else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
