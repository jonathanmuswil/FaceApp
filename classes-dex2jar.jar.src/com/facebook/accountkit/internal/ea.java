package com.facebook.accountkit.internal;

import Vm;
import Vm.a;
import android.util.Log;
import android.util.Pair;
import org.json.JSONException;

class ea
  implements f.a
{
  ea(ga paramga, W paramW) {}
  
  public void a(l paraml)
  {
    if (!this.a.l())
    {
      Log.w(ga.a(), "Warning: Callback issues while activity not available.");
      return;
    }
    if (paraml == null) {
      return;
    }
    try
    {
      if (paraml.a() != null)
      {
        localPair = va.a(paraml.a());
        try
        {
          if (!va.a((O)localPair.second)) {
            this.b.a((Vm)localPair.first);
          }
          if ((((ia)this.b.d).l() == Y.f) && (localPair != null) && (va.a((O)localPair.second)))
          {
            ((ia)this.b.d).a(Y.b);
            ((ia)this.b.d).a(null);
          }
          this.b.b();
          this.a.b(this.b.d);
          if ((((ia)this.b.d).l() == Y.d) || (((ia)this.b.d).l() == Y.f)) {
            this.a.b();
          }
          return;
        }
        finally
        {
          break label424;
        }
      }
      paraml = paraml.b();
      if (paraml == null)
      {
        this.b.a(Vm.a.c, O.b);
        ((ia)this.b.d).l();
        paraml = Y.f;
        this.b.b();
        this.a.b(this.b.d);
        if ((((ia)this.b.d).l() == Y.d) || (((ia)this.b.d).l() == Y.f)) {
          this.a.b();
        }
        return;
      }
      try
      {
        this.b.a(paraml);
      }
      catch (JSONException|NumberFormatException paraml)
      {
        this.b.a(Vm.a.c, O.c);
      }
      ((ia)this.b.d).l();
      paraml = Y.f;
      this.b.b();
      this.a.b(this.b.d);
      if ((((ia)this.b.d).l() == Y.d) || (((ia)this.b.d).l() == Y.f)) {
        this.a.b();
      }
      return;
    }
    finally
    {
      Pair localPair = null;
      label424:
      if ((((ia)this.b.d).l() == Y.f) && (localPair != null) && (va.a((O)localPair.second)))
      {
        ((ia)this.b.d).a(Y.b);
        ((ia)this.b.d).a(null);
      }
      this.b.b();
      this.a.b(this.b.d);
      if ((((ia)this.b.d).l() == Y.d) || (((ia)this.b.d).l() == Y.f)) {
        this.a.b();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */