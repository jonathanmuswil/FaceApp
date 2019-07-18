package com.facebook.accountkit.internal;

import Vm;
import Vm.a;
import android.content.Intent;
import android.support.v4.content.g;
import android.util.Pair;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import un;
import un.a;

class ja
  implements f.a
{
  ja(la paramla) {}
  
  public void a(l paraml)
  {
    sa localsa = la.a(this.a);
    if ((localsa != null) && (paraml != null))
    {
      Object localObject1 = null;
      Object localObject2 = localObject1;
      try
      {
        if (paraml.a() != null)
        {
          localObject2 = localObject1;
          localObject1 = va.a(paraml.a());
          localObject2 = localObject1;
          la.a(this.a, (Vm)((Pair)localObject1).first);
          localObject2 = new Intent(un.b);
          if (la.b(this.a).e() == ta.b)
          {
            paraml = (l)localObject2;
            paraml.putExtra(un.c, un.a.b);
          }
          else
          {
            paraml = (l)localObject2;
            if (la.b(this.a).e() == ta.e)
            {
              ((Intent)localObject2).putExtra(un.c, un.a.d);
              paraml = (l)localObject2;
              if (localObject1 != null)
              {
                ((Intent)localObject2).putExtra(un.e, ((Vm)((Pair)localObject1).first).n());
                paraml = (l)localObject2;
              }
            }
          }
        }
        for (;;)
        {
          localsa.c().a(paraml);
          return;
          localObject2 = localObject1;
          paraml = paraml.b();
          if (paraml != null) {
            break label273;
          }
          localObject2 = localObject1;
          la.a(this.a, Vm.a.g, O.b);
          localObject2 = new Intent(un.b);
          if (la.b(this.a).e() == ta.b)
          {
            paraml = (l)localObject2;
            break;
          }
          paraml = (l)localObject2;
          if (la.b(this.a).e() == ta.e)
          {
            ((Intent)localObject2).putExtra(un.c, un.a.d);
            paraml = (l)localObject2;
          }
        }
        label273:
        localObject2 = localObject1;
        String str = paraml.optString("privacy_policy");
        localObject2 = localObject1;
        if (!va.e(str))
        {
          localObject2 = localObject1;
          la.b(this.a).a("privacy_policy", str);
        }
        localObject2 = localObject1;
        str = paraml.optString("terms_of_service");
        localObject2 = localObject1;
        if (!va.e(str))
        {
          localObject2 = localObject1;
          la.b(this.a).a("terms_of_service", str);
        }
        localObject2 = localObject1;
        try
        {
          str = paraml.getString("update_request_code");
          localObject2 = localObject1;
          long l = Long.parseLong(paraml.getString("expires_in_sec"));
          localObject2 = localObject1;
          la.b(this.a).a(l);
          localObject2 = localObject1;
          l = Long.parseLong(paraml.optString("min_resend_interval_sec"));
          localObject2 = localObject1;
          la.b(this.a).b(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(l));
          localObject2 = localObject1;
          la.b(this.a).a(ta.b);
          localObject2 = localObject1;
          la.b(this.a).d(str);
        }
        catch (JSONException|NumberFormatException paraml)
        {
          localObject2 = localObject1;
          la.a(this.a, Vm.a.g, O.c);
        }
        paraml = new Intent(un.b);
        if (la.b(this.a).e() == ta.b) {
          paraml.putExtra(un.c, un.a.b);
        } else if (la.b(this.a).e() == ta.e) {
          paraml.putExtra(un.c, un.a.d);
        }
        localsa.c().a(paraml);
        return;
      }
      finally
      {
        localObject1 = new Intent(un.b);
        if (la.b(this.a).e() != ta.b)
        {
          if (la.b(this.a).e() == ta.e)
          {
            ((Intent)localObject1).putExtra(un.c, un.a.d);
            if (localObject2 != null) {
              ((Intent)localObject1).putExtra(un.e, ((Vm)((Pair)localObject2).first).n());
            }
          }
        }
        else {
          ((Intent)localObject1).putExtra(un.c, un.a.b);
        }
        localsa.c().a((Intent)localObject1);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */