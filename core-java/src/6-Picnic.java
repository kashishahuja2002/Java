// Picnic Spot and Food
// Display a menu of kilometer range, corresponding to user's choice display spots name and as per spot choice display following menu: About the place, incidents, transport facility, stay and food facility, emergency contacts

import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.System.in;

class Picnic
{
	static	
	{
		out.println("\n Picnic Spot and Food");
		Date date=new Date();
		out.println(date);	
	}

        static Scanner sc=new Scanner(in);

        static void menu()
        {
                out.println("\nMenu");
                out.println("1) About the place \n2) Incidents \n3) Transport facility \n4) Stay and food facility \n5) Emergrncy contacts");
                out.println("\nEnter your menu choice: ");
        }

        // 1) Central Museum 2) Krishna Pura Chhatri 3) Ralamandal Wildlife Sanctuary 4) Hatyari Khoh 5) Lotus Lake, Gulawat 6) Tincha Falls 7) Patalpani Falls 8) Choral Dam 9) Janapav Hill 10) Jam Darwaza

        static void centralMuseum()
        {
                out.println("\t\t\t Central Museum");
                menu();
                byte menu=sc.nextByte();
                switch(menu)
                {
                        case 1: out.println("\nAbout the place");
                                out.println("Indore Museum is museum situated in Indore in Madhya Pradesh state in India. It is located near the General Post Office in Indore.There are two galleries in the Museum.The artefacts exhibited in the museum range from the prehistoric to the modern era.");
                                break;

                        case 2: out.println("\nIncidents");
                                out.println("...");
                                break;

                        case 3: out.println("\nTransport facility");
                                out.println("...");
                                break;

                        case 4: out.println("\nStay and food facility");
                                out.println("...");
                                break;

                        case 5: out.println("\nEmergency contacts");
                                out.println("...");
                                break;
                }
        }

        static void krishnaPuraChhatri()
        {
                out.println("\t\t\t Krishna Pura Chhatri");
                menu();
                byte menu=sc.nextByte();
                switch(menu)
                {
                        case 1: out.println("\nAbout the place");
                                out.println("The Krishnapura Chhatri, also known as the Krishna Pura Chhatri are three chhatri located in Indore, Madhya Pradesh, India.[1] The structures were built by the Holkars as cenotaphs to house the remains of the dynasty's rulers, leading to them also being known as the Holkar Chhatris. All three of the Chhatris are located half a kilometer from the palace-city of Rajwada, which was also built by the Holkar dynasty.");
                                break;

                        case 2: out.println("\nIncidents");
                                out.println("...");
                                break;

                        case 3: out.println("\nTransport facility");
                                out.println("...");
                                break;

                        case 4: out.println("\nStay and food facility");
                                out.println("...");
                                break;

                        case 5: out.println("\nEmergency contacts");
                                out.println("...");
                                break;
                }
        }

        static void ralamandalWildlifeSanctuary()
        {
                out.println("\t\t\t Ralamandal Wildlife Sanctuary");
                menu();
                byte menu=sc.nextByte();
                switch(menu)
                {
                        case 1: out.println("\nAbout the place");
                                out.println("The Ralamandal Wildlife Sanctuary was established in 1989 in Indore, Madhya Pradesh. It is spread over five square kilometres and is home to different species of birds and other wildlife. It has an ancient palace built by Holkars which was primarily used as a hunting hut also known as shikargah.");
                                break;

                        case 2: out.println("\nIncidents");
                                out.println("...");
                                break;

                        case 3: out.println("\nTransport facility");
                                out.println("...");
                                break;

                        case 4: out.println("\nStay and food facility");
                                out.println("...");
                                break;

                        case 5: out.println("\nEmergency contacts");
                                out.println("...");
                                break;
                }
        }

