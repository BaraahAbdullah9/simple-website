





              import java.util.Scanner;
                  class data_customer {
                  String customer_name;
                  int customer_card;
                  int customer_phone;
                  String customer_address;
                String customer_purchases="";
                  String pro="";
                }
              
               public class offic {
                 public static data_customer customer_information=new data_customer();
                   public static  Scanner in=new Scanner (System.in);   
                  public static int School_supplies (){
                      int stay_here;
                      int totai_purchases=0;
                          String customer_items = "";

                  do{
                      System.out.println("_______________________");
                 System.out.println("1- Notebook -$15");
                 System.out.println("2- Pens -$5");
                 System.out.println("3- Rouls -$3");
                 System.out.println("4- School bag -$10");
                 System.out.println("5- A set of pencil -$20");
                 System.out.println("6- Waxy colors -$15");
                 System.out.println("7- Pencils -$4");
                 System.out.println("8- Eraser -$3");
                 System.out.println("9- Pencil sharpener -$4");
                 System.out.println("10- Wooden colors box-$12"); 
                 System.out.println("# Enter the number of the item you want to buy: #");

                 int selcet_items=in.nextInt();
                 switch(selcet_items){
                  case 1:
                totai_purchases+=15;
                customer_items+= "Notebook -$15   ";
                 break;
                 case 2:
                  totai_purchases+=5;
                 customer_items+= "pens -$5   ";
                 break;
                 case 3:
                 totai_purchases+=3;
                customer_items+= "Rouls -$3   ";
                 break;
                 case 4:
                     totai_purchases+=10;
                    customer_items += "School bag -$10   ";
                     break;
                     case 5:
                    totai_purchases+=20;
                   customer_items+= "- A set of pencil   ";
                     break;
                     case 6:
                    totai_purchases+=15;
                    customer_items+= " Waxy colors -$15   ";
                     break;
                     case 7:
                    totai_purchases+=4;
                    customer_items += "Pencils -$4   ";
                     break;
                     case 8:
                   totai_purchases+=3;
                    customer_items+= "Eraser -$3   ";
                     break;
                     case 9:
                    totai_purchases+=4;
                     customer_items+= "Pencil sharpener -$4   ";
                     break;
                     case 10:
                     totai_purchases+=12;
                     customer_items+= "Wooden colors box-$12   ";
                     break;
                 default :
                 System.out.println("it's not use");
                 }System.out.println("# Do you want to buy more school supplies? (1 = Yes, 0 = No) #");
               stay_here=in.nextInt();
               }while( stay_here==1);
               customer_information.customer_purchases += customer_items;
                      System.out.println("");
                     return totai_purchases;
                            }

                  public static int  Books(){
                       int stay_here;
                      int totai_purchases=0;
                          String customer_items = "";

               do {

                         System.out.println("_______________________");
               System.out.println("1- Fiction - $20");
               System.out.println("2- Non-Fiction - $25");
               System.out.println("3- Educational - $18");
               System.out.println("4- Novels  - $27");
               System.out.println("5- Satire- $20");
               System.out.println("6- Horror - $19");
               System.out.println("7- Dictionary - $30");
               System.out.println("8- History - $12");
               System.out.println("9- Poetry - $24");
               System.out.println("10- Fantasy - $19"); 
               System.out.println("# Enter the number of the item you want to buy: #");
                int selcet_items= in.nextInt();
                switch (selcet_items) {
                case 1:
               totai_purchases+=20;
               customer_items+= "Fiction - $20   ";
                break;
                 case 2:
                   totai_purchases+= 25;  
                customer_items+= "Non-Fiction - $25   ";

                 break;
                 case 3:
                   totai_purchases+=18;
                customer_items+= "Educational - $18   ";
                break;
                case 4:
                  totai_purchases+=27;
                 customer_items+= "Novels  - $27   ";
                break;
               case 5:
                  totai_purchases+=20;
               customer_items+= "Satire- $20   ";
                break;
               case 6:
                   totai_purchases+=19;
               customer_items += "Horror - $19   ";
                break;
                case 7:
                  totai_purchases+=30;
               customer_items += "Dictionary - $30   ";
                break;
                case 8:
                  totai_purchases+=12;
             customer_items += "History - $12   ";
                break;
               case 9:
                  totai_purchases+=24;  
                customer_items += "Poetry - $24   ";
                break;
               case 10:
                totai_purchases+=19;
               customer_items += " Fantasy - $19   ";
                break;
                 default:
                System.out.println("it's not use");  }
                System.out.println("# Do you want to buy more books? (1 = Yes, 0 = No) #"); 
                stay_here= in.nextInt();
                 } while (stay_here== 1);   
               customer_information.customer_purchases += customer_items;
                      System.out.println("");
                   return   totai_purchases;

                  }
                  public static int Kids_toys(){
                       int stay_here;
                      int totai_purchases=0;
                       String customer_items = "";
                do {
                      System.out.println("_______________________");
               System.out.println("1- Stuffed Animals - $12");
               System.out.println("2- Board Games - $30");
               System.out.println("3- Building Blocks - $15");
               System.out.println("4- Card Games - $33");
               System.out.println("5- Cotten dolls - $40");
               System.out.println("6- Board Games - $30");
               System.out.println("7- Animal figures - $30");
               System.out.println("8- play doh - $30");
               System.out.println("9- Doodle board - $10");
               System.out.println("10- Leapad - $22");

                 System.out.println("# Enter the number of the item you want to buy: #");
               int selcet_items = in.nextInt();
                switch (selcet_items) {
                case 1:
                totai_purchases+=12;
               customer_items  += "Stuffed Animals - $12   ";
                break;
               case 2:
                totai_purchases+=30;
                customer_items += "Board Games - $30   ";
                break;
               case 3:
              totai_purchases+=5;
               customer_items  += "Building Blocks - $15   ";
                 break;
                 case 4:
               totai_purchases+=33;
                customer_items  += " Card Games - $33   ";
                break;
               case 5:
               totai_purchases+=40;
                customer_items += "Cotten dolls - $40   ";
                break;
               case 6:
               totai_purchases+=30;
              customer_items  += "Board Games - $30   ";
                break;
                case 7:
               totai_purchases+=30;
             customer_items  += "Animal figures - $30   ";
                break;
               case 8:
                totai_purchases+=30;
          customer_items += "play doh - $30   ";
                break;
               case 9:
               totai_purchases+=10;
                customer_items  += "Doodle board - $10   ";
                break;
               case 10:
                totai_purchases+=22;
               customer_items += " Leapad - $22   ";
                break;


                 default:
               System.out.println("it's not use"); }
               System.out.println("# Do you want to buy more toys? (1 = Yes, 0 = No) #");
               stay_here= in.nextInt();
                } while (stay_here== 1);
                customer_information.customer_purchases += customer_items;
                      System.out.println("");
                  return totai_purchases;

                  }
                  public static int  Devises(){

                           int stay_here;
                      int totai_purchases=0;
                       String customer_items = "";
                do{
                         System.out.println("_______________________");
                System.out.println("1- Tablets -$550");
                System.out.println("2- Smart phones -$700");
                  System.out.println("3- Computers -$1500");
                   System.out.println("4- Headphone  -$200");
                System.out.println("5- Chargers  -$100");
                System.out.println("6- Batteries -$50");
                System.out.println("7- Flash drives -$100");
                System.out.println("8- Memorys -$150");
                System.out.println("9- Covers mobile -$500");
                System.out.println("10- Maintenance -$100");

                 System.out.println("# Enter the number of the item you want to buy: #");
                 int selcet_items=in.nextInt();


                 switch (selcet_items){
                case 1:
               totai_purchases+=550;
               customer_items+= "Tablets -$550   ";
                break;
                case 2:
              totai_purchases+=700;
               customer_items+= "Smart phones -$700   ";
                break;
               case 3:
               totai_purchases+=1500;
               customer_items+= "Computers -$1500   ";
                break;
                case 4:
               totai_purchases+=200;
               customer_items+= "Headphone  -$200   ";
                break;
               case 5:
               totai_purchases+=100;
               customer_items+= "Chargers  -$100   ";
                break;
               case 6:
                totai_purchases+=50;
               customer_items+= "Batteries -$50   ";
                break;
               case 7:
              totai_purchases+=100;
              customer_items+= "Flash drives -$100   ";
                break;
               case 8:
                totai_purchases+=150;
               customer_items+= "Memorys -$150   ";
                break;
               case 9:
              totai_purchases+=500;
               customer_items+= "Covers mobile -$500   ";
                break;
               case 10:
                totai_purchases+=100;
                customer_items += "Maintenance -$100   ";
                break;

                default:
                System.out.println("it's not use");
                 }
               System.out.println("# Do you want to buy more divise? (1 = Yes, 0 = No) #");
                stay_here= in.nextInt();
                } while (stay_here== 1);
                customer_information.customer_purchases += customer_items;
                      System.out.println("");
                    return totai_purchases;

                  }
                public static void customer_information(){
                    System.out.print("Welcome to jarir bookstore\n ");
                    System.out.println("_______________________");
                  
                         System.out.println(" Enter your name :");
                      customer_information.customer_name=in.next();
                      System.out.println(" Enter your phon number :");
                     customer_information.customer_phone=in.nextInt();
                      System.out.println(" Enter your location : ");
                     customer_information.customer_address=in.next();
                      System.out.print("Enter your card number :\n");
                     customer_information.customer_card=in.nextInt();
                     System.out.println();

                }
                   public static int return_items(int totai_purchases ){

                       System.out.println("YOUR PURCHASES:");
                      System.out.println(customer_information.customer_purchases);
                            System.out.println("Type the price of product ?");
                            int price=in.nextInt();
                               totai_purchases-=price;

                       return totai_purchases;

                   }
                   public static void customer_record(int totai_purchases){
                   
                    System.out.print("\n________________________\nYOYR NAME\t"+customer_information.customer_name+"\n________________________\nYOUR LOCATION\t"+customer_information.customer_address+"\n________________________\nYOUR CARD\t"+customer_information.customer_card+"\n________________________\nYOUR PHONE NUMBER\t"+customer_information.customer_phone+"\n_________________________\nTHE PRICE OF YOUR PURCHASES\t"+"$"+ totai_purchases+"\n________________________\n");
                   System.out.println("YOUR PURCHASES:");
                    System.out.print(customer_information.customer_purchases);
                    System.out.println("");
                
                   
                   
                   
               }
                  public static void main(String[] args) {

                     customer_information();
                   int totai_purchases=0;
                    int  choose_section;
                 do{
                System.out.println("_______________________");
                 System.out.println("1- School supplies ");
                 System.out.println("2- Books");
                 System.out.println("3- Kids toys");
                 System.out.println("4- Devises"); 
                  System.out.println("5- About you ");
                     System.out.println("6- Reurn thing");
                     System.out.println("7- Exilt");
                  

                  System.out.println("# Choose from these seven categories. # ");
                  choose_section=in.nextInt();
                 switch (choose_section){
                  case 1: 
                 totai_purchases+=School_supplies ();
                  break;
                   case 2: 
                 totai_purchases+= Books();
                  break;
                 case 3:
                 totai_purchases+=Kids_toys();
                  break;
                  case 4: 
                 totai_purchases+= Devises();
                   break;
                  case 5:
                  customer_record(totai_purchases);
                  break;
                  case 6:
                    int result=return_items(totai_purchases);      
                   System.out.println("THE PRICE OF YOUR PURCHASES :\n $"+result+"\n");
                    break;
                  case 7:
                      break;
                      default:
                     System.out.println("Invalid category choice");} 
                     }while(choose_section!=7);
               }}




