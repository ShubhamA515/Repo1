package in4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.hwpf.usermodel.DateAndTime;

public class CDT 
{
public static void main(String[] args) 
{
LocalDateTime cdt = LocalDateTime.now();	

DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

String current = cdt.format(format);

System.out.println(current);
}
}
