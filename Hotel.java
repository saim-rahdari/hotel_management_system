import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hotel{
    static int id = 0, room_count = 0;
    static int MAX_CUSTOMERS = 100;
    static int MAX_ROOMS = 100;
    static int[] cost = new int[MAX_CUSTOMERS];
    static String[] name = new String[MAX_CUSTOMERS];
    static String[] address = new String[MAX_CUSTOMERS];
    static int[] month = new int[MAX_CUSTOMERS];
    static int[] day = new int[MAX_CUSTOMERS];
    static long[] ids = new long[MAX_CUSTOMERS];
    static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void show_details(){
        System.out.println("Name\t\tAddress\t\tCNIC\t\t\tTOTAL COST");
        for(int i = 0; i < id;i++){
            System.out.println(name[i] + "\t\t" + address[i] + "\t\t" + ids[i] + "\t\t" + cost[i]);
        }
    }

    public static void customer_panel(){
        Scanner input = new Scanner(System.in);
        String add;
        int len;
        boolean idc = true;
        room_count = 0;

        System.out.println("Enter your Name:");
        name[id] = input.nextLine();

        while(idc){
        System.out.println("Enter Day of Stay:");
        day[id] = input.nextInt();
        if(day[id] >= 1 && day[id] <= 31)
            idc = false;
        else
            System.out.println("Invalid Day!");
    }
        idc = true;
        while(idc){
        System.out.println("Enter Month of Stay:");
        month[id] = input.nextInt();
        if(month[id] > 0 && month[id] < 13)
            idc = false;
        else 
            System.out.println("Invalid Month!");
    }

        System.out.println("Enter your adress:");
        add = input.nextLine();
        address[id] = input.nextLine();

        idc = true;
        while (idc){
            System.out.println("Enter your CNIC without Dashes(-): ");
            ids[id] = input.nextLong();
            len = String.valueOf(ids[id]).length();
            if (len == 13)
                idc = false;
            else
                System.out.println("Invalid CNIC Number");
        }
        cost[id] = 0;
        main_menu_customer();
    }

    public static void roomselection_rent(){
        Scanner input = new Scanner(System.in);
        int rent = 0, nights,room_no;
        char inp;
        boolean check = true, room_check = true;
        System.out.println("\tROOM SELECTION MENU");
        while(check){
            System.out.println("We have " + MAX_ROOMS + " ROOMS LEFT! HURRY UP!");
            System.out.println();
            System.out.println("Press 1 for single bed room ---- RS 2000");
            System.out.println("Press 2 for double bed room ---- RS 3000");
            System.out.println("Press 3 for family room -------- RS 5000");
            System.out.println("Press 4 for suite -------------- RS 8000");
            System.out.println("Press 5 to exit Room Selection Menu : ");

            inp = input.next().charAt(0);
            if(inp == '1'){
                room_count++;
                System.out.println("Enter the number of nights you want to stay?");
                nights = input.nextInt();
                room_no = (((int) (Math.random()*(20 - 1))) + 1);
                while(room_check){
                room_no = (((int) (Math.random()*(20 - 1))) + 1);
                    if(list.size() == 0){
                        list.add(room_no);
                        //System.out.println(list);
                        room_check = false;
                    }
                    else if(list.contains(room_no))
                        room_check = true;
                    else if(!(list.contains(room_no))){
                        list.add(room_no);
                        room_check = false;
                    }
                }
                System.out.println("You chose the Single Bed Room. Your room number is " + room_no);
                rent = nights*2000;
                check = false;
                MAX_ROOMS--;
            }
            else if(inp == '2'){
                room_count++;
                System.out.println("Enter the number of nights you want to stay?");
                nights = input.nextInt();
                room_no = (((int) (Math.random()*(50 - 21))) + 21);
                while(room_check){
                    room_no = (((int) (Math.random()*(50 - 21))) + 21);
                        if(list.size() == 0){
                            list.add(room_no);
                            System.out.println(list);
                            room_check = false;
                        }
                        else if(list.contains(room_no))
                            room_check = true;
                        else if(!(list.contains(room_no))){
                            list.add(room_no);
                            room_check = false;
                        }
                    }
                System.out.println("You chose the Double Bed Room. Your room number is " + room_no);
                rent = nights*3000;
                check = false;
                MAX_ROOMS--;
            }
            else if(inp == '3'){
                room_count++;
                System.out.println("Enter the number of nights you want to stay?");
                nights = input.nextInt();
                room_no = (((int) (Math.random()*(90 - 51))) + 51);
                while(room_check){
                    room_no = (((int) (Math.random()*(90 - 51))) + 51);
                        if(list.size() == 0){
                            list.add(room_no);
                            System.out.println(list);
                            room_check = false;
                        }
                        else if(list.contains(room_no))
                            room_check = true;
                        else if(!(list.contains(room_no))){
                            list.add(room_no);
                            room_check = false;
                        }
                    }
                System.out.println("You chose the Family Room. Your room number is " + room_no);
                rent = nights*5000;
                check = false;
                MAX_ROOMS--;
            }
            else if(inp == '4'){
                room_count++;
                System.out.println("Enter the number of nights you want to stay?");
                nights = input.nextInt();
                room_no = (((int) (Math.random()*(120 - 91))) + 91);
                while(room_check){
                    room_no = (((int) (Math.random()*(120 - 91))) + 91);
                        if(list.size() == 0){
                            list.add(room_no);
                            System.out.println(list);
                            room_check = false;
                        }
                        else if(list.contains(room_no))
                            room_check = true;
                        else if(!(list.contains(room_no))){
                            list.add(room_no);
                            room_check = false;
                        }
                    }
                System.out.println("You chose the Suite. Your room number is " + room_no);
                rent = nights*8000;
                check = false;
                MAX_ROOMS--;
            }
            else if(inp == '5'){
                System.out.println("You have chosen to Exit. Thank you for using Room Selection Menu.");
                return;
            }
            else
                System.out.println("Invalid Input!");
        }
    System.out.println();
    System.out.println("Your Room Rent is: " + rent);
    cost[id] += rent;
    main_menu_customer();
    }
    
    public static void laundrybill(){
        Scanner input = new Scanner(System.in);
        int t_cost = 0, no_laundry;
        char inp;
        boolean check = true;
        System.out.println("\tLAUNDRY SELECTION MENU");

        while(check){
            System.out.println("Press 1 for Shirts");
            System.out.println("Press 2 for Pants");
            System.out.println("Press 3 for Dresscoats");
            System.out.println("Press 4 for Sweaters");
            System.out.println("Press 5 to exit Laundry Selection Menu : ");

            inp = input.next().charAt(0);

            if(inp == '1'){
                System.out.println("How many shirts you want to give for Laundry: ");
                no_laundry = input.nextInt();
                t_cost = no_laundry * 20;
                check = false;
            }
            else if(inp == '2'){
                System.out.println("How many pants you want to give for Laundry: ");
                no_laundry = input.nextInt();
                t_cost = no_laundry * 35;
                check = false;
            }
            else if(inp == '3'){
                System.out.println("How many dresscoats you want to give for Laundry: ");
                no_laundry = input.nextInt();
                t_cost = no_laundry * 70;
                check = false;
            }
            else if(inp == '4'){
                System.out.println("How many sweaters you want to give for Laundry: ");
                no_laundry = input.nextInt();
                t_cost = no_laundry * 50;
                check = false;
            }
            else if(inp == '5'){
                System.out.println("You have chosen to Exit. Thank you for using Laundry Menu.");
                return;
            }
            else
                System.out.println("Invalid Input!");
        }

    System.out.println();
    System.out.println("Your total Laundry Bill is: " + t_cost);
    cost[id] += t_cost;
    main_menu_customer();
    }

    public static void restaurantbill(){
        Scanner input = new Scanner(System.in);
        int t_cost = 0, no_res;
        char inp;
        boolean check = true;
        System.out.println("\tWELCOME TO OUR RESTAURANT");

        while(check){
            System.out.println("Press 1 for Water ---------- $1");
            System.out.println("Press 2 for Breakfast ------ $15");
            System.out.println("Press 3 for Lunch ---------- $30");
            System.out.println("Press 4 for Dinner --------- $50");
            System.out.println("Press 5 to exit Restaurant Menu : ");

            inp = input.next().charAt(0);

            if(inp == '1'){
                System.out.println("Enter the quantity: ");
                no_res = input.nextInt();
                t_cost = no_res * 1;
                check = false;
            }
            else if(inp == '2'){
                System.out.println("Enter the quantity: ");
                no_res = input.nextInt();
                t_cost = no_res * 15;
                check = false;
            }
            else if(inp == '3'){
                System.out.println("Enter the quantity: ");
                no_res = input.nextInt();
                t_cost = no_res * 30;
                check = false;
            }
            else if(inp == '4'){
                System.out.println("Enter the quantity: ");
                no_res = input.nextInt();
                t_cost = no_res * 50;
                check = false;
            }
            else if(inp == '5'){
                System.out.println("You have chosen to Exit. Thank you for using Restaurant Menu.");
                return;
            }
            else
                System.out.println("Invalid Input!");
        }

    System.out.println();
    System.out.println("Your total Restaurant Bill is: $" + t_cost);
    cost[id] += t_cost;
    main_menu_customer();
    }

    public static void totalcost(){
        System.out.println("You have been checkout out! Now you can go fuck yourself");
        System.out.println("Total Cost = " + cost[id]);
        System.out.println("Thanks for using our Hotel Management System!");
        id++;
        panels();
    }

    public static void admin_panel(){
        //add delete edit customer select
    }

    public static void main_menu_customer(){
        Scanner input = new Scanner(System.in);
        char choice;
        System.out.println();
        System.out.println("          \t             WELCOME TO THE MAIN MENU       ");
        System.out.println("\t           _________________________________________");
        System.out.println();
        System.out.println(" Press 1 for Room Selection and Rent Menu\t   Press 2 for Laundry Menu\n\n Press 3 for Restaurant Menu\t\t\t   Press 4 to Checkout \n\n\t\t         Press any other key to exit: ");
        choice = input.next().charAt(0);
        //while check invalid
        switch (choice) {
            case '1': if(room_count > 0){
                System.out.println();
                System.out.println("You have already booked for the room! Continuing you again to the Room Selection Menu");
                roomselection_rent();
            }   else
                roomselection_rent();
                break;
            case '2':
                laundrybill();
                break;
            case '3':
                restaurantbill();
                break;
            case '4':
                totalcost();
                break;
            default:
                System.exit(0);
                break;
        }
    }

    public static void panels(){
        Scanner input = new Scanner(System.in);
        char confirm = 'y', choice;
        while (confirm == 'y'){
            System.out.println();
            while(confirm == 'y'){ 
            System.out.println("Select a particular Panel: ");
            System.out.println();
            System.out.println("_________________________________");
            System.out.println();
            System.out.println("1. Admin Panel\t2. Customer Panel");
            choice = input.next().charAt(0);
            if(choice == '1'){
                admin_panel();
                confirm = 'n';
            }
            else if(choice == '2'){
                customer_panel();
                confirm = 'n';
            }
            else
                System.out.println("Invalid Input!");
            }
            confirm = 'y';
            System.out.println("Press 'y' to continue");
            confirm = input.next().charAt(0);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char branch, confirm = 'y', choice;
        System.out.println();
        System.out.println("                 WELCOME TO OUR HOTEL           ");
        System.out.println("________________________________________________");
        while(confirm == 'y') {
        System.out.println();
        System.out.println("Press 1 for Isamabad Branch\nPress 2 for Lahore Branch\nPress 3 for Karachi Branch: ");
        branch = input.next().charAt(0); 
        if(branch == '1'){
            System.out.println("You opted for ISLAMABAD BRANCH");
            confirm = 'n';
        }
        else if(branch == '2'){
            System.out.println("You opted for LAHORE BRANCH");
            confirm = 'n';
        }
        else if(branch == '3'){
            System.out.println("You opted for KARACHI BRANCH");
            confirm = 'n';
        }
        else {
            System.out.println("INVALID INPUT");
            confirm = 'y';
        }
        System.out.println();
    }
        panels();
    }
}


/**
 * admin to show details//edit details///delete user
 * store data in files
 */