        static void hatyariKhoh()
        {
                out.println("\t\t\t Hatyari Khoh");
                menu();
                byte menu=sc.nextByte();
                switch(menu)
                {
                        case 1: out.println("\nAbout the place");
                                out.println("You might be thinking why would someone want to visit a place to relax with such a lurid name. But Hatyari Khoh is anything but uncanny. Rather it is the most beautiful place you can visit to getaway from the hustle bustle of the city. Located in the state of Madhya Pradesh, Hatyari Khoh with fascinating horror stories, lush green trees, mesmerizing waterfalls and majestic hillocks, Hatyari Khoh is a must visit place to be in the lap of nature. This place is still untouched by industrialization which makes it even more beautiful. This is an amazing place to break free from the monotony of your stressful life and devote some time gazing at the enchanting waterfall and verdant trees. After this trip you will definitely feel closer to nature and start appreciating its beauty.");
                                break;

                        case 2: out.println("\nIncidents");
                                out.println("...");
                                break;

                        case 3: out.println("\nTransport facility");
                                out.println("...");
                                break;

                        case 4: out.println("\nStay and food facility");
                                out.println("...");
                                break;

                        case 5: out.println("\nEmergency contacts");
                                out.println("...");
                                break;
                }
        }

        static void lotusLake()
        {
                out.println("\t\t\t Lotus Lake, Gulawat");
                menu();
                byte menu=sc.nextByte();
                switch(menu)
                {
                        case 1: out.println("\nAbout the place");
                                out.println("Gulawat is a beautiful lotus valley located about 30 kms away from city of Indore. Gulawat village is located in Hatod tehsil of Indore district. Gulawat Lotus Lake offers breathtaking views of the lotus valley and is therefore a place of great interest for photographers too.");
                                break;

                        case 2: out.println("\nIncidents");
                                out.println("...");
                                break;

                        case 3: out.println("\nTransport facility");
                                out.println("...");
                                break;

                        case 4: out.println("\nStay and food facility");
                                out.println("...");
                                break;

                        case 5: out.println("\nEmergency contacts");
                                out.println("...");
                                break;
                }
        }

        static void tinchaFalls()
        {
                out.println("\t\t\t Tincha Falls");
                menu();
                byte menu=sc.nextByte();
                switch(menu)
                {
                        case 1: out.println("\nAbout the place");
                                out.println("Located 25 kilometres from the bustling city of Indore, Tincha Falls are one of the most popular waterfalls in the region. The milky white cascade is located in the Tincha village, also where the falls derive their name from. The roaring plunge of water at a height of 300 feet is a rain fed waterfall and is primarily a monsoon destination. Surrounded by lush green vegetation on all sides and an exhilarating experience in itself,Tincha falls attracts a wide array of visitors from all walks of life. The falls are also a canyon, nuzzled in between valleys Tincha is an ideal picnic destination and monsoon break away from the chaos that ensues in the cities. The falls also have a small pond near the foot of the falls, the stillness of the pond against the roaring descent of water is a sight you must definitely not miss.");
                                break;

                        case 2: out.println("\nIncidents");
                                out.println("...");
                                break;

                        case 3: out.println("\nTransport facility");
                                out.println("...");
                                break;

                        case 4: out.println("\nStay and food facility");
                                out.println("...");
                                break;

                        case 5: out.println("\nEmergency contacts");
                                out.println("...");
                                break;
                }
        }

        static void patalpaniFalls()
        {
                out.println("\t\t\t Patalpani Falls");
                menu();
                byte menu=sc.nextByte();
                switch(menu)
                {
                        case 1: out.println("\nAbout the place");
                                out.println("Plummeting from a height of 300 meters, the Patalpani Waterfall is the most scenic photo stop in Indore. These roaring falls are enveloped by refreshing mist and dense verdure making them the favourite getaway picnic spot. The monsoons swell the falls and may make it risky for close encounters causing accidents. It is best to maintain cautious distance from the waterfall during the rains.");
                                break;

                        case 2: out.println("\nIncidents");
                                out.println("...");
                                break;

                        case 3: out.println("\nTransport facility");
                                out.println("...");
                                break;

                        case 4: out.println("\nStay and food facility");
                                out.println("...");
                                break;

                        case 5: out.println("\nEmergency contacts");
                                out.println("...");
                                break;
                }
        }

