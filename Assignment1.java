class Datedemo{
public static java.util.Date calculateMonthEndDate(int fromdate, int todate) {
    int[] daysInAMonth = { 29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int day = daysInAMonth[fromdate];
    Scanner in = new Scanner(System.in);
    boolean isLeapYear = new GregorianCalendar().isLeapYear(year);

    if (isLeapYear && month == 2) {
        day++;
    }

 GregorianCalendar gc = new GregorianCalendar(fromdate,todate, 1);
    java.util.Date monthStartDate = new java.util.Date(gc.getTime().getTime());
    System.out.println(monthStartDate);
    GregorianCalendar gc = new GregorianCalendar(fromdate, todate, 1);
    java.util.Date monthEndDate = new java.util.Date(gc.getTime().getTime());
    System.out.println(monthEndDate);
}

public static void main(String[] args) {
    int fromdate,todate;
    fromdate=in.nextInt();
    todate=in.nextInt();
    final java.util.Date calculatedDate = calculateMonthStartDate(fromdate, todate);
    SimpleDateFormat format = new SimpleDateFormat();
    System.out.println("Calculated month start date : " + format.format(calculatedDate));
    final java.util.Date calculatedDate = calculateMonthEndDate(fromdate, todate);
    SimpleDateFormat format = new SimpleDateFormat();
    System.out.println("Calculated month end date : " + format.format(calculatedDate));
} 
}
