import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VotingMachine day1= new VotingMachine();
        day1.voteLabour();
        day1.voteLabour();
        day1.voteLabour();
        VotingMachine.ConservativeVotes();
        System.out.println(" conservative votes :"+day1.getConservativeVotes());
        System.out.println("labour votes : "+ day1.getLabourVotes());

        if (day1.getConservativeVotes()> day1.getLabourVotes()){
            System.out.println(" conser vative won the election ");
        }else System.out.println("labour won the election ");


        // if you want to delete or clear the voting machine please enter 1

        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number :");
        int input1=input.nextInt();
        if (input1==1){
            day1.clearMachine();
        }else System.out.println("please enter a correct number ");

        System.out.println(" conservative votes :"+day1.getConservativeVotes());
        System.out.println("labour votes : "+ day1.getLabourVotes());


    }
}
