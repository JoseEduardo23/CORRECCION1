import Viajes.Normal;
import Viajes.VIP;

public class Main {
    public static void main(String[] args) {
        VIP pasajeroVip1  = new VIP(null, null, null, null, 0, null, null, null, 0.0,null,false,false,false,false,null,null,0.0);
        VIP pasajeroVip2  = new VIP(null, null, null, null, 0, null, null, null, 0.0,null,false,false,false,false,null,null,0.0);
        VIP pasajeroVip3  = new VIP(null, null, null, null, 0, null, null, null, 0.0,null,false,false,false,false,null,null,0.0);
        VIP pasajeroVip4  = new VIP(null, null, null, null, 0, null, null, null, 0.0,null,false,false,false,false,null,null,0.0);
        VIP pasajeroVip5  = new VIP(null, null, null, null, 0, null, null, null, 0.0,null,false,false,false,false,null,null,0.0);
        VIP pasajeroVip6 = new VIP("VIP2024-123","10","Ale","051316132684",15,"065161","Quito","Guayaquil",2.1,"1",true,true,true,false,"Comida","Cobija",20);
        VIP pasajeroVip7 = new VIP("VIP2024-123","10","Ale","051316132684",15,"065161","Quito","Guayaquil",2.1,"1",true,true,true,false,"Comida","Cobija",20);
        VIP pasajeroVip8 = new VIP("VIP2024-123","10","Ale","051316132684",15,"065161","Quito","Guayaquil",2.1,"1",true,true,true,false,"Comida","Cobija",20);
        VIP pasajeroVip9 = new VIP("VIP2024-123","10","Ale","051316132684",15,"065161","Quito","Guayaquil",2.1,"1",true,true,true,false,"Comida","Cobija",20);
        VIP pasajeroVip10 = new VIP("VIP2024-123","10","Ale","051316132684",15,"065161","Quito","Guayaquil",2.1,"1",true,true,true,false,"Comida","Cobija",20);
        Normal pasajeroNormal1 = new Normal(null, null, null, null, 0, null, null, null, 0.0,null,false,false);
        Normal pasajeroNormal2 = new Normal(null, null, null, null, 0, null, null, null, 0.0,null,false,false);
        Normal pasajeroNormal3 = new Normal(null, null, null, null, 0, null, null, null, 0.0,null,false,false);
        Normal pasajeroNormal4 = new Normal(null, null, null, null, 0, null, null, null, 0.0,null,false,false);
        Normal pasajeroNormal5 = new Normal(null, null, null, null, 0, null, null, null, 0.0,null,false,false);
        Normal pasajeroNormal6 = new Normal("N2024-123","10","Ale","051316132684",15,"065161","Quito","Guayaquil",2.1,"34",true,true);
        pasajeroVip1.mostrarTicket();
        System.out.println();
        pasajeroVip6.mostrarTicket();
        System.out.println();
        pasajeroNormal1.mostrarTicket();
        System.out.println();
        pasajeroNormal6.mostrarTicket();
    }
}

//2