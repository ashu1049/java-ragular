public class switch1demo {
    public static void main(String args[])
    {
        System.out.println("sunday");
        System.out.println("monday");
        System.out.println("tuesday");
        System.out.println("wednesday");
        System.out.println("thursday");
        System.out.println("friday");
        System.out.println("saturday\n");

       
        String choice= "sunday";

        switch( choice )
        {
            case "sunday":
            System.out.println("sunday:\n\n"+"Associated with vitality, health, authority, and leadership." + //
                                "\n" + //
                                "Fasting on Sundays is believed to remove ailments, especially related to the eyes, bones, and skin." + //
                                "\n" + //
                                "People worship Surya by offering Arghya (water) at sunrise." + //
                                "\n" + //
                                "Considered auspicious for beginning government-related work or leadership roles.\n" + //
                                "");
            break;

            case "monday":
            System.out.println("monday:\n\n"+"Represents calmness, emotions, and the mind." + //
                                "\n" + //
                                "Fasting on Mondays (Somavār Vrat) pleases Lord Shiva; popular among unmarried girls for getting a good spouse." + //
                                "\n" + //
                                "Special worship involves offering milk, bilva leaves, and water to Shiva Linga." + //
                                "\n" + //
                                "Considered good for starting journeys and spiritual practices.");
            break;

            case "tuesday":
            System.out.println("tuesday:\n\n"+"Symbolizes strength, courage, and protection." + //
                                "\n" + //
                                "People fast on Tuesdays to reduce the malefic effects of Mars (Mangal Dosh)." + //
                                "\n" + //
                                "Hanuman worship is popular on this day; red flowers and sindoor are offered." + //
                                "\n" + //
                                "Considered good for initiating legal or property-related work.\n" + //
                                "");
            break;

            case "wednesday":
            System.out.println("wednesday:\n\n"+"Represents intelligence, communication, and business." + //
                                "\n" + //
                                "Wednesday fasts help improve memory, speech, and financial stability." + //
                                "\n" + //
                                "Green-colored items and tulsi leaves are considered auspicious." + //
                                "\n" + //
                                "Good day for education, trade, and resolving misunderstandings.\n" + //
                                "");
            break;

            case "thursday":
            System.out.println("thursday:\n\n"+"Associated with knowledge, wisdom, and prosperity." + //
                                "\n" + //
                                "Thursday fasting brings blessings of Guru and Vishnu." + //
                                "\n" + //
                                "Yellow is the auspicious color; devotees often offer chana dal and yellow flowers." + //
                                "\n" + //
                                "Suitable for initiating studies, marriages, and spiritual practices.\n" + //
                                "");
            break;

            case "friday":
            System.out.println("friday:\n\n"+"Represents love, wealth, beauty, and material comforts." + //
                                "\n" + //
                                "Friday fasting is observed for prosperity, marital happiness, and removal of poverty." + //
                                "\n" + //
                                "White and pink are considered auspicious; devotees offer sweets and milk." + //
                                "\n" + //
                                "Good for starting financial investments, artistic work, or housewarming.\n" + //
                                "");
            break;

            case "saturday":
            System.out.println("saturday:\n\n"+"Associated with discipline, justice, hard work, and karmic balance." + //
                                "\n" + //
                                "Saturday fasts and prayers help reduce the malefic effects of Shani (Sade-Sati, Dhaiya)." + //
                                "\n" + //
                                "Devotees light sesame oil lamps under Peepal trees and offer black items like sesame, urad dal, and mustard oil." + //
                                "\n" + //
                                "A day for humility, charity, and service.");
            break;

            default:
            System.out.println("invalid day.");
            break;
        }
    }
}

