class ComplexNumber{
    int real,image;
    public ComplexNumber(int r, int i){
        this.real= r;
        this.image = i;
    }
    public void showC(){
        System.out.println(this.real + "+i" + this.image);
    }
    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2){
        ComplexNumber res = new ComplexNumber(0, 0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }
    static void Print_Product(ComplexNumber n1, ComplexNumber n2){
        int p1 = n1.real*n2.real;
        int p2 = n1.image*n2.image;
        int p3 = (n1.real+n2.real)*(n1.image+n2.image);
        int real = p1 - p2;
        int img = p3 - (p1 + p2);
        System.out.println(real + "+ i" + img);
    }
    
    public static void main(String[] args) {
       ComplexNumber c1 = new ComplexNumber(4, 5);
         ComplexNumber c2 = new ComplexNumber(7, 10);
         System.out.println("first Complex Number: " );
         c1.showC();
         System.out.println("Second ComplecNumber is :");
         c2.showC();
         ComplexNumber res = add(c1, c2);
         System.out.println("Addition is: ");
         res.showC();
         System.out.println("Multiplication is:");
         Print_Product(c1, c2);

         
       




}
}
