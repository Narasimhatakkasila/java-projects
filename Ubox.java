import java.util.Scanner;
class Details{
    void movieDetails(String name, String type, String time, String director){
        System.out.println("Movie   : " + name + "\nDuration: " + time + "\nLanguage: " + type + "\nDirector Name: " + director);
    }
    int TicketsCost;
    double taxes;
    double TotalCost;

    void seatDetails(int type, int m){
        if(type == 1){
            TicketsCost=250 * m ;
            taxes=(250 * m) * 0.08 ;
            TotalCost=(250 * m) * 1.08 ;
        }
        else if (type == 2) {
            TicketsCost=200 * m ;
            taxes=(200 * m) * 0.08 ;
            TotalCost=(200 * m) * 1.08 ;
        }
        else if (type == 3) {
            TicketsCost=150 * m ;
            taxes=(150 * m) * 0.08 ;
            TotalCost=(150 * m) * 1.08 ;
        }
        else if (type == 4) {
            TicketsCost=100 * m ;
            taxes=(100 * m) * 0.08 ;
            TotalCost=(100 * m) * 1.08 ;
        }
        else{
            System.out.println("Enter the correct number.");
        }
        System.out.println("Tickets Cost: " + m + "X250=Rs." + TicketsCost + "/-");
        System.out.println("Taxes(GST): Rs." + taxes+ "/-");
    }
}

class Offer{
    void offer(int type, int m){
        if(type == 1 && m > 2){
            System.out.printf("Congratulations! You got %d X pop corn(300g) and %d X coke(100ml) Coupons\n", m / 3, m / 3);
        }
        else if (type == 2 && m > 1) {
            if(m / 2 > 1){
                System.out.printf("Congratulations! You won %d X coke(150ml) Coupons\n", m / 2);
            }
            else{
                System.out.printf("Congratulations! You won %d X coke(150ml) Coupon\n", m / 2);
            }
        }
        System.out.println("**Please collect your Beverages at the food counter**  ");
    }
    int totalSeats;

