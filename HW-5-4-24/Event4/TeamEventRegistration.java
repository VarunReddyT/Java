public class TeamEventRegistration extends EventRegistration{
    public int noOfParticipants;
    public int teamNo;
    TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo){
        super(name, nameOfEvent);
        setNoOfParticipants(noOfParticipants);
        setTeamNo(teamNo);
    }
    public int getNoOfParticipants(){
        return noOfParticipants;
    }
    public void setNoOfParticipants(int noOfParticipants){
        this.noOfParticipants = noOfParticipants;
    }
    public int getTeamNo(){
        return teamNo;
    }
    public void setTeamNo(int teamNo){
        this.teamNo = teamNo;
    }
    @Override
    public void registerEvent(){
        System.out.println("    Events     BaseFee");
        System.out.println("1. ShakeALeg -  50");
        System.out.println("2. Sing&Win  -  60");
        System.out.println("3. Actathon  -  80");
        System.out.println("4. PlayAway  -  130");
        if(getNameOfEvent().equals("ShakeALeg")){
            setRegistrationFee(50 * getNoOfParticipants());
        }
        else if(getNameOfEvent().equals("Sing&Win")){
            setRegistrationFee(60 * getNoOfParticipants());
        }
        else if(getNameOfEvent().equals("Actathon")){
            setRegistrationFee(80 * getNoOfParticipants());
        }
        else if(getNameOfEvent().equals("PlayAway")){
            setRegistrationFee(100 * getNoOfParticipants());
        }
        else{
            System.out.println("Please choose a valid event");
        }
        System.out.println("Thank you " + getName() + " for your participation.Your registration fee is: " + getRegistrationFee());
        System.out.println("You are team no: " + getTeamNo());
        System.out.println();
    }
}
