// Program to display guest name of Republic Day as per user's input of the year (2010 - 2020) and depending upon user's choice guest name and history should be displayed.

import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.System.in;

class RepublicDay
{
	static	
	{
		out.println("\nRepublic Day");
		Date date=new Date();
		out.println(date);	
	}

    static public void main(String...args)
    {
        Scanner sc=new Scanner(in);
        out.println("Enter an year from 2010 to 2020: ");
        int year=sc.nextInt();
        switch(year)
        {
            case 2010: out.println("\nGuest: Lee Myung Bak");
                        out.println("Country: South Korea");
                        out.println("Designation: President of South Korea");
                        out.println("Host: Pratibha Patil");
                        out.println("History: Lee Myung Bak is a former South Korean businessman and politician who served as President of South Korea from 2008 to 2013. Before his presidency, he was the CEO of Hyundai Engineering and Construction, and the mayor of Seoul from 2002 to 2006.");
                        break;

            case 2011: out.println("\nGuest: Susilo Bambang Yudhoyono");
                        out.println("Country: Indonesia");
                        out.println("Designation: President of Indonesia");
                        out.println("Host: Pratibha Patil");
                        out.println("History: Susilo Bambang Yudhoyono commonly referred to by his initials SBY, is an Indonesian politician and retired Army general who served as the sixth president of Indonesia from 2004 to 2014. He is a member of the Democratic Party and President of the Assembly and Chair of the Council of the Global Green Growth Institute. Yudhoyono was also the former Chairman of ASEAN due to Indonesia hosting the 18th and 19th ASEAN Summits.");
                        break;

            case 2012: out.println("\nGuest: Yingluck Shinawatra");
                        out.println("Country: Thailand");
                        out.println("Designation: Prime Minister of Thailand");
                        out.println("Host: Pratibha Patil");
                        out.println("History: Yingluck Shinawatra, nicknamed Pou, is a Thai businesswoman, politician and a member of the Pheu Thai Party who became the Prime Minister of Thailand following the 2011 election. Yingluck was Thailand's first female prime minister and its youngest in over 60 years. She was removed from office on 7 May 2014 by a Constitutional Court decision.");
                        break;

            case 2013: out.println("\nGuest: Jigme Khesar Namgyel Wangchuck");
                        out.println("Country: Bhutan");
                        out.println("Designation: King of Bhutan");
                        out.println("Host: Pranab Mukherjee");
                        out.println("History: Jigme Khesar Namgyel Wangchuck is Druk Gyalpo or \"Dragon King\" of the Kingdom of Bhutan. After his father Jigme Singye Wangchuck abdicated the throne in his favour, he became the monarch on 9 December 2006. A public coronation ceremony was held on 1 November 2008, a year that marked 100 years of monarchy in Bhutan.");
                        break;

            case 2014: out.println("\nGuest: Shinzo Abe");
                        out.println("Country: Japan");
                        out.println("Designation: Prime Minister of Japan");
                        out.println("Host: Pranab Mukherjee");
                        out.println("History: Shinzo Abe is a Japanese politician who served as Prime Minister of Japan and President of the Liberal Democratic Party (LDP) from 2006 to 2007 and again from 2012 to 2020. He is the longest-serving prime minister in Japanese history. Abe also served as Chief Cabinet Secretary from 2005 to 2006 under Junichiro Koizumi and was briefly Leader of the Opposition in 2012.");
                        break;

            case 2015: out.println("\nGuest: Barack Obama");
                        out.println("Country: United States");
                        out.println("Designation: President of the United States");
                        out.println("Host: Pranab Mukherjee");
                        out.println("History: Barack Obama is an American politician and attorney who served as the 44th president of the United States from 2009 to 2017. A member of the Democratic Party, Obama was the first African-American president of the United States. He previously served as a U.S. senator from Illinois from 2005 to 2008 and as an Illinois state senator from 1997 to 2004.");
                        break;

            case 2016: out.println("\nGuest: François Hollande");
                        out.println("Country: France");
                        out.println("Designation: President of France");
                        out.println("Host: Pranab Mukherjee");
                        out.println("History: François Hollande is a French politician who served as President of France from 2012 to 2017. He previously was First Secretary of the Socialist Party from 1997 to 2008, Mayor of Tulle from 2001 to 2008 and President of the General Council of Corrèze from 2008 to 2012. Hollande also served in the National Assembly twice for the first constituency of Corrèze from 1988 to 1993 and again from 1997 until 2012.");
                        break;

            case 2017: out.println("\nGuest: Mohammed bin Zayed Al Nahyan");
                        out.println("Country: United Arab Emirates");
                        out.println("Designation: Crown Prince of Abu Dhabi");
                        out.println("Host: Pranab Mukherjee");
                        out.println("History: Mohammed bin Zayed Al Nahyan, colloquially known by his initials as MBZ, is the Crown Prince of the Emirate of Abu Dhabi, Deputy Supreme Commander of the United Arab Emirates Armed Forces and the de facto ruler of Abu Dhabi. He is seen as the driving force behind the UAE's interventionist foreign policy and is a leader of a campaign against Islamist movements in the Arab World.");
                        break;

            case 2018: out.println("\nGuest: Hassanal Bolkiah");
                        out.println("Country: Brunei");
                        out.println("Designation: Sultan of Brunei");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Hassanal Bolkiah is the 29th and current Sultan and Yang di-Pertuan of Brunei and the Prime Minister of Brunei. He is one of the last absolute monarchs in the world. The eldest son of Sultan Omar Ali Saifuddien III and Raja Isteri (Queen) Pengiran Anak Damit, he succeeded to the throne as the sultan of Brunei, following the abdication of his father on 5 October 1967.");

                        out.println("\nGuest: Hun Sen");
                        out.println("Country: Cambodia");
                        out.println("Designation: Prime Minister of Cambodia");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Hun Sen is a Cambodian politician and former military commander who has served as the prime minister of Cambodia since 1985[4] He is the longest-serving head of government of Cambodia, and one of the longest-serving leaders in the world. He is also the president of the Cambodian People's Party (CPP) and a member of the National Assembly for Kandal. His full honorary title is Samdech Akka Moha Sena Padei Techo Hun Sen, meaning \"Lord Prime Minister, Supreme Military Commander Hun Sen\"");

                        out.println("\nGuest: Joko Widodo");
                        out.println("Country: Indonesia");
                        out.println("Designation: President of Indonesia");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Joko Widodo also known as Jokowi, is an Indonesian politician and businessman who is the 7th and current president of Indonesia. Elected in July 2014 as the first president not to come from an elite political or military background, he was previously the Mayor of Surakarta from 2005 to 2012 and the Governor of Jakarta from 2012 to 2014. Before his political career, he was an industrialist and businessman.");
                        
                        out.println("\nGuest: Thongloun Sisoulith");
                        out.println("Country: Laos");
                        out.println("Designation: Prime Minister of Laos");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Thongloun Sisoulith is a Laotian politician currently serving as General Secretary of the Lao People's Revolutionary Party since 15 January 2021 and President of Laos since 22 March 2021.");
                        
                        out.println("\nGuest: Najib Razak");
                        out.println("Country: Malaysia");
                        out.println("Designation: Prime Minister of Malaysia");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Najib Razak  is a Malaysian politician who served as the 6th prime minister of Malaysia from April 2009 to May 2018. He is the son of another former prime minister, Abdul Razak Hussein. Najib Razak was the chairman of the Barisan Nasional (BN) coalition from April 2009 to May 2018 and the president of the United Malays National Organisation (UMNO) from November 2008 to May 2018, which had maintained control of Malaysia's government with a parliamentary majority for more than sixty years until the coalition's defeat in the 2018 general election. He is referred to as Father of Transformation (Bapa Transformasi).");
                        
                        out.println("\nGuest: Aung San Suu Kyi");
                        out.println("Country: Myanmar");
                        out.println("Designation: State Counsellor of Myanmar");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Aung San Suu Kyi is a Burmese politician, diplomat, author, and a 1991 Nobel Peace Prize laureate who served as State Counsellor of Myanmar (equivalent to a prime minister) and Minister of Foreign Affairs from 2016 to 2021. She has served as the chairperson of the National League for Democracy (NLD) since 2011, having been the general secretary from 1988 to 2011. She played a vital role in Myanmar's transition from military junta to partial democracy in the 2010s.");
                        
                        out.println("\nGuest: Rodrigo Duterte");
                        out.println("Country: Philippines");
                        out.println("Designation: President of the Philippines");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Rodrigo Duterte also known as Digong and Rody, is a Filipino politician who is the 16th and current president of the Philippines and the first from Mindanao to hold the office.");
                        
                        out.println("\nGuest: Lee Hsien Loong");
                        out.println("Country: Singapore");
                        out.println("Designation: Prime Minister of Singapore");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Lee Hsien Loong is a Singaporean politician and former army general who has served as Prime Minister of Singapore and secretary-general of the ruling People's Action Party (PAP) since 2004. He served as the deputy prime minister to Goh Chok Tong from 1990 to 2004 and was minister for finance from 2001 to 2007. His wife is Ho Ching, the CEO of Temasek Holdings.");
                        
                        out.println("\nGuest: Prayut Chan-o-cha");
                        out.println("Country: Thailand");
                        out.println("Designation: Prime Minister of Thailand");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Prayut Chan-o-cha is a Thai politician and a retired Royal Thai Army general officer, serving as Prime Minister of Thailand since 2014 and Minister of Defence since 2019. Prayut served as chief of the Thai army from 2010 to 2014 and was the leader of a coup d'etat which installed the National Council for Peace and Order (NCPO), the military junta which governed Thailand between 22 May 2014 and 10 July 2019.");
                        
                        out.println("\nGuest: Nguyễn Xuân Phúc");
                        out.println("Country: Vietnam");
                        out.println("Designation: Prime Minister of Vietnam");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: He is a Vietnamese politician currently serving as the President of Vietnam, one of the highest-ranked officials in Vietnam. He ranked 2nd in the Communist Party's 13th Politburo and was ranked 3rd in the 12th Politburo. He is also a full member of the National Assembly, serving in its 11th, 12th, 13th and 14th terms. He was elected to the post by the National Assembly of Vietnam on 5 April 2021 after serving 5 years as Prime Minister of the country. He became a member of the Communist Party of Vietnam on 12 November 1983.");
                        break;

            case 2019: out.println("\nGuest: Cyril Ramaphosa");
                        out.println("Country: South Africa");
                        out.println("Designation: President of South Africa");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Cyril Ramaphosa (born 17 November 1952) is a South African politician serving as President of South Africa since 2018 and President of the African National Congress (ANC) since 2017. Previously an anti-apartheid activist, trade union leader and businessman, Ramaphosa served as Secretary General to ANC President Nelson Mandela, Deputy President to President Jacob Zuma, and Chairman of the National Planning Commission from 2014 to 2018.");
                        break;

            case 2020: out.println("\nGuest: Jair Bolsonaro");
                        out.println("Country: Brazil");
                        out.println("Designation: President of Brazil");
                        out.println("Host: Ram Nath Kovind");
                        out.println("History: Jair Bolsonaro is a Brazilian politician and retired military officer who has been the 38th president of Brazil since 1 January 2019. He was elected in 2018 as a member of the conservative Social Liberal Party before cutting ties with it. From 1991 to 2018, Bolsonaro served in Brazil's Chamber of Deputies, representing the state of Rio de Janeiro.");

            default: 
                out.println("Invalid year.");
        }   
    }
}