    void movieOffer(int x, int m){
        if(x==2|x==5){
            System.out.printf("No. of seats you can book are %d+%d(offer active)\n",m,m/2);
            totalSeats=m+m/2;
        }
        else{
            System.out.printf("No. of seats you can book are %d\n",m);
            totalSeats=m;
        }
    }
    void moviefinal(int x, int m){
        if(x==2|x==5){
            System.out.printf("No. of seats you booked are %d+%d(offer active)\n",m,m/2);
            totalSeats=m+m/2;
        }
        else{
            System.out.printf("No. of seats you booked are %d\n",m);
            totalSeats=m;
        }
    }
}
class Design{
    void type1(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    void type2(){
        System.out.println("_________________________________________________________________________________________________________________________________________________");
    }
    void type3(){
        System.out.println("-------------------------");
    }
}
public class Ubox {
    private static int x;
    private static int type;
    private static int m;
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Design dn=new Design();
        Details dd = new Details();
        Offer off = new Offer();
        dn.type1();//design line1-----
        System.out.println("                                                                  UBOX MOVIE COMPLEX");
        dn.type1();//design line1-----
        System.out.println("MOVIES AVAILABLE ARE \n 1.Virupaksha(Telugu) \n 2.Agent(Telugu) \n 3.PS-2(Telugu) \n 4.Evil Dead Rise(English) \n 5.Kisi Ka Bhai Kisi Ka Jaan(Hindi)");
        dn.type2();//design line2_____
        System.out.println("                                                                   ---OFFERS---");
        System.out.println("                              *  Buy 2 tickets and get 1 ticket free on Kisi Ka Bhai Kisi Ka Jaan(Hindi) movie");
        System.out.println("                              *  Buy 2 tickets and get 1 ticket free on Agent(Telugu) movie");
        dn.type2();//design line2_____
        System.out.print("Please enter the number beside the movie name(1-5): ");
        boolean flag = true;
        while(flag){
            x = SC.nextInt();
            try {
                if(x>=1&&x<=5){
                    flag = false;
                }
                else{
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.print("\"Entered number is not between 1-5\"\n Please enter the correct number: ");
            }
        }
        dn.type1();//design line1-----
        System.out.println("Seat types available are \n1.Platinum(Rs.250 per ticket)\n2.Gold(Rs.200 per ticket)\n3.Silver(Rs.150 per ticket)\n4.Balcony(Rs.100 per ticket)");
        dn.type2();//design line2_____
        System.out.println("                                                                   ---OFFERS---");
        System.out.println("                              *  Buy 3 platinum tickets and get 1 X pop corn(300g), 1 X coke(100ml) Coupons");
        System.out.println("                              *  Buy 2 Gold tickets and get one coke(150ml) Coupon");
        dn.type2();//design line2_____
        System.out.print("Please enter the number beside the seat type(1-4) : ");
        flag = true;
        while(flag){
            type = SC.nextInt();
            try {
                if(type <= 4 && type >= 1){
                    flag = false;
                }
                else{
                    throw new Exception();
                }
            }
            catch (Exception e) {
                System.out.print("\"Entered number is not between 1-4\"\n Please enter the correct number: ");
            }
        }
        dn.type2();//design line2_____
        int totalSeats = 50;
        System.out.println("                              Total number of seats available are: " + totalSeats);
        System.out.println("                              \"Maximum number of tickets that can be booked is 6\"");
        dn.type2();//design line2_____
        System.out.print("Enter the number of tickets required: ");
        flag = true;
        while(flag){
            m = SC.nextInt();
            try {
                if(m <= 6 && m >= 1){
                    flag = false;
                }
                else{
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.print("\"Please enter a number between 1-6\"\n Please enter the correct number: ");
            }
        }
        //Selection of seats
        dn.type3();//design line3
        System.out.println(" 0 indicates empty seats");
        dn.type3();//design line3
        char[][] seats = new char[5][10];
        System.out.print("RC");
        for(int k = 1; k < 11; k++) {
            System.out.print(k + " ");
        }
        System.out.println("\n");
        for(int a = 0; a < 5; a++){
            System.out.print((a + 1) + " ");
            for(int b = 0; b < 10; b++){
                seats[a][b] = '0';
                System.out.print(seats[a][b] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("--------SCREEN--------");
        dn.type3();//design line3
        System.out.println("Please select your seats");
        off.movieOffer(x,m);
        dn.type3();//design line3
        int finaltick;
        if(x==2|x==5){
            finaltick=m+(m/2);
        }
        else{
            finaltick=m;
        }
        int i = 1;
        while( i < finaltick+1){
            System.out.print("Enter the row number(1-5): ");
            int row=1;
            int column=1;
            flag = true;
            while(flag){
                row = SC.nextInt();
                try {
                    if(row <= 5 && row >= 1){
                        flag = false;
                    }
                    else{
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.print("\"Please enter a number between 1-5\"\n Please enter the correct number: ");
                }
            }
            System.out.print("Enter the column(1-10): ");
            flag = true;
            while(flag){
                column = SC.nextInt();
                try {
                    if(column <= 10 && column >= 1){
                        flag = false;
                    }
                    else{
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.print("\"Please enter a number between 1-10\"\n Please enter the correct number: ");
                }
            }
            if(seats[row-1][column-1]=='0') {
                seats[row - 1][column - 1] ='X';
                i++;
            }
            else{
                System.out.printf("     row %d column %d is already booked!\n     please re-enter the row and column numbers\n",row,column);
            }
        }
        dn.type3();//design line3
        System.out.println("X indicates the seats reserved by you");
        dn.type3();//design line3
        System.out.print("RC");
        for(int k = 1; k < 11; k++) {
            System.out.print(k + " ");
        }
        System.out.println("\n");
        for(int c = 0; c < 5; c++){
            System.out.print((c + 1) + " ");

            for(int d = 0; d < 10; d++){
                System.out.print(seats[c][d] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("--------SCREEN--------");
        System.out.print("Do you need any extra Beverages (yes/no)\nEnter 1 for yes and 0 for no: ");
        boolean flag3 = true;
        char Beverages = '0';

        while (flag3) {
            Beverages = SC.next().charAt(0);
            try {
                if (!(Beverages == '1' || Beverages == '0')) {
                    throw new Exception("\"Please enter 1 or 0\"\nEnter the correct number: ");
                } else {
                    flag3 = false;
                }
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }

        String items;
        int costOfBeverages = 0;

        if (Beverages == '1') {
            dn.type2(); //design line2_____
            System.out.println("Beverages available are:");
            System.out.println("1. Coke (180 ml) (Rs.100/-)");
            System.out.println("2. PopCorn (300g) (Rs.150/-)");
            System.out.println("3. French fries (100g) (Rs.100/-)");
            System.out.println("4. Chicken puff (150g) (Rs.200/-)");
            System.out.println("5. Water Bottle (500ml) (Rs.30/-)");
            dn.type2(); //design line2_____
            System.out.print("Enter the items you want (example: 123 or 24 or 2531): ");
            SC.nextLine();
            items = SC.nextLine();

            int Coke = 0;
            if (items.contains("1")) {
                System.out.print("Enter the number of Cokes required: ");
                flag = true;
                while (flag) {
                    Coke = SC.nextInt();
                    try {
                        if (Coke <= 10 && Coke >= 0) {
                            flag = false;
                        } else {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.out.print("\"Low Stock Problem\"\nPlease enter the quantity required (<10): ");
                    }
                }
            }

            int PopCorn = 0;
            if (items.contains("2")) {
                System.out.print("Enter the number of PopCorns required: ");
                flag = true;
                while (flag) {
                    PopCorn = SC.nextInt();
                    try {
                        if (PopCorn <= 10 && PopCorn >= 0) {
                            flag = false;
                        } else {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.out.print("\"Low Stock Problem\"\nPlease enter the quantity required (<10): ");
                    }
                }
            }

            int frenchFries = 0;
            if (items.contains("3")) {
                System.out.print("Enter the number of French fries required: ");
                flag = true;
                while (flag) {
                    frenchFries = SC.nextInt();
                    try {
                        if (frenchFries <= 10 && frenchFries >= 0) {
                            flag = false;
                        } else {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.out.print("\"Low Stock Problem\"\nPlease enter the quantity required (<10): ");
                    }
                }
            }

            int ChickenPuff = 0;
            if (items.contains("4")) {
                System.out.print("Enter the number of Chicken puffs required: ");
                flag = true;
                while (flag) {
                    ChickenPuff = SC.nextInt();
                    try {
                        if (ChickenPuff <= 10 && ChickenPuff >= 0) {
                            flag = false;
                        } else {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.out.print("\"Low Stock Problem\"\nPlease enter the quantity required (<10): ");
                    }
                }
            }

            int waterBottle = 0;
            if (items.contains("5")) {
                System.out.print("Enter the number of water Bottles required: ");
                flag = true;
                while (flag) {
                    waterBottle = SC.nextInt();
                    try {
                        if (waterBottle <= 10 && waterBottle >= 0) {
                            flag = false;
                        } else {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.out.print("\"Low Stock Problem\"\nPlease enter the quantity required (<10): ");
                    }
                }
            }

            costOfBeverages = (Coke * 100) + (PopCorn * 150) + (frenchFries * 100) + (ChickenPuff * 200) + (waterBottle * 30);
        }

        dn.type2();//design line2_____
            System.out.println("\n       BILL\n       ----");

            switch (x) {
                case 1 -> dd.movieDetails("Virupaksha", "Telugu", "2 hrs 25 min", "Karthik Varma Dandu");
                case 2 -> dd.movieDetails("Agent", "Telugu", "2 hrs", "Surender Reddy");
                case 3 -> dd.movieDetails("PS-II", "Telugu", "2 hrs 44 mins", "Mani Rantnam");
                case 4 -> dd.movieDetails("Evil Dead Rise", "English", "1 hr 37 mins", "Lee Cronin");
                case 5 -> dd.movieDetails("Kisi Ka Bhai Kisi Ka Jaan", "Hindi", "2 hrs", "Farhad Samji");
                default -> System.out.println("Please enter the correct number");
            }

            off.moviefinal(x, m);

            System.out.print("The seats booked are: ");

            switch (type) {
                case 1 -> System.out.print("Platinum-");
                case 2 -> System.out.print("Gold-");
                case 3 -> System.out.print("Silver-");
                default -> System.out.print("Balcony-");
            }

            for(int a = 0; a < 5; a++){
                for(int b = 0; b < 10; b++){
                    if(seats[a][b] == 'X') {
                        System.out.printf("R%dC%d ", a + 1, b + 1);
                    }
                }
            }

            System.out.println("\n______________________________");
            dd.seatDetails(type, m);
            System.out.println("cost on Beverages: "+costOfBeverages+"/-");
            System.out.println("Total Cost: "+(dd.TotalCost+costOfBeverages));
            System.out.println("-----------THANK YOU-----------");
            off.offer(type, m);
            int remaining=50-off.totalSeats;
            dn.type2();//design line2_____
            System.out.println("**Tickets left are "+ remaining+" **");
    }
}

