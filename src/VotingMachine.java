import java.util.Random;

public class VotingMachine {
    private static int labourVotes ;
    private static int conservativeVotes ;

    public VotingMachine(){}
                        public void voteLabour(){
                            labourVotes++;
                        }
                        public static void ConservativeVotes(){
                            Random random = new Random();
                            conservativeVotes=random.nextInt(10);
                        }


    public void clearMachine(){
        labourVotes=0;
        conservativeVotes=0;
    }

                        public int getLabourVotes(){
                            return labourVotes;
                        }
                        public int getConservativeVotes(){
                            return conservativeVotes;
    }

}
