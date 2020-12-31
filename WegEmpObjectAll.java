public class WegEmpObjectAll{
   public static final int IS_FULL_TIME=2;
   public static final int IS_PART_TIME=1;

        private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHourPerMonth;

        public WegEmpObjectAll(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth)
        {
                this.company=company;
                this.empRatePerHour=empRatePerHour;
                this.numOfWorkingDays=numOfWorkingDays;
                this.maxHourPerMonth=maxHourPerMonth;
        }
        private int computeEmpWage()
        {
         int empHrs=0,totalWorkingDays=0,totalEmpHrs=0;
      while(totalEmpHrs <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays){
         totalWorkingDays++;
         int empCheck=(int)Math.floor(Math.random()*10)%3;
         switch(empCheck){
         case IS_FULL_TIME:
            empHrs=8;
            break;
         case IS_PART_TIME:
            empHrs=4;
            break;
         default:
            empHrs=0;
         }
        totalEmpHrs+=empHrs;
        System.out.println("Days: "+ totalWorkingDays +"Emp Hr"+ empHrs );
      }
        int totalEmpWage=totalEmpHrs * empRatePerHour;;
                return totalEmpWage;
        }
        public static void main(String args[]){

                WegEmpObjectAll dMart=new WegEmpObjectAll("DMart",20,2,10);
                WegEmpObjectAll BigBasket=new WegEmpObjectAll("BigBasket",35,2,11);
                System.out.println("Total wage for Dmart is:"+ dMart.computeEmpWage());
      System.out.println("Total wage for BigBasket is:"+ BigBasket.computeEmpWage());
        }
}
