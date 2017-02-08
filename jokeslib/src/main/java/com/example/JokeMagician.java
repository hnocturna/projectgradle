package com.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class JokeMagician {
    private String[] jokes = new String[] {
            "A man makes a bet with his boss. \n" +
                    "He bets 500$ that he can lick his eyeball.\n" +
                    "Laughing the boss agrees.\n" +
                    "The man takes off a fake eyeball and licks it.\n" +
                    "The boss angrily gives him the 500$.\n" +
                    "The man then bets 500$ he can bite his own ears.\n" +
                    "The boss pulls his ears to check if the man is wearing any fake ones, then agrees.\n" +
                    "The man takes out a set of fake teeth from his mouth and bites his ear with them.\n" +
                    "Angry, the boss gives him 500$ and tells him to go away.\n" +
                    "The next day, the man comes back.\n" +
                    "Boss: What now? Didn't you take enough money from me?\n" +
                    "Man: Trust me. This one should be easy. I bet you all your money back that you are wearing purple underwear.\n" +
                    "Boss: Haha! My underwear is black!\n" +
                    "Man: May I see some proof?\n" +
                    "The boss goes to the washroom and brings back his underwear in his hands.\n" +
                    "The man cheerfully hands 1000$ to the boss.\n" +
                    "Boss: Why are you so happy?\n" +
                    "Man: Look around you. All around the office's glass walls your 43 employees are watching.\n" +
                    "Boss: And..?\n" +
                    "Man: I bet each of them 500$ that I can make you take off your underwear.",

            "What do you call a communist sniper? \n" +
                    "A marxman",

            "As a German, you know what really grinds my gears? \n" +
                    "Nothing. Our engineering is perfect.",

            "A flight attendant sees a suspicious couple on board... \n" +
                    "She decides to report it to the pilot immediately.\n" +
                    "\"Sir, I think we have a case of human trafficking! The female passenger looks pretty frightened and the man she is with looks dangerous!\"\n" +
                    "The pilot responds, \"Patricia, I've told you before. This is Air Force One...\"",

            "QUEEN Elizabeth and Dolly Parton die on the same day, and both go before an Angel to find out if they'll be admitted to Heaven. Unfortunately, there's only one space left that day, so the Angel must decide which of them gets in. The Angel asks Dolly if there's some particular reason why she should go to Heaven. Dolly takes off her top and says, \"Look at these, they're the most perfect breasts God ever created, and I'm sure it will please God to be able to see them every day, for eternity\". The Angel thanks Dolly and asks Her Majesty the same question. The Queen takes a bottle of Perrier out of her purse, and drinks it down. Then, pees into a toilet and pulls the lever. The Angel says, \"ok, your Majesty, you may go in\". Dolly is outraged and asked,\"What was that all about, I show you two of God's own perfect creations and you turn me down. She pees into a toilet and she gets in! Would you explain that to me\"? \"Sorry, Dolly says the Angel, but even in Heaven A Royal Flush Beats a Pair No Matter How Big They Are\".",

            "I asked my wife if she wanted to try a new sex position called the 68. \n" +
                    "Wife: What's a 68?\n" +
                    "Well it's when you go down on me, and I'll owe you one.",

            "It was the first day of school and a new student named Pedro, the son of a Mexican immigrant, entered the fourth grade.\n" +
                    "The teacher said, \"Let's begin by reviewing some American history. Who said 'Give me Liberty, or give me Death?' \"\n" +
                    "She saw a sea of blank faces, except for Pedro, who had his hand up.\n" +
                    "\"Patrick Henry, 1775.\"\n" +
                    "\"Very good! Who said \"Government of the people, by the people, for the people, shall not perish from the earth\" \"?\n" +
                    "Again, no response except from Pedro:\n" +
                    "\"Abraham Lincoln, 1863,\" said Pedro.\n" +
                    "The teacher snapped at the class, \"Class, you should be ashamed. Pedro, who is new to our country, knows more about its history than you do.\"\n" +
                    "She heard a loud whisper: \"Screw the Mexicans.\"\n" +
                    "\"Who said that?\" she demanded.\n" +
                    "Pedro put his hand up. \"Jim Bowie, 1836.\"\n" +
                    "At that point, a student in the back said, \"I'm gonna puke.\"\n" +
                    "The teacher glared and asked, \"All right! Now, who said that?\"\n" +
                    "Again, Pedro. \"George Bush to the Japanese Prime Minister, 1991.\"\n" +
                    "Now furious, another student yelled, \"Oh yeah? Suck this!\"\n" +
                    "Pedro jumped out of his chair waving his hand and shouting to the teacher, \"Bill Clinton to Monica Lewinski, 1997!\"\n" +
                    "Now, with almost a mob hysteria, someone said, \"You little shit. If you say anything else, I'll kill you.\"\n" +
                    "Pedro frantically yelled at the top of his voice, \"Gary Condit to Chandra Levy, 2001.\"\n" +
                    "The teacher fainted, and as the class gathered around her on the floor, someone said, \"Oh shit, we're in BIG trouble now!\"" +
                    "Pedro whispered, \"Saddam Hussein, 2003.",

            "I don't see why Obama gave all his speeches behind bulletproof glass.. \n" +
                    "I know he's black and all but I doubt he'd actually shoot anyone.",

            "An Israeli doctor says: \"In Israel, medicine is so advanced that we cut off a man's liver put them on another man, and in 6 weeks, he is looking for work.\"\n" +
                    "The German doctor says: \"That's nothing, in Germany we take part of a brain, put it in another man, and in 4 weeks he is looking for work.\"\n" +
                    "The Russian doctor says: \"Gentlemen, we take half a heart from a man, put it in another's chest, and in 2 weeks he is looking for work.\"\n" +
                    "The American doctor laughs: \"You all are behind us. Two days ago, we took a man with no brains, no heart, and no liver and made him President.\n" +
                    "Now, the whole country is looking for work!\"",

            "A male whale and a female whale were swimming off the coast of Japan when they noticed a whaling ship. The male whale recognized it as the same ship that had harpooned his father many years earlier. He said to the female whale, \"Lets both swim under the ship and blow out of our air holes at the same time and it should cause the ship to turn over and sink.\" They tried it and sure enough, the ship turned over and quickly sank.\n" +
                    "Soon however, the whales realized the sailors had jumped overboard and were swimming to the safety of shore. The male was enraged that they were going to get away and told the female, \"Let's swim after them and gobble them up before they reach the shore.\" At this point, he realized the female was becoming reluctant to follow him. \"Look,\" she said, \"I went along with the blow job, but I absolutely refuse to swallow the seamen.\"\n" +
                    "Edit: I think it's bad that I'm more excited watching this get ups that I was about the whole of Christmas",

            "\"You're telling me that I'm losing my job because Donald Trump won the election? WHY, BECAUSE I'M BLACK?!\"" +
                    "\"Mister President, we've been over this...\"\n",

            "Dave was bragging to his boss one day, \"You know, I know everyone there is to know. Just name someone, anyone, and I know them.\"\n" +
                    "Tired of his boasting, his boss called his bluff, \"OK, Dave, how about Tom Cruise?\"\n" +
                    "\"No dramas boss, Tom and I are old friends, and I can prove it.\" So Dave and his boss fly out to Hollywood and knock on Tom Cruise's door, and Tom Cruise shouts,\n" +
                    "\"Dave! What's happening? Great to see you! Come on in for a beer!\"\n" +
                    "Although impressed, Dave's boss is still skeptical. After they leave Cruise's house, he tells Dave that he thinks him knowing Cruise was just lucky.\n" +
                    "\"No, no, just name anyone else,\" Dave says.\n" +
                    "\"President Obama,\" his boss quickly retorts.\n" +
                    "\"Yup,\" Dave says, \"Old buddies, let's fly out to Washington,\" and off they go.\n" +
                    "At the White House, Obama spots Dave on the tour and motions him and his boss over, saying, \"Dave, what a surprise, I was just on my way to a meeting, but you and your friend come on in and let's have a beer first and catch up.\"\n" +
                    "Well, the boss is very shaken by now but still not totally convinced. After they leave the White House grounds he expresses his doubts to Dave, who again implores him to name anyone else.\n" +
                    "\"Pope Francis,\" his boss replies.\n" +
                    "\"Sure!\" says Dave. \"I've known the Pope for years.\" So off they fly to Rome.\n" +
                    "Dave and his boss are assembled with the masses at the Vatican's St. Peter's Square when Dave says, \"This will never work. I can't catch the Pope's eye among all these people. Tell you what, I know all the guards so let me just go upstairs and I'll come out on the balcony with the Pope.\" He disappears into the crowd headed towards the Vatican.\n" +
                    "Sure enough, half an hour later Dave emerges with the Pope on the balcony, but by the time Dave returns, he finds that his boss has had a heart attack and is surrounded by paramedics.\n" +
                    "Making his way to his boss' side, Dave asks him, \"What happened?\"\n" +
                    "His boss looks up and says, \"It was the final straw... you and the Pope came out on to the balcony and the man next to me said, 'Who the fuck is that on the balcony with Dave?'",

            "Son: \"Mom, Dad, I'm gay.\"\n" +
                    "Mom: Stares at Dad\n" +
                    "Dad: Clenches fist\n" +
                    "Mom: \"Don't!\"\n" +
                    "Dad: Sweats Profusely\n" +
                    "Mom: \"...\"\n" +
                    "Dad: \"HI GAY, I'M DAD\"",

            "Two deaf people get married and during the first week of marriage, they find that they are unable to communicate in the bedroom with the lights out since they can't see each other signing, or read lips. After several nights of fumbling around and many misunderstandings, the wife figures out a solution. She writes a note to her husband: 'Honey, Why don't we agree on some simple signals? For instance, at night, if you want to have sex with me, reach over and squeeze my left breast one time. If you don't want to have sex, reach over and squeeze my right breast two times. The husband thinks this is a great idea. He writes back to his wife That if she wants to have sex with him, reach over and pull on his penis one time. If she doesn't want to have sex, pull on his penis two hundred and fifty times.",

            "A girl goes into a church to confess...\n" +
                    "Girl : \"Forgive me father for I have sinned.\"\n" +
                    "Priest : \"What have you done my child?\"\n" +
                    "Girl : \"I called a man a son of a bitch.\"\n" +
                    "Priest : \"Why did you call him a son of a bitch?\"\n" +
                    "Girl : \"Because he touched my hand.\"\n" +
                    "Priest : \"Like this?\" (as he touches her hand)\n" +
                    "Girl : \"Yes father.\"\n" +
                    "Priest : \"That's no reason to call a man a son of a bitch.\"\n" +
                    "Girl : \"Then he touched my breast.\"\n" +
                    "Priest : \"Like this?\" (as he touched her breast)\n" +
                    "Girl : \"Yes father.\"\n" +
                    "Priest : \"That's no reason to call him a son of a bitch.\"\n" +
                    "Girl : \"Then he took off my clothes, father.\"\n" +
                    "Priest : \"Like this?\" (as he takes off her clothes)\n" +
                    "Girl : \"Yes father.\"\n" +
                    "Priest : \"That's no reason to call him a son of a bitch.\"\n" +
                    "Girl : \"Then he stuck his you know what into my you know where.\"\n" +
                    "Priest : \"Like this?\" (as he stuck his you know what into her you know where)\n" +
                    "Girl : \"YES FATHER, YES FATHER, YES FATHER!!!\"\n" +
                    "(after a few minutes)\n" +
                    "Priest : \"That's no reason to call him a son of a bitch.\"\n" +
                    "Girl : \"But father, he had AIDS!\"\n" +
                    "Priest : \"THAT SON OF A BITCH!!!\"",

            "A guy is browsing in a pet shop and sees a parrot sitting on a little perch. It doesn't have any feet or legs. The guy says aloud, \"Jeesh. I wonder what happened to this Parrot?\"\n" +
                    "The parrot says, \"I was born this way. I'm a defective parrot.\"\n" +
                    "\"Holy shit,\" the guy replies. \"You actually understood and answered me!\"\n" +
                    "\"I got every word,\" says the parrot.\" I happen to be a highly intelligent, thoroughly educated bird.\"\n" +
                    "\"Oh yeah?\", the guy asks, \"Then answer this -- how do you hang onto your perch without any feet?\"\n" +
                    "\"Well,\" the parrot says, \"this is very embarrassing but since you asked, I wrap my willie around this wooden bar like a little hook. You can't see it because of my feathers.\"\n" +
                    "\"Wow\" says the guy, \"you really can understand and speak English, can't you!?\"\n" +
                    "\"Actually, I speak both Spanish and English and I can converse with reasonable competence on almost any topic: politics, religion, sports, physics, philosophy. I'm especially good at ornithology. You really ought to buy me. I'd be a great companion.\"\n" +
                    "The guy looks at the $200 price tag.\" Sorry, but I just can't afford that.\"\n" +
                    "\"Pssssssst\" says the parrot, \"I'm defective, so the truth is, nobody wants me cause I don't have any feet. You can probably get me for $20, just make the guy an offer!\"\n" +
                    "The guy offers $20 and walks out with the parrot. Weeks go by. The parrot is sensational. He has a great sense of humour, he's interesting, he's a great pal, he understands everything, he sympathizes, and he's insightful.\n" +
                    "The guy is delighted. One day the guy comes home from work and the parrot goes \"Psssssssssssst\" and motions him over with one wing. \"I don't know if I should tell you this or not, but it's about your wife and the postman.\"\n" +
                    "\"What are you talking about?\" asks the guy.\n" +
                    "\"When the postman delivered today, your wife greeted him at the door in a sheer black nightie and kissed him passionately.\"\n" +
                    "\"WHAT???\" the guy asks incredulously. \"THEN what happened?\"\n" +
                    "\"Well, then the postman came into the house and lifted up her nightie and began petting her all over\" reported the parrot.\n" +
                    "\"My God!\" he exclaims. \"Then what?\"\n" +
                    "\"Then he lifted up the nightie, got down on his knees and began to lick her all over, starting with her breasts and slowly going down...\"\n" +
                    "\"WELL???\" demands the frantic guy, \"THEN WHAT HAPPENED?\"\n" +
                    "\"Damned if I know. I got a hard-on and fell off my perch.\"",

            "A male patient is lying in bed in the hospital, wearing an oxygen mask over his mouth and nose.\n" +
                    "A young student nurse appears and gives him a partial sponge bath.\n" +
                    "\"Nurse,\"' he mumbles from behind the mask, \"are my testicles black?\"\n" +
                    "Embarrassed, the young nurse replies, \"I don't know, Sir. I'm only here to wash your upper body and feet.\"\n" +
                    "He struggles to ask again, \"Nurse, please check for me. Are my testicles black?\"\n" +
                    "Concerned that he might elevate his blood pressure and heart rate from worrying about his testicles, she overcomes her embarrassment and pulls back the covers.\n" +
                    "She raises his gown, holds his manhood in one hand and his testicles gently in the other.\n" +
                    "She looks very closely and says, \"There's nothing wrong with them, Sir. They look fine.\"\n" +
                    "The man slowly pulls off his oxygen mask, smiles at her, and says very slowly, \"Thank you very much. That was wonderful. Now listen very, very closely:\n" +
                    "Are - my - test - results - back?\"",

            "An 18 year old Italian girl tells her Mom that she has missed her period for two months.......\n" +
                    "Very worried, the mother goes to the drugstore and buys a pregnancy kit. The test result shows that the girl is pregnant. Shouting, cursing, crying, the mother says, \"Who was the pig that did this to you? I want to know!\" The girl picks up the phone and makes a call. Half an hour later, a Ferrari stops in front of their house. A mature and distinguished man with gray hair and impeccably dressed in an Armani suit steps out of the of the Ferrari and enters the house. He sits in the living room with the father, mother, and the girl and tells them: \"Good morning, your daughter has informed me of the problem. I can't marry her because of my personal family situation but I'll take charge. I will pay all costs and provide for your daughter for the rest of her life.\" \"Additionally, if a girl is born, I will bequeath a Ferrari, a beach house, two retail stores, a townhouse, a beachfront villa, and a $2,000,000 bank account. If a boy is born, my legacy will be a couple of factories and a $4,000,000 bank account. If twins, they will receive a factory and $2,000,000 each. However, if there is a miscarriage, what do you suggest I do?\"\n" +
                    "At this point, the father, who had remained silent, places a hand firmly on the man's shoulder and tells him, \"You fuck her again.\"",

            "Two married buddies are out drinking one night when one turns to the other and says, \"You know, I don't know what else to do. Whenever I go home after we've been out drinking, I turn the headlights off before I get to the driveway. I shut off the engine and coast into the garage. I take my shoes off before I go into the house, I sneak up the stairs, I get undressed in the bathroom. I ease into bed and my wife STILL wakes up and yells at me for staying out so late!\"\n" +
                    "His buddy looks at him and says, \"Well, you're obviously taking the wrong approach. I screech into the driveway, slam the door, storm up the steps, throw my shoes into the closet, jump into bed, rub my hands on my wife's ass and say, 'How about a blowjob?' ....And she's always sound asleep.\"",

            "While examining the body of Mr. Schwartz, a mortician notices that Schwartz has the largest penis he has ever seen.\n" +
                    "\"I'm sorry, Mr. Schwartz,\" says the mortician, \"But I can't send you to be cremated with a tremendously huge penis like this. It has to be saved for posterity.\"\n" +
                    "The mortician removes the penis, places it in a jar and puts the jar in his briefcase.\n" +
                    "When he gets home, he decides to show it to his wife. \"I have something to show you that you won't believe,\" he says, removing the jar from his briefcase.\n" +
                    "\"Oh my God!\" she screams, \"Schwartz is dead?\"",

            "Two old friends were just about to tee off at the first hole of their local golf course when a guy carrying a golf bag called out to them.\n" +
                    "\"Do you mind if I join you? My partner didn't turn up\".\n" +
                    "Sure, they said, you’re welcome.\n" +
                    "So they started playing and enjoyed the game and the company of the newcomer. Part way around the course, one of the friends asked the newcomer,\n" +
                    "\"What do you do for a living?\"\n" +
                    "I’m a hit man,\" was the reply.\n" +
                    "\"You're joking!\" was the response.\n" +
                    "\"No, I'm not,\" he said, reaching into his golf bag, and pulling out a beautiful Martini sniper's rifle with a large telescopic sight. \"Here are my tools.\"\n" +
                    "That's a beautiful telescopic sight,\" said the other friend, \"Can I take a look? I think I might be able to see my house from here\".\n" +
                    "So he picked up the rifle and looked through the sight in the direction of his house.\n" +
                    "\"Yeah, I can see my house all right. \"This sight is fantastic. I can see right in the window. Wow, I can see my wife in the bedroom\".\n" +
                    "\"Ha Ha, I can see she's naked!! Wait a minute, that's my neighbor in there with her......He's naked, too!!! The bitch!\"\n" +
                    "He turned to the hit man. “How much do you charge for a hit?\"\n" +
                    "\"I'll do a flat rate, for you: One thousand dollars every time I pull the trigger.\"\n" +
                    "\"Can you do two for me now?\"\n" +
                    "“Sure, what do you want?\"\n" +
                    "\"First, shoot my wife; she's always been mouthy, so shoot her in the mouth. Then the neighbor, he's supposed to be a friend of mine, so just shoot his dick off to teach him a lesson.\"\n" +
                    "The hit man took the rifle and took aim, standing perfectly still for a few minutes.\n" +
                    "“Are you gonna do it or not?\" asked the friend impatiently.\n" +
                    "\"Just be patient,\" said the hit man calmly . . . . . \"I think I can save ya a grand here.\"",

            "A guy goes to Las Vegas to gamble\n" +
                    "And he loses all his money. He doesn't even have enough for a cab, but he flagged one down anyway. He explained to the driver that he would pay him back next time and gave him his phone number, but the driver told him, \"Get the fuck out of my cab.\"\n" +
                    "He walked all the way to the airport and got home. Some times rolls by and he decides to go back to Vegas again and this time he wins BIG.\n" +
                    "He gets his bags and is ready for the airport with all his new winnings. There are a line of cabs and at the very end he sees the driver from last time that kicked him out. He stood for a moment thinking how can he get his revenge on that driver.\n" +
                    "So, he gets in the first cab.\n" +
                    "\"How much is it to the airport?\" He asks.\n" +
                    "The driver says, \"$15\"\n" +
                    "\"Great, how much is it for a blowjob on the way there?\"\n" +
                    "The cab driver says, \"Get the fuck out of my cab.\"\n" +
                    "So he goes to the next one and asks the same thing. \"How much to airport?\"\n" +
                    "\"$15\"\n" +
                    "\"Great, how much for a blowjob on the way there?\"\n" +
                    "And that cab driver also tells him to get the fuck out of his cab.\n" +
                    "He does this all the way down the line of drivers, each one kicking him out. He finally gets to the last driver, the one from his last trip.\n" +
                    "He asks, \"hey how much to the airport?\"\n" +
                    "Driver responds, \"$15\"\n" +
                    "The guy hands him $15 and says \"great let's go\"\n" +
                    "And so the driver leaves, slowly passing all the other drivers who are staring out their window while the guy in the back smiles back with a thumbs up.",
    };

    private Random random;

    public JokeMagician() {
        random = new Random();
    }

    public String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
