public class Wraper {
    Integer obj = 600;
    Byte obj1 = Byte.valueOf((byte)50);
    Short obj2 = Short.valueOf((short) 500);
    Long obj3 = Long.valueOf((long) 300);
    Float obj4 = Float.valueOf((float) 67.90);
    Double obj5 = Double.valueOf((double) 55.55);
    Character obj6 = 'a';
    //Boolean obj7 = (boolean) obj;
    int res = obj.intValue();
    int res1 = obj;
    int res3 = Integer.parseInt("100");
    public static void main(String[] args) {
        Wraper oo = new Wraper();
        System.out.println(oo.res);
        System.out.println(oo.obj);
        System.out.println(oo.obj1);
        System.out.println(oo.obj2);
        System.out.println(oo.obj3);
        System.out.println(oo.obj4);
        System.out.println(oo.obj5);
        System.out.println(oo.obj6);
        //System.out.println(oo.obj7);
        System.out.println(oo.obj.toString());
        String s = oo.obj.toString();
        System.out.println(oo.res1);
        System.out.println(oo.res3);
    }


}