        static void choralDam()
        {
                out.println("\t\t\t Choral Dam");
                menu();
                byte menu=sc.nextByte();
                switch(menu)
                {
                        case 1: out.println("\nAbout the place");
                                out.println("If you are tired of the pell mell of the daily life and want to go away to unwind and relax, Choral Dam is just the place for you. Located in the state of Madhya Pradesh, Choral Dam is a hidden gem that will definitely provide you with quietness and tranquility. Constructed around the backwaters of River Narmada, Choral Dam is replete with cool and clear water. A large number of lush green trees and small hills surround the place making it even more attractive. This place is full of jovial water activities that will interest young and old alike. The panoramic views of the sky and the ground are mesmerizing. To enjoy nature at its best make sure to witness either a sunset or a sunrise from here. The different hues of sky coupled with the verdant trees and clear blue water is nothing short of perfection. Choral Dam is an ideal place for a weekend getaway and spend some quiet time relaxing and unwinding.");
                                break;

                        case 2: out.println("\nIncidents");
                                out.println("...");
                                break;

                        case 3: out.println("\nTransport facility");
                                out.println("...");
                                break;

                        case 4: out.println("\nStay and food facility");
                                out.println("...");
                                break;

                        case 5: out.println("\nEmergency contacts");
                                out.println("...");
                                break;
                }
        }

        static void janapavHill()
        {
                out.println("\t\t\t Janapav Hill");
                menu();
                byte menu=sc.nextByte();
                switch(menu)
                {
                        case 1: out.println("\nAbout the place");
                                out.println("Nestled among similar hills of the Malwa region, Janapav, or Janapav Kuti, is the ideal getaway for lovers of nature and trekkers alike. If you’re looking to traverse through twisty bends in Central Indian forests while peacefully gazing over distant hills and the crimson sunset, then this hill station should be your destination. Located on the Mumbai-Indore highway and in the Mhow Tehsil of Indore district, Janapav experiences footfall from all areas of country throughout the year, especially during monsoons. Situated as it is at a height of 881 m, 45 km away from the city of Indore, and surrounded by forest cover, Janapav is a pocket of nature whose air will not only cleanse your lungs but also leave you spiritually soothed. Indeed the flora of this region is known for its unique Ayurvedic potencies and is accordingly harvested by expert Ayurveda practitioners. The place is also famous for the fair a that is held there every year on Kartik Purnima which is the first full moon after Diwali.");
                                break;

                        case 2: out.println("\nIncidents");
                                out.println("...");
                                break;

                        case 3: out.println("\nTransport facility");
                                out.println("...");
                                break;

                        case 4: out.println("\nStay and food facility");
                                out.println("...");
                                break;

                        case 5: out.println("\nEmergency contacts");
                                out.println("...");
                                break;
                }
        }

        static void jamDarwaza()
        {
                out.println("\t\t\t Jam Darwaza");
                menu();
                byte menu=sc.nextByte();
                switch(menu)
                {
                        case 1: out.println("\nAbout the place");
                                out.println("The Jam Gate is a picnic spot in Maheshwar Tehsil of Khargone district in the state of Madhya Pradesh, India. It is on Mhow-Mandleshwar Road. It is approximately 30 km from Mhow, 50 km from Indore, 33 km from Maheshwar and 75 km from district headquarter Khargone. Jam gate is the gateway of Malwa - Nimar.");
                                break;

                        case 2: out.println("\nIncidents");
                                out.println("...");
                                break;

                        case 3: out.println("\nTransport facility");
                                out.println("...");
                                break;

                        case 4: out.println("\nStay and food facility");
                                out.println("...");
                                break;

                        case 5: out.println("\nEmergency contacts");
                                out.println("...");
                                break;
                }
        }

        static public void main(String...args)
        {
                out.println("\t\t\t\t\t Picnic");
                out.println("\nKilometer Range");
                out.println("1) Within 10Km \n2) Within 20km \n3) Within 30km \n4) Within 40km \n5) Within 50km");
                out.println("\nEnter your choice: ");
                byte spot;
                byte choice=sc.nextByte();
                switch(choice)
                {
                case 1: out.println("\n\t\t\t Within 10km");
                        out.println("\nSpots");
                        out.println("1) Central Museum \n2) Krishna Pura Chhatri");
                        out.println("\nEnter your spot choice: ");
                        spot=sc.nextByte();
                        switch(spot) 
                        {
                                case 1: centralMuseum();
                                        break;

                                case 2: krishnaPuraChhatri();
                                        break;
                        }
                        break;

                case 2: out.println("\n\t\t\t Within 20km");
                        out.println("\nSpots");
                        out.println("1) Central Museum \n2) Krishna Pura Chhatri \n3) Ralamandal Wildlife Sanctuary \n4) Hatyari Khoh");
                        out.println("\nEnter your spot choice: ");
                        spot=sc.nextByte();
                        switch(spot)
                        {
                                case 1: centralMuseum();
                                        break;

                                case 2: krishnaPuraChhatri();
                                        break;
                                
                                case 3: ralamandalWildlifeSanctuary();
                                        break;

                                case 4: hatyariKhoh();
                                        break;
                        }
                        break;

                case 3: out.println("\n\t\t\t Within 30km");
                        out.println("\nSpots");
                        out.println("1) Central Museum \n2) Krishna Pura Chhatri \n3) Ralamandal Wildlife Sanctuary \n4) Hatyari Khoh \n5) Lotus Lake, Gulawat \n6) Tincha Falls");
                        out.println("\nEnter your spot choice: ");
                        spot=sc.nextByte();
                        switch(spot)
                        {
                                case 1: centralMuseum();
                                        break;

                                case 2: krishnaPuraChhatri();
                                        break;
                                
                                case 3: ralamandalWildlifeSanctuary();
                                        break;

                                case 4: hatyariKhoh();
                                        break;

                                case 5: lotusLake();
                                        break;

                                case 6: tinchaFalls();
                                        break;
                        }
                        break;

                case 4: out.println("\n\t\t\t Within 40km");
                        out.println("\nSpots");
                        out.println("1) Central Museum \n2) Krishna Pura Chhatri \n3) Ralamandal Wildlife Sanctuary \n4) Hatyari Khoh \n5) Lotus Lake, Gulawat \n6) Tincha Falls \n7) Patalpani Falls \n8) Choral Dam");
                        out.println("\nEnter your spot choice: ");
                        spot=sc.nextByte();
                        switch(spot)
                        {
                                case 1: centralMuseum();
                                        break;

                                case 2: krishnaPuraChhatri();
                                        break;
                                
                                case 3: ralamandalWildlifeSanctuary();
                                        break;

                                case 4: hatyariKhoh();
                                        break;

                                case 5: lotusLake();
                                        break;

                                case 6: tinchaFalls();
                                        break;

                                case 7: patalpaniFalls();
                                        break;

                                case 8: choralDam();    
                                        break;
                        }
                        break;

                case 5:out.println("\n\t\t\t Within 50km");
                        out.println("\nSpots");
                        out.println("1) Central Museum \n2) Krishna Pura Chhatri \n3) Ralamandal Wildlife Sanctuary \n4) Hatyari Khoh \n5) Lotus Lake, Gulawat \n6) Tincha Falls \n7) Patalpani Falls \n8) Choral Dam \n9) Janapav Hill \n10) Jam Darwaza");
                        out.println("\nEnter your spot choice: ");
                        spot=sc.nextByte();
                        switch(spot)
                        {
                                case 1: centralMuseum();
                                        break;

                                case 2: krishnaPuraChhatri();
                                        break;
                                
                                case 3: ralamandalWildlifeSanctuary();
                                        break;

                                case 4: hatyariKhoh();
                                        break;

                                case 5: lotusLake();
                                        break;

                                case 6: tinchaFalls();
                                        break;

                                case 7: patalpaniFalls();
                                        break;

                                case 8: choralDam();    
                                        break;

                                case 9: janapavHill();
                                        break;
                                
                                case 10: jamDarwaza();
                                        break;
                        }
                        break;
                }
        }
}