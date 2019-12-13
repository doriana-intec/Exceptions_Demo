package jp.ekata.custom_exceptions;

public class RiverRaftingApp {
    public static void main(String[] args) {

        RiverRafting riverRafting = new RiverRafting();

        try {
            riverRafting.crossRapid(11);
            riverRafting.rowRaft("Nervous");
        } catch (FallInWaterException | DropOarException doe) {
            doe.printStackTrace();
        } finally {
            System.out.println("Don't forget to pay the sport");
        }
    }
}
