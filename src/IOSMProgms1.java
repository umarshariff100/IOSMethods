class plane{
    public void takeoff(){
        System.out.println("PLane is taking Off");
    }
    public void fly(){
        System.out.println("Plane is Flying");
    }
    public void land(){
        System.out.println("Plane is Landing");
    }
}




class PassengerPlane extends plane{
    
    
    @Override
    public void fly(){
        
        System.out.println("PassengerPalne is flying with Medium speed");
    }
    public void carryPassenger(){
        System.out.println("PassengerPlane is carrying Passengers");
    }
}

class CargoPlane extends plane{
    
    @Override
    public void fly(){
        System.out.println("Cargo plane is flying with Low speed");
    }
    public void carryCargo(){
        
        System.out.println("Cargo plane is carrying Cargo");
    }
}

class FighterPlane extends plane{
    
    @Override
    public void fly(){
        System.out.println("FighterPlane is flying with high speed");
    }
    public void carryArms(){
        
        System.out.println("Fighter Plane is carrying Arms");
    }
}
 class IOSMProgms1 {
    
    public static void main(String[] args){
        
        PassengerPlane PP = new PassengerPlane();
        CargoPlane CP = new CargoPlane();
        FighterPlane FP = new FighterPlane();
        
        
        PP.takeoff();
        PP.fly();
        PP.carryPassenger();
        PP.land();
        System.out.println();
        
        
        CP.takeoff();
        CP.fly();
        CP.carryCargo();
        CP.land();
        System.out.println();
        
        
        FP.takeoff();
        FP.fly();
        FP.carryArms();
        FP.land();
        System.out.println();
    }
}
