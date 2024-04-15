package cafe.yamds.work0312;

public class demo16 {
	public static void main(String[] args) {
		System.out.println("<table>");
        System.out.println("\t<tr><th>A</th><th>B</th><th>C</th><th>D</th><th>E</th></tr>");

        for (int i = 0; i < 5; i++) {
            System.out.print("\t<tr>");
            for (int j = 0; j < 5; j++) {
                int num = i * 5 + j + 1;
                System.out.print("<td>" + num + "</td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>");
        
    }
	
}