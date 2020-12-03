package JSON;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;   
public class JSONEncode
{

	public static void main(String[] args)
	{
		JSONObject_CMD();
		System.out.println("\n");
		JSON_HashMap();

	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	private static void JSONObject_CMD()
	{
		JSONObject obj=new JSONObject();    
		obj.put("name","sonoo");    
		obj.put("age",new Integer(27));    
		obj.put("salary",new Double(600000));    
		System.out.print(obj); 
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void JSON_HashMap()
	{
		Map obj = new HashMap();
		obj.put("name", "Truong");
		obj.put("address", "San Jose");
		obj.put("county","Santa Clara");
		String data = JSONValue.toJSONString(obj);
		System.out.println(obj);
 	}
}
