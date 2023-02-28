import java.util.*;

public class votingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // map to store the nominees
        Map<String, Integer> nominees = new HashMap<>();
        
        //List to store the voters and their votes
        List<String> voters = new ArrayList<>();
        while(true){
        System.out.println("1.Enter the number of nominees followed by names and id's");
        System.out.println("2.Enter number of voters followed with names and id's");
        System.out.println("3.enter required details to vote");
        System.out.println("4.Here is the winner");
        System.out.println("Choose any options from the above mentioned:");
        int value = sc.nextInt();
        switch(value){
            case 1:
        //Number of nominees
        System.out.print("Enter the number of nominees: ");
        int numofNominees = sc.nextInt();
        
        // Taking inputs of Name and ID of each nominee
        for (int i = 1; i <= numofNominees; i++) {
            System.out.print("Enter nominee " + i + " name: ");
            String nomineeName = sc.next();
            System.out.print("Enter nominee " + i + " ID: ");
            int nomineeID = sc.nextInt();
            nominees.put(nomineeName,nomineeID);
        }
        break;
        case 2:
    
        System.out.print("Enter the number of voters: ");
        int numofvoters = sc.nextInt();
        
        
        for (int i = 1; i <= numofvoters; i++) {
            System.out.print("Enter voter" + i + " name: ");
            String voterName = sc.next();
            System.out.print("Enter voter " + i + " ID: ");
            int voterID = sc.nextInt();
            voters.add(voterName +  (" + voterID + "));
        }
        break;
        case 3:
    
        for (String voter : voters) {
            System.out.println("voter " + voter + ", please enter the name and ID of the nominee to whom you want to vote");
            String nomineeName = sc.next();
            int nomineeID = sc.nextInt();
            String key = nomineeName + " (" + nomineeID + ")";
           if (nominees.containsKey(key)) {
                nominees.put(key, nominees.get(key));
                System.out.println("voter " + voter + " voted for " + nomineeName + " (" + nomineeID + ")");
            } else {
                System.out.println("Invalid Nominee Details.");
            }
        }
        break;
        case 4:
        String winner = null;
        int maxVotes = -1;
        for (Map.Entry<String, Integer> entry : nominees.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
                System.out.println("Winner is " + winner + " with " + maxVotes + " votes.");
            }
        }
        
        break;
    default: System.out.println("Not valid");
    break;
        }
    }
}
}
