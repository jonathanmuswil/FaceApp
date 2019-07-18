import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.E;
import com.facebook.E.b;
import com.facebook.E.e;
import com.facebook.J;
import com.facebook.b;
import com.facebook.internal.S;
import com.facebook.p;
import java.io.File;
import java.io.FileNotFoundException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class xo
{
  public static Pair<String, String> a(String paramString)
  {
    int i = paramString.indexOf(':');
    if (i != -1)
    {
      int j = paramString.length();
      int k = i + 1;
      if (j > k)
      {
        str1 = paramString.substring(0, i);
        str2 = paramString.substring(k);
        paramString = str1;
        break label56;
      }
    }
    String str1 = null;
    String str2 = paramString;
    paramString = str1;
    label56:
    return new Pair(paramString, str2);
  }
  
  public static E a(b paramb, Uri paramUri, E.b paramb1)
    throws FileNotFoundException
  {
    if (S.c(paramUri)) {
      return a(paramb, new File(paramUri.getPath()), paramb1);
    }
    if (S.b(paramUri))
    {
      E.e locale = new E.e(paramUri, "image/png");
      paramUri = new Bundle(1);
      paramUri.putParcelable("file", locale);
      return new E(paramb, "me/staging_resources", paramUri, J.b, paramb1);
    }
    throw new p("The image Uri must be either a file:// or content:// Uri");
  }
  
  public static E a(b paramb, File paramFile, E.b paramb1)
    throws FileNotFoundException
  {
    E.e locale = new E.e(ParcelFileDescriptor.open(paramFile, 268435456), "image/png");
    paramFile = new Bundle(1);
    paramFile.putParcelable("file", locale);
    return new E(paramb, "me/staging_resources", paramFile, J.b, paramb1);
  }
  
  public static JSONArray a(JSONArray paramJSONArray, boolean paramBoolean)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      Object localObject1 = paramJSONArray.get(i);
      Object localObject2;
      if ((localObject1 instanceof JSONArray))
      {
        localObject2 = a((JSONArray)localObject1, paramBoolean);
      }
      else
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject)) {
          localObject2 = a((JSONObject)localObject1, paramBoolean);
        }
      }
      localJSONArray.put(localObject2);
    }
    return localJSONArray;
  }
  
  public static JSONObject a(Ko paramKo)
    throws JSONException
  {
    return vo.a(paramKo.c(), new wo());
  }
  
  public static JSONObject a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    if (paramJSONObject == null) {
      return null;
    }
    try
    {
      JSONObject localJSONObject1 = new org/json/JSONObject;
      localJSONObject1.<init>();
      JSONObject localJSONObject2 = new org/json/JSONObject;
      localJSONObject2.<init>();
      JSONArray localJSONArray = paramJSONObject.names();
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        String str = localJSONArray.getString(i);
        Object localObject1 = paramJSONObject.get(str);
        Object localObject2;
        if ((localObject1 instanceof JSONObject))
        {
          localObject2 = a((JSONObject)localObject1, true);
        }
        else
        {
          localObject2 = localObject1;
          if ((localObject1 instanceof JSONArray)) {
            localObject2 = a((JSONArray)localObject1, true);
          }
        }
        Object localObject3 = a(str);
        localObject1 = (String)((Pair)localObject3).first;
        localObject3 = (String)((Pair)localObject3).second;
        if (paramBoolean)
        {
          if ((localObject1 != null) && (((String)localObject1).equals("fbsdk"))) {
            localJSONObject1.put(str, localObject2);
          } else if ((localObject1 != null) && (!((String)localObject1).equals("og"))) {
            localJSONObject2.put((String)localObject3, localObject2);
          } else {
            localJSONObject1.put((String)localObject3, localObject2);
          }
        }
        else if ((localObject1 != null) && (((String)localObject1).equals("fb"))) {
          localJSONObject1.put(str, localObject2);
        } else {
          localJSONObject1.put((String)localObject3, localObject2);
        }
      }
      if (localJSONObject2.length() > 0) {
        localJSONObject1.put("data", localJSONObject2);
      }
      return localJSONObject1;
    }
    catch (JSONException paramJSONObject)
    {
      throw new p("Failed to create json object from share content");
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */