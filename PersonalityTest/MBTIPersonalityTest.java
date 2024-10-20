import java.util.*;

public class MBTIPersonalityTest{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("What is your Name? : ");
		String name = input.nextLine();
		name = Character.toUpperCase(name.charAt(0))+name.substring(1);
		questions(input, name);
	}





	public static void questions(Scanner input, String name ){
			
			System.out.printf("Youre Welcome %s.%nPls answer these 20 set of questions ('A' or 'B') %n%n", name);

			ArrayList<String> options = new ArrayList<>();
			
			String[] answers = new String[20];
		int count = 0;
		int counter = 1;
		
		String[] optionsA = {"expend energy, enjoy groups","Interpret literally","logical, thinking, questioning","organized, orderly","more outgoing, think out loud","practical, realistic, experiential","candid, straightforward, frank","plan, schedule","seek many tasks, public activities, interaction with others","standard, usual, conventional","firm, tend to criticize, hold the line","regulated, structured","external, communicative, express yourself","focus on here-and-now","tough-minded, just","preparation, plan ahead","active, initiate","facts, things, what is, ideas","matter of fact, issue-oriented","control, govern"};

	String[] optionsB = {
  "conserve energy, enjoy one-on-one","look for meaning and possibilities", "empathetic, feeling, accommodating", "flexible, adaptable","more reserved, think to yourself", "imaginative, innovative, theoretical","tactful, kind, encouraging","unplanned, spontaneous","seek private, solitary activities with quiet to concentrate","different, novel, unique","gentle, tend to appreciate, conciliate","easy-going, live and let live",
"internal, reticent, keep to yourself","look to the future, global perspective, big picture","tender-hearted, merciful","go with the flow, adapt as you go","reflective, deliberate","ideas, dreams, what could be, philosophical","sensitive, people-oriented, compassionate","latitude, freedom"};


		String option = "";
		
		while(count != 20){
		    System.out.println(counter+". "+optionsA[count]+"     or      "+ optionsB[count]);
		option = input.nextLine();
		if(option.equalsIgnoreCase("A")){
			options.add(optionsA[count]);
			answers[count] = option;
			count++; counter++;
		}
		else if(option.equalsIgnoreCase("B")){
			options.add(optionsB[count]);
			answers[count] = option;
			count++; counter++;
		}



		else System.out.println("Expected 'A' or 'B' as response. \nI know its a mistake....Try again.\n");

		}


		
		

	sortAndDisplay(options, answers, name);

	}




	
	public static void sortAndDisplay(ArrayList<String>options, String[] answers, String name){

	String[][] optionsArray = new String[4][5];
	String[][] answersArray = new String[4][5];
	String personalityTrait = "";
	int counter1 = 0;
	int counter2 = 0;

        for (int count1 = 0; count1 < 5; count1++) {  
            for (int count2 = 0; count2 < 4; count2++) {  
                optionsArray[count2][count1] = options.get(counter1) ; 
                answersArray[count2][count1] = answers[counter1] ; 
                counter1++;
            }
        }
	


	String[] versusDisplay = {"Extraverted (E) vs Introverted (I)","Sensing (S) vs Intuitive (N)","Thinking (T) vs Feeling (F)","Judging (J) vs Perceptive (P)"};

		int aCount = 0;
		int bCount = 0; 
		int count1 = 0;
		int versusCount = 0;
		System.out.printf("%nHello %s, You selected: %n%n%n", name);
		
	 for ( count1 = 0; count1 < 4; count1++) { 
		 aCount = 0;
		 bCount = 0; 
		System.out.println("       -> "+versusDisplay[count1]+"\n");
            for (int count2 = 0; count2 < 5; count2++) {  
		
		System.out.println(answersArray[count1][count2]+". "+optionsArray[count1][count2]);
		if(answersArray[count1][count2].equalsIgnoreCase("A")){
			aCount++;
		}else bCount++;

               System.out.println();
            }
		
                String output = """
			Number of 'A' selected: %d
			number of 'B' selected: %d



		""";
		System.out.printf(output,aCount,bCount);
		System.out.println();

		
	
		if(aCount > bCount && count1 == 0)personalityTrait += "E";
		else if(aCount < bCount && count1 == 0) personalityTrait += "I";	

		if(aCount > bCount && count1 == 1)personalityTrait += "S";
		else if(aCount < bCount && count1 == 1) personalityTrait += "N";

		if(aCount > bCount && count1 == 2)personalityTrait += "T";
		else if(aCount < bCount && count1 == 2) personalityTrait += "F";

		if(aCount > bCount && count1 == 3)personalityTrait += "J";
		else if(aCount < bCount && count1 == 3) personalityTrait += "P";
		

        }
		
		System.out.printf("personalityTrait: %s%n%n",personalityTrait);
		personalityBrief(personalityTrait);
		
	
	}





	public static void personalityBrief(String personalityTrait){

		
	switch(personalityTrait){
	

	case "ISTJ":{
		System.out.print("""

		Logistician (16Personalities)
		   Logisticians are practical and fact-minded individuals, whose reliability cannot be doubted.

		-> Personality Brief:

		ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits. 
		  These people tend to be reserved yet willful, with a rational outlook on life. 
		  They compose their actions carefully and carry them out with methodical purpose.

		People with the ISTJ personality type (Logisticians) mean what they say and say what they mean, and when they 
		   commit to doing something, they make sure to follow through. With their responsible and dependable nature, 
		   it might not be so surprising that ISTJ personalities also tend to have a deep respect for structure and tradition. 
		   They are often drawn to organizations, workplaces, and educational settings that offer clear hierarchies and expectations.

		While ISTJs may not be particularly flashy or attention seeking, they do more than their share to keep society on a sturdy
		, stable foundation. In their families and their communities, people with this personality type often earn respect for their
		  reliability, their practicality, and their ability to stay grounded and logical in even the most stressful situations.

		-> Characteristics :

		They are quiet, serious, earn success by being thorough and dependable. 
		  Practical, matter-of-fact, realistic, and responsible. 
		  Decide logically what should be done and work toward it steadily, regardless of distractions. 
		  Take pleasure in making everything orderly and organized—their work, their home, their life. 
		  Value traditions and loyalty.

		-> Strengths: Practical, reliable, responsible, organized, and detail-oriented. Good at managing tasks 
		   and working independently. 
		-> Weaknesses : Can be overly cautious, resistant to change, inflexible, and may struggle with expressing emotions.

		-> Strategies :
		   Practice flexibility by gradually introducing small changes.
		   Focus on positive reinforcement and constructive feedback.
		   Engage in activities that promote emotional awareness, like journaling or therapy.

		"""); break;
	
	}



	case "ISFJ":{
		System.out.print("""

		Defender (16Personalities)
		   Defenders are very dedicated and warm protectors, always ready to defend their loved ones.

		-> Personality Brief:

		ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. 
		   These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, 
		   giving careful attention to practical details in their daily lives.

		In their unassuming, understated way, people with the ISFJ personality type (Defenders) help make the world go round. 
		   Hardworking and devoted, these personalities feel a deep sense of responsibility to those around them. ISFJs can be 
		   counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower their loved ones 
		   with gestures of care and support. But they rarely demand recognition for all that they do, preferring instead to operate 
		   behind the scenes.

		-> Characteristics :

		They are quiet, friendly, responsible, and conscientious. Committed and steady in meeting their obligations. 
		  Thorough, painstaking, and accurate. Loyal, considerate, notice and remember specifics about people 
		  who are important to them, concerned with how others feel. 
		  Strive to create an orderly and harmonious environment at work and at home.

		-> Strengths: Loyal, caring, practical, and compassionate. Excellent at supporting others and creating a harmonious environment. 
		-> Weaknesses : May be overly selfless, avoid confrontation, struggle with change, and may neglect their own needs.

		-> Strategies :
		   Set boundaries and prioritize self-care.
		   Build assertiveness skills and practice addressing issues directly.
		   Develop resilience through mindfulness and self-reflection.
		
		"""); break;
	
	}

	


	case "INFJ":{
		System.out.print("""

		Advocate (16Personalities)
		   Advocates are quiet visionaries, often serving as inspiring and tireless idealists.

		-> Personality Brief:

		INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach 
		   life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of 
		   humanism guide them in all things.

		Idealistic and principled, people with the INFJ personality type (Advocates) aren’t content to coast through life – they want
		   to stand up and make a difference. For these compassionate personalities, success doesn’t come from money or status 
		   but from seeking fulfillment, helping others, and being a force for good in the world.

		While they have lofty goals and ambitions, INFJs shouldn’t be mistaken for idle dreamers. People with this personality type 
		   care about integrity, and they’re rarely satisfied until they’ve done what they know to be right. 
		Conscientious to the core, they move through life with a clear sense of their values, and they aim to never lose 
		   sight of what truly matters – not according to other people or society at large but according to their own wisdom and intuition.

		-> Characteristics :

		They seek meaning and connection in ideas, relationships, and material possessions. Want to understand what motivates 
		   people and are insightful about others. Conscientious and committed to their firm values. Develop a clear vision
		   about how best to serve the common good. Organized and decisive in implementing their vision.

		-> Strengths: Insightful, principled, creative, and passionate. Driven by strong values and a desire to make a positive impact. 
		-> Weaknesses : Can be overly sensitive, perfectionistic, prone to burnout, and may have difficulty expressing emotions.

		-> Strategies :
		   Balance idealism with realism by setting achievable goals.
		   Practice opening up to trusted friends and family.
		   Set realistic expectations and prioritize self-care.
		
		"""); break;
	
	}


	case "INTJ":{
		System.out.print("""

		Architect (16Personalities)
		   Architects are imaginative and strategic thinkers, with a plan for everything.

		-> Personality Brief:
		
		INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. 
		   These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to
		   everything they do. Their inner world is often a private, complex one.

		INTJs tend to value creative ingenuity, straightforward rationality, and self-improvement. 
		   They consistently work toward enhancing intellectual abilities and are often driven by an intense
		   desire to master any and every topic that piques their interest.

		-> Characteristics :

		They have original minds and great drive for implementing their ideas and achieving their goals. Quickly see patterns
		   in external events and develop long-range explanatory perspectives. When committed, organize a job and carry it through. 
		   Skeptical and independent, have high standards of competence and performance—for themselves and others.

		
		-> Strengths: Strategic, independent, highly analytical, and innovative. Excellent problem-solvers and planners. 
		-> Weaknesses : Can be overly critical, arrogant, emotionally detached, and struggle with expressing feelings.  
		
		-> Strategies :
		   Practice active listening and empathy.
		   Focus on progress rather than perfection.
		   Develop humility by acknowledging and valuing others’ contributions.

		"""); break;
	
	}





	case "ISTP":{
		System.out.print("""

		Virtuosos (16Personalities)
		   Virtuosos are innovative and practical experimenters, masters of all kinds of tools.

		-> Personality Brief:
		
		ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits.
		   They tend to have an individualistic mindset, pursuing goals without needing much external connection. 
		   They engage in life with inquisitiveness and personal skill, varying their approach as needed.

		People with the ISTP personality type (Virtuosos) love to explore with their hands and their eyes, touching 
		   and examining the world around them with an impressive diligence, a casual curiosity, and a healthy dose of skepticism. 
		   They are natural makers, moving from project to project, building the useful and the superfluous for the fun of it and 
		   learning from their environment as they go. They find no greater joy than in getting their hands dirty pulling things apart 
		   and putting them back together, leaving them just a little bit better than they were before.

		-> Characteristics :

		They are tolerant and flexible, quiet observers until a problem appears, then act quickly to find workable solutions. 
		   Analyze what makes things work and readily get through large amounts of data to isolate the core of practical problems. 
		   Interested in cause and effect, organize facts using logical principles, value efficiency.

		-> Strengths: Practical, observant, adaptable, and skilled at troubleshooting. Enjoy working with their hands and finding solutions. 
		-> Weaknesses : Can be impulsive, risk-prone, insensitive, and may struggle with long-term planning.

		-> Strategies :
		   Develop planning skills and consider long-term consequences.
		   Use tools like calendars and reminders to stay organized.
		   Practice empathy and active listening.		

		"""); break;
	
	}





	case "ISFP":{
		System.out.print("""

		Adventurers (16Personalities)
		   Adventurers are flexible and charming, always ready to explore and experience something new.

		-> Personality Brief:
		
		ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. 
		   They tend to have open minds, approaching life, new experiences, and people with grounded warmth. 
		   Their ability to stay in the moment helps them uncover exciting potentials.

		People with the ISFP personality type (Adventurers) are true artists – although not necessarily in the conventional sense.
		   For these types, life itself is a canvas for self-expression. From what they wear to how they spend their free time, 
		   they act in ways that vividly reflect who they are as unique individuals. With their exploratory spirit and their ability 
		   to find joy in everyday life, ISFPs can be among the most interesting people you’ll ever meet.

		Driven by their sense of fairness and their open-mindedness, people with this personality type move through life with an 
		   infectiously encouraging attitude. They love motivating those close to them to follow their passions and usually follow 
		   their own interests with the same unhindered enthusiasm. 
		   The only irony? Unassuming and humble, ISFPs tend to see themselves as “just doing their own thing,” so they may not 
		   even realize how remarkable they really are.

		-> Characteristics :

		They are quiet, friendly, sensitive, and kind. Enjoy the present moment, what's going on around them. 
		   Like to have their own space and to work within their own time frame. Loyal and committed to their values
		   and to people who are important to them. Dislike disagreements and conflicts; don't force their opinions 
		   or values on others.

		-> Strengths: Artistic, open-minded, flexible, and empathetic. Enjoy exploring new experiences and expressing creativity. 
		-> Weaknesses : Can be unpredictable, easily stressed, overly competitive, and struggle with consistency.

		-> Strategies :
		   Build assertiveness skills and address issues directly.
		   Develop resilience through mindfulness and self-reflection.
		   Create a flexible but consistent routine.

		"""); break;
	
	}



	case "INFP":{
		System.out.print("""

		Mediators (16Personalities)
		   Mediators are poetic, kind, and altruistic people, always eager to help a good cause.

		-> Personality Brief:
		
		INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. 
		   These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring 
		   and creative approach to everything they do.

		Although they may seem quiet or unassuming, people with the INFP personality type (Mediators) have vibrant, 
		   passionate inner lives. Creative and imaginative, they happily lose themselves in daydreams, inventing 
		   all sorts of stories and conversations in their mind. 

		INFPs are known for their sensitivity – these personalities can have profound emotional responses to music, 
		   art, nature, and the people around them. They are known to be extremely sentimental and nostalgic, often 
		   holding onto special keepsakes and memorabilia that brighten their days and fill their heart with joy.

		-> Characteristics :

		Idealistic, loyal to their values and to people who are important to them. Want to live a life that is
		   congruent with their values. Curious, quick to see possibilities, can be catalysts for implementing ideas. 
		   Seek to understand people and to help them fulfill their potential. Adaptable, flexible, and accepting
		   unless a value is threatened.
		
		-> Strengths: Empathetic, creative, idealistic, and passionate. Driven by strong values and a desire to help others. 
		-> Weaknesses : Can be overly idealistic, impractical, self-critical, and may struggle with making decisions

		-> Strategies :
		   Ground yourself in reality by setting practical goals.
		   Develop coping strategies for stress, like mindfulness or exercise.
		   Seek help or delegate practical tasks when needed.


		"""); break;
	
	}



	case "INTP":{
		System.out.print("""

		Logicians (16Personalities)
		   Logicians are innovative inventors with an unquenchable thirst for knowledge

		-> Personality Brief:
		
		INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. 
		   These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek 
		   out unlikely paths, mixing willingness to experiment with personal creativity.

		-> Characteristics :

		They seek to develop logical explanations for everything that interests them. Theoretical and abstract, 
		   interested more in ideas than in social interaction. Quiet, contained, flexible, and adaptable. 
		   Have unusual ability to focus in depth to solve problems in their area of interest. Skeptical, 
		   sometimes critical, always analytical.

		-> Strengths: Innovative, curious, logical, and open-minded. Enjoy exploring new ideas and finding unique solutions. 
		-> Weaknesses : Can be absent-minded, insensitive, prone to overthinking, and may struggle with following through on tasks.


		-> Strategies :
		   Set deadlines for decision-making to avoid analysis paralysis.
		   Practice mindfulness to stay present.
		   Create a flexible but consistent routine.

		"""); break;
	
	}



	case "ESTP":{
		System.out.print("""

		Entrepreneurs (16Personalities)
		   Entrepreneurs are savvy, energetic, and very perceptive people who truly enjoy living on the edge.

		-> Personality Brief:
		
		ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. 
		   They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. 
		   They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.

		People with the ESTP personality type (Entrepreneurs) are vibrant individuals brimming with an enthusiastic and spontaneous energy. 
		   They tend to be on the competitive side, often assuming that a competitive mindset is a necessity in order to achieve success in life. 
		   With their driven, action-oriented attitudes, they rarely waste time thinking about the past. In fact, they excel at keeping their 
		   attention rooted in their present – so much so that they rarely find themselves fixated on the time throughout the day.

		Theory, abstract concepts, and plodding discussions about global issues and their implications don’t keep ESTP personalities 
		   interested for long. They keep their conversations energetic, with a good dose of intelligence, but they like to talk 
		   about what is – or better yet, to just go out and do it. 
		They often leap before they look, fixing their mistakes as they go rather than sitting idle and preparing contingencies and escape clauses.

		-> Characteristics :

		Flexible and tolerant, take a pragmatic approach focused on immediate results. Bored by theories and conceptual 
		   explanations; want to act energetically to solve the problem. Focus on the here and now, spontaneous, enjoy 
		   each moment they can be active with others. Enjoy material comforts and style. Learn best through doing.

		-> Strengths: Energetic, perceptive, direct, and excellent at taking action. Enjoy living in the moment and taking risks. 
		-> Weaknesses: Can be impatient, risk-prone, defiant, and may struggle with long-term planning.


		-> -> Strategies :
		   Weigh the pros and cons before making decisions.
		   Develop patience through mindfulness and relaxation techniques.
		   Break down long-term goals into smaller, manageable tasks

		"""); break;
	
	}



	case "ESFP":{
		System.out.print("""

		Entertainers (16Personalities)
		   Entertainers are spontaneous, energetic, and enthusiastic people – life is never boring around them.

		-> Personality Brief:
		
		ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. 
		   These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. 
		   They can be very social, often encouraging others into shared activities.

		If anyone is to be found spontaneously breaking into song and dance, it is people with the ESFP personality type (Entertainers). 
		   They get caught up in the excitement of the moment and want everyone else to feel that way too. 
		   No other type is as generous with their time and energy when it comes to encouraging others, 
		   and no other type does it with such irresistible style.

		-> Characteristics :
		   Outgoing, friendly, and accepting. Exuberant lovers of life, people, and material comforts. Enjoy working with others to make things happen.
		   Bring common sense and a realistic approach to their work and make work fun. Flexible and spontaneous, adapt readily to new people and 
	   	   environments. Learn best by trying a new skill with other people.

		-> Strengths: Enthusiastic, spontaneous, sociable, and excellent at making others happy. 
		   Enjoy exploring new experiences and living in the moment. 

		-> Weaknesses : Can be easily bored, overly sensitive, unfocused, and may struggle with long-term planning.

		-> -> Strategies :
		   Break down long-term goals into smaller, manageable tasks.
		   Build self-confidence by focusing on personal values and achievements.
		   Create a flexible but consistent routine.

		"""); break;
	
	}





	case "ENFP":{
		System.out.print("""

		Campaigners (16Personalities)
		   Campaigners are enthusiastic, creative, and sociable free spirits, who can always find a reason to smile.

		-> Personality Brief:
		
		ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits. 
		   These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. 
		   Their vibrant energy can flow in many directions.

		People with the ENFP personality type (Campaigners) are true free spirits – outgoing, openhearted, and open-minded. 
		   With their lively, upbeat approach to life, ENFPs stand out in any crowd. But even though they can be the 
		   life of the party, they don’t just care about having a good time. These personalities have profound depths 
		   that are fueled by their intense desire for meaningful, emotional connections with others.

		-> Characteristics :

		Warmly enthusiastic and imaginative. See life as full of possibilities. Make connections between events
		   and information very quickly, and confidently proceed based on the patterns they see. Want a lot of 
		   affirmation from others, and readily give appreciation and support. 
		Spontaneous and flexible, often rely on their ability to improvise and their verbal fluency.

		-> Strengths: Enthusiastic, creative, sociable, and excellent at inspiring others. Enjoy exploring new ideas and connecting with people. 
		-> Weaknesses: Can be overly emotional, easily stressed, disorganized, and may struggle with following through on tasks.

		-> -> Strategies :
		   Create a structured environment with clear priorities.
		   Develop emotional resilience through mindfulness and self-reflection.
		   Use techniques like time-blocking to maintain focus.

		"""); break;
	
	}




	case "ENTP":{
		System.out.print("""

		Debaters (16Personalities)
		   Debaters are curious and flexible thinkers who cannot resist an intellectual challenge.

		-> Personality Brief:
		
		ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. 
		   They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. 
		   They pursue their goals vigorously despite any resistance they might encounter.

		Quick-witted and audacious, people with the ENTP personality type (Debaters) aren’t afraid to disagree with the status quo. 
		   In fact, they’re not afraid to disagree with pretty much anything or anyone. Few things light up these personalities 
		   more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.

		-> Characteristics :

		Quick, ingenious, stimulating, alert, and outspoken. Resourceful in solving new and challenging problems. 
		   Adept at generating conceptual possibilities and then analyzing them strategically. Good at reading other people. 
		   Bored by routine, will seldom do the same thing the same way, apt to turn to one new interest after another.
		
		-> Strengths: Quick-witted, original, charismatic, and excellent at debating ideas. Enjoy exploring new concepts 
		     and challenging the status quo. 
		-> Weaknesses: Can be argumentative, insensitive, easily bored, and may struggle with following through on tasks.

		-> Strategies :
		   Practice active listening and empathy.
		   Focus on collaborative problem-solving rather than winning arguments.
		   Create a flexible but consistent routine.

		"""); break;
	
	}




	case "ESTJ":{
		System.out.print("""

		Executives (16Personalities)
		   Executives are excellent organizers, unsurpassed at managing things – or people.

		-> Personality Brief:
		
		ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits. 
		   They possess great fortitude, emphatically following their own sensible judgment. They often serve as
		   a stabilizing force among others, able to offer solid direction amid adversity.

		People with the ESTJ personality type (Executives) are representatives of tradition and order, utilizing 
		   their understanding of what is right, wrong, and socially acceptable to bring families and communities together. 
		   Embracing the values of honesty and dedication, ESTJs are valued for their mentorship mindset and their ability 
		   to create and follow through on plans in a diligent and efficient manner. They will happily lead the way on 
		   difficult paths, and they won’t give up when things become stressful.

		-> Characteristics :

		Practical, realistic, matter-of-fact. Decisive, quickly move to implement decisions. Organize projects and people to get 
		   things done, focus on getting results in the most efficient way possible. Take care of routine details. 
		   Have a clear set of logical standards, systematically follow them and want others to also. 
		   Forceful in implementing their plans.

		-> Strengths: Dedicated, strong-willed, organized, and excellent at leading and managing tasks. Enjoy creating order and structure. 
		-> Weaknesses: Can be inflexible, stubborn, judgmental, and may struggle with expressing emotions.	


		-> Strategies :
		   Embrace change by seeking out new experiences.
		   Focus on positive reinforcement and constructive feedback.
		   Engage in activities that promote emotional awareness, like journaling or therapy.

		"""); break;

	}







	case "ESFJ":{
		System.out.print("""

		Consuls (16Personalities)
		   Consuls are very caring, social, community-minded people who are always eager to help.

		-> Personality Brief:
		
		ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits.
		   They are attentive and people-focused, and they enjoy taking part in their social community. 
		   Their achievements are guided by decisive values, and they willingly offer guidance to others.

		For people with the ESFJ personality type (Consuls), life is sweetest when it’s shared with others. 
		   These social individuals form the bedrock of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbors.

		This doesn’t mean that they are saints or that they like everyone. In fact, they are much more likely 
		   to form close bonds with people who share their same values and opinions. But regardless of other people’s beliefs, 
		   ESFJ personalities still strongly believe in the power of hospitality and good manners, and they tend to feel 
		   a sense of duty to those around them. 
		   Generous and reliable, they often take it upon themselves – in ways both large and small 
		   to hold their families and their communities together.

		-> Characteristics :

		Warmhearted, conscientious, and cooperative. Want harmony in their environment, work with determination to establish it. 
		Like to work with others to complete tasks accurately and on time. Loyal, follow through even in small matters. Notice what 
		others need in their day-to-day lives and try to provide it. Want to be appreciated for who they are and for what they contribute.

		-> Strengths: Caring, sociable, practical, and excellent at supporting others. Enjoy creating harmony and helping those in need. 
		-> Weaknesses: Can be overly selfless, needy, resistant to change, and may neglect their own needs.

		-> Strategies :
		   Build self-confidence by focusing on personal values and achievements.
		   Set boundaries and prioritize self-care.
		   Practice flexibility by gradually introducing small changes.



		"""); break;

	}




		case "ENFJ":{
		System.out.print("""

		Protagonists (16Personalities)
		   Protagonists are inspiring optimists, readily taking action to do what they feel is right..

		-> Personality Brief:
		
		ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits. 
		   These warm, forthright types love helping others, and they tend to have strong ideas and values. 
		   They back their perspective with the creative energy to achieve their goals.

		People with the ENFJ personality type (Protagonists) feel called to serve a greater purpose in life. 
		   Thoughtful and idealistic, ENFJs strive to have a positive impact on other people and the world around them. 
		   These personalities rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.
		
		ENFJs are born leaders, which explains why these personalities can be found among many notable politicians, coaches, 
		   and teachers. Their passion and charisma allow them to inspire others not just in their careers but in every arena
		   of their lives, including their relationships. Few things bring people with the ENFJ personality type a deeper 
		   sense of joy and fulfillment than guiding friends and loved ones to grow into their best selves.

		-> Characteristics :

		Warm, empathetic, responsive, and responsible. Highly attuned to the emotions, needs, and motivations of others. 
		   Find potential in everyone, want to help others fulfill their potential. May act as catalysts for individual 
		   and group growth. Loyal, responsive to praise and criticism. Sociable, facilitate others in a group, and 
		   provide inspiring leadership.
		
		-> Strengths: Receptive, reliable, passionate, and excellent at inspiring and leading others. Driven by strong
		  values and a desire to make a positive impact. 
		-> Weaknesses: Can be overly idealistic, overly sensitive, self-sacrificing, and may struggle with setting boundaries.

		-> Strategies :
		   Prioritize tasks and learn to delegate.
		   Balance idealism with realism by setting achievable goals.
		   Set realistic expectations and prioritize self-care.
	

		"""); break;

	}




	case "ENTJ":{
		System.out.print("""

		Commander (16Personalities)
		   Commanders are bold, imaginative, and strong-willed, always finding a way – or making one.

		-> Personality Brief:
		
		ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits. 
		   They are decisive people who love momentum and accomplishment. They gather information to construct 
		   their creative visions but rarely hesitate for long before acting on them.

		People with the ENTJ personality type (Commanders) are natural-born leaders. Embodying the gifts of 
		   charisma and confidence, ENTJs project authority in a way that draws crowds together behind a common 
		   goal. However, these personalities are also characterized by an often ruthless level of rationality, 
		   using their drive, determination, and sharp mind to achieve whatever objectives they’ve set for themselves. 
		   Their intensity might sometimes rub people the wrong way, but ultimately, ENTJs take pride in both their 
		   work ethic and their impressive level of self-discipline.

		-> Characteristics :

		Frank, decisive, assume leadership readily. Quickly see illogical and inefficient procedures and policies, 
		   develop and implement comprehensive systems to solve organizational problems. Enjoy long-term planning 
		   and goal setting. Usually well informed, well read, enjoy expanding their knowledge and passing it on to others. 
		   Forceful in presenting their ideas.

		-> Strengths: Efficient, strategic, confident, and excellent at organizing and leading. Enjoy setting and achieving goals. 
		-> Weaknesses: Can be stubborn, intolerant, impatient, and may struggle with expressing emotions.

		-> Strategies :
		   Develop empathy and active listening skills.
		   Focus on constructive feedback and positive reinforcement.
		   Engage in activities that promote emotional awareness, like journaling or therapy.


		"""); break;

	}












	
		
	}

		

	}
       











}

