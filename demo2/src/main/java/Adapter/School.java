package Adapter;

public class School {
    public static void main(String args[]){

//        PilotPen pp = new PilotPen();
        Pen p =new PenAdapter();
        Assignment aw =new Assignment();
        aw.setP(p);
        aw.writeAssignment("I am a bit tired");
    }
}
