package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

final class j
  implements k.a
{
  public void a(Bundle paramBundle, String paramString, Object paramObject)
    throws JSONException
  {
    JSONArray localJSONArray = (JSONArray)paramObject;
    ArrayList localArrayList = new ArrayList();
    if (localJSONArray.length() == 0)
    {
      paramBundle.putStringArrayList(paramString, localArrayList);
      return;
    }
    int i = 0;
    while (i < localJSONArray.length())
    {
      paramObject = localJSONArray.get(i);
      if ((paramObject instanceof String))
      {
        localArrayList.add((String)paramObject);
        i++;
      }
      else
      {
        paramBundle = new StringBuilder();
        paramBundle.append("Unexpected type in an array: ");
        paramBundle.append(paramObject.getClass());
        throw new IllegalArgumentException(paramBundle.toString());
      }
    }
    paramBundle.putStringArrayList(paramString, localArrayList);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */