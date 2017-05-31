public class contraction
{
	public String getCorrection(String text)
	{
		if (text.length()==0)
        {
            return "Please enter text.";
        }
		while (text.indexOf("arent ")>=0)
		{
			text = text.substring(0, text.indexOf("arent ")) + "aren’t " + text.substring(text.indexOf("arent ")+6,text.length());
		}
while (text.indexOf("Arent ")>=0)
		{
			text = text.substring(0, text.indexOf("Arent ")) + "Aren’t " + text.substring(text.indexOf("Arent ")+6,text.length());
		}
while (text.indexOf("cant ")>=0)
		{
			text = text.substring(0, text.indexOf("cant ")) + "can’t " + text.substring(text.indexOf("cant ")+5,text.length());
		}
while (text.indexOf("Cant ")>=0)
		{
			text = text.substring(0, text.indexOf("Cant ")) + "Can’t " + text.substring(text.indexOf("Cant ")+5,text.length());
		}
while (text.indexOf("couldve ")>=0)
		{
			text = text.substring(0, text.indexOf("couldve ")) + "could’ve " + text.substring(text.indexOf("couldve ")+8,text.length());
		}
while (text.indexOf("Couldve ")>=0)
		{
			text = text.substring(0, text.indexOf("Couldve ")) + "Could’ve " + text.substring(text.indexOf("Couldve ")+8,text.length());
		}
while (text.indexOf("couldnt ")>=0)
		{
			text = text.substring(0, text.indexOf("couldnt ")) + "couldn’t " + text.substring(text.indexOf("couldnt ")+8,text.length());
		}
while (text.indexOf("Couldnt ")>=0)
		{
			text = text.substring(0, text.indexOf("Couldnt ")) + "Couldn’t " + text.substring(text.indexOf("Couldnt ")+8,text.length());
		}
while (text.indexOf("didnt ")>=0)
		{
			text = text.substring(0, text.indexOf("didnt ")) + "didn’t " + text.substring(text.indexOf("didnt ")+6,text.length());
		}
while (text.indexOf("Didnt ")>=0)
		{
			text = text.substring(0, text.indexOf("Didnt ")) + "Didn’t " + text.substring(text.indexOf("Didnt ")+6,text.length());
		}
while (text.indexOf("doesnt ")>=0)
		{
			text = text.substring(0, text.indexOf("doesnt ")) + "doesn’t " + text.substring(text.indexOf("doesnt ")+7,text.length());
		}
while (text.indexOf("Doesnt ")>=0)
		{
			text = text.substring(0, text.indexOf("Doesnt ")) + "Doesn’t " + text.substring(text.indexOf("Doesnt ")+7,text.length());
		}
while (text.indexOf("dont ")>=0)
		{
			text = text.substring(0, text.indexOf("dont ")) + "don’t " + text.substring(text.indexOf("dont ")+5,text.length());
		}
while (text.indexOf("Dont ")>=0)
		{
			text = text.substring(0, text.indexOf("Dont ")) + "Don’t " + text.substring(text.indexOf("Dont ")+5,text.length());
		}
while (text.indexOf("hadnt ")>=0)
		{
			text = text.substring(0, text.indexOf("hadnt ")) + "hadn’t " + text.substring(text.indexOf("hadnt ")+6,text.length());
		}
while (text.indexOf("Hadnt ")>=0)
		{
			text = text.substring(0, text.indexOf("Hadnt ")) + "Hadn’t " + text.substring(text.indexOf("Hadnt ")+6,text.length());
		}
while (text.indexOf("hasnt ")>=0)
		{
			text = text.substring(0, text.indexOf("hasnt ")) + "hasn’t " + text.substring(text.indexOf("hasnt ")+6,text.length());
		}
while (text.indexOf("Hasnt ")>=0)
		{
			text = text.substring(0, text.indexOf("Hasnt ")) + "Hasn’t " + text.substring(text.indexOf("Hasnt ")+6,text.length());
		}
while (text.indexOf("havent ")>=0)
		{
			text = text.substring(0, text.indexOf("havent ")) + "haven’t " + text.substring(text.indexOf("havent ")+3,text.length());
		}
while (text.indexOf("Havent ")>=0)
		{
			text = text.substring(0, text.indexOf("Havent ")) + "Haven’t " + text.substring(text.indexOf("Havent ")+3,text.length());
		}
while (text.indexOf(" hed ")>=0)
		{
			text = text.substring(0, text.indexOf(" hed ")) + " he’d " + text.substring(text.indexOf(" hed ")+5,text.length());
		}
while (text.indexOf("Hed ")>=0)
		{
			text = text.substring(0, text.indexOf("Hed ")) + "He’d " + text.substring(text.indexOf("Hed ")+4,text.length());
		}
while (text.indexOf(" hell ")>=0)
		{
			text = text.substring(0, text.indexOf(" hell ")) + " he’ll " + text.substring(text.indexOf(" hell ")+6,text.length());
		}
while (text.indexOf("Hell ")>=0)
		{
			text = text.substring(0, text.indexOf("Hell ")) + "He’ll " + text.substring(text.indexOf("Hell ")+5,text.length());
		}
while (text.indexOf(" hes ")>=0)
		{
			text = text.substring(0, text.indexOf(" hes ")) + " he’s " + text.substring(text.indexOf(" hes ")+5,text.length());
		}
while (text.indexOf("Hes ")>=0)
		{
			text = text.substring(0, text.indexOf("Hes ")) + "He’s " + text.substring(text.indexOf("Hes ")+4,text.length());
		}
while (text.indexOf("howd ")>=0)
		{
			text = text.substring(0, text.indexOf("howd ")) + "how’d " + text.substring(text.indexOf("howd ")+5,text.length());
		}
while (text.indexOf("Howd ")>=0)
		{
			text = text.substring(0, text.indexOf("Howd ")) + "How’d " + text.substring(text.indexOf("Howd ")+5,text.length());
		}
while (text.indexOf("howll ")>=0)
		{
			text = text.substring(0, text.indexOf("howll ")) + "how’ll " + text.substring(text.indexOf("howll ")+6,text.length());
		}
while (text.indexOf("Howll ")>=0)
		{
			text = text.substring(0, text.indexOf("Howll ")) + "How’ll " + text.substring(text.indexOf("Howll ")+6,text.length());
		}
while (text.indexOf(" hows ")>=0)
		{
			text = text.substring(0, text.indexOf(" hows ")) + " how’s " + text.substring(text.indexOf(" hows ")+6,text.length());
		}
while (text.indexOf("Hows ")>=0)
		{
			text = text.substring(0, text.indexOf("Hows ")) + "How’s " + text.substring(text.indexOf("Hows ")+5,text.length());
		}
while (text.indexOf(" isnt ")>=0)
		{
			text = text.substring(0, text.indexOf(" isnt ")) + " isn’t " + text.substring(text.indexOf(" isnt ")+6,text.length());
		}
while (text.indexOf("Isnt ")>=0)
		{
			text = text.substring(0, text.indexOf("Isnt ")) + "Isn’t " + text.substring(text.indexOf("Isnt ")+5,text.length());
		}
while (text.indexOf(" itll ")>=0)
		{
			text = text.substring(0, text.indexOf(" itll ")) + " it’ll " + text.substring(text.indexOf(" itll ")+6,text.length());
		}
while (text.indexOf("Itll ")>=0)
		{
			text = text.substring(0, text.indexOf("Itll ")) + "It’ll " + text.substring(text.indexOf("Itll ")+5,text.length());
		}
while (text.indexOf(" its ")>=0)
		{
			text = text.substring(0, text.indexOf(" its ")) + " it’s " + text.substring(text.indexOf(" its ")+5,text.length());
		}
while (text.indexOf("Its ")>=0)
		{
			text = text.substring(0, text.indexOf("Its ")) + "It’s " + text.substring(text.indexOf("Its ")+4,text.length());
		}
while (text.indexOf("mightve ")>=0)
		{
			text = text.substring(0, text.indexOf("mightve ")) + "might’ve " + text.substring(text.indexOf("mightve ")+8,text.length());
		}
while (text.indexOf("Mightve ")>=0)
		{
			text = text.substring(0, text.indexOf("Mightve ")) + "Might’ve " + text.substring(text.indexOf("Mightve ")+8,text.length());
		}

		while (text.indexOf("Im ")>=0)
		{
			text = text.substring(0, text.indexOf("Im ")) + "I'm " + text.substring(text.indexOf("Im ")+3,text.length());
		}
		while (text.indexOf("Id ")>=0)
		{
			text = text.substring(0, text.indexOf("Id ")) + "I'd " + text.substring(text.indexOf("Id ")+3,text.length());
		}
		while (text.indexOf("Ill ")>=0)
		{
			text = text.substring(0, text.indexOf("Ill ")) + "I'll " + text.substring(text.indexOf("Ill ")+3,text.length());
		}
		while (text.indexOf("Ive ")>=0)
		{
			text = text.substring(0, text.indexOf("Ive ")) + "I've " + text.substring(text.indexOf("Ive ")+3,text.length());
		}
		while (text.indexOf("youve ")>=0)
		{
			text = text.substring(0, text.indexOf("youve ")) + "you've " + text.substring(text.indexOf("youve ")+6,text.length());
		}
		while (text.indexOf("Youve ")>=0)
		{
			text = text.substring(0, text.indexOf("Youve ")) + "You've " + text.substring(text.indexOf("Youve ")+6,text.length());
		}
		while (text.indexOf("youre ")>=0)
		{
			text = text.substring(0, text.indexOf("youre ")) + "you're " + text.substring(text.indexOf("youre ")+6,text.length());
		}
		while (text.indexOf("Youre ")>=0)
		{
			text = text.substring(0, text.indexOf("Youre ")) + "You're " + text.substring(text.indexOf("Youre ")+6,text.length());
		}
		while (text.indexOf("youll ")>=0)
		{
			text = text.substring(0, text.indexOf("youll ")) + "you'll " + text.substring(text.indexOf("youll ")+6,text.length());
		}
		while (text.indexOf("Youll ")>=0)
		{
			text = text.substring(0, text.indexOf("Youll ")) + "You'll " + text.substring(text.indexOf("Youll ")+6,text.length());
		}
		while (text.indexOf("youd ")>=0)
		{
			text = text.substring(0, text.indexOf("youd ")) + "you'd " + text.substring(text.indexOf("youd ")+5,text.length());
		}
		while (text.indexOf("Youd ")>=0)
		{
			text = text.substring(0, text.indexOf("Youd ")) + "You'd " + text.substring(text.indexOf("Youd ")+5,text.length());
		}
		while (text.indexOf("wouldnt ")>=0)
		{
			text = text.substring(0, text.indexOf("wouldnt ")) + "wouldn't " + text.substring(text.indexOf("wouldn't ")+9,text.length());
		}
		while (text.indexOf("Wouldnt ")>=0)
		{
			text = text.substring(0, text.indexOf("Wouldnt ")) + "Wouldn't " + text.substring(text.indexOf("Wouldn't ")+9,text.length());
		}
		while (text.indexOf("wouldve ")>=0)
		{
			text = text.substring(0, text.indexOf("wouldve ")) + "would've " + text.substring(text.indexOf("would've ")+9,text.length());
		}
		while (text.indexOf("Wouldve ")>=0)
		{
			text = text.substring(0, text.indexOf("Wouldve ")) + "Would've " + text.substring(text.indexOf("Would've ")+9,text.length());
		}
		while (text.indexOf("wont ")>=0)
		{
			text = text.substring(0, text.indexOf("wont ")) + "won't " + text.substring(text.indexOf("wont ")+5,text.length());
		}
		while (text.indexOf("Wont ")>=0)
		{
			text = text.substring(0, text.indexOf("Wont ")) + "Won't " + text.substring(text.indexOf("Wont ")+5,text.length());
		}
		while (text.indexOf("whys ")>=0)
		{
			text = text.substring(0, text.indexOf("whys ")) + "why's " + text.substring(text.indexOf("whys ")+5,text.length());
		}
		while (text.indexOf("Whys ")>=0)
		{
			text = text.substring(0, text.indexOf("Whys ")) + "Why's " + text.substring(text.indexOf("Whys ")+5,text.length());
		}
		while (text.indexOf("whyd ")>=0)
		{
			text = text.substring(0, text.indexOf("whyd ")) + "why'd " + text.substring(text.indexOf("whyd ")+5,text.length());
		}
		while (text.indexOf("Whyd ")>=0)
		{
			text = text.substring(0, text.indexOf("Whyd ")) + "Why'd " + text.substring(text.indexOf("Whyd ")+5,text.length());
		}
		while (text.indexOf("whyre ")>=0)
		{
			text = text.substring(0, text.indexOf("whyre ")) + "why're " + text.substring(text.indexOf("whyre ")+6,text.length());
		}
		while (text.indexOf("Whyre ")>=0)
		{
			text = text.substring(0, text.indexOf("Whyre ")) + "Why're " + text.substring(text.indexOf("Whyre ")+6,text.length());
		}
		while (text.indexOf("whove ")>=0)
		{
			text = text.substring(0, text.indexOf("whove ")) + "who've " + text.substring(text.indexOf("whove ")+6,text.length());
		}
		while (text.indexOf("Whove ")>=0)
		{
			text = text.substring(0, text.indexOf("Whove ")) + "Who've " + text.substring(text.indexOf("Whove ")+6,text.length());
		}
		while (text.indexOf("whos ")>=0)
		{
			text = text.substring(0, text.indexOf("whos ")) + "who's " + text.substring(text.indexOf("whos ")+5,text.length());
		}
		while (text.indexOf("Whos ")>=0)
		{
			text = text.substring(0, text.indexOf("Whos ")) + "Who's " + text.substring(text.indexOf("Whos ")+5,text.length());
		}
		while (text.indexOf("wholl ")>=0)
		{
			text = text.substring(0, text.indexOf("wholl ")) + "who'll " + text.substring(text.indexOf("wholl ")+6,text.length());
		}
		while (text.indexOf("Wholl ")>=0)
		{
			text = text.substring(0, text.indexOf("Wholl ")) + "Who'll " + text.substring(text.indexOf("Wholl ")+6,text.length());
		}
		while (text.indexOf("whod ")>=0)
		{
			text = text.substring(0, text.indexOf("whod ")) + "who'd " + text.substring(text.indexOf("whod ")+5,text.length());
		}
		while (text.indexOf("Whod ")>=0)
		{
			text = text.substring(0, text.indexOf("Whod ")) + "Who'd " + text.substring(text.indexOf("Whod ")+5,text.length());
		}
		while (text.indexOf("whereve ")>=0)
		{
			text = text.substring(0, text.indexOf("whereve ")) + "where've " + text.substring(text.indexOf("whereve ")+8,text.length());
		}
		while (text.indexOf("Whereve ")>=0)
		{
			text = text.substring(0, text.indexOf("Whereve ")) + "Where've " + text.substring(text.indexOf("Whereve ")+8,text.length());
		}
		while (text.indexOf(" wheres ")>=0)
		{
			text = text.substring(0, text.indexOf(" wheres ")) + " where's " + text.substring(text.indexOf(" wheres ")+8,text.length());
		}
		while (text.indexOf("Wheres ")>=0)
		{
			text = text.substring(0, text.indexOf("Wheres ")) + "Where's " + text.substring(text.indexOf("Wheres ")+7,text.length());
		}
		while (text.indexOf("whered ")>=0)
		{
			text = text.substring(0, text.indexOf("whered ")) + "where'd " + text.substring(text.indexOf("whered ")+7,text.length());
		}
		while (text.indexOf("Whered ")>=0)
		{
			text = text.substring(0, text.indexOf("Whered ")) + "Where'd " + text.substring(text.indexOf("Whered ")+7,text.length());
		}
		while (text.indexOf(" whens ")>=0)
		{
			text = text.substring(0, text.indexOf(" whens ")) + "when's " + text.substring(text.indexOf(" whens ")+7,text.length());
		}
		while (text.indexOf("Whens ")>=0)
		{
			text = text.substring(0, text.indexOf("Whens ")) + "When's " + text.substring(text.indexOf("Whens ")+6,text.length());
		}
		while (text.indexOf("whatve ")>=0)
		{
			text = text.substring(0, text.indexOf("whatve ")) + "what've " + text.substring(text.indexOf("whatve ")+7,text.length());
		}
		while (text.indexOf("Whatve ")>=0)
		{
			text = text.substring(0, text.indexOf("Whatve ")) + "What've " + text.substring(text.indexOf("Whatve ")+7,text.length());
		}
		while (text.indexOf("whatre ")>=0)
		{
			text = text.substring(0, text.indexOf("whatre ")) + "what're " + text.substring(text.indexOf("whatre ")+7,text.length());
		}
		while (text.indexOf("Whatre ")>=0)
		{
			text = text.substring(0, text.indexOf("Whatre ")) + "What're " + text.substring(text.indexOf("Whatre ")+7,text.length());
		}
		while (text.indexOf("whats ")>=0)
		{
			text = text.substring(0, text.indexOf("whats ")) + "what's " + text.substring(text.indexOf("whats ")+6,text.length());
		}
		while (text.indexOf("Whats ")>=0)
		{
			text = text.substring(0, text.indexOf("Whats ")) + "What's " + text.substring(text.indexOf("Whats ")+6,text.length());
		}
		while (text.indexOf("whatd ")>=0)
		{
			text = text.substring(0, text.indexOf("whatd ")) + "what'd " + text.substring(text.indexOf("whatd ")+6,text.length());
		}
		while (text.indexOf("Whatd ")>=0)
		{
			text = text.substring(0, text.indexOf("Whatd ")) + "What'd " + text.substring(text.indexOf("Whatd ")+6,text.length());
		}
		while (text.indexOf("whatll ")>=0)
		{
			text = text.substring(0, text.indexOf("whatll ")) + "what'll " + text.substring(text.indexOf("whatll ")+7,text.length());
		}
		while (text.indexOf("Whatll ")>=0)
		{
			text = text.substring(0, text.indexOf("Whatll ")) + "What'll " + text.substring(text.indexOf("Whatll ")+7,text.length());
		}
		while (text.indexOf("werent ")>=0)
		{
			text = text.substring(0, text.indexOf("werent ")) + "weren't " + text.substring(text.indexOf("werent ")+7,text.length());
		}
		while (text.indexOf("Werent ")>=0)
		{
			text = text.substring(0, text.indexOf("Werent ")) + "Weren't " + text.substring(text.indexOf("Weren't ")+7,text.length());
		}
		while (text.indexOf("weve ")>=0)
		{
			text = text.substring(0, text.indexOf("weve ")) + "we've " + text.substring(text.indexOf("weve ")+5,text.length());
		}
		while (text.indexOf("Weve ")>=0)
		{
			text = text.substring(0, text.indexOf("Weve ")) + "We've " + text.substring(text.indexOf("Weve ")+5,text.length());
		}
		while (text.indexOf("wasnt ")>=0)
		{
			text = text.substring(0, text.indexOf("wasnt ")) + "wasn't " + text.substring(text.indexOf("wasnt ")+6,text.length());
		}
		while (text.indexOf("Wasnt ")>=0)
		{
			text = text.substring(0, text.indexOf("Wasnt ")) + "Wasn't " + text.substring(text.indexOf("Wasn't ")+6,text.length());
		}
		
		return text;
	}
}