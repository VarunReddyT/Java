public class SingleEventRegistration extends EventRegistration{
    public int participantNo;
    SingleEventRegistration(String name, String nameOfEvent, int participantNo){
        super(name, nameOfEvent);
        setParticipantNo(participantNo);
    }
    public int getParticipantNo(){
        return participantNo;
    }
    public void setParticipantNo(int participantNo){
        this.participantNo = participantNo;
    }
    @Override
    public void registerEvent(){
        System.out.println("    Events     BaseFee");
        System.out.println("1. ShakeALeg -  100");
        System.out.println("2. Sing&Win  -  150");
        System.out.println("3. PlayAway  -  130");
        if(getNameOfEvent().equals("ShakeALeg")){
            setRegistrationFee(100);
        }
        else if(getNameOfEvent().equals("Sing&Win")){
            setRegistrationFee(150);
        }
        else if(getNameOfEvent().equals("PlayAway")){
            setRegistrationFee(130);
        }
        else{
            System.out.println("Please choose a valid event");
        }   
        System.out.println("Thank you " + getName() + " for your participation.Your registration fee is: " + getRegistrationFee());
        System.out.println("You are participant no: " + getParticipantNo());
        System.out.println();
    }
}
