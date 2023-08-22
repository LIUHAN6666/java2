import java.util.ArrayList;

public class Test1 {
        public static void main(String[] args) {
            ArrayList<String> arl = new ArrayList<>();
            arl.add("AA");
            arl.add("BB");
            arl.add("CC");
            arl.add("DD");
            arl.add("EE");
            arl.set(4,"SS");
            arl.remove(0);
            String s = arl.toString();
            System.out.println(s);
            System.out.println(arl.size());
            System.out.println(arl.get(1));
            System.out.println(arl.indexOf("BB"));
        }

    }

