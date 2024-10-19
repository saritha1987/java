import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

class comarr{
    public static void main(String [] args)
    {
        int a[]={1,2,3,4,5};
        int b[]={9,2,6,7,4};

        List <Integer> com = findcom(a,b);

        System.out.println(com);
    }
    public static List <Integer> findcom(int a[],int b[])
    {
        Set <Integer> sets = new HashSet<>();
        for(int num : a)
        {
            sets.add(num);
        }
        List <Integer> com = new ArrayList<>();
        for(int num : b)
        {
            if(sets.contains(num))
            {
                com.add(num);
            }
        }
        return com;
    }


}