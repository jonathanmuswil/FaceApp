package com.facebook;

import android.util.Log;
import com.facebook.internal.S;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

class e
  implements E.b
{
  e(h paramh, AtomicBoolean paramAtomicBoolean, Set paramSet1, Set paramSet2) {}
  
  public void a(I paramI)
  {
    paramI = paramI.b();
    if (paramI == null) {
      return;
    }
    paramI = paramI.optJSONArray("data");
    if (paramI == null) {
      return;
    }
    this.a.set(true);
    for (int i = 0; i < paramI.length(); i++)
    {
      Object localObject1 = paramI.optJSONObject(i);
      if (localObject1 != null)
      {
        Object localObject2 = ((JSONObject)localObject1).optString("permission");
        localObject1 = ((JSONObject)localObject1).optString("status");
        if ((!S.b((String)localObject2)) && (!S.b((String)localObject1)))
        {
          localObject1 = ((String)localObject1).toLowerCase(Locale.US);
          if (((String)localObject1).equals("granted"))
          {
            this.b.add(localObject2);
          }
          else if (((String)localObject1).equals("declined"))
          {
            this.c.add(localObject2);
          }
          else
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("Unexpected status: ");
            ((StringBuilder)localObject2).append((String)localObject1);
            Log.w("AccessTokenManager", ((StringBuilder)localObject2).toString());
          }
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */