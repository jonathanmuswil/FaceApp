package com.facebook.accountkit.internal;

import Vm;
import Vm.a;
import android.content.Intent;
import android.support.v4.content.g;
import android.util.Pair;
import org.json.JSONObject;
import un;
import un.a;

class ka
  implements f.a
{
  ka(la paramla) {}
  
  public void a(l paraml)
  {
    sa localsa = la.a(this.a);
    if ((localsa != null) && (paraml != null))
    {
      Intent localIntent = new Intent(un.b);
      if (paraml.a() != null)
      {
        paraml = va.a(paraml.a());
        if (va.a((O)paraml.second))
        {
          la.b(this.a).a(ta.b);
          la.b(this.a).a(null);
          localIntent.putExtra(un.c, un.a.f);
        }
        else
        {
          la.a(this.a, (Vm)paraml.first);
          localsa.b();
          localIntent.putExtra(un.c, un.a.e);
          localIntent.putExtra(un.e, ((Vm)paraml.first).n());
        }
      }
      else
      {
        paraml = paraml.b();
        if (paraml == null)
        {
          la.a(this.a, Vm.a.g, O.b);
          localIntent.putExtra(un.c, un.a.e);
        }
        else
        {
          paraml = paraml.optString("state");
          la.b(this.a).b(paraml);
          la.b(this.a).a(ta.c);
          localIntent.putExtra(un.c, un.a.h);
          localIntent.putExtra(un.g, la.b(this.a).c());
        }
        localsa.b();
      }
      localsa.d().a("ak_update_complete", la.b(this.a));
      localsa.c().a(localIntent);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */