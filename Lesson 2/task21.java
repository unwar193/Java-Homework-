// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Входная строка:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// Выходная строка:
// select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"

/*public class task21 {
    public static void main(String[] args) {
        String strDir = "{\"name\" : \"Ivanov\",\"country\": \"Russia\",\"city\": \"Moscow\",\"age\": \"null\"}";
        String strCl = strDir.replace("{", "").replace("}", "")
                .replace("\"", "");
        StringBuilder string = new StringBuilder();
        StringBuilder finalStr = new StringBuilder();
        String[] newStr = strCl.split(",");
        System.out.print("select * from students where ");
        String t1 = "null";

        for (String string2 : newStr) {
            String[] string3 = string2.split(": ");
            String t2 = string3[1];
            if (t2 != t1){
                System.out.printf("%s = \"%s\"; ", string3[0], string3[1]);
            // } else if (string3[1] == t1){
            //     System.out.print(";");
            // }
            //System.out.printf("%s = %s; ", string3[0], string3[1]);
            }
        }
    }
}*/


public class task21 {
    public static final String QUERY = "select * from students where ";
    public static final String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
    public static void main(String[] args) {
        String paramToStr = PARAMS.replace('{', ' ').replace('}', ' '); 
        String[] newStr = paramToStr.split(","); 
        StringBuilder result = new StringBuilder(QUERY);
        for (int i = 0; i < newStr.length; i++) {
            String[] resultItem = newStr[i].replace('"', ' ').split(":"); 
            if (!"null".equals(resultItem[1].trim())) { 
                result.append(resultItem[0].trim()).append(" = ").append('"').append(resultItem[1].trim()).append('"'); /*ключ и значение соединили через = для вывода */
                if (i < newStr.length - 2)
                    result.append(" and "); 
            }
        }
        System.out.println(result);
    }
}
