// Mysore United is a player's club which maintains the average rating of the players and sets their category based on the average rating obtained from the critics every month. The number of critics for the club varies from two to three.
public class PlayerRating {
    public int playerPosition;
    public String  playerName;
    public float criticOneRating;
    public float criticTwoRating;
    public float criticThreeRating;
    public float averageRating;
    public char category;
    public float PlayerRating;

    PlayerRating(int playerPosition, String playerName){
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }
    public void calculateAverageRating(float criticOneRating, float criticTwoRating){
        this.averageRating = (criticOneRating + criticTwoRating)/2;
    }
    public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating){
        this.averageRating = (criticOneRating + criticTwoRating + criticThreeRating)/3;
    }
    public void calculateCategory(){
        if(averageRating > 8){
            category = 'A';
        }
        else if(averageRating > 5 && averageRating <= 8){
            category = 'B';
        }
        else if(averageRating > 0 && averageRating <= 5){
            category = 'C';
        }
    }
    public void display(){
        System.out.println("The player name : " + playerName);
        System.out.println("The player position : " + playerPosition);
        System.out.println("The average rating is : " + averageRating);
        System.out.println("The category is : " + category);
        System.out.println();
    }
    public static void main(String[] args) {
        PlayerRating p1 = new PlayerRating(1, "Oscar");
        p1.calculateAverageRating(1, 1,1);
        p1.calculateCategory();
        p1.display();
        
        PlayerRating p2 = new PlayerRating(2, "Ravi");
        p2.calculateAverageRating(4, 3);
        p2.calculateCategory();
        p2.display();
    }
}
