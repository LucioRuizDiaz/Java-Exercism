public class FootballMatchReports {
    public static String onField(int shirtNum) {

        String player = "";
        switch (shirtNum) {
            case 1:
                player = "goalie";
                break;

            case 2:
                player = "left back";
                break;

            case 3, 4:
                player = "center back";
                break;

            case 5:
                player = "right back";
                break;

            case 6, 7, 8:
                player = "midfielder";
                break;

            case 9:
                player = "left wing";
                break;

            case 10:
                player = "striker";
                break;

            case 11:
                player = "right wing";
                break;

            default:
                throw new IllegalArgumentException();
        }
        return player;
    }
}
