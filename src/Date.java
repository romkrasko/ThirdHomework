public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(checkDate(day,month,year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else System.out.println(("constructor: Incorrect date"));
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (checkDate(day, month, year))
        this.day = day;
        else System.out.println("setter: Incorrect day(");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (checkDate(day, month, year))
        this.month = month;
        else System.out.println("setter: Incorrect month(");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (checkDate(day, month, year))
        this.year = year;
        else System.out.println("setter: Incorrect year(");
    }

    public boolean checkDate(int day, int month,int year){
        int feb;
        boolean flag=true;
        if (year%4 == 0)
            feb = 29;
        else feb = 28;

            if (year>0)
            switch(month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if ((day > 31) || (day < 1))
                        flag = false;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    if ((day > 30) || (day < 1))
                        flag = false;
                    break;

                case 2:
                    if ((day > feb) || (day < 1))
                        flag = false;
                    break;

                default:
                    flag = false;
                    break;
            }
            else flag=false;
            return flag;
    }

    public void print()
    {
        System.out.println(day+" "+month+" "+year);
    }

    public int differenceInDays(int day, int month, int year) {
        int d1 = getDay();
        int m1 = getMonth();
        int y1 = getYear();
        int d2 = day;
        int m2 = month;
        int y2 = year;
        int feb;
        int diff=0;

        while(!((d1==d2)&&(m1==m2)&&(y1==y2))) {
            if (y2 % 4 == 0)
                feb = 29;
            else feb = 28;
            boolean lastDay = false;
            boolean lastMonth = false;
            switch (m1) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if (d1 == 31) lastDay = true;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    if (d1 == 30) lastDay = true;
                    break;

                case 2:
                    if (d1 == feb) lastDay = true;
                    break;

                case 12:
                    if (d1 == 31) lastDay = true;
                    lastMonth = true;
                    break;

                default:
                    break;

            }
            diff++;
            d1++;
            if (lastDay) {d1=1; m1++;
            if (lastMonth){ m1=1; y1++;}}

        }
        return diff;
    }
}
