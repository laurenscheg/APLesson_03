public class capitalization
{
	public String getCorrection(String text)
	{
		if (text.length()==0)
        {
            return "Please enter text.";
        }
		
		//period
		while (text.indexOf(". a")>0)
		{
			text = text.substring(0, text.indexOf(". a")) + ". A" + text.substring(text.indexOf(". a")+3,text.length());
		}
		while (text.indexOf(". b")>0)
		{
			text = text.substring(0, text.indexOf(". b")) + ". B" + text.substring(text.indexOf(". b")+3,text.length());
		}
		while (text.indexOf(". c")>0)
		{
			text = text.substring(0, text.indexOf(". c")) + ". C" + text.substring(text.indexOf(". c")+3,text.length());
		}
		while (text.indexOf(". d")>0)
		{
			text = text.substring(0, text.indexOf(". d")) + ". D" + text.substring(text.indexOf(". d")+3,text.length());
		}
		while (text.indexOf(". e")>0)
		{
			text = text.substring(0, text.indexOf(". e")) + ". E" + text.substring(text.indexOf(". e")+3,text.length());
		}
		while (text.indexOf(". f")>0)
		{
			text = text.substring(0, text.indexOf(". f")) + ". F" + text.substring(text.indexOf(". f")+3,text.length());
		}
		while (text.indexOf(". g")>0)
		{
			text = text.substring(0, text.indexOf(". g")) + ". G" + text.substring(text.indexOf(". g")+3,text.length());
		}
		while (text.indexOf(". h")>0)
		{
			text = text.substring(0, text.indexOf(". h")) + ". H" + text.substring(text.indexOf(". h")+3,text.length());
		}
		while (text.indexOf(". i")>0)
		{
			text = text.substring(0, text.indexOf(". i")) + ". I" + text.substring(text.indexOf(". i")+3,text.length());
		}
		while (text.indexOf(". j")>0)
		{
			text = text.substring(0, text.indexOf(". j")) + ". J" + text.substring(text.indexOf(". j")+3,text.length());
		}
		while (text.indexOf(". k")>0)
		{
			text = text.substring(0, text.indexOf(". k")) + ". K" + text.substring(text.indexOf(". k")+3,text.length());
		}
		while (text.indexOf(". l")>0)
		{
			text = text.substring(0, text.indexOf(". l")) + ". L" + text.substring(text.indexOf(". l")+3,text.length());
		}
		while (text.indexOf(". m")>0)
		{
			text = text.substring(0, text.indexOf(". m")) + ". M" + text.substring(text.indexOf(". m")+3,text.length());
		}
		while (text.indexOf(". n")>0)
		{
			text = text.substring(0, text.indexOf(". n")) + ". N" + text.substring(text.indexOf(". n")+3,text.length());
		}
		while (text.indexOf(". o")>0)
		{
			text = text.substring(0, text.indexOf(". o")) + ". O" + text.substring(text.indexOf(". o")+3,text.length());
		}
		while (text.indexOf(". p")>0)
		{
			text = text.substring(0, text.indexOf(". p")) + ". P" + text.substring(text.indexOf(". p")+3,text.length());
		}
		while (text.indexOf(". q")>0)
		{
			text = text.substring(0, text.indexOf(". q")) + ". Q" + text.substring(text.indexOf(". q")+3,text.length());
		}
		while (text.indexOf(". r")>0)
		{
			text = text.substring(0, text.indexOf(". r")) + ". R" + text.substring(text.indexOf(". r")+3,text.length());
		}
		while (text.indexOf(". s")>0)
		{
			text = text.substring(0, text.indexOf(". s")) + ". S" + text.substring(text.indexOf(". s")+3,text.length());
		}
		while (text.indexOf(". t")>0)
		{
			text = text.substring(0, text.indexOf(". t")) + ". T" + text.substring(text.indexOf(". t")+3,text.length());
		}
		while (text.indexOf(". u")>0)
		{
			text = text.substring(0, text.indexOf(". u")) + ". U" + text.substring(text.indexOf(". u")+3,text.length());
		}
		while (text.indexOf(". v")>0)
		{
			text = text.substring(0, text.indexOf(". v")) + ". V" + text.substring(text.indexOf(". v")+3,text.length());
		}
		while (text.indexOf(". w")>0)
		{
			text = text.substring(0, text.indexOf(". w")) + ". W" + text.substring(text.indexOf(". w")+3,text.length());
		}
		while (text.indexOf(". x")>0)
		{
			text = text.substring(0, text.indexOf(". x")) + ". X" + text.substring(text.indexOf(". x")+3,text.length());
		}
		while (text.indexOf(". y")>0)
		{
			text = text.substring(0, text.indexOf(". y")) + ". Y" + text.substring(text.indexOf(". y")+3,text.length());
		}
		while (text.indexOf(". z")>0)
		{
			text = text.substring(0, text.indexOf(". z")) + ". Z" + text.substring(text.indexOf(". z")+3,text.length());
		}
		
		//question mark
		while (text.indexOf("? a")>0)
		{
			text = text.substring(0, text.indexOf("? a")) + "? A" + text.substring(text.indexOf("? a")+3,text.length());
		}
		while (text.indexOf("? b")>0)
		{
			text = text.substring(0, text.indexOf("? b")) + "? B" + text.substring(text.indexOf("? b")+3,text.length());
		}
		while (text.indexOf("? c")>0)
		{
			text = text.substring(0, text.indexOf("? c")) + "? C" + text.substring(text.indexOf("? c")+3,text.length());
		}
		while (text.indexOf("? d")>0)
		{
			text = text.substring(0, text.indexOf("? d")) + "? D" + text.substring(text.indexOf("? d")+3,text.length());
		}
		while (text.indexOf("? e")>0)
		{
			text = text.substring(0, text.indexOf("? e")) + "? E" + text.substring(text.indexOf("? e")+3,text.length());
		}
		while (text.indexOf("? f")>0)
		{
			text = text.substring(0, text.indexOf("? f")) + "? F" + text.substring(text.indexOf("? f")+3,text.length());
		}
		while (text.indexOf("? g")>0)
		{
			text = text.substring(0, text.indexOf("? g")) + "? G" + text.substring(text.indexOf("? g")+3,text.length());
		}
		while (text.indexOf("? h")>0)
		{
			text = text.substring(0, text.indexOf("? h")) + "? H" + text.substring(text.indexOf("? h")+3,text.length());
		}
		while (text.indexOf("? i")>0)
		{
			text = text.substring(0, text.indexOf("? i")) + "? I" + text.substring(text.indexOf("? i")+3,text.length());
		}
		while (text.indexOf("? j")>0)
		{
			text = text.substring(0, text.indexOf("? j")) + "? J" + text.substring(text.indexOf("? j")+3,text.length());
		}
		while (text.indexOf("? k")>0)
		{
			text = text.substring(0, text.indexOf("? k")) + "? K" + text.substring(text.indexOf("? k")+3,text.length());
		}
		while (text.indexOf("? l")>0)
		{
			text = text.substring(0, text.indexOf("? l")) + "? L" + text.substring(text.indexOf("? l")+3,text.length());
		}
		while (text.indexOf("? m")>0)
		{
			text = text.substring(0, text.indexOf("? m")) + "? M" + text.substring(text.indexOf("? m")+3,text.length());
		}
		while (text.indexOf("? n")>0)
		{
			text = text.substring(0, text.indexOf("? n")) + "? N" + text.substring(text.indexOf("? n")+3,text.length());
		}
		while (text.indexOf("? o")>0)
		{
			text = text.substring(0, text.indexOf("? o")) + "? O" + text.substring(text.indexOf("? o")+3,text.length());
		}
		while (text.indexOf("? p")>0)
		{
			text = text.substring(0, text.indexOf("? p")) + "? P" + text.substring(text.indexOf("? p")+3,text.length());
		}
		while (text.indexOf("? q")>0)
		{
			text = text.substring(0, text.indexOf("? q")) + "? Q" + text.substring(text.indexOf("? q")+3,text.length());
		}
		while (text.indexOf("? r")>0)
		{
			text = text.substring(0, text.indexOf("? r")) + "? R" + text.substring(text.indexOf("? r")+3,text.length());
		}
		while (text.indexOf("? s")>0)
		{
			text = text.substring(0, text.indexOf("? s")) + "? S" + text.substring(text.indexOf("? s")+3,text.length());
		}
		while (text.indexOf("? t")>0)
		{
			text = text.substring(0, text.indexOf("? t")) + "? T" + text.substring(text.indexOf("? t")+3,text.length());
		}
		while (text.indexOf("? u")>0)
		{
			text = text.substring(0, text.indexOf("? u")) + "? U" + text.substring(text.indexOf("? u")+3,text.length());
		}
		while (text.indexOf("? v")>0)
		{
			text = text.substring(0, text.indexOf("? v")) + "? V" + text.substring(text.indexOf("? v")+3,text.length());
		}
		while (text.indexOf("? w")>0)
		{
			text = text.substring(0, text.indexOf("? w")) + "? W" + text.substring(text.indexOf("? w")+3,text.length());
		}
		while (text.indexOf("? x")>0)
		{
			text = text.substring(0, text.indexOf("? x")) + "? X" + text.substring(text.indexOf("? x")+3,text.length());
		}
		while (text.indexOf("? y")>0)
		{
			text = text.substring(0, text.indexOf("? y")) + "? Y" + text.substring(text.indexOf("? y")+3,text.length());
		}
		while (text.indexOf("? z")>0)
		{
			text = text.substring(0, text.indexOf("? z")) + "? Z" + text.substring(text.indexOf("? z")+3,text.length());
		}
		
		//exclamation point
		while (text.indexOf("! a")>0)
		{
			text = text.substring(0, text.indexOf("! a")) + "! A" + text.substring(text.indexOf("! a")+3,text.length());
		}
		while (text.indexOf("! b")>0)
		{
			text = text.substring(0, text.indexOf("! b")) + "! B" + text.substring(text.indexOf("! b")+3,text.length());
		}
		while (text.indexOf("! c")>0)
		{
			text = text.substring(0, text.indexOf("! c")) + "! C" + text.substring(text.indexOf("! c")+3,text.length());
		}
		while (text.indexOf("! d")>0)
		{
			text = text.substring(0, text.indexOf("! d")) + "! D" + text.substring(text.indexOf("! d")+3,text.length());
		}
		while (text.indexOf("! e")>0)
		{
			text = text.substring(0, text.indexOf("! e")) + "! E" + text.substring(text.indexOf("! e")+3,text.length());
		}
		while (text.indexOf("! f")>0)
		{
			text = text.substring(0, text.indexOf("! f")) + "! F" + text.substring(text.indexOf("! f")+3,text.length());
		}
		while (text.indexOf("! g")>0)
		{
			text = text.substring(0, text.indexOf("! g")) + "! G" + text.substring(text.indexOf("! g")+3,text.length());
		}
		while (text.indexOf("! h")>0)
		{
			text = text.substring(0, text.indexOf("! h")) + "! H" + text.substring(text.indexOf("! h")+3,text.length());
		}
		while (text.indexOf("! i")>0)
		{
			text = text.substring(0, text.indexOf("! i")) + "! I" + text.substring(text.indexOf("! i")+3,text.length());
		}
		while (text.indexOf("! j")>0)
		{
			text = text.substring(0, text.indexOf("! j")) + "! J" + text.substring(text.indexOf("! j")+3,text.length());
		}
		while (text.indexOf("! k")>0)
		{
			text = text.substring(0, text.indexOf("! k")) + "! K" + text.substring(text.indexOf("! k")+3,text.length());
		}
		while (text.indexOf("! l")>0)
		{
			text = text.substring(0, text.indexOf("! l")) + "! L" + text.substring(text.indexOf("! l")+3,text.length());
		}
		while (text.indexOf("! m")>0)
		{
			text = text.substring(0, text.indexOf("! m")) + "! M" + text.substring(text.indexOf("! m")+3,text.length());
		}
		while (text.indexOf("! n")>0)
		{
			text = text.substring(0, text.indexOf("! n")) + "! N" + text.substring(text.indexOf("! n")+3,text.length());
		}
		while (text.indexOf("! o")>0)
		{
			text = text.substring(0, text.indexOf("! o")) + "! O" + text.substring(text.indexOf("! o")+3,text.length());
		}
		while (text.indexOf("! p")>0)
		{
			text = text.substring(0, text.indexOf("! p")) + "! P" + text.substring(text.indexOf("! p")+3,text.length());
		}
		while (text.indexOf("! q")>0)
		{
			text = text.substring(0, text.indexOf("! q")) + "! Q" + text.substring(text.indexOf("! q")+3,text.length());
		}
		while (text.indexOf("! r")>0)
		{
			text = text.substring(0, text.indexOf("! r")) + "! R" + text.substring(text.indexOf("! r")+3,text.length());
		}
		while (text.indexOf("! s")>0)
		{
			text = text.substring(0, text.indexOf("! s")) + "! S" + text.substring(text.indexOf("! s")+3,text.length());
		}
		while (text.indexOf("! t")>0)
		{
			text = text.substring(0, text.indexOf("! t")) + "! T" + text.substring(text.indexOf("! t")+3,text.length());
		}
		while (text.indexOf("! u")>0)
		{
			text = text.substring(0, text.indexOf("! u")) + "! U" + text.substring(text.indexOf("! u")+3,text.length());
		}
		while (text.indexOf("! v")>0)
		{
			text = text.substring(0, text.indexOf("! v")) + "! V" + text.substring(text.indexOf("! v")+3,text.length());
		}
		while (text.indexOf("! w")>0)
		{
			text = text.substring(0, text.indexOf("! w")) + "! W" + text.substring(text.indexOf("! w")+3,text.length());
		}
		while (text.indexOf("! x")>0)
		{
			text = text.substring(0, text.indexOf("! x")) + "! X" + text.substring(text.indexOf("! x")+3,text.length());
		}
		while (text.indexOf("! y")>0)
		{
			text = text.substring(0, text.indexOf("! y")) + "! Y" + text.substring(text.indexOf("! y")+3,text.length());
		}
		while (text.indexOf("! z")>0)
		{
			text = text.substring(0, text.indexOf("! z")) + "! Z" + text.substring(text.indexOf("! z")+3,text.length());
		}
		
		
		// first letter
		while (text.indexOf("a")==0)
		{
			text = "A" + text.substring(1,text.length());
		}
		while (text.indexOf("b")==0)
		{
			text = "B" + text.substring(1,text.length());
		}
		while (text.indexOf("c")==0)
		{
			text = "C" + text.substring(1,text.length());
		}
		while (text.indexOf("d")==0)
		{
			text = "D" + text.substring(1,text.length());
		}
		while (text.indexOf("e")==0)
		{
			text = "E" + text.substring(1,text.length());
		}
		while (text.indexOf("f")==0)
		{
			text = "F" + text.substring(1,text.length());
		}
		while (text.indexOf("g")==0)
		{
			text = "G" + text.substring(1,text.length());
		}
		while (text.indexOf("h")==0)
		{
			text = "H" + text.substring(1,text.length());
		}
		while (text.indexOf("i")==0)
		{
			text = "I" + text.substring(1,text.length());
		}while (text.indexOf("j")==0)
		{
			text = "J" + text.substring(1,text.length());
		}
		while (text.indexOf("k")==0)
		{
			text = "K" + text.substring(1,text.length());
		}
		while (text.indexOf("l")==0)
		{
			text = "L" + text.substring(1,text.length());
		}
		while (text.indexOf("m")==0)
		{
			text = "M" + text.substring(1,text.length());
		}
		while (text.indexOf("n")==0)
		{
			text = "N" + text.substring(1,text.length());
		}
		while (text.indexOf("o")==0)
		{
			text = "O" + text.substring(1,text.length());
		}
		while (text.indexOf("p")==0)
		{
			text = "P" + text.substring(1,text.length());
		}
		while (text.indexOf("q")==0)
		{
			text = "Q" + text.substring(1,text.length());
		}
		while (text.indexOf("r")==0)
		{
			text = "R" + text.substring(1,text.length());
		}
		while (text.indexOf("s")==0)
		{
			text = "S" + text.substring(1,text.length());
		}
		while (text.indexOf("t")==0)
		{
			text = "T" + text.substring(1,text.length());
		}
		while (text.indexOf("u")==0)
		{
			text = "U" + text.substring(1,text.length());
		}
		while (text.indexOf("v")==0)
		{
			text = "V" + text.substring(1,text.length());
		}
		while (text.indexOf("w")==0)
		{
			text = "W" + text.substring(1,text.length());
		}
		while (text.indexOf("x")==0)
		{
			text = "X" + text.substring(1,text.length());
		}
		while (text.indexOf("y")==0)
		{
			text = "Y" + text.substring(1,text.length());
		}
		while (text.indexOf("z")==0)
		{
			text = "Z" + text.substring(1,text.length());
		}
		
		//i
		while (text.indexOf(" i ")>0)
		{
			text = text.substring(0, text.indexOf(" i ")) + " I " + text.substring(text.indexOf(" i ")+3,text.length());
		}
		while (text.indexOf(" i'm ")>0)
		{
			text = text.substring(0, text.indexOf(" i'm ")) + " I'm " + text.substring(text.indexOf(" i'm ")+5,text.length());
		}
		while (text.indexOf(" im ")>0)
		{
			text = text.substring(0, text.indexOf(" im ")) + " Im " + text.substring(text.indexOf(" im ")+4,text.length());
		}
		while (text.indexOf(" i'll ")>0)
		{
			text = text.substring(0, text.indexOf(" i'll ")) + " I'll" + text.substring(text.indexOf(" i'll ")+6,text.length());
		}
		while (text.indexOf(" ill ")>0)
		{
			text = text.substring(0, text.indexOf(" ill ")) + " Ill" + text.substring(text.indexOf(" ill ")+5,text.length());
		}
		while (text.indexOf(" i'd ")>0)
		{
			text = text.substring(0, text.indexOf(" i'd ")) + " I'd " + text.substring(text.indexOf(" i'd ")+5,text.length());
		}
		while (text.indexOf(" id ")>0)
		{
			text = text.substring(0, text.indexOf(" id ")) + " Id " + text.substring(text.indexOf(" id ")+4,text.length());
		}
		while (text.indexOf(" i've ")>0)
		{
			text = text.substring(0, text.indexOf(" i've ")) + " I've" + text.substring(text.indexOf(" i've ")+6,text.length());
		}
		while (text.indexOf(" ive ")>0)
		{
			text = text.substring(0, text.indexOf(" ive ")) + " Ive" + text.substring(text.indexOf(" ive ")+5,text.length());
		}

		return text;	
	}
	
}