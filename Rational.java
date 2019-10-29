public class Rational {
    private int Numerator;
    private int Denominator;


    public Rational(int numerator , int Denominator) {
        int a = 0;

        if (Math.abs(numerator) > Math.abs(Denominator)){
            a = Math.abs(numerator);
        }

        else if(Math.abs(numerator) < Math.abs(Denominator)){
            a = Math.abs(Denominator);
        }

        else {
            a = Math.abs(numerator);
        }

        for (int i = a ; i >= 0 ; --i){
            if ((Math.abs(numerator) % i == 0) && (Math.abs(Denominator) % i == 0)){
                numerator = numerator / i;
                Denominator = Denominator / i;
                break;
            }
        }
        this.Numerator = numerator;
        this.Denominator = Denominator;
    }

    public Rational() {

    }

    public int getNumerator() {
        return Numerator;
    }

    public int getDenominator() {
        return Denominator;
    }

    public Rational add(Rational num){
        int x , y;
        x = (this.Numerator * num.Denominator) + (this.Denominator * num.Numerator);
        y = this.Denominator * num.Denominator;
        if (x < 0 && y < 0){
            x = Math.abs(x);
            y = Math.abs(y);
        }
        if (x > 0 && y < 0){
            x = -Math.abs(x);
            y = Math.abs(y);
        }
        Rational r3 = new Rational(x , y);
        return r3;
    }

    public Rational sub(Rational num){
        int x , y;
        x = (this.Numerator * num.Denominator) - (this.Denominator * num.Numerator);
        y = this.Denominator * num.Denominator;
        if (x < 0 && y < 0){
            x = Math.abs(x);
            y = Math.abs(y);
        }
        if (x > 0 && y < 0){
            x = -Math.abs(x);
            y = Math.abs(y);
        }
        Rational r4 = new Rational(x , y);
        return r4;
    }

    public Rational mul(Rational num){
        int x , y;
        x = this.Numerator * num.Numerator;
        y = this.Denominator * num.Denominator;
        if (x < 0 && y < 0){
            x = Math.abs(x);
            y = Math.abs(y);
        }
        if (x > 0 && y < 0){
            x = -Math.abs(x);
            y = Math.abs(y);
        }
        Rational r5 = new Rational(x , y);
        return r5;
    }

    public Rational div(Rational num){
        int x , y;
        x = this.Numerator * num.Denominator;
        y = this.Denominator * num.Numerator;
        if (x < 0 && y < 0){
            x = Math.abs(x);
            y = Math.abs(y);
        }
        if (x > 0 && y < 0){
            x = -Math.abs(x);
            y = Math.abs(y);
        }
        Rational r6 = new Rational(x , y);
        return r6;
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

    public double toFloatingPoint (){
        return (Numerator * 1.0) / this.Denominator;
    }

    public Rational print(){
        System.out.println(toString());
        return this;
    }



                                                      //satrting convert


    public Rational convert(String str) {
        int x = 0 , y = 0;
        int i = 0;
        String string1 = "";
        String string2 = "";
        int numerator1, denominator1;
        int numerator2, denominator2;
        while (str.charAt(i) != '/') {
            string1 += str.charAt(i);
            i++;
        }
        numerator1 = Integer.parseInt(string1);
        i++;
        if (str.charAt(i) == '-') {
            string2 += str.charAt(i);
            i++;
        }
        while (str.charAt(i) != ':' && str.charAt(i) != '+' && str.charAt(i) != '-' && str.charAt(i) != '*'){
            string2 += str.charAt(i);
            i++;
        }
        denominator1 = Integer.parseInt(string2);
        string1 = "";
        string2 = "";
        if(str.charAt(i) == '+'){
            i++;
            while (str.charAt(i) != '/'){
                string1 += str.charAt(i);
                i++;
            }
            numerator2 = Integer.parseInt(string1);
            i++;
            while (i < str.length()){
                string2 += str.charAt(i);
                i++;
            }
            denominator2 = Integer.parseInt(string2);
            Rational num1 = new Rational(numerator1, denominator1);
            Rational num2 = new Rational(numerator2, denominator2);
            Rational r3;
            x = this.Numerator;
            y = this.Denominator;
            r3 = num1.add(num2);
            return r3;
        }
        else if(str.charAt(i) == '-'){
            i++;
            while (str.charAt(i) != '/'){
                string1 += str.charAt(i);
                i++;
            }
            numerator2 = Integer.parseInt(string1);
            i++;
            while (i < str.length()){
                string2 += str.charAt(i);
                i++;
            }
            denominator2 = Integer.parseInt(string2);
            Rational num1 = new Rational(numerator1, denominator1);
            Rational num2 = new Rational(numerator2, denominator2);
            Rational r3 ;
            x = this.Numerator;
            y = this.Denominator;
            r3 = num1.sub(num2);
            return r3;
        }
        else if(str.charAt(i) == '*'){
            i++;
            while (str.charAt(i) != '/'){
                string1 += str.charAt(i);
                i++;
            }
            numerator2 = Integer.parseInt(string1);
            i++;
            while (i < str.length()){
                string2 += str.charAt(i);
                i++;
            }
            denominator2 = Integer.parseInt(string2);
            Rational num1 = new Rational(numerator1, denominator1);
            Rational num2 = new Rational(numerator2, denominator2);
            Rational r3 ;
            x = this.Numerator;
            y = this.Denominator;
            r3 = num1.mul(num2);
            return r3;
        }
        else if(str.charAt(i) == ':'){
            i++;
            while (str.charAt(i) != '/'){
                string1 += str.charAt(i);
                i++;
            }
            numerator2 = Integer.parseInt(string1);
            i++;
            while (i < str.length()){
                string2 += str.charAt(i);
                i++;
            }
            denominator2 = Integer.parseInt(string2);
            Rational num1 = new Rational(numerator1, denominator1);
            Rational num2 = new Rational(numerator2, denominator2);
            Rational r3 ;
            x = this.Numerator;
            y = this.Denominator;
            r3 = num1.div(num2);
            return r3;
        }
        return null;
    }








   public static void main(String[] args){
       RationalTest a = new RationalTest();
       a.Rationall();
   }






}

class RationalTest{
    public void Rationall(){
        Rational a = new Rational(2 ,-4);
        Rational b = new Rational(8 ,5);
        Rational c ;
        System.out.printf("Float form of number 1: %f\n", a.toFloatingPoint());
        System.out.printf("Float form of number 2: %f\n\n\n\n", b.toFloatingPoint());
        c = a.div(b);
        System.out.print("the division : ");
        c.print();
        System.out.println("the floating division : " + c.toFloatingPoint() + "\n");
        c = a.mul(b);
        System.out.print("the multiple : ");
        c.print();
        System.out.println( "the floating multiple : " + c.toFloatingPoint() + "\n");
        c = a.add(b);
        System.out.print("the sum : ");
        c.print();
        System.out.println("the floating sum : " + c.toFloatingPoint() + "\n");
        c = a.sub(b);
        System.out.print("the subtraction : ");
        c.print();
        System.out.println("the floating subtraction : " + c.toFloatingPoint() + "\n");
        System.out.println("-------------------------------------");


        a = new Rational(2,5);
        b = new Rational(-1,-8);
        System.out.printf("Float form of number 1: %f\n", a.toFloatingPoint());
        System.out.printf("Float form of number 2: %f\n\n\n\n", b.toFloatingPoint());
        c = a.div(b);
        System.out.print("the division : ");
        c.print();
        System.out.println("the floating division : " + c.toFloatingPoint() + "\n");
        c = a.mul(b);
        System.out.print("the multiple : ");
        c.print();
        System.out.println( "the floating multiple : " + c.toFloatingPoint() + "\n");
        c = a.add(b);
        System.out.print("the sum : ");
        c.print();
        System.out.println("the floating sum : " + c.toFloatingPoint() + "\n");
        c = a.sub(b);
        System.out.print("the subtraction : ");
        c.print();
        System.out.println("the floating subtraction : " + c.toFloatingPoint() + "\n");
        System.out.println("-------------------------------------");


        a = new Rational(-32,5);
        b = new Rational(-90,10);
        System.out.printf("Float form of number 1: %f\n", a.toFloatingPoint());
        System.out.printf("Float form of number 2: %f\n\n\n\n", b.toFloatingPoint());
        c = a.div(b);
        System.out.print("the division : ");
        c.print();
        System.out.println("the floating division : " + c.toFloatingPoint() + "\n");
        c = a.mul(b);
        System.out.print("the multiple : ");
        c.print();
        System.out.println( "the floating multiple : " + c.toFloatingPoint() + "\n");
        c = a.add(b);
        System.out.print("the sum : ");
        c.print();
        System.out.println("the floating sum : " + c.toFloatingPoint() + "\n");
        c = a.sub(b);
        System.out.print("the subtraction : ");
        c.print();
        System.out.println("the floating subtraction : " + c.toFloatingPoint() + "\n");
        System.out.println("-------------------------------------");

        a = new Rational(29,8);
        b = new Rational(-13,82);
        System.out.printf("Float form of number 1: %f\n", a.toFloatingPoint());
        System.out.printf("Float form of number 2: %f\n\n\n\n", b.toFloatingPoint());
        c = a.div(b);
        System.out.print("the division : ");
        c.print();
        System.out.println("the floating division : " + c.toFloatingPoint() + "\n");
        c = a.mul(b);
        System.out.print("the multiple : ");
        c.print();
        System.out.println( "the floating multiple : " + c.toFloatingPoint() + "\n");
        c = a.add(b);
        System.out.print("the sum : ");
        c.print();
        System.out.println("the floating sum : " + c.toFloatingPoint() + "\n");
        c = a.sub(b);
        System.out.print("the subtraction : ");
        c.print();
        System.out.println("the floating subtraction : " + c.toFloatingPoint() + "\n");
        System.out.println("-------------------------------------");

        a = new Rational(20,8);
        b = new Rational(45,90);
        System.out.printf("Float form of number 1: %f\n", a.toFloatingPoint());
        System.out.printf("Float form of number 2: %f\n\n\n\n", b.toFloatingPoint());
        c = a.div(b);
        System.out.print("the division : ");
        c.print();
        System.out.println("the floating division : " + c.toFloatingPoint() + "\n");
        c = a.mul(b);
        System.out.print("the multiple : ");
        c.print();
        System.out.println( "the floating multiple : " + c.toFloatingPoint() + "\n");
        c = a.add(b);
        System.out.print("the sum : ");
        c.print();
        System.out.println("the floating sum : " + c.toFloatingPoint() + "\n");
        c = a.sub(b);
        System.out.print("the subtraction : ");
        c.print();
        System.out.println("the floating subtraction : " + c.toFloatingPoint() + "\n");
        System.out.println("-------------------------------------");

        a = new Rational(34,50);
        b = new Rational(74,89);
        System.out.printf("Float form of number 1: %f\n", a.toFloatingPoint());
        System.out.printf("Float form of number 2: %f\n\n\n\n", b.toFloatingPoint());
        c = a.div(b);
        System.out.print("the division : ");
        c.print();
        System.out.println("the floating division : " + c.toFloatingPoint() + "\n");
        c = a.mul(b);
        System.out.print("the multiple : ");
        c.print();
        System.out.println( "the floating multiple : " + c.toFloatingPoint() + "\n");
        c = a.add(b);
        System.out.print("the sum : ");
        c.print();
        System.out.println("the floating sum : " + c.toFloatingPoint() + "\n");
        c = a.sub(b);
        System.out.print("the subtraction : ");
        c.print();
        System.out.println("the floating subtraction : " + c.toFloatingPoint() + "\n");
        System.out.println("-------------------------------------");

        a = new Rational(20,53);
        b = new Rational(-19,51);
        System.out.printf("Float form of number 1: %f\n", a.toFloatingPoint());
        System.out.printf("Float form of number 2: %f\n\n\n\n", b.toFloatingPoint());
        c = a.div(b);
        System.out.print("the division : ");
        c.print();
        System.out.println("the floating division : " + c.toFloatingPoint() + "\n");
        c = a.mul(b);
        System.out.print("the multiple : ");
        c.print();
        System.out.println( "the floating multiple : " + c.toFloatingPoint() + "\n");
        c = a.add(b);
        System.out.print("the sum : ");
        c.print();
        System.out.println("the floating sum : " + c.toFloatingPoint() + "\n");
        c = a.sub(b);
        System.out.print("the subtraction : ");
        c.print();
        System.out.println("the floating subtraction : " + c.toFloatingPoint() + "\n");
        System.out.println("-------------------------------------");

        a = new Rational(24,-75);
        b = new Rational(38,63);
        System.out.printf("Float form of number 1: %f\n", a.toFloatingPoint());
        System.out.printf("Float form of number 2: %f\n\n\n\n", b.toFloatingPoint());
        c = a.div(b);
        System.out.print("the division : ");
        c.print();
        System.out.println("the floating division : " + c.toFloatingPoint() + "\n");
        c = a.mul(b);
        System.out.print("the multiple : ");
        c.print();
        System.out.println( "the floating multiple : " + c.toFloatingPoint() + "\n");
        c = a.add(b);
        System.out.print("the sum : ");
        c.print();
        System.out.println("the floating sum : " + c.toFloatingPoint() + "\n");
        c = a.sub(b);
        System.out.print("the subtraction : ");
        c.print();
        System.out.println("the floating subtraction : " + c.toFloatingPoint() + "\n");
        System.out.println("-------------------------------------");

        a = new Rational(28,-2);
        b = new Rational(6,-5);
        System.out.printf("Float form of number 1: %f\n", a.toFloatingPoint());
        System.out.printf("Float form of number 2: %f\n\n\n\n", b.toFloatingPoint());
        c = a.div(b);
        System.out.print("the division : ");
        c.print();
        System.out.println("the floating division : " + c.toFloatingPoint() + "\n");
        c = a.mul(b);
        System.out.print("the multiple : ");
        c.print();
        System.out.println( "the floating multiple : " + c.toFloatingPoint() + "\n");
        c = a.add(b);
        System.out.print("the sum : ");
        c.print();
        System.out.println("the floating sum : " + c.toFloatingPoint() + "\n");
        c = a.sub(b);
        System.out.print("the subtraction : ");
        c.print();
        System.out.println("the floating subtraction : " + c.toFloatingPoint() + "\n");
        System.out.println("-------------------------------------");

        a = new Rational(12,5);
        b = new Rational(-7,-8);
        System.out.printf("Float form of number 1: %f\n", a.toFloatingPoint());
        System.out.printf("Float form of number 2: %f\n\n\n\n", b.toFloatingPoint());
        c = a.div(b);
        System.out.print("the division : ");
        c.print();
        System.out.println("the floating division : " + c.toFloatingPoint() + "\n");
        c = a.mul(b);
        System.out.print("the multiple : ");
        c.print();
        System.out.println( "the floating multiple : " + c.toFloatingPoint() + "\n");
        c = a.add(b);
        System.out.print("the sum : ");
        c.print();
        System.out.println("the floating sum : " + c.toFloatingPoint() + "\n");
        c = a.sub(b);
        System.out.print("the subtraction : ");
        c.print();
        System.out.println("the floating subtraction : " + c.toFloatingPoint() + "\n");
        System.out.println("-------------------------------------");

        System.out.println("check convert \n\n");

        System.out.println(a.convert("2/3+4/6"));
        System.out.println(a.convert("2/5:3/5"));
        System.out.println(a.convert("1/9*3/90"));
        System.out.println(a.convert("8/3-8/6"));
        System.out.println("--------------------------------------");
        System.out.println(a.convert("20/3+5/60"));
        System.out.println(a.convert("2/3:3/-9"));
        System.out.println(a.convert("10/4*7/30"));
        System.out.println(a.convert("23/8--12/4"));
        System.out.println("--------------------------------------");
        System.out.println(a.convert("2/3+4/6"));
        System.out.println(a.convert("3/7:34/5"));
        System.out.println(a.convert("1/9*3/5"));
        System.out.println(a.convert("8/3-8/6"));
        System.out.println("--------------------------------------");
        System.out.println(a.convert("2/3+4/6"));
        System.out.println(a.convert("20/5:35/5"));
        System.out.println(a.convert("1/90*34/90"));
        System.out.println(a.convert("8/33--98/6"));






        Rational ab = new Rational(18,24);
        Rational a1 = new Rational(72,36);
        Rational a2 = new Rational(27,11);
        Rational a4 = new Rational(273,114);
        Rational DefaultConstructorTest = new Rational();
        try {
            Rational ConstructorTest6 = new Rational(25, 0);
        } catch (ArithmeticException e) {

        }



        assert (ab.getNumerator() == 3) && (ab.getDenominator() == 4);
        assert (a1.getNumerator() == 2) && (a1.getDenominator() == 1);
        assert (a2.getNumerator() == 27) && (a2.getDenominator() == 11);
        assert (a4.getNumerator() == 91) && (a4.getDenominator() == 38);
        assert (DefaultConstructorTest.getNumerator() == 0) && (DefaultConstructorTest.getDenominator() == 0);












    }

}
