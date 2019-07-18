import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class vo
{
  public static Object a(Object paramObject, vo.a parama)
    throws JSONException
  {
    if (paramObject == null) {
      return JSONObject.NULL;
    }
    if ((!(paramObject instanceof String)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Double)) && (!(paramObject instanceof Float)) && (!(paramObject instanceof Integer)) && (!(paramObject instanceof Long)))
    {
      if ((paramObject instanceof Po))
      {
        if (parama != null) {
          return parama.a((Po)paramObject);
        }
        return null;
      }
      if ((paramObject instanceof Mo)) {
        return a((Mo)paramObject, parama);
      }
      if ((paramObject instanceof List)) {
        return a((List)paramObject, parama);
      }
      parama = new StringBuilder();
      parama.append("Invalid object found for JSON serialization: ");
      parama.append(paramObject.toString());
      throw new IllegalArgumentException(parama.toString());
    }
    return paramObject;
  }
  
  private static JSONArray a(List paramList, vo.a parama)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localJSONArray.put(a(paramList.next(), parama));
    }
    return localJSONArray;
  }
  
  public static JSONObject a(Io paramIo, vo.a parama)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramIo.b().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject.put(str, a(paramIo.a(str), parama));
    }
    return localJSONObject;
  }
  
  private static JSONObject a(Mo paramMo, vo.a parama)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramMo.b().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject.put(str, a(paramMo.a(str), parama));
    }
    return localJSONObject;
  }
  
  public static abstract interface a
  {
    public abstract JSONObject a(Po paramPo);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */