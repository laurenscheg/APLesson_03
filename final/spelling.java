public class spelling
{
	public String getCorrection(String text)
	{
		if (text.length()==0)
        {
            return "Please enter text.";
        }
		while (text.indexOf(" tomorow ")>=0)
		{
			text = text.substring(0, text.indexOf(" tomorow ")) + " tomorrow " + text.substring(text.indexOf(" tomorow ")+9,text.length());
		}
		while (text.indexOf("Tomorow ")>=0)
		{
			text = text.substring(0, text.indexOf("Tomorow ")) + "Tomorrow " + text.substring(text.indexOf("Tomorow ")+8,text.length());
		}
		while (text.indexOf(" tommorow ")>=0)
		{
			text = text.substring(0, text.indexOf(" tommorow ")) + " tomorrow " + text.substring(text.indexOf(" tommorow ")+10,text.length());
		}
		while (text.indexOf("Tommorow ")>=0)
		{
			text = text.substring(0, text.indexOf("Tommorow ")) + "Tomorrow " + text.substring(text.indexOf("Tommorow ")+9,text.length());
		}
		while (text.indexOf(" tommorrow ")>=0)
		{
			text = text.substring(0, text.indexOf(" tommorrow ")) + " tomorrow " + text.substring(text.indexOf(" tommorrow ")+11,text.length());
		}
		while (text.indexOf("Tommorrow ")>=0)
		{
			text = text.substring(0, text.indexOf("Tommorrow ")) + "Tomorrow " + text.substring(text.indexOf("Tommorrow ")+10,text.length());
		}
		while (text.indexOf(" seperate ")>=0)
		{
			text = text.substring(0, text.indexOf(" seperate ")) + " separate " + text.substring(text.indexOf(" seperate ")+10,text.length());
		}
		while (text.indexOf("Seperate ")>=0)
		{
			text = text.substring(0, text.indexOf("Seperate ")) + "Separate " + text.substring(text.indexOf("Seperate ")+9,text.length());
		}
		while (text.indexOf(" alot ")>=0)
		{
			text = text.substring(0, text.indexOf(" alot ")) + " a lot " + text.substring(text.indexOf(" alot ")+6,text.length());
		}
		while (text.indexOf("Alot ")>=0)
		{
			text = text.substring(0, text.indexOf("Alot ")) + "A lot " + text.substring(text.indexOf("Alot ")+5,text.length());
		}
		while (text.indexOf(" neccessary ")>=0)
		{
			text = text.substring(0, text.indexOf(" neccessary ")) + " necessary " + text.substring(text.indexOf(" neccessary ")+11,text.length());
		}
		while (text.indexOf("Neccessary ")>=0)
		{
			text = text.substring(0, text.indexOf("Neccessary ")) + "Necessary " + text.substring(text.indexOf("Neccessary ")+10,text.length());
		}
		while (text.indexOf(" neccesary ")>=0)
		{
			text = text.substring(0, text.indexOf(" neccesary ")) + " necessary " + text.substring(text.indexOf(" neccesary ")+10,text.length());
		}
		while (text.indexOf("Neccesary ")>=0)
		{
			text = text.substring(0, text.indexOf("Neccesary ")) + "Necessary " + text.substring(text.indexOf("Neccesary ")+9,text.length());
		}
		while (text.indexOf(" necesary ")>=0)
		{
			text = text.substring(0, text.indexOf(" necesary ")) + " necessary " + text.substring(text.indexOf(" necesary ")+10,text.length());
		}
		while (text.indexOf("Necesary ")>=0)
		{
			text = text.substring(0, text.indexOf("Necesary ")) + "Necessary " + text.substring(text.indexOf("Necesary ")+9,text.length());
		}
		while (text.indexOf(" recieve ")>=0)
		{
			text = text.substring(0, text.indexOf(" recieve ")) + " receive " + text.substring(text.indexOf(" recieve ")+9,text.length());
		}
		while (text.indexOf("Recieve ")>=0)
		{
			text = text.substring(0, text.indexOf("Recieve ")) + "Receive " + text.substring(text.indexOf("Recieve ")+8,text.length());
		}
		while (text.indexOf(" occassion ")>=0)
		{
			text = text.substring(0, text.indexOf(" occassion ")) + " occasion " + text.substring(text.indexOf(" occassion ")+11,text.length());
		}
		while (text.indexOf("Occassion ")>=0)
		{
			text = text.substring(0, text.indexOf("Occassion ")) + "Occasion " + text.substring(text.indexOf("Occassion ")+10,text.length());
		}
		while (text.indexOf(" ocasion ")>=0)
		{
			text = text.substring(0, text.indexOf(" ocasion ")) + " occasion " + text.substring(text.indexOf(" ocasion ")+9,text.length());
		}
		while (text.indexOf("Ocasion ")>=0)
		{
			text = text.substring(0, text.indexOf("Ocasion ")) + "Occasion " + text.substring(text.indexOf("Ocasion ")+8,text.length());
		}
		while (text.indexOf(" ocassion ")>=0)
		{
			text = text.substring(0, text.indexOf(" ocassion ")) + " occasion " + text.substring(text.indexOf(" ocassion ")+10,text.length());
		}
		while (text.indexOf("Ocassion ")>=0)
		{
			text = text.substring(0, text.indexOf("Ocassion ")) + "Occasion " + text.substring(text.indexOf("Ocassion ")+9,text.length());
		}
		while (text.indexOf(" momento ")>=0)
		{
			text = text.substring(0, text.indexOf(" momento ")) + " memento " + text.substring(text.indexOf(" memento ")+9,text.length());
		}
		while (text.indexOf("Momento ")>=0)
		{
			text = text.substring(0, text.indexOf("Momento ")) + "Memento " + text.substring(text.indexOf("Memento ")+8,text.length());
		}
		while (text.indexOf(" privelege ")>=0)
		{
			text = text.substring(0, text.indexOf(" privelege ")) + " privilege " + text.substring(text.indexOf(" privelege ")+11,text.length());
		}
		while (text.indexOf("Privelege ")>=0)
		{
			text = text.substring(0, text.indexOf("Privelege ")) + "Privilege " + text.substring(text.indexOf("Privelege ")+10,text.length());
		}
		while (text.indexOf(" priviledge ")>=0)
		{
			text = text.substring(0, text.indexOf(" priviledge ")) + " privilege " + text.substring(text.indexOf(" priviledge ")+12,text.length());
		}
		while (text.indexOf("Priviledge ")>=0)
		{
			text = text.substring(0, text.indexOf("Priviledge ")) + "Privilege " + text.substring(text.indexOf("Priviledge ")+11,text.length());
		}
		while (text.indexOf(" truely ")>=0)
		{
			text = text.substring(0, text.indexOf(" truely ")) + " truly " + text.substring(text.indexOf(" truely ")+8,text.length());
		}
		while (text.indexOf("Truely ")>=0)
		{
			text = text.substring(0, text.indexOf("Truely ")) + "Truly " + text.substring(text.indexOf("Truely ")+7,text.length());
		}
		while (text.indexOf(" definately ")>=0)
		{
			text = text.substring(0, text.indexOf(" definately ")) + " definitely " + text.substring(text.indexOf(" definately ")+12,text.length());
		}
		while (text.indexOf("Definately ")>=0)
		{
			text = text.substring(0, text.indexOf("Definately ")) + "Definitely " + text.substring(text.indexOf("Definately ")+11,text.length());
		}
		while (text.indexOf(" mispell ")>=0)
		{
			text = text.substring(0, text.indexOf(" mispell ")) + " misspell " + text.substring(text.indexOf(" mispell ")+9,text.length());
		}
		while (text.indexOf("Mispell ")>=0)
		{
			text = text.substring(0, text.indexOf("Mispell ")) + "Misspell " + text.substring(text.indexOf("Mispell ")+8,text.length());
		}
		while (text.indexOf(" pronounciation ")>=0)
		{
			text = text.substring(0, text.indexOf(" pronounciation ")) + " pronunciation " + text.substring(text.indexOf(" pronounciation ")+16,text.length());
		}
		while (text.indexOf("Pronounciation ")>=0)
		{
			text = text.substring(0, text.indexOf("Pronounciation ")) + "Pronunciation " + text.substring(text.indexOf("Pronounciation ")+15,text.length());
		}
		while (text.indexOf(" maintainance ")>=0)
		{
			text = text.substring(0, text.indexOf(" maintainance")) + " maintenance " + text.substring(text.indexOf(" maintainance ")+14,text.length());
		}
		while (text.indexOf("Maintainance ")>=0)
		{
			text = text.substring(0, text.indexOf("Maintainance")) + "Maintenance " + text.substring(text.indexOf("Maintainance ")+13,text.length());
		}
		while (text.indexOf(" maintainence ")>=0)
		{
			text = text.substring(0, text.indexOf(" maintainence")) + " maintenance " + text.substring(text.indexOf(" maintainence ")+14,text.length());
		}
		while (text.indexOf("Maintainence ")>=0)
		{
			text = text.substring(0, text.indexOf("Maintainence")) + "Maintenance " + text.substring(text.indexOf("Maintainence ")+13,text.length());
		}
		while (text.indexOf(" occurrance ")>=0)
		{
			text = text.substring(0, text.indexOf(" occurrance ")) + " occurrence " + text.substring(text.indexOf(" occurrance ")+12,text.length());
		}
		while (text.indexOf("Occurrance ")>=0)
		{
			text = text.substring(0, text.indexOf("Occurrance ")) + "Occurrence " + text.substring(text.indexOf("Occurrance ")+11,text.length());
		}
		while (text.indexOf(" ocurrance ")>=0)
		{
			text = text.substring(0, text.indexOf(" ocurrance ")) + " occurrence " + text.substring(text.indexOf(" ocurrance ")+11,text.length());
		}
		while (text.indexOf("Ocurrance ")>=0)
		{
			text = text.substring(0, text.indexOf("Ocurrance ")) + "Occurrence " + text.substring(text.indexOf("Ocurrance ")+10,text.length());
		}
		while (text.indexOf(" ocurrence ")>=0)
		{
			text = text.substring(0, text.indexOf(" ocurrence ")) + " occurrence " + text.substring(text.indexOf(" ocurrence ")+11,text.length());
		}
		while (text.indexOf("Ocurrence ")>=0)
		{
			text = text.substring(0, text.indexOf("Ocurrence ")) + "Occurrence " + text.substring(text.indexOf("Ocurrence ")+10,text.length());
		}
		while (text.indexOf(" occurance ")>=0)
		{
			text = text.substring(0, text.indexOf(" occurance ")) + " occurrence " + text.substring(text.indexOf(" occurance ")+11,text.length());
		}
		while (text.indexOf("Occurance ")>=0)
		{
			text = text.substring(0, text.indexOf("Occurance ")) + "Occurrence " + text.substring(text.indexOf("Occurance ")+10,text.length());
		}
		while (text.indexOf(" occurence ")>=0)
		{
			text = text.substring(0, text.indexOf(" occurence ")) + " occurrence " + text.substring(text.indexOf(" occurence ")+11,text.length());
		}
		while (text.indexOf("Occurence ")>=0)
		{
			text = text.substring(0, text.indexOf("Occurence ")) + "Occurrence " + text.substring(text.indexOf("Occurence ")+10,text.length());
		}
		while (text.indexOf(" ocurance ")>=0)
		{
			text = text.substring(0, text.indexOf(" ocurance ")) + " occurrence " + text.substring(text.indexOf(" ocurance ")+10,text.length());
		}
		while (text.indexOf("Ocurance ")>=0)
		{
			text = text.substring(0, text.indexOf("Ocurance ")) + "Occurrence " + text.substring(text.indexOf("Ocurance ")+9,text.length());
		}
		while (text.indexOf(" ocurence ")>=0)
		{
			text = text.substring(0, text.indexOf(" ocurence ")) + " occurrence " + text.substring(text.indexOf(" ocurence ")+10,text.length());
		}
		while (text.indexOf("Ocurence ")>=0)
		{
			text = text.substring(0, text.indexOf("Ocurence ")) + "Occurrence " + text.substring(text.indexOf("Ocurence ")+9,text.length());
		}
		
		//typos
		while (text.indexOf(" teh ")>=0)
		{
			text = text.substring(0, text.indexOf(" teh ")) + " the " + text.substring(text.indexOf(" teh ")+5,text.length());
		}
		while (text.indexOf("Teh ")>=0)
		{
			text = text.substring(0, text.indexOf("Teh ")) + "The " + text.substring(text.indexOf("Teh ")+4,text.length());
		}
		while (text.indexOf(" becuase ")>=0)
		{
			text = text.substring(0, text.indexOf(" becuase ")) + " because " + text.substring(text.indexOf(" becuase ")+9,text.length());
		}
		while (text.indexOf("Becuase ")>=0)
		{
			text = text.substring(0, text.indexOf("Becuase ")) + "Because " + text.substring(text.indexOf("Becuase ")+8,text.length());
		}
		while (text.indexOf(" becasue ")>=0)
		{
			text = text.substring(0, text.indexOf(" becasue ")) + " because " + text.substring(text.indexOf(" becasue ")+9,text.length());
		}
		while (text.indexOf("Becasue ")>=0)
		{
			text = text.substring(0, text.indexOf("Becuase ")) + "Because " + text.substring(text.indexOf("Becuase ")+8,text.length());
		}
		while (text.indexOf(" tahts ")>=0)
		{
			text = text.substring(0, text.indexOf(" tahts ")) + " that's " + text.substring(text.indexOf(" tahts ")+7,text.length());
		}
		while (text.indexOf("Tahts ")>=0)
		{
			text = text.substring(0, text.indexOf("Tahts ")) + "That's " + text.substring(text.indexOf("Tahts ")+6,text.length());
		}
		while (text.indexOf("thign ")>=0)
		{
			text = text.substring(0, text.indexOf("thign ")) + "thing " + text.substring(text.indexOf("thign ")+6,text.length());
		}
		while (text.indexOf("Thign ")>=0)
		{
			text = text.substring(0, text.indexOf("Thign ")) + "Thing " + text.substring(text.indexOf("Thign ")+6,text.length());
		}
		while (text.indexOf(" tomorow.")>=0)
		{
			text = text.substring(0, text.indexOf(" tomorow.")) + " tomorrow." + text.substring(text.indexOf(" tomorow.")+9,text.length());
		}
		while (text.indexOf("Tomorow.")>=0)
		{
			text = text.substring(0, text.indexOf("Tomorow.")) + "Tomorrow." + text.substring(text.indexOf("Tomorow.")+8,text.length());
		}
		while (text.indexOf(" tommorow.")>=0)
		{
			text = text.substring(0, text.indexOf(" tommorow.")) + " tomorrow." + text.substring(text.indexOf(" tommorow.")+10,text.length());
		}
		while (text.indexOf("Tommorow.")>=0)
		{
			text = text.substring(0, text.indexOf("Tommorow.")) + "Tomorrow." + text.substring(text.indexOf("Tommorow.")+9,text.length());
		}
		while (text.indexOf(" tommorrow.")>=0)
		{
			text = text.substring(0, text.indexOf(" tommorrow.")) + " tomorrow." + text.substring(text.indexOf(" tommorrow.")+11,text.length());
		}
		while (text.indexOf("Tommorrow.")>=0)
		{
			text = text.substring(0, text.indexOf("Tommorrow.")) + "Tomorrow." + text.substring(text.indexOf("Tommorrow.")+10,text.length());
		}
		while (text.indexOf(" seperate.")>=0)
		{
			text = text.substring(0, text.indexOf(" seperate.")) + " separate." + text.substring(text.indexOf(" seperate.")+10,text.length());
		}
		while (text.indexOf("Seperate.")>=0)
		{
			text = text.substring(0, text.indexOf("Seperate.")) + "Separate." + text.substring(text.indexOf("Seperate.")+9,text.length());
		}
		while (text.indexOf(" alot.")>=0)
		{
			text = text.substring(0, text.indexOf(" alot.")) + " a lot." + text.substring(text.indexOf(" alot.")+6,text.length());
		}
		while (text.indexOf("Alot.")>=0)
		{
			text = text.substring(0, text.indexOf("Alot.")) + "A lot." + text.substring(text.indexOf("Alot.")+5,text.length());
		}
		while (text.indexOf(" neccessary.")>=0)
		{
			text = text.substring(0, text.indexOf(" neccessary.")) + " necessary." + text.substring(text.indexOf(" neccessary.")+11,text.length());
		}
		while (text.indexOf("Neccessary.")>=0)
		{
			text = text.substring(0, text.indexOf("Neccessary.")) + "Necessary." + text.substring(text.indexOf("Neccessary.")+10,text.length());
		}
		while (text.indexOf(" neccesary.")>=0)
		{
			text = text.substring(0, text.indexOf(" neccesary.")) + " necessary." + text.substring(text.indexOf(" neccesary.")+10,text.length());
		}
		while (text.indexOf("Neccesary.")>=0)
		{
			text = text.substring(0, text.indexOf("Neccesary.")) + "Necessary." + text.substring(text.indexOf("Neccesary.")+9,text.length());
		}
		while (text.indexOf(" necesary.")>=0)
		{
			text = text.substring(0, text.indexOf(" necesary.")) + " necessary." + text.substring(text.indexOf(" necesary.")+10,text.length());
		}
		while (text.indexOf("Necesary.")>=0)
		{
			text = text.substring(0, text.indexOf("Necesary.")) + "Necessary." + text.substring(text.indexOf("Necesary.")+9,text.length());
		}
		while (text.indexOf(" recieve.")>=0)
		{
			text = text.substring(0, text.indexOf(" recieve.")) + " receive." + text.substring(text.indexOf(" recieve.")+9,text.length());
		}
		while (text.indexOf("Recieve.")>=0)
		{
			text = text.substring(0, text.indexOf("Recieve.")) + "Receive." + text.substring(text.indexOf("Recieve.")+8,text.length());
		}
		while (text.indexOf(" occassion.")>=0)
		{
			text = text.substring(0, text.indexOf(" occassion.")) + " occasion." + text.substring(text.indexOf(" occassion.")+11,text.length());
		}
		while (text.indexOf("Occassion.")>=0)
		{
			text = text.substring(0, text.indexOf("Occassion.")) + "Occasion." + text.substring(text.indexOf("Occassion.")+10,text.length());
		}
		while (text.indexOf(" ocasion.")>=0)
		{
			text = text.substring(0, text.indexOf(" ocasion.")) + " occasion." + text.substring(text.indexOf(" ocasion.")+9,text.length());
		}
		while (text.indexOf("Ocasion.")>=0)
		{
			text = text.substring(0, text.indexOf("Ocasion.")) + "Occasion." + text.substring(text.indexOf("Ocasion.")+8,text.length());
		}
		while (text.indexOf(" ocassion.")>=0)
		{
			text = text.substring(0, text.indexOf(" ocassion.")) + " occasion." + text.substring(text.indexOf(" ocassion.")+10,text.length());
		}
		while (text.indexOf("Ocassion.")>=0)
		{
			text = text.substring(0, text.indexOf("Ocassion.")) + "Occasion." + text.substring(text.indexOf("Ocassion.")+9,text.length());
		}
		while (text.indexOf(" momento.")>=0)
		{
			text = text.substring(0, text.indexOf(" momento.")) + " memento." + text.substring(text.indexOf(" memento.")+9,text.length());
		}
		while (text.indexOf("Momento.")>=0)
		{
			text = text.substring(0, text.indexOf("Momento.")) + "Memento." + text.substring(text.indexOf("Memento.")+8,text.length());
		}
		while (text.indexOf(" privelege.")>=0)
		{
			text = text.substring(0, text.indexOf(" privelege.")) + " privilege." + text.substring(text.indexOf(" privelege.")+11,text.length());
		}
		while (text.indexOf("Privelege.")>=0)
		{
			text = text.substring(0, text.indexOf("Privelege.")) + "Privilege." + text.substring(text.indexOf("Privelege.")+10,text.length());
		}
		while (text.indexOf(" priviledge.")>=0)
		{
			text = text.substring(0, text.indexOf(" priviledge.")) + " privilege." + text.substring(text.indexOf(" priviledge.")+12,text.length());
		}
		while (text.indexOf("Priviledge.")>=0)
		{
			text = text.substring(0, text.indexOf("Priviledge.")) + "Privilege." + text.substring(text.indexOf("Priviledge.")+11,text.length());
		}
		while (text.indexOf(" truely.")>=0)
		{
			text = text.substring(0, text.indexOf(" truely.")) + " truly." + text.substring(text.indexOf(" truely.")+8,text.length());
		}
		while (text.indexOf("Truely.")>=0)
		{
			text = text.substring(0, text.indexOf("Truely.")) + "Truly." + text.substring(text.indexOf("Truely.")+7,text.length());
		}
		while (text.indexOf(" definately.")>=0)
		{
			text = text.substring(0, text.indexOf(" definately.")) + " definitely." + text.substring(text.indexOf(" definately.")+12,text.length());
		}
		while (text.indexOf("Definately.")>=0)
		{
			text = text.substring(0, text.indexOf("Definately.")) + "Definitely." + text.substring(text.indexOf("Definately.")+11,text.length());
		}
		while (text.indexOf(" mispell.")>=0)
		{
			text = text.substring(0, text.indexOf(" mispell.")) + " misspell." + text.substring(text.indexOf(" mispell.")+9,text.length());
		}
		while (text.indexOf("Mispell.")>=0)
		{
			text = text.substring(0, text.indexOf("Mispell.")) + "Misspell." + text.substring(text.indexOf("Mispell.")+8,text.length());
		}
		while (text.indexOf(" pronounciation.")>=0)
		{
			text = text.substring(0, text.indexOf(" pronounciation.")) + " pronunciation." + text.substring(text.indexOf(" pronounciation.")+16,text.length());
		}
		while (text.indexOf("Pronounciation.")>=0)
		{
			text = text.substring(0, text.indexOf("Pronounciation.")) + "Pronunciation." + text.substring(text.indexOf("Pronounciation.")+15,text.length());
		}
		while (text.indexOf(" maintainance.")>=0)
		{
			text = text.substring(0, text.indexOf(" maintainance")) + " maintenance." + text.substring(text.indexOf(" maintainance.")+14,text.length());
		}
		while (text.indexOf("Maintainance.")>=0)
		{
			text = text.substring(0, text.indexOf("Maintainance")) + "Maintenance." + text.substring(text.indexOf("Maintainance.")+13,text.length());
		}
		while (text.indexOf(" maintainence.")>=0)
		{
			text = text.substring(0, text.indexOf(" maintainence")) + " maintenance." + text.substring(text.indexOf(" maintainence.")+14,text.length());
		}
		while (text.indexOf("Maintainence.")>=0)
		{
			text = text.substring(0, text.indexOf("Maintainence")) + "Maintenance." + text.substring(text.indexOf("Maintainence.")+13,text.length());
		}
		while (text.indexOf(" occurrance.")>=0)
		{
			text = text.substring(0, text.indexOf(" occurrance.")) + " occurrence." + text.substring(text.indexOf(" occurrance.")+12,text.length());
		}
		while (text.indexOf("Occurrance.")>=0)
		{
			text = text.substring(0, text.indexOf("Occurrance.")) + "Occurrence." + text.substring(text.indexOf("Occurrance.")+11,text.length());
		}
		while (text.indexOf(" ocurrance.")>=0)
		{
			text = text.substring(0, text.indexOf(" ocurrance.")) + " occurrence." + text.substring(text.indexOf(" ocurrance.")+11,text.length());
		}
		while (text.indexOf("Ocurrance.")>=0)
		{
			text = text.substring(0, text.indexOf("Ocurrance.")) + "Occurrence." + text.substring(text.indexOf("Ocurrance.")+10,text.length());
		}
		while (text.indexOf(" ocurrence.")>=0)
		{
			text = text.substring(0, text.indexOf(" ocurrence.")) + " occurrence." + text.substring(text.indexOf(" ocurrence.")+11,text.length());
		}
		while (text.indexOf("Ocurrence.")>=0)
		{
			text = text.substring(0, text.indexOf("Ocurrence.")) + "Occurrence." + text.substring(text.indexOf("Ocurrence.")+10,text.length());
		}
		while (text.indexOf(" occurance.")>=0)
		{
			text = text.substring(0, text.indexOf(" occurance.")) + " occurrence." + text.substring(text.indexOf(" occurance.")+11,text.length());
		}
		while (text.indexOf("Occurance.")>=0)
		{
			text = text.substring(0, text.indexOf("Occurance.")) + "Occurrence." + text.substring(text.indexOf("Occurance.")+10,text.length());
		}
		while (text.indexOf(" occurence.")>=0)
		{
			text = text.substring(0, text.indexOf(" occurence.")) + " occurrence." + text.substring(text.indexOf(" occurence.")+11,text.length());
		}
		while (text.indexOf("Occurence.")>=0)
		{
			text = text.substring(0, text.indexOf("Occurence.")) + "Occurrence." + text.substring(text.indexOf("Occurence.")+10,text.length());
		}
		while (text.indexOf(" ocurance.")>=0)
		{
			text = text.substring(0, text.indexOf(" ocurance.")) + " occurrence." + text.substring(text.indexOf(" ocurance.")+10,text.length());
		}
		while (text.indexOf("Ocurance.")>=0)
		{
			text = text.substring(0, text.indexOf("Ocurance.")) + "Occurrence." + text.substring(text.indexOf("Ocurance.")+9,text.length());
		}
		while (text.indexOf(" ocurence.")>=0)
		{
			text = text.substring(0, text.indexOf(" ocurence.")) + " occurrence." + text.substring(text.indexOf(" ocurence.")+10,text.length());
		}
		while (text.indexOf("Ocurence.")>=0)
		{
			text = text.substring(0, text.indexOf("Ocurence.")) + "Occurrence." + text.substring(text.indexOf("Ocurence.")+9,text.length());
		}
		
		//typos
		while (text.indexOf(" teh.")>=0)
		{
			text = text.substring(0, text.indexOf(" teh.")) + " the." + text.substring(text.indexOf(" teh.")+5,text.length());
		}
		while (text.indexOf("Teh.")>=0)
		{
			text = text.substring(0, text.indexOf("Teh.")) + "The." + text.substring(text.indexOf("Teh.")+4,text.length());
		}
		while (text.indexOf(" becuase.")>=0)
		{
			text = text.substring(0, text.indexOf(" becuase.")) + " because." + text.substring(text.indexOf(" becuase.")+9,text.length());
		}
		while (text.indexOf("Becuase.")>=0)
		{
			text = text.substring(0, text.indexOf("Becuase.")) + "Because." + text.substring(text.indexOf("Becuase.")+8,text.length());
		}
		while (text.indexOf(" becasue.")>=0)
		{
			text = text.substring(0, text.indexOf(" becasue.")) + " because." + text.substring(text.indexOf(" becasue.")+9,text.length());
		}
		while (text.indexOf("Becasue.")>=0)
		{
			text = text.substring(0, text.indexOf("Becuase.")) + "Because." + text.substring(text.indexOf("Becuase.")+8,text.length());
		}
		while (text.indexOf(" tahts.")>=0)
		{
			text = text.substring(0, text.indexOf(" tahts.")) + " that's." + text.substring(text.indexOf(" tahts.")+7,text.length());
		}
		while (text.indexOf("Tahts.")>=0)
		{
			text = text.substring(0, text.indexOf("Tahts.")) + "That's." + text.substring(text.indexOf("Tahts.")+6,text.length());
		}
		while (text.indexOf("thign.")>=0)
		{
			text = text.substring(0, text.indexOf("thign.")) + "thing." + text.substring(text.indexOf("thign.")+6,text.length());
		}
		while (text.indexOf("Thign.")>=0)
		{
			text = text.substring(0, text.indexOf("Thign.")) + "Thing." + text.substring(text.indexOf("Thign.")+6,text.length());
		}
		return text;
	}
}	