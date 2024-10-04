package San;

class TeamSizeExceedException extends Exception{

    TeamSizeExceedException(String message){
        super(message);
    }
}

 class CricketTeam  {

    void addTeamSize(int size) throws TeamSizeExceedException{
        if(size>11){
            throw new TeamSizeExceedException("Team size should not be greater than 11");
        }

    }

    public static void main(String[] args)  throws TeamSizeExceedException {

        CricketTeam ct = new CricketTeam();
        ct.addTeamSize(25);
    }
}
