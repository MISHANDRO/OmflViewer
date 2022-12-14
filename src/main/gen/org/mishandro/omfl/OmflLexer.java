/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.mishandro.omfl;

import com.intellij.psi.tree.IElementType;
import org.mishandro.omfl.psi.OmflTypes;
import com.intellij.psi.TokenType;
import com.intellij.lexer.FlexLexer;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Omfl.flex</tt>
 */
class OmflLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 15616 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\1\21\1\22\3\21\1\23\1\24\1\25\1\21\14\26\1\27\50\26\1\30\2\26\1\31\1\32"+
    "\1\33\1\34\25\26\1\35\20\21\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1"+
    "\47\1\50\1\21\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\21\1\26\1\60\1\61\5\21"+
    "\2\26\1\62\7\21\1\26\1\63\20\21\1\26\1\64\1\21\1\65\13\26\1\66\1\26\1\67\22"+
    "\21\1\70\5\21\1\71\11\21\1\72\1\73\1\74\1\75\1\21\1\76\2\21\1\77\3\21\1\100"+
    "\2\21\1\101\1\102\7\21\123\26\1\103\7\26\1\104\1\105\12\26\1\106\24\21\1\26"+
    "\1\107\u0582\21\1\110\u017f\21");

  /* The ZZ_CMAP_Y table has 4672 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\2\0\1\2\1\3\1\4\1\5\1\6\2\7\1\10\1\11\1\12\1\13\1\14\1\15\4\0\1\16"+
    "\1\17\1\16\2\7\1\20\3\7\1\20\71\7\1\21\1\7\1\22\1\0\1\23\1\24\2\0\16\7\1\25"+
    "\1\26\1\27\1\30\2\7\1\31\11\7\1\32\21\7\1\31\25\7\1\6\3\7\1\20\1\33\1\6\4"+
    "\7\1\0\1\6\4\7\1\32\1\34\1\0\3\7\2\14\3\0\1\7\1\14\10\7\1\4\1\35\14\7\1\36"+
    "\1\37\1\7\1\40\1\4\1\41\2\0\7\7\1\42\14\7\1\22\1\0\1\4\1\43\4\7\1\44\1\16"+
    "\5\7\1\44\2\0\3\7\1\45\10\0\2\7\1\25\1\44\2\0\1\46\1\7\1\31\17\7\1\47\1\4"+
    "\1\6\1\7\1\36\1\37\1\50\2\7\1\40\1\51\1\52\1\37\1\53\1\54\1\55\1\47\1\4\1"+
    "\22\1\0\1\56\1\57\1\50\2\7\1\40\1\60\1\61\1\57\1\62\1\33\1\63\1\64\1\4\1\44"+
    "\1\0\1\56\1\32\1\31\2\7\1\40\1\65\1\52\1\32\1\66\1\67\1\0\1\47\1\4\1\0\1\33"+
    "\1\56\1\37\1\50\2\7\1\40\1\65\1\52\1\37\1\62\1\70\1\55\1\47\1\4\1\33\1\0\1"+
    "\71\1\72\1\73\1\74\1\75\1\72\1\7\1\21\1\72\1\73\1\76\1\0\1\64\1\4\2\0\1\36"+
    "\1\25\1\40\2\7\1\40\1\7\1\77\1\25\1\73\1\100\1\14\1\47\1\4\2\0\1\36\1\25\1"+
    "\40\2\7\1\40\1\36\1\52\1\25\1\73\1\100\1\27\1\47\1\4\1\101\1\0\1\56\1\25\1"+
    "\40\4\7\1\42\1\25\1\102\1\46\1\54\1\47\1\4\1\0\1\103\1\71\1\7\1\20\1\103\2"+
    "\7\1\31\1\104\1\20\1\105\1\106\1\7\1\64\1\4\1\107\1\0\1\6\6\7\1\14\1\7\1\20"+
    "\1\4\1\110\4\0\1\111\1\112\1\46\1\6\1\113\1\71\1\7\1\66\1\106\1\44\1\4\1\114"+
    "\4\0\1\67\2\0\1\22\1\4\1\110\1\115\1\116\1\7\1\6\3\7\1\23\1\6\1\7\1\25\2\7"+
    "\1\6\3\7\1\23\1\27\7\0\10\7\1\4\1\110\10\7\1\4\1\117\4\7\1\32\1\17\5\7\1\120"+
    "\51\7\1\73\1\20\1\73\5\7\1\73\4\7\1\73\1\20\1\73\1\7\1\20\7\7\1\73\10\7\1"+
    "\42\4\0\2\7\2\0\12\7\2\44\1\6\114\7\1\37\2\7\1\6\2\7\1\14\11\7\1\72\1\7\1"+
    "\67\1\7\1\25\1\23\1\0\2\7\1\23\1\0\2\7\1\45\1\0\1\7\1\25\1\121\1\0\12\7\1"+
    "\122\1\123\1\4\1\110\3\0\1\124\1\4\1\110\13\7\1\0\5\7\1\14\10\7\1\44\1\0\3"+
    "\7\1\20\1\7\1\45\1\7\1\45\1\64\1\4\3\7\1\44\1\23\1\0\5\7\1\45\3\7\1\22\1\4"+
    "\1\110\4\0\3\7\1\45\7\7\1\20\3\7\1\37\1\4\1\110\1\4\1\110\1\54\1\0\1\7\1\20"+
    "\10\0\11\7\1\45\1\4\1\110\1\0\1\125\1\45\1\0\6\7\1\4\1\43\6\7\1\45\1\0\7\7"+
    "\1\0\1\4\1\126\1\4\1\43\3\7\1\44\1\7\1\67\10\0\1\120\3\7\1\20\1\22\36\7\1"+
    "\44\1\125\42\7\2\44\4\7\2\44\1\7\1\127\3\7\1\44\6\7\1\25\1\106\1\130\1\23"+
    "\1\131\1\45\1\7\1\23\1\130\1\23\5\0\1\132\1\0\1\54\1\67\1\0\1\133\3\0\1\33"+
    "\1\54\2\0\1\7\1\23\6\0\4\7\1\67\1\0\1\105\1\103\1\104\1\134\1\24\1\135\1\7"+
    "\1\52\1\136\1\137\2\0\5\7\1\67\144\0\1\70\6\7\1\22\42\0\5\7\1\20\5\7\1\20"+
    "\20\7\1\23\1\125\1\45\1\0\4\7\1\32\1\17\7\7\1\54\1\0\1\54\2\7\1\20\1\0\10"+
    "\20\4\7\5\0\1\54\72\0\1\136\3\0\1\6\1\7\1\134\1\23\1\6\11\7\1\20\1\140\1\6"+
    "\12\7\1\120\1\136\4\7\1\44\1\6\12\7\1\20\2\0\3\7\1\14\6\0\170\7\1\44\11\0"+
    "\72\7\1\44\5\0\21\7\1\23\10\0\5\7\1\44\41\7\1\23\2\7\1\4\1\141\2\0\6\7\1\120"+
    "\1\32\16\7\1\22\3\0\1\54\1\7\1\103\14\7\1\50\3\7\1\20\1\7\7\0\1\54\6\7\3\0"+
    "\6\7\1\45\1\0\10\7\1\44\1\0\1\4\1\110\3\7\1\142\1\4\1\43\3\7\1\44\4\7\1\45"+
    "\1\0\3\7\1\23\10\7\1\67\1\54\1\4\1\110\2\7\1\4\1\143\6\7\1\20\1\0\1\7\1\44"+
    "\1\4\1\110\2\7\1\20\1\103\10\7\1\14\2\0\1\124\2\7\1\144\1\0\3\145\1\0\2\20"+
    "\5\7\1\120\1\44\1\0\17\7\1\146\1\4\1\110\64\7\1\45\1\0\2\7\1\20\1\125\5\7"+
    "\1\45\40\0\55\7\1\44\15\7\1\22\4\0\1\20\1\0\1\125\1\136\1\7\1\40\1\20\1\106"+
    "\1\147\15\7\1\22\3\0\1\125\54\7\1\44\2\0\10\7\1\103\6\7\5\0\1\7\1\45\2\7\2"+
    "\0\2\7\1\75\2\0\1\136\4\0\1\25\20\7\1\23\2\0\1\4\1\110\1\6\2\7\1\57\1\6\2"+
    "\7\1\14\1\70\12\7\1\20\3\103\1\150\4\0\1\7\1\36\2\7\1\20\2\7\1\151\1\7\1\44"+
    "\1\7\1\44\4\0\17\7\1\14\10\0\6\7\1\23\20\0\1\17\20\0\3\7\1\23\6\7\1\67\1\0"+
    "\1\67\3\0\4\7\2\0\3\7\1\14\5\7\1\14\3\7\1\44\4\7\1\45\1\7\1\134\5\0\23\7\1"+
    "\44\1\4\1\110\4\7\1\45\4\7\1\45\5\7\1\0\6\7\1\45\23\0\46\7\1\20\1\0\2\7\1"+
    "\44\1\0\1\7\23\0\1\44\1\40\4\7\1\32\1\152\2\7\1\44\1\0\2\7\1\20\1\0\3\7\1"+
    "\20\10\0\2\7\1\146\1\0\2\7\1\44\1\0\3\7\1\22\10\0\7\7\1\70\10\0\1\153\1\46"+
    "\1\36\1\6\2\7\1\45\1\57\4\0\3\7\1\23\3\7\1\23\4\0\1\7\1\6\2\7\1\20\3\0\6\7"+
    "\1\44\1\0\2\7\1\44\1\0\2\7\1\14\1\0\2\7\1\22\15\0\11\7\1\67\6\0\6\7\1\14\1"+
    "\0\6\7\1\14\41\0\10\7\1\20\3\0\1\64\1\4\1\0\1\54\7\7\1\14\2\0\3\7\1\67\1\4"+
    "\1\110\6\7\1\154\1\4\2\0\4\7\1\155\1\0\10\7\1\23\1\150\1\4\1\156\4\0\2\7\1"+
    "\31\4\7\1\27\10\0\1\20\1\135\1\7\1\32\1\7\1\67\7\7\1\14\1\4\1\110\1\36\1\37"+
    "\1\50\2\7\1\40\1\65\1\52\1\37\1\62\1\76\1\136\1\131\2\23\21\0\11\7\1\14\1"+
    "\4\1\110\4\0\10\7\1\32\1\0\1\4\1\110\24\0\6\7\1\44\1\7\1\67\2\0\1\44\4\0\10"+
    "\7\1\157\1\0\1\4\1\110\4\0\7\7\1\0\1\4\1\110\6\0\3\7\1\77\1\7\1\45\1\4\1\110"+
    "\54\0\10\7\1\4\1\110\1\0\1\54\70\0\7\7\1\67\40\0\1\7\1\40\4\7\1\20\1\7\1\67"+
    "\1\0\1\4\1\110\2\0\1\103\3\7\1\103\2\7\1\6\1\20\51\0\63\7\1\22\14\0\15\7\1"+
    "\20\2\0\30\7\1\45\27\0\5\7\1\20\72\0\10\7\1\20\67\0\7\7\1\67\3\7\1\20\1\4"+
    "\1\110\14\0\3\7\1\44\1\23\1\0\6\7\1\20\1\0\1\45\1\0\1\4\1\110\1\125\2\7\1"+
    "\136\2\7\56\0\10\7\1\23\1\0\5\7\1\20\1\0\1\54\2\7\10\0\1\67\3\0\75\7\1\23"+
    "\2\0\36\7\1\14\41\0\1\22\77\0\15\7\1\14\1\7\1\23\1\7\1\67\1\7\1\160\130\0"+
    "\1\136\1\77\1\14\1\125\1\42\1\45\3\0\1\161\22\0\1\150\67\0\12\7\1\25\10\7"+
    "\1\25\1\162\1\163\1\7\1\164\1\36\7\7\1\32\1\42\2\25\3\7\1\165\1\106\1\103"+
    "\1\40\51\7\1\44\3\7\1\40\2\7\1\120\3\7\1\120\2\7\1\25\3\7\1\25\2\7\1\20\3"+
    "\7\1\20\3\7\1\40\3\7\1\40\2\7\1\120\1\47\6\4\6\7\1\20\1\125\5\7\1\23\1\17"+
    "\1\0\1\133\2\0\1\125\1\6\1\7\52\0\1\20\2\7\1\50\1\147\1\14\72\0\30\7\1\23"+
    "\1\0\1\20\5\0\11\7\1\14\1\4\1\110\24\0\1\36\3\7\1\111\1\6\1\120\1\166\1\105"+
    "\1\167\1\111\1\127\1\111\2\120\1\63\1\7\1\31\1\7\1\45\1\56\1\31\1\7\1\45\116"+
    "\0\3\7\1\22\3\7\1\22\3\7\1\22\16\0\32\7\1\20\5\0\106\7\1\23\1\0\33\7\1\44"+
    "\120\7\1\22\53\0\3\7\1\44\134\0\36\7\2\0");

  /* The ZZ_CMAP_A table has 960 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\1\1\11\1\12\1\10\2\0\1\2\1\0\1\6\1\30\7\0\1\23\1\5\1\27\1\25\1"+
    "\0\12\24\3\0\1\31\3\0\22\26\1\3\1\7\1\4\1\0\1\26\1\0\1\20\3\26\1\16\1\17\5"+
    "\26\1\21\5\26\1\14\1\22\1\13\1\15\5\26\12\0\1\11\4\0\1\26\12\0\1\26\2\0\7"+
    "\26\1\0\2\26\4\0\4\26\6\0\5\26\7\0\1\26\1\0\1\26\1\0\5\26\1\0\2\26\2\0\4\26"+
    "\1\0\1\26\6\0\1\26\1\0\3\26\1\0\1\26\1\0\4\26\1\0\13\26\1\0\1\26\1\0\1\26"+
    "\7\0\2\26\1\0\2\26\1\0\1\26\2\24\4\0\6\26\1\0\10\26\2\0\2\26\1\0\6\26\2\24"+
    "\3\26\2\0\4\26\2\0\3\26\2\24\14\26\2\0\4\26\10\0\10\26\2\0\2\24\1\26\2\0\6"+
    "\26\1\0\1\26\3\0\4\26\2\0\5\26\2\0\4\26\10\0\1\26\4\0\2\26\1\0\1\26\1\0\3"+
    "\26\1\0\6\26\4\0\2\26\1\0\2\26\1\0\2\26\1\0\2\26\2\0\1\26\1\0\3\26\2\0\3\26"+
    "\3\0\4\26\1\0\1\26\7\0\2\24\1\26\1\0\2\26\1\0\5\26\1\0\3\26\2\0\1\26\15\0"+
    "\2\26\2\0\2\26\1\0\6\26\3\0\3\26\1\0\4\26\3\0\2\26\1\0\1\26\1\0\2\26\3\0\2"+
    "\26\3\0\1\26\6\0\3\26\3\0\3\26\5\0\2\26\2\0\2\26\5\0\1\26\1\0\5\26\3\0\12"+
    "\26\1\0\1\26\4\0\1\26\4\0\6\26\1\0\1\26\3\0\2\26\4\0\2\24\7\0\2\26\1\0\1\26"+
    "\2\0\2\26\1\0\1\26\2\0\1\26\3\0\3\26\1\0\1\26\1\0\1\26\2\24\2\0\4\26\5\0\1"+
    "\26\1\0\1\26\1\0\1\26\4\0\2\26\2\24\4\26\2\0\3\26\1\0\5\26\1\0\2\26\4\0\4"+
    "\26\3\0\1\26\4\0\2\26\5\0\3\26\5\0\5\26\2\24\3\0\3\26\1\0\1\26\1\0\1\26\1"+
    "\0\1\26\1\0\1\26\2\0\3\26\1\0\6\26\2\0\2\26\2\11\12\0\1\26\4\0\5\26\2\0\1"+
    "\26\1\0\4\26\1\0\1\26\5\0\5\26\4\0\1\26\2\0\2\26\2\0\3\26\2\24\2\26\7\0\1"+
    "\26\1\0\1\26\2\0\2\24\5\26\3\0\5\26\2\0\6\26\1\0\3\26\1\0\2\26\2\0\2\26\1"+
    "\0\2\26\1\0\2\26\2\0\3\26\3\0\3\26\1\0\2\26\1\0\2\26\3\0\1\26\2\0\5\26\1\0"+
    "\2\26\1\0\5\26\1\0\2\24\4\26\2\0\1\26\1\0\2\24\1\26\1\0\1\26\3\0\1\26\3\0"+
    "\1\26\3\0\2\26\3\0\2\26\3\0\4\26\4\0\1\26\2\0\2\26\2\0\4\26\1\0\4\26\1\0\1"+
    "\26\1\0\5\26\1\0\4\26\2\0\1\26\1\0\1\26\5\0\1\26\1\0\1\26\1\0\3\26");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\2\10\1\11\1\12\3\1\1\13\1\0\1\14"+
    "\4\0\1\15\2\0\1\13\1\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[29];
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
    "\0\0\0\32\0\64\0\116\0\150\0\64\0\64\0\202"+
    "\0\234\0\64\0\116\0\266\0\64\0\320\0\352\0\u0104"+
    "\0\u011e\0\u0138\0\u0152\0\64\0\u016c\0\u0186\0\u01a0\0\u01ba"+
    "\0\64\0\u01d4\0\u01ee\0\u01ba\0\64";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[29];
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
    "\1\3\2\4\1\5\1\6\1\7\4\3\1\4\10\10"+
    "\1\3\1\10\1\3\2\10\1\11\1\12\1\3\1\13"+
    "\1\14\1\15\1\6\1\3\1\16\3\3\1\14\1\17"+
    "\3\3\1\20\3\3\1\21\1\22\2\3\1\21\2\3"+
    "\33\0\2\4\7\0\1\4\32\0\10\23\1\0\4\23"+
    "\15\0\10\10\1\0\1\10\1\0\2\10\2\0\1\11"+
    "\1\0\6\11\1\0\21\11\1\0\2\14\7\0\1\14"+
    "\17\0\6\16\1\24\1\25\22\16\14\0\1\26\35\0"+
    "\1\27\35\0\1\22\31\0\1\22\1\30\10\0\1\31"+
    "\6\0\10\23\1\0\4\23\2\0\1\16\1\0\6\16"+
    "\3\0\17\16\15\0\1\32\35\0\1\33\34\0\1\34"+
    "\23\0\1\35\35\0\1\32\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[520];
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

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\2\1\2\11\2\1\1\11\2\1\1\11"+
    "\5\1\1\0\1\11\4\0\1\11\2\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[29];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

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

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  OmflLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
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
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
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
    CharSequence zzBufferL = zzBuffer;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 15: break;
          case 2: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 16: break;
          case 3: 
            { yybegin(YYINITIAL); return OmflTypes.CLOSE_ARRAY;
            } 
            // fall through
          case 17: break;
          case 4: 
            { yybegin(WAITING_VALUE); return OmflTypes.COMMA;
            } 
            // fall through
          case 18: break;
          case 5: 
            { yybegin(YYINITIAL); return OmflTypes.KEY;
            } 
            // fall through
          case 19: break;
          case 6: 
            { yybegin(YYINITIAL); return OmflTypes.COMMENT;
            } 
            // fall through
          case 20: break;
          case 7: 
            { yybegin(WAITING_VALUE); return OmflTypes.SEPARATOR;
            } 
            // fall through
          case 21: break;
          case 8: 
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 22: break;
          case 9: 
            { yybegin(WAITING_VALUE); return OmflTypes.OPEN_ARRAY;
            } 
            // fall through
          case 23: break;
          case 10: 
            { yybegin(YYINITIAL); return OmflTypes.QUOTE;
            } 
            // fall through
          case 24: break;
          case 11: 
            { yybegin(YYINITIAL); return OmflTypes.VALUE_NUM;
            } 
            // fall through
          case 25: break;
          case 12: 
            { yybegin(YYINITIAL); return OmflTypes.VALUE_STRING;
            } 
            // fall through
          case 26: break;
          case 13: 
            { yybegin(YYINITIAL); return OmflTypes.SECTION;
            } 
            // fall through
          case 27: break;
          case 14: 
            { yybegin(YYINITIAL); return OmflTypes.VALUE_BOOL;
            } 
            // fall through
          case 28: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
