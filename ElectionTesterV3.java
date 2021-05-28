
/**
 * 2/24/2021
 * Ryan Wagner
 * Replacing values while traversing through arrays
 */
public class ElectionTesterV3
{
    public static void main(String[] args){
        
        Candidate[] candidates = new Candidate[5];
        
        candidates[0] = new Candidate("Tony Stark", 3000);
        candidates[1] = new Candidate("Steve Rogers", 99);
        candidates[2] = new Candidate("Thor Odinson", 1500);
        candidates[3] = new Candidate("Bruce Banner", 1000);
        candidates[4] = new Candidate("Clint Barton", 48);
        
        int totalVotes = 0;
        for(Candidate c: candidates){
            totalVotes += c.getVotes();
        }
        System.out.printf("%18s", "Original Results");
        System.out.printf("\n %30s %20s", "Votes", "% of Total");
        System.out.printf("\n %9s %22s %15s", "Candidate", "Recieved", "Votes");
        System.out.println("\n" + "====================================================");
        System.out.printf("%s %20s %17s \n", candidates[0].getName(), candidates[0].getVotes(), percentOfVotes(totalVotes, candidates[0].getVotes()));
        for(int i = 1; i < candidates.length; i++){
            System.out.printf("%s %18s %17s \n", candidates[i].getName(), candidates[i].getVotes(), percentOfVotes(totalVotes, candidates[i].getVotes()));
        }
        System.out.println("\nThe total number of votes is: " + totalVotes);
        //Change name method
        changeName(candidates, "Tony Stark", "Iron Man");
        System.out.printf("%s %20s %17s \n", candidates[0].getName(), candidates[0].getVotes(), percentOfVotes(totalVotes, candidates[0].getVotes()));
        for(int i = 1; i < candidates.length; i++){
            System.out.printf("%s %18s %17s \n", candidates[i].getName(), candidates[i].getVotes(), percentOfVotes(totalVotes, candidates[i].getVotes()));
        }
        totalVotes = 0;
        for(Candidate c: candidates){
            totalVotes += c.getVotes();
        }
        System.out.println("\nThe toal number of votes is: " + totalVotes);
        //Change votes method
        changeVotes(candidates, "Steve Rogers", 2000);
        System.out.printf("%s %20s %17s \n", candidates[0].getName(), candidates[0].getVotes(), percentOfVotes(totalVotes, candidates[0].getVotes()));
        for(int i = 1; i < candidates.length; i++){
            System.out.printf("%s %18s %17s \n", candidates[i].getName(), candidates[i].getVotes(), percentOfVotes(totalVotes, candidates[i].getVotes()));
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
    
    public static void changeName(Candidate[] candidate, String name, String newName){
        for(Candidate c: candidate){
            if(c.getName().equals(name)){
                c.setName(newName);
                System.out.println("<< Changing " + name + " to " + newName + " >>");
            }
        }
    }
    
    public static void changeVotes(Candidate[] candidate, String name, int votes){
        for(Candidate c: candidate){
            if(c.getName().equals(name)){
                c.setVotes(votes);
                System.out.println("<< Changing " + name + "'s votes to " + votes + " >>");
            }
        }
    }
    
    public static void changeNameAndVotes(Candidate[] candidate, String name, String newName, int votes){
        for(Candidate c: candidate){
            if(c.getName().equals(name)){
                c.setName(newName);
                c.setVotes(votes);
            }
        }
    }
}
