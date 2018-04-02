public class MainClass {
    public static void main(String[] args){
        Address addr = new Address("Belarus","Polotsk","Skoriny",35,1);
        addr.printAddress();

        Address addr2 = new Address("Russia","Moscow","Krasnaya",35);
        addr2.printAddress();

        Date date = new Date(29,12,1995);
        date.setDay(35);
        date.setMonth(13);
        date.setYear(-5);
        date.print();
        System.out.println(date.differenceInDays(1,2,1997));
    }
}
