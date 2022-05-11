// Andhvishwas Assignment
// Display top 10 andhvishwas and corresponding to users choice display scientific facts with YouTube link

import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.System.in;

class Andhvishwas
{
	static	
	{
		out.println("\n Andhvishwas");
		Date date=new Date();
		out.println(date);	
	}

        static public void main(String...args)
        {
                Scanner sc=new Scanner(in);
                out.println("\t\t\t\t\t Andhvishwas \t\t\t\t\t");
                out.println("\n1) Eat curd and sugar before heading out \n2) Don’t wash or cut hairs on certain days \n3) Swallow tulsi leaves never chew \n4) Bathe after attending a funeral ceremony \n5) Menstruating women are considered impure and unclean \n6) Lizard falling on human is bad luck \n7) Using lemons and green chillies to avoid buri nazar \n8) Bats entering the house means death \n9) Ghosts residing in peepal trees \n10) Throwing coins in fountains and rivers bring good");
                out.println("\nEnter your choice: ");
                int choice=sc.nextInt(); 
                switch(choice)
                {
                case 1: out.println("Superstition: Eat curd and sugar before heading out");
                        out.println("Scientific fact: Eating curd and sugar before stepping out for something new and important is considered to be good luck as the consumption of curd has a cooling effect on the stomach and sugar which is added provides instant glucose which makes your work easier and successful. This combination is indispensable for Indians and its consumption was slowly linked to good luck.");
                        out.println("YouTube link: https://youtu.be/jyGJMVjcHt0");
                        break;

                case 2: out.println("Superstition: Don’t wash or cut hairs on certain days");
                        out.println("Scientific fact: Washing or cutting hairs on certain days like on Tuesdays or Thursdays are considered to be bad luck but there’s no truth in this as it was one of the water management practices. And moreover, during those days, barbers got a holiday on those days. So, just to give them a holiday people don’t cut hairs on those days.");
                        out.println("YouTube link: https://youtu.be/UF81Ukd9TQA");
                        break;

                case 3: out.println("Superstition: Swallow tulsi leaves never chew");
                        out.println("Scientific fact: Tulsi leaves shouldn’t be chewed, it needs to be swallowed. The science behind his is that the tulsi leaves contain a little amount of arsenic. Thus, chewing it directly could result in degradation of enamel.");
                        out.println("YouTube link: https://youtu.be/BJ944bmZDdU");
                        break;

                case 4: out.println("Superstition: Bathe after attending a funeral ceremony");
                        out.println("Scientific fact: Earlier bathing was necessary after attending a funeral ceremony but today it’s not like earlier as our ancestors didn’t have vaccinations against smallpox, hepatitis and other deadly diseases. So they came up with this ritual of bathing so as to prevent themselves from infection from the dead body.");
                        out.println("YouTube link: https://youtu.be/h8EUgKJ6FjM");
                        break;

                case 5: out.println("Superstition: Menstruating women are considered impure and unclean");
                        out.println("Scientific fact: In a country like India, it is very prevalent and this gave rise to many other superstitious beliefs. At that time women were not allowed inside the kitchen, temples, mosques, and other religious spots. They are not allowed to perform any household duties. The reason is that at that point of time women are comparatively weak because of a lot of blood loss. So, they are given complete rest. Moreover, ancient stone statues of God maintain a certain equilibrium with the atmosphere and may collapse if any disturbance occurs. As women release a lot of heat during this period, they are not allowed inside the temple since this may cause a disturbance in the natural equilibrium and may result in cracks in the idols.");
                        out.println("YouTube link: https://youtu.be/xb927D0qXTU");
                        break;

                case 6: out.println("Superstition: Lizard falling on human is bad luck");
                        out.println("Scientific fact: It is said to be bad luck but the scientific reasons behind this is that the lizard releases poisonous chemicals from its body in order to protect themselves from enemies and if it falls on human body or food, it is bound to contaminate it. So, bathe is taken after it falls on someone.");
                        out.println("YouTube link: https://youtu.be/883mH7xABtE");
                        break;

                case 7: out.println("Superstition: Using lemons and green chillies to avoid buri nazar");
                        out.println("Scientific fact: The nimbhu mirchi tadka is one of the commonly visible superstitions among the society whose use is often encouraged due to the qualities of lemon and chillies as they both are rich in different vitamins and create certain acidic odour which helps keep away insects. Thus, our ancestors used this as a symbol during ceremonies which now turned into a todka.");
                        out.println("YouTube link: https://youtu.be/0aSgX5lU2Y8");
                        break;

                case 8: out.println("Superstition: Bats entering the house means death");
                        out.println("Scientific fact: It is considered to be a bad omen. The real reason behind this superstition is that the bats bring a lot of deadly diseases along with them and when there was no medical facility available during those days, people would die due to rabies, Ebola, Nipah and other illness brought in by the illness.");
                        out.println("YouTube link: https://youtu.be/-41psER4zUk");
                        break;

                case 9: out.println("Superstition: Ghosts residing in peepal trees");
                        out.println("Scientific fact: This myth continues to prevail even today. But the scientific reason behind this is that the trees use carbon dioxide during the day and releases oxygen but at night, it is the other way round. So, when you sleep under the tree, the excess carbon dioxide level can make you feel heavy in the fist and suffocated which is associated with the feeling of being possessed by some spirits.");
                        out.println("YouTube link: https://youtu.be/nigDSmHYjP4");
                        break;

                case 10: out.println("Superstition: Throwing coins in fountains and rivers bring good");
                        out.println("Scientific fact: Most currencies in ancient times were made of copper and by throwing copper coins into rivers, our forefathers apparently ensured that they were consuming pure water. Science has it that copper has antimicrobial property and it can kill 99.9% of infection-causing bacteria. However, today neither do we use copper coins nor do we drink water directly from the river. This belief has brought in more pollution than good luck.");
                        out.println("YouTube link: https://youtu.be/yTGFbV0ojJU");
                        break;
                }
        }
}