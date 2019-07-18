package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class ql
{
  private static final sl<Map<String, ?>> a = new rl();
  
  public static String a(tl paramtl)
  {
    return a(paramtl);
  }
  
  private static String a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    StringWriter localStringWriter = new StringWriter();
    try
    {
      JsonWriter localJsonWriter = new android/util/JsonWriter;
      localJsonWriter.<init>(localStringWriter);
      a(localJsonWriter, paramObject);
      localJsonWriter.close();
      return localStringWriter.toString();
    }
    catch (IOException paramObject)
    {
      Tl.b("Error when writing JSON.", (Throwable)paramObject);
    }
    return null;
  }
  
  public static List<String> a(JsonReader paramJsonReader)
    throws IllegalStateException, IOException
  {
    ArrayList localArrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      localArrayList.add(paramJsonReader.nextString());
    }
    paramJsonReader.endArray();
    return localArrayList;
  }
  
  public static List<String> a(JSONArray paramJSONArray, List<String> paramList)
    throws JSONException
  {
    paramList = new ArrayList();
    if (paramJSONArray == null) {
      return paramList;
    }
    for (int i = 0; i < paramJSONArray.length(); i++) {
      paramList.add(paramJSONArray.getString(i));
    }
    return paramList;
  }
  
  public static JSONObject a(String paramString, Object paramObject)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(paramString, paramObject);
    return localJSONObject;
  }
  
  public static JSONObject a(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    try
    {
      JSONObject localJSONObject1 = paramJSONObject.getJSONObject(paramString);
      paramJSONObject = localJSONObject1;
    }
    catch (JSONException localJSONException)
    {
      JSONObject localJSONObject2 = new JSONObject();
      paramJSONObject.put(paramString, localJSONObject2);
      paramJSONObject = localJSONObject2;
    }
    return paramJSONObject;
  }
  
  public static JSONObject a(JSONObject paramJSONObject, String... paramVarArgs)
  {
    paramJSONObject = b(paramJSONObject, paramVarArgs);
    if (paramJSONObject == null) {
      return null;
    }
    return paramJSONObject.optJSONObject(paramVarArgs[(paramVarArgs.length - 1)]);
  }
  
  private static void a(JsonWriter paramJsonWriter, Object paramObject)
    throws IOException
  {
    if (paramObject == null)
    {
      paramJsonWriter.nullValue();
      return;
    }
    if ((paramObject instanceof Number))
    {
      paramJsonWriter.value((Number)paramObject);
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      paramJsonWriter.value(((Boolean)paramObject).booleanValue());
      return;
    }
    if ((paramObject instanceof String))
    {
      paramJsonWriter.value((String)paramObject);
      return;
    }
    if ((paramObject instanceof tl))
    {
      ((tl)paramObject).a(paramJsonWriter);
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJsonWriter.beginObject();
      Iterator localIterator = ((Map)paramObject).entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        paramObject = ((Map.Entry)localObject).getKey();
        if ((paramObject instanceof String))
        {
          localObject = ((Map.Entry)localObject).getValue();
          a(paramJsonWriter.name((String)paramObject), localObject);
        }
      }
      paramJsonWriter.endObject();
      return;
    }
    if ((paramObject instanceof List))
    {
      paramJsonWriter.beginArray();
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        a(paramJsonWriter, ((Iterator)paramObject).next());
      }
      paramJsonWriter.endArray();
      return;
    }
    paramJsonWriter.nullValue();
  }
  
  private static void a(JsonWriter paramJsonWriter, JSONArray paramJSONArray)
    throws IOException
  {
    try
    {
      paramJsonWriter.beginArray();
      int i = 0;
      while (i < paramJSONArray.length())
      {
        Object localObject = paramJSONArray.get(i);
        if ((localObject instanceof String))
        {
          paramJsonWriter.value((String)localObject);
        }
        else if ((localObject instanceof Number))
        {
          paramJsonWriter.value((Number)localObject);
        }
        else if ((localObject instanceof Boolean))
        {
          paramJsonWriter.value(((Boolean)localObject).booleanValue());
        }
        else if ((localObject instanceof JSONObject))
        {
          a(paramJsonWriter, (JSONObject)localObject);
        }
        else
        {
          if (!(localObject instanceof JSONArray)) {
            break label120;
          }
          a(paramJsonWriter, (JSONArray)localObject);
        }
        i++;
        continue;
        label120:
        paramJsonWriter = new org/json/JSONException;
        localObject = String.valueOf(localObject);
        i = String.valueOf(localObject).length();
        paramJSONArray = new java/lang/StringBuilder;
        paramJSONArray.<init>(i + 23);
        paramJSONArray.append("unable to write field: ");
        paramJSONArray.append((String)localObject);
        paramJsonWriter.<init>(paramJSONArray.toString());
        throw paramJsonWriter;
      }
      paramJsonWriter.endArray();
      return;
    }
    catch (JSONException paramJsonWriter)
    {
      throw new IOException(paramJsonWriter);
    }
  }
  
  public static void a(JsonWriter paramJsonWriter, JSONObject paramJSONObject)
    throws IOException
  {
    try
    {
      paramJsonWriter.beginObject();
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramJSONObject.get(str);
        if ((localObject instanceof String))
        {
          paramJsonWriter.name(str).value((String)localObject);
        }
        else if ((localObject instanceof Number))
        {
          paramJsonWriter.name(str).value((Number)localObject);
        }
        else if ((localObject instanceof Boolean))
        {
          paramJsonWriter.name(str).value(((Boolean)localObject).booleanValue());
        }
        else if ((localObject instanceof JSONObject))
        {
          a(paramJsonWriter.name(str), (JSONObject)localObject);
        }
        else if ((localObject instanceof JSONArray))
        {
          a(paramJsonWriter.name(str), (JSONArray)localObject);
        }
        else
        {
          paramJsonWriter = new org/json/JSONException;
          paramJSONObject = String.valueOf(localObject);
          int i = String.valueOf(paramJSONObject).length();
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>(i + 23);
          ((StringBuilder)localObject).append("unable to write field: ");
          ((StringBuilder)localObject).append(paramJSONObject);
          paramJsonWriter.<init>(((StringBuilder)localObject).toString());
          throw paramJsonWriter;
        }
      }
      paramJsonWriter.endObject();
      return;
    }
    catch (JSONException paramJsonWriter)
    {
      throw new IOException(paramJsonWriter);
    }
  }
  
  public static boolean a(boolean paramBoolean, JSONObject paramJSONObject, String... paramVarArgs)
  {
    paramJSONObject = b(paramJSONObject, paramVarArgs);
    if (paramJSONObject == null) {
      return false;
    }
    return paramJSONObject.optBoolean(paramVarArgs[(paramVarArgs.length - 1)], false);
  }
  
  public static Map<String, String> b(JsonReader paramJsonReader)
    throws IllegalStateException, IOException
  {
    HashMap localHashMap = new HashMap();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext()) {
      localHashMap.put(paramJsonReader.nextName(), paramJsonReader.nextString());
    }
    paramJsonReader.endObject();
    return localHashMap;
  }
  
  private static JSONObject b(JSONObject paramJSONObject, String[] paramArrayOfString)
  {
    for (int i = 0; i < paramArrayOfString.length - 1; i++)
    {
      if (paramJSONObject == null) {
        return null;
      }
      paramJSONObject = paramJSONObject.optJSONObject(paramArrayOfString[i]);
    }
    return paramJSONObject;
  }
  
  public static JSONObject c(JsonReader paramJsonReader)
    throws IllegalStateException, IOException, JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    paramJsonReader.beginObject();
    while (paramJsonReader.hasNext())
    {
      String str = paramJsonReader.nextName();
      Object localObject = paramJsonReader.peek();
      if (JsonToken.BEGIN_ARRAY.equals(localObject))
      {
        localJSONObject.put(str, d(paramJsonReader));
      }
      else if (JsonToken.BEGIN_OBJECT.equals(localObject))
      {
        localJSONObject.put(str, c(paramJsonReader));
      }
      else if (JsonToken.BOOLEAN.equals(localObject))
      {
        localJSONObject.put(str, paramJsonReader.nextBoolean());
      }
      else if (JsonToken.NUMBER.equals(localObject))
      {
        localJSONObject.put(str, paramJsonReader.nextDouble());
      }
      else if (JsonToken.STRING.equals(localObject))
      {
        localJSONObject.put(str, paramJsonReader.nextString());
      }
      else
      {
        paramJsonReader = String.valueOf(localObject);
        localObject = new StringBuilder(String.valueOf(paramJsonReader).length() + 23);
        ((StringBuilder)localObject).append("unexpected json token: ");
        ((StringBuilder)localObject).append(paramJsonReader);
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
    }
    paramJsonReader.endObject();
    return localJSONObject;
  }
  
  public static JSONArray d(JsonReader paramJsonReader)
    throws IllegalStateException, IOException, JSONException
  {
    Object localObject = new JSONArray();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext())
    {
      JsonToken localJsonToken = paramJsonReader.peek();
      if (JsonToken.BEGIN_ARRAY.equals(localJsonToken))
      {
        ((JSONArray)localObject).put(d(paramJsonReader));
      }
      else if (JsonToken.BEGIN_OBJECT.equals(localJsonToken))
      {
        ((JSONArray)localObject).put(c(paramJsonReader));
      }
      else if (JsonToken.BOOLEAN.equals(localJsonToken))
      {
        ((JSONArray)localObject).put(paramJsonReader.nextBoolean());
      }
      else if (JsonToken.NUMBER.equals(localJsonToken))
      {
        ((JSONArray)localObject).put(paramJsonReader.nextDouble());
      }
      else if (JsonToken.STRING.equals(localJsonToken))
      {
        ((JSONArray)localObject).put(paramJsonReader.nextString());
      }
      else
      {
        paramJsonReader = String.valueOf(localJsonToken);
        localObject = new StringBuilder(String.valueOf(paramJsonReader).length() + 23);
        ((StringBuilder)localObject).append("unexpected json token: ");
        ((StringBuilder)localObject).append(paramJsonReader);
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
    }
    paramJsonReader.endArray();
    return (JSONArray)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ql.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */