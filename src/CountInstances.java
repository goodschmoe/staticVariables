public class CountInstances
{
    public static void main (String[] args)
    {
        Slogan obj;
        obj = new Slogan ("Remember the Alamo");
        System.out.println(obj);
        obj = new Slogan("Don't Worry be Happy");
        System.out.println(obj);
        obj = new Slogan("Live Free or Die.");
        System.out.println(obj);
        obj = new Slogan("Talk is Cheap.");
        System.out.println(obj);
        obj = new Slogan("Write Once, Run Anywhere.");
        System.out.println(obj);
        System.out.println();
        System.out.println("Slogan created: " + Slogan.getCount());
    }
}
