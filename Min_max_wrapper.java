public class Wraper {
    Integer obj1 = Integer.MIN_VALUE;
    Integer obj2 = Integer.MAX_VALUE;
    Byte obj3 = Byte.MAX_VALUE;
    Byte obj4 = Byte.MIN_VALUE;
    Short obj5 = Short.MAX_VALUE;
    Short obj6 = Short.MIN_VALUE;
    Long obj7 = Long.MAX_VALUE;
    Long obj8 = Long.MIN_VALUE;
    Float obj9 = Float.MAX_VALUE;
    Float obj10 = Float.MIN_VALUE;
    Double obj11 = Double.MAX_VALUE;
    Double obj12 = Double.MIN_VALUE;

    public static void main(String[] args) {
        Wraper obj = new Wraper();
        System.out.println("Integer range:");
        System.out.println("min: "+obj.obj1);
        System.out.println("max: "+obj.obj2);
        System.out.println("Byte range:");
        System.out.println("max: "+obj.obj3);
        System.out.println("min: "+obj.obj4);
        System.out.println("Short range:");
        System.out.println("max: "+obj.obj5);
        System.out.println("min: "+obj.obj6);
        System.out.println("Long range:");
        System.out.println("max: "+obj.obj7);
        System.out.println("min: "+obj.obj8);
        System.out.println("Float range:");
        System.out.println("max: "+obj.obj9);
        System.out.println("min: "+obj.obj10);
        System.out.println("Double range:");
        System.out.println("max: "+obj.obj11);
        System.out.println("min: "+obj.obj12);

    }




}
