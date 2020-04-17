

class A{



}

class ReflectionDemo{
    public static void main(final String... args) throws Exception {
        final Class c = Class.forName("A");
             System.out.println(c.getModifiers());
    }
}