
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package org.example;

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\002\004\000\002\005\003\000\002\002" +
    "\004\000\002\002\002\000\002\004\006\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\003\005\000" +
    "\002\003\005\000\002\003\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\006\002\ufffe\014\004\001\002\000\004\007" +
    "\012\001\002\000\006\002\ufffe\014\004\001\002\000\004" +
    "\002\010\001\002\000\004\002\000\001\002\000\004\002" +
    "\001\001\002\000\004\002\uffff\001\002\000\010\004\014" +
    "\014\013\015\015\001\002\000\016\005\ufff6\006\ufff6\010" +
    "\ufff6\011\ufff6\012\ufff6\013\ufff6\001\002\000\010\004\014" +
    "\014\013\015\015\001\002\000\016\005\ufff7\006\ufff7\010" +
    "\ufff7\011\ufff7\012\ufff7\013\ufff7\001\002\000\014\006\021" +
    "\010\020\011\022\012\017\013\023\001\002\000\010\004" +
    "\014\014\013\015\015\001\002\000\010\004\014\014\013" +
    "\015\015\001\002\000\006\002\ufffd\014\ufffd\001\002\000" +
    "\010\004\014\014\013\015\015\001\002\000\010\004\014" +
    "\014\013\015\015\001\002\000\016\005\ufff9\006\ufff9\010" +
    "\ufff9\011\ufff9\012\ufff9\013\ufff9\001\002\000\016\005\ufffb" +
    "\006\ufffb\010\ufffb\011\ufffb\012\017\013\023\001\002\000" +
    "\016\005\ufffc\006\ufffc\010\ufffc\011\ufffc\012\017\013\023" +
    "\001\002\000\016\005\ufffa\006\ufffa\010\ufffa\011\ufffa\012" +
    "\ufffa\013\ufffa\001\002\000\014\005\031\010\020\011\022" +
    "\012\017\013\023\001\002\000\016\005\ufff8\006\ufff8\010" +
    "\ufff8\011\ufff8\012\ufff8\013\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\010\002\006\004\004\005\005\001\001\000" +
    "\002\001\001\000\006\002\010\004\004\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\015\001\001\000\002\001\001\000\004" +
    "\003\027\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\003\026\001\001\000\004\003\025\001\001\000\002" +
    "\001\001\000\004\003\024\001\001\000\004\003\023\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    ParserUtils parserUtils = new ParserUtils();

    public void syntax_error(Symbol s){
            System.out.println("Error Sintáctico en la Línea " + (s.left) +
            " Columna "+s.right+ ". No se esperaba este componente: " +s.value+".");
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
            System.out.println("Error síntactico irrecuperable en la Línea " +
            (s.left)+ " Columna "+s.right+". Componente " + s.value +
            " no reconocido.");
    }




/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio_p EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio_p ::= inicio 
            {
              String RESULT =null;
		  parserUtils.mostrarC3D(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio_p",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicio ::= asign inicio 
            {
              String RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // inicio ::= 
            {
              String RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // asign ::= ID IGUAL expr PUNTO_COMA 
            {
              String RESULT =null;
		int valIdleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int valIdright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String valId = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = parserUtils.guardarExprFinal(val,valId); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("asign",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr MAS expr 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = parserUtils.guardarOperacion(val1,val2,"+"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr MENOS expr 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = parserUtils.guardarOperacion(val1,val2,"-"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr MULT expr 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = parserUtils.guardarOperacion(val1,val2,"*"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr DIV expr 
            {
              String RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String val1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String val2 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = parserUtils.guardarOperacion(val1,val2,"/");  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= PAR_A expr PAR_C 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = parserUtils.guardarOperacion(val,"","");   
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= DIGITO 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = val ; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= ID 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = val; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
