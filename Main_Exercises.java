import java.util.Arrays;

public class Main_Exercises {
    public static void main(String[] args) {


        // 1:
        int number[]={1,5,2,9,0,10,6};
        try{
            System.out.println(number[9]);

        }catch (Exception ex) {
            ex.printStackTrace();
        }
        //2:
        try {
            checkNumber(11);
        }catch (Exception e){
            e.printStackTrace();
        }

        //3:
        Author author1= new Author("Haya","Haya@gmail.com");
        Author author2=new Author("Abdullah","Abdullah@gmail.com");
        System.out.println(author2.getName());
        System.out.println(author1.toString());
        System.out.println(author2.toString());

        //4:
        Ball ball1= new Ball(15,12,15,10,12);
        ball1.move();
        ball1.reflecteHorizontal();
        ball1.reflectVertical();
        System.out.println(ball1.toString());
        ball1.move();
        ball1.move();
        System.out.println(ball1.toString());

        //5:
        Employee employee1= new Employee(123134,"Haya","Almalki",3000);
        Employee employee2=new Employee(14134,"Fahad","Saad",5000);
        System.out.println("Name= "+employee1.getName()+", annual Salay="+ employee1.getAnnualSalary());
        System.out.println(employee2.toString());

        //6:
        InvoiceItem inItem= new InvoiceItem("35512","juice",10,5);
        System.out.println("Total Price= "+inItem.getTotal());
        System.out.println(inItem.toString());

        //7:
        MyPoint point1= new MyPoint(15,20);
        MyPoint point2=new MyPoint(3,7);
        System.out.println("distance from point1 to (4,9) ="+point1.distance(4,9));
        System.out.println("distance from this point to (0,0) = "+ point1.distance());
        System.out.println("distance from point1 to point 2 ="+point1.distance(point2));
        int arr[]= point1.getXY();
        System.out.println(Arrays.toString(arr));
        System.out.println(point2.toString());

    }

    public static void checkNumber(int num) throws RuntimeException{
        if(num%5!=0){
            throw new RuntimeException("The number isn't divided by 5");
        }
        else{
            System.out.println("The number is divided by 5");
        }

    }
}