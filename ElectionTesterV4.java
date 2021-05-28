import java.util.ArrayList;
/**
 * 2/24/2021
 * Ryan Wagner
 * Replacing values while traversing through arraylists
 */
public class ElectionTesterV4
{
    public static void main(String[] args){
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Tony Stark", 3000));
        candidates.add(new Candidate("Steve Rogers", 99));
        candidates.add(new Candidate("Thor Odinson", 1500));
        candidates.add(new Candidate("Bruce Banner", 1000));
        candidates.add(new Candidate("Clint Barton", 48));
        
        int totalVotes = 0;
        for(Candidate c: candidates){
            totalVotes += c.getVotes();
        }
        System.out.printf("%18s", "Original Results:");
        System.out.printf("\n %30s %20s", "Votes", "% of Total");
        System.out.printf("\n %9s %22s %15s", "Candidate", "Recieved", "Votes");
        System.out.println("\n" + "====================================================");
        System.out.printf("%s %20s %17s \n", candidates.get(0).getName(), candidates.get(0).getVotes(), percentOfVotes(totalVotes, candidates.get(0).getVotes()));
        for(int i = 1; i < candidates.size(); i++){
            System.out.printf("%s %18s %17s \n", candidates.get(i).getName(), candidates.get(i).getVotes(), percentOfVotes(totalVotes, candidates.get(i).getVotes()));
        }
        System.out.println("\nThe total number of votes is: " + totalVotes);
        //method to change name
        changeName(candidates, "Tony Stark", "Iron Man");
        System.out.printf("\n %s %21s %17s \n", candidates.get(0).getName(), candidates.get(0).getVotes(), percentOfVotes(totalVotes, candidates.get(0).getVotes()));
        for(int i = 1; i < candidates.size(); i++){
            System.out.printf("%s %18s %17s \n", candidates.get(i).getName(), candidates.get(i).getVotes(), percentOfVotes(totalVotes, candidates.get(i).getVotes()));
        }
        totalVotes = 0;
        for(Candidate c: candidates){
            totalVotes += c.getVotes();
        }
        System.out.println("\nThe total number of votes is: " + totalVotes);
        //method to change votes
        changeVotes(candidates, "Steve Rogers", 2000);
        System.out.printf("\n %s %21s %17s \n", candidates.get(0).getName(), candidates.get(0).getVotes(), percentOfVotes(totalVotes, candidates.get(0).getVotes()));
        for(int i = 1; i < candidates.size(); i++){
            System.out.printf("%s %18s %17s \n", candidates.get(i).getName(), candidates.get(i).getVotes(), percentOfVotes(totalVotes, candidates.get(i).getVotes()));
        }
        totalVotes = 0;
        for(Candidate c: candidates){
            totalVotes += c.getVotes();
        }
        System.out.println("\nThe total number of votes is: " + totalVotes);
        //Change name and votes method
        changeNameAndVotes(candidates, "Thor Odinson", "Pointbreak", 500);
    }
    
    public static double percentOfVotes(int totalVotes, int votes){
        double tVotes = totalVotes, v = votes;
        double percentOfVotes = Math.round((v / tVotes) * 1000) / 10.0;
        return percentOfVotes;
    }
    
    public static void changeName(ArrayList<Candidate> candidate, String name, String newName){
        for(Candidate c: candidate){
            if(c.getName().equals("Tony Stark")){
                c.setName(newName);
                System.out.println("<< Changing " + name + " to " + newName + " >>");
            }
        }
    }
    
    public static void changeVotes(ArrayList<Candidate> candidate, String name, int votes){
        for(Candidate c: candidate){
            if(c.getName().equals(name)){
                c.setVotes(votes);
                System.out.println("<< Changing " + name + "'s votes to " + votes + " >>");
            }
        }
    }
    
    public static void changeNameAndVotes(ArrayList<Candidate> candidate, String name, String newName, int votes){
        for(Candidate c: candidate){
            if(c.getName().equals(name)){
                c.setName(newName);
                c.setVotes(votes);
            }
        }
    }
}
