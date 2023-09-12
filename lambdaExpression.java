interface addition{
    int add(int a, int b);
}

public class lambdaExpression
{
    public static void main(String[] args) {
        

        //without return keyword
        addition ad1= (a,b)-> (a+b);
        System.out.println(ad1.add(20,32));
        
        //with return keyword
        addition ad2= (a,b)-> {
            return (a+b);
        };
        System.out.println(ad2.add(200,456));
    }
}
