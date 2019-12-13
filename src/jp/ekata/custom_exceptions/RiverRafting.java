package jp.ekata.custom_exceptions;

public class RiverRafting {

    public void crossRapid(int degree) throws FallInWaterException{
        if (degree > 10){
            throw new FallInWaterException();
        }
    }

    public void rowRaft(String state)throws DropOarException{
        System.out.println("*".repeat(20));
        if (state.equalsIgnoreCase("nervous")){
            throw new DropOarException("You dropped the oar");
        }
    }


}
