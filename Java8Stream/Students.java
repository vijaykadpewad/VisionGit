package Java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

class Students {

    private Integer id;
    private String name;
    public Students(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public Integer getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}

 class VK {
     public static void main(String[] args) {
         List<Students> list = new ArrayList<Students>();
         list.add(new Students(1, "vijay"));
         list.add(new Students(2, "sourabh"));
         list.add(new Students(3, "Angad"));


         Map<String, Students> map = list.stream().collect(Collectors.toMap(Students::getName, item -> item));
      /*  Map<Integer, String> map = new HashMap<>();

        for (Students std : list) {
            map.put(std.getId(), std.getName());
        }
        System.out.println("Map : " + map);
    }*/
     }
 